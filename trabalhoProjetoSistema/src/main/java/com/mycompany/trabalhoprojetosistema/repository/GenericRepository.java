package com.mycompany.trabalhoprojetosistema.repository;

import java.sql.SQLException;
import java.util.List;

public interface GenericRepository <T> {

    List<T> buscarTodos() throws SQLException;

    T buscarPorId(Integer id) throws SQLException;

    void delete(Integer id) throws SQLException;

    void salvar(T entity) throws SQLException;
    void update(T entity) throws SQLException;
}
