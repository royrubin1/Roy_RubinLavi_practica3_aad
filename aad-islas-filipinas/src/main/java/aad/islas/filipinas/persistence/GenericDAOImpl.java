/**
 * Esta clase abstracta proporciona una implementación genérica de las 
 * operaciones CRUD para cualquier entidad implementando la interfaz DAO.
 *
 * @param <T> El tipo de entidad con la que se trabaja.
 * @author Roy
 */

package aad.islas.filipinas.persistence;

import java.util.List;

import aad.islas.filipinas.dao.DAO;
import jakarta.persistence.EntityManager;

public abstract class GenericDAOImpl<T> implements DAO<T> {

	protected EntityManager entityManager;

	public GenericDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public void insert(T obj) {
		entityManager.getTransaction().begin();
		try {
			entityManager.persist(obj);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			System.out
					.println("No se ha podido insertar este " + obj.getClass().getSimpleName() + ": " + e.getMessage());
		}
	}

	@Override
	public void insertAll(List<T> objs) {
		entityManager.getTransaction().begin();
		try {
			for (T obj : objs) {
				entityManager.persist(obj);
			}
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			System.out.println("No se ha podido insertar esta lista: " + e.getMessage());
		}
	}

	@Override
	public T find(Class<T> className, int id) {
		return entityManager.find(className, id);
	}

	@Override
	public List<T> findAll(Class<T> className) {
		return entityManager.createQuery("SELECT obj FROM " + className.getSimpleName() + " obj", className).getResultList();
	}

	@Override
	public void update(T obj) {
		entityManager.getTransaction().begin();
		try {
			entityManager.merge(obj);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			System.out.println("No se ha podido actualizar: " + e.getMessage());
		}

	}

	@Override
	public void delete(T obj) {
		entityManager.getTransaction().begin();
		try {
			entityManager.remove(obj);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			System.out.println("No se ha podido borrar" + e.getMessage());
		}

	}

}
