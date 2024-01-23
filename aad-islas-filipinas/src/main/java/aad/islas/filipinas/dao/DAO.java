package aad.islas.filipinas.dao;
import java.util.List;


public interface DAO <T>{
    void insert(T obj);
    void insertAll(List<T> objs);    
    T find(int id);
    List<T> getAll();
    void update(T obj);
    void delete(T obj);

}
