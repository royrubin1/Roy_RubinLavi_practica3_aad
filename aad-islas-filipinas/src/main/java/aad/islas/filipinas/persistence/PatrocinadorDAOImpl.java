/**
 * Esta clase representa una implementación específica de DAO para la entidad Patrocinador.
 * Se encarga de realizar operaciones de persistencia relacionadas con patrocinadores en la base de datos.
 *
 * @author Roy
 */
package aad.islas.filipinas.persistence;

import aad.islas.filipinas.entities.Patrocinador;
import jakarta.persistence.EntityManager;


public class PatrocinadorDAOImpl extends GenericDAOImpl<Patrocinador> {

	public PatrocinadorDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

}
