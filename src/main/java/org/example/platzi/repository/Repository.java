package org.example.platzi.repository;

import java.sql.SQLException;
import java.util.List;

public interface Repository<T> {
    // Mtodo para listar todos los objetos
    List<T> findAll() throws SQLException;
    //Método para listar un solo objeto por medio de su id
    T getById(Integer id) throws SQLException;
    // Método salvar para insertar y actualizar
    void save(T t) throws SQLException;
    // Método para eliminar
    void delete(Integer id) throws SQLException;


}
