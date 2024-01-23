package aad.islas.filipinas.persistence;

import aad.islas.filipinas.entities.Transferencia;
import jakarta.persistence.EntityManager;


public class TransferenciaDAOImpl extends GenericDAOImpl<Transferencia>{

	public TransferenciaDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

}
