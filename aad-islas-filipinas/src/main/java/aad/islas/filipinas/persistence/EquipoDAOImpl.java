/**
 * Esta clase representa una implementación específica de DAO para la entidad Equipo.
 * Se encarga de realizar operaciones de persistencia relacionadas con equipos en la base de datos.
 *
 * @author Roy
 */

package aad.islas.filipinas.persistence;

import aad.islas.filipinas.entities.Equipo;
import jakarta.persistence.EntityManager;


public class EquipoDAOImpl extends GenericDAOImpl<Equipo>{

	public EquipoDAOImpl(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}
	
}
