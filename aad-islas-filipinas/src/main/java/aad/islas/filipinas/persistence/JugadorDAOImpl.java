/**
 * Esta clase representa una implementación específica de DAO para la entidad Jugador.
 * Se encarga de realizar operaciones de persistencia relacionadas con jugadores en la base de datos.
 *
 * @author Roy
 */
package aad.islas.filipinas.persistence;

import aad.islas.filipinas.entities.Jugador;
import jakarta.persistence.EntityManager;


public class JugadorDAOImpl extends GenericDAOImpl<Jugador>{

	public JugadorDAOImpl(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}

}
