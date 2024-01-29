/**
 * Esta interfaz define un conjunto de métodos genéricos para realizar operaciones CRUD 
 * en una base de datos.
 *
 * @author Roy
 */
package aad.islas.filipinas.dao;
import java.util.List;


public interface DAO <T>{
    void insert(T obj);
    void insertAll(List<T> objs);    
    T find(Class<T> className, int id);
	List<T> findAll(Class<T> className);
    void update(T obj);
    void delete(T obj);

	

}
