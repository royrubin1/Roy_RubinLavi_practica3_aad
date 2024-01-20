package aad.islas.filipinas.dao;

import java.util.ArrayList;
import java.util.Set;

import aad.islas.filipinas.entities.Equipo;
import aad.islas.filipinas.entities.Jugador;

public interface DAO <T>{
    void insert(T obj);
    void insertAll(ArrayList<T> objs);    
    T find(int id);
    ArrayList<T> getAll();
    void update(T obj);
    void delete(T obj);

}
