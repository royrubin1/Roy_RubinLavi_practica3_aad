package aad.islas.filipinas.persistence;

import aad.islas.filipinas.entities.Patrocinador;
import jakarta.persistence.EntityManager;


public class PatrocinadorDAOImpl extends GenericDAOImpl<Patrocinador> {

	public PatrocinadorDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

}
