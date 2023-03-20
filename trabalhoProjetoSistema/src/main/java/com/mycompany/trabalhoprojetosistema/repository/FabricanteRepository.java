package com.mycompany.trabalhoprojetosistema.repository;

import com.mycompany.trabalhoprojetosistema.ConexaoBancoDados;
import com.mycompany.trabalhoprojetosistema.domain.Dropdown;
import com.mycompany.trabalhoprojetosistema.domain.Fabricante;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class FabricanteRepository implements GenericRepository<Fabricante> {

    public List<Fabricante> buscarTodos() throws SQLException {
        Statement has = ConexaoBancoDados.connect().createStatement();
        String sql = "SELECT * FROM fabricante";
        ResultSet rs = has.executeQuery(sql);
        List<Fabricante> list = new ArrayList<>();
        while(rs.next()){
            Fabricante fabricante = new Fabricante();
            fabricante.setId(rs.getInt("id_fabricante"));
            fabricante.setNome(rs.getString("nome"));
            fabricante.setPaisOrigem(rs.getString("pais_origem"));
            list.add(fabricante);
        }
        return list;
    }

    public List<Dropdown> buscarDropdown() throws SQLException {
        Statement has = ConexaoBancoDados.connect().createStatement();
        String sql = "SELECT f.id_fabricante, f.nome FROM fabricante f";
        ResultSet rs = has.executeQuery(sql);
        List<Dropdown> list = new ArrayList<>();
        while(rs.next()){
            Dropdown dropdown = new Dropdown();
            dropdown.setValue(rs.getInt("id_fabricante"));
            dropdown.setLabel(rs.getString("nome"));
            list.add(dropdown);
        }
        return list;
    }

    public Fabricante buscarPorId(Integer id){
        Fabricante fabricante = new Fabricante();
        String sql = "SELECT * FROM Fabricante f where f.id_fabricante = " + id;
        try {
            Statement has = ConexaoBancoDados.connect().createStatement();
            ResultSet resultSet = has.executeQuery(sql);
            while (resultSet.next()){
                fabricante.setId(resultSet.getInt("id_fabricante"));
                fabricante.setNome(resultSet.getString("nome"));
                fabricante.setPaisOrigem(resultSet.getString("pais_origem"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return fabricante;
    }

    public void salvar(Fabricante entity){
        String sql = "INSERT INTO fabricante (nome, pais_origem) VALUES ('" + entity.getNome() + "', '" + entity.getPaisOrigem() + "')";
        try {
            Statement has = ConexaoBancoDados.connect().createStatement();
            has.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(Fabricante entity){
        String sql = "UPDATE fabricante f SET nome = " + entity.getNome() + ", pais_origem = " + entity.getPaisOrigem();
        try {
            Statement has = ConexaoBancoDados.connect().createStatement();
            has.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(Integer id){
        String sql = "DELETE From fabricante where id_fabricante = " + id;
        try {
            Statement has = ConexaoBancoDados.connect().createStatement();
            has.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
