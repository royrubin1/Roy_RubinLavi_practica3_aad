/**
 * Esta clase se encarga de visualizar información relacionada con competiciones, partidos y transferencias.
 * @author Roy
 */

package aad.islas.filipinas.visualizacion;

import jakarta.persistence.EntityManager;

import java.util.List;

import aad.islas.filipinas.entities.Competicion;
import aad.islas.filipinas.entities.Partido;
import aad.islas.filipinas.entities.Transferencia;
import aad.islas.filipinas.persistence.CompeticionDAOImpl;
import aad.islas.filipinas.persistence.PartidoDAOImpl;
import aad.islas.filipinas.persistence.TransferenciaDAOImpl;

public class CompeticionVisualizacion {
	public static void visualizar(EntityManager entityManager) {
		visualizarCompeticion(entityManager);
		visualizarPartidos(entityManager);
		visualizarTransferencias(entityManager);
	}
	
	private static void visualizarCompeticion(EntityManager entityManager) {
		CompeticionDAOImpl cdi = new CompeticionDAOImpl(entityManager);
		Competicion competicion = cdi.find(Competicion.class, 1);
		System.out.println("---------------------------------------------");
		System.out.println("Nombre de competicion: " + competicion.getNombre());
		System.out.println("Nombre de equipos: " + competicion.getNumEquipos());
		System.out.println("Número de jornadas: " + competicion.getNumJornadas());
	}
	
	private static void visualizarPartidos(EntityManager entityManager) {
		PartidoDAOImpl pdl = new PartidoDAOImpl(entityManager);
		List<Partido> partidos = pdl.findAll(Partido.class);
		System.out.println("---------------------------------------------");
		System.out.println("Partidos: ");
		for (Partido partido : partidos) {
			System.out.println(partido.getFechaPartido() + " " + partido.getequipoLocal().getNombreEquipo() + " - " + partido.getEquipoVisitante().getNombreEquipo() + " : " + partido.getGolesEquipoLocal() + " - " + partido.getGolesEquipoVistante());
		}
	}
	
	public static void visualizarTransferencias(EntityManager entityManager) {
		TransferenciaDAOImpl transferenciaDAOImpl = new TransferenciaDAOImpl(entityManager);
		List<Transferencia> transferencias = transferenciaDAOImpl.findAll(Transferencia.class);
		System.out.println("---------------------------------------------");
		System.out.println("Transferencias: ");
		for(Transferencia transferencia : transferencias) {
			System.out.println("Transferencia:");
			System.out.println("Fecha: " + transferencia.getFechaTransferencia());
			System.out.println("Jugador: " + transferencia.getJugador().getNombreJugador());
			System.out.println("Del equipo: " + transferencia.getDelEquipo().getNombreEquipo() + " al equipo: " + transferencia.getAlEquipo().getNombreEquipo());
			
		}
	}
}
