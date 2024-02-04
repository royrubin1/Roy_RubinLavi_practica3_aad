/**
 * Esta clase representa una implementación específica de DAO para la entidad Competicion.
 * Se encarga de realizar operaciones de persistencia relacionadas con 
 * las Competiciones en la base de datos.
 *
 * @author Roy
 */
package aad.islas.filipinas.persistence;

import aad.islas.filipinas.entities.Competicion;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class CompeticionDAOImpl extends GenericDAOImpl<Competicion>{

	public CompeticionDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}
	
	public Competicion obtenerCaracteristicasCompeticion() {
		Query query = entityManager.createNativeQuery("SELECT * FROM competicion", Competicion.class);
		Competicion competicion = (Competicion) query.getSingleResult();
		return competicion;
	}

}
