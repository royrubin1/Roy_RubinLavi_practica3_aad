package aad.islas.filipinas.persistence;

import aad.islas.filipinas.entities.Temporada;
import jakarta.persistence.EntityManager;

public class TemporadaDAOImpl extends GenericDAOImpl<Temporada>{

	public TemporadaDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}
	
}
