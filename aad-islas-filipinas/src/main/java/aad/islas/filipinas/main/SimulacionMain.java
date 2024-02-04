package aad.islas.filipinas.main;

import aad.islas.filipinas.consultas.ConsultasCompeticion;
import aad.islas.filipinas.entities.Competicion;
import aad.islas.filipinas.entities.Temporada;
import aad.islas.filipinas.generacion.GenerarJugadores;
import aad.islas.filipinas.generacion.GenerarPartidos;
import aad.islas.filipinas.generacion.GenerarPatrocinadores;
import aad.islas.filipinas.generacion.GenerarTransferencia;
import aad.islas.filipinas.persistence.CompeticionDAOImpl;
import aad.islas.filipinas.persistence.JugadorDAOImpl;

import aad.islas.filipinas.persistence.PatrocinadorDAOImpl;
import aad.islas.filipinas.visualizacion.CompeticionVisualizacion;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class SimulacionMain {
	public static void main(String[] args) {
		
		// Crear el EntityManager
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("orm_competicion_unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		// Crear la competición
		CompeticionDAOImpl cdi = new CompeticionDAOImpl(entityManager);
		cdi.insert(new Competicion("La Liga", 180, 10));
		
		// Creamos los patrocinadores
		PatrocinadorDAOImpl pdi = new PatrocinadorDAOImpl(entityManager);
		pdi.insertAll(GenerarPatrocinadores.generarPatrocinadores());
		
		// Creamos los jugadores y los equipos
		JugadorDAOImpl jdi = new JugadorDAOImpl(entityManager);
		jdi.insertAll(GenerarJugadores.generarJugadores(entityManager));
		
		// Creamos los partidos
		GenerarPartidos.generarPartidos(entityManager, new Temporada(2024, null));
		
		GenerarTransferencia.generarTransferenciasAleatorias(entityManager, 10);
		
		//CompeticionVisualizacion.visualizar(entityManager);
		
		ConsultasCompeticion.consulta(entityManager);
	}
}
