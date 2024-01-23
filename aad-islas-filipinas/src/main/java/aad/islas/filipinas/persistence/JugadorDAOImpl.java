package aad.islas.filipinas.persistence;

import aad.islas.filipinas.entities.Jugador;
import jakarta.persistence.EntityManager;


public class JugadorDAOImpl extends GenericDAOImpl<Jugador>{

	public JugadorDAOImpl(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}

}
