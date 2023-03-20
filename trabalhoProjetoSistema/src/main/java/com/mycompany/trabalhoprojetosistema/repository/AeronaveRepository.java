package com.mycompany.trabalhoprojetosistema.repository;

import com.mycompany.trabalhoprojetosistema.ConexaoBancoDados;
import com.mycompany.trabalhoprojetosistema.domain.Aeronave;
import com.mycompany.trabalhoprojetosistema.domain.Fabricante;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AeronaveRepository implements GenericRepository<Aeronave> {
    private FabricanteRepository fabricanteRepository = new FabricanteRepository();

    public List<Aeronave> buscarTodos() throws SQLException {
        Statement has = ConexaoBancoDados.connect().createStatement();
        String sql = "SELECT * FROM modelo_aeronave";
        ResultSet rs = has.executeQuery(sql);
        List<Aeronave> list = new ArrayList<>();
        while(rs.next()){
            Aeronave aeronave = new Aeronave();
            aeronave.setId(rs.getInt("id_modelo"));
            aeronave.setNome(rs.getString("nome"));
            aeronave.setQtdPassageiro(rs.getInt("capacidade_passageiro"));
            aeronave.setQtdCarga(rs.getInt("capacidade_carga"));
            aeronave.setQtdAutonomia(rs.getInt("autonomia"));
            aeronave.setIdFabricante(rs.getInt("id_fabricante"));
            aeronave.setFabricante(fabricanteRepository.buscarPorId(rs.getInt("id_fabricante")));
            list.add(aeronave);
        }
        return list;
    }

    public Aeronave buscarPorId(Integer id){
        Aeronave aeronave = new Aeronave();
        String sql = "SELECT * FROM Fabricante f where f.id_fabricante = " + id;
        try {
            Statement has = ConexaoBancoDados.connect().createStatement();
            ResultSet resultSet = has.executeQuery(sql);
            aeronave.setId(resultSet.getInt("id_modelo"));
            aeronave.setNome(resultSet.getString("nome"));
            aeronave.setQtdPassageiro(resultSet.getInt("quantidade_passageiro"));
            aeronave.setQtdCarga(resultSet.getInt("quantidade_carga"));
            aeronave.setQtdAutonomia(resultSet.getInt("autonomia"));
            aeronave.setFabricante(new Fabricante(resultSet.getInt("id_fabricante"), resultSet.getString("nome"), resultSet.getString("pais_origem")));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return aeronave;
    }

    public void salvar(Aeronave entity){
        String sql = "INSERT INTO modelo_aeronave (nome, capacidade_passageiro, capacidade_carga, autonomia, id_fabricante) " +
                "VALUES ('" + entity.getNome() + "'," + entity.getQtdPassageiro() + ", "+ entity.getQtdCarga() +", "+ entity.getQtdAutonomia() +", " + entity.getIdFabricante() +")";
        try {
            Statement has = ConexaoBancoDados.connect().createStatement();
            has.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(Aeronave entity){
        String sql = "UPDATE modelo_aeronave f SET nome = " + entity.getNome() + ", autonomia = " + entity.getQtdAutonomia() +
                ", capacidade_carga = " + entity.getQtdCarga() + ", capacidade_passageiro = " + entity.getQtdPassageiro() +
                ", id_fabricante = " + entity.getFabricante().getId();
        try {
            Statement has = ConexaoBancoDados.connect().createStatement();
            has.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(Integer id){
        String sql = "DELETE From modelo_aeronave where id_modelo = " + id;
        try {
            Statement has = ConexaoBancoDados.connect().createStatement();
            has.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
