/**
 * Esta clase representa una implementación específica de DAO para la entidad Transferencia.
 * Se encarga de realizar operaciones de persistencia relacionadas con transferencias en la base de datos.
 *
 * @author Roy
 */
package aad.islas.filipinas.persistence;

import java.util.List;

import aad.islas.filipinas.entities.Transferencia;
import jakarta.persistence.EntityManager;

public class TransferenciaDAOImpl extends GenericDAOImpl<Transferencia> {

	public TransferenciaDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	public List<Transferencia> enumerarFichajes() {
		List<Transferencia> transferencias = entityManager.createQuery(
				"SELECT t FROM Transferencia t " + "WHERE t.delEquipo IS NOT NULL " 
				+ "AND alEquipo IS NOT NULL",
				Transferencia.class).getResultList();
		return transferencias;
	}

}
