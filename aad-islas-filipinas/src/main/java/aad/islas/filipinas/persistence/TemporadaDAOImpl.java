/**
 * Esta clase representa una implementación específica de DAO para la entidad Temporada.
 * Se encarga de realizar operaciones de persistencia relacionadas con temporadas en la base de datos.
 *
 * @author Roy
 */
package aad.islas.filipinas.persistence;

import aad.islas.filipinas.entities.Temporada;
import jakarta.persistence.EntityManager;

public class TemporadaDAOImpl extends GenericDAOImpl<Temporada>{

	public TemporadaDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}
	
}
