package add.islas.filipinas.main;

import aad.islas.filipinas.entities.Temporada;
import aad.islas.filipinas.persistence.GenerarJugadores;
import aad.islas.filipinas.persistence.GenerarPartidos;
import aad.islas.filipinas.persistence.GenerarPatrocinadores;
import aad.islas.filipinas.persistence.JugadorDAOPersistence;
import aad.islas.filipinas.persistence.PatrocinadorDAOPersistence;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class SimulacionMain {
	public static void main(String[] args) {
		// Crear el EntityManager
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("orm_competicion_unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		// Creamos los patrocinadores
		PatrocinadorDAOPersistence pdp = new PatrocinadorDAOPersistence(entityManager);
		pdp.insertAll(GenerarPatrocinadores.generarPatrocinadores());
		
		// Creamos los jugadores y los equipos
		JugadorDAOPersistence jdp = new JugadorDAOPersistence(entityManager);
		jdp.insertAll(GenerarJugadores.generarJugadores(entityManager));
		
		// Creamos los partidos
		GenerarPartidos.generarPartidos(entityManager, new Temporada(2024, null));
	}
}
