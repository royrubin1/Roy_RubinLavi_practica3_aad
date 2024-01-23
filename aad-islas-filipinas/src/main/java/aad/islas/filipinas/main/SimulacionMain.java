package aad.islas.filipinas.main;

import aad.islas.filipinas.entities.Temporada;
import aad.islas.filipinas.generacion.GenerarJugadores;
import aad.islas.filipinas.generacion.GenerarPartidos;
import aad.islas.filipinas.generacion.GenerarPatrocinadores;
import aad.islas.filipinas.persistence.JugadorDAOImpl;

import aad.islas.filipinas.persistence.PatrocinadorDAOImpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class SimulacionMain {
	public static void main(String[] args) {
		// Crear el EntityManager
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("orm_competicion_unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		// Creamos los patrocinadores
		PatrocinadorDAOImpl pdp = new PatrocinadorDAOImpl(entityManager);
		pdp.insertAll(GenerarPatrocinadores.generarPatrocinadores());
		
		// Creamos los jugadores y los equipos
		JugadorDAOImpl jdp = new JugadorDAOImpl(entityManager);
		jdp.insertAll(GenerarJugadores.generarJugadores(entityManager));
		
		// Creamos los partidos
		GenerarPartidos.generarPartidos(entityManager, new Temporada(2024, null));
	}
}
