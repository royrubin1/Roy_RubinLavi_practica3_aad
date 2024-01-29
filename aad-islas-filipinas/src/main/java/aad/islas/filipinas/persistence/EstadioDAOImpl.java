/*
 * La clase proporcionada representa una implementación específica de un DAO para la entidad Equipo. 
 * Su función principal es realizar operaciones de persistencia relacionadas 
 * con equipos en la base de datos.
 */
package aad.islas.filipinas.persistence;

import aad.islas.filipinas.entities.Estadio;
import jakarta.persistence.EntityManager;

public class EstadioDAOImpl extends GenericDAOImpl<Estadio>{

	public EstadioDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

}
