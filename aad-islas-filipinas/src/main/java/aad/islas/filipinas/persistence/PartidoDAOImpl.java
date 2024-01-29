/**
 * Esta clase representa una implementación específica de DAO para la entidad Partido.
 * Se encarga de realizar operaciones de persistencia relacionadas con partidos en la base de datos.
 *
 * @author Roy
 */
package aad.islas.filipinas.persistence;

import aad.islas.filipinas.entities.Partido;
import jakarta.persistence.EntityManager;


public class PartidoDAOImpl extends GenericDAOImpl<Partido>{

	public PartidoDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}
	
}
