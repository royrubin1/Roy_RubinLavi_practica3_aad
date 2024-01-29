/**
 * Esta clase representa una implementación específica de DAO para la entidad Transferencia.
 * Se encarga de realizar operaciones de persistencia relacionadas con transferencias en la base de datos.
 *
 * @author Roy
 */
package aad.islas.filipinas.persistence;

import aad.islas.filipinas.entities.Transferencia;
import jakarta.persistence.EntityManager;


public class TransferenciaDAOImpl extends GenericDAOImpl<Transferencia>{

	public TransferenciaDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

}
