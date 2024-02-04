package aad.islas.filipinas.consultas;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import aad.islas.filipinas.entities.Competicion;
import aad.islas.filipinas.entities.Equipo;
import aad.islas.filipinas.entities.Jugador;
import aad.islas.filipinas.entities.Patrocinador;
import aad.islas.filipinas.entities.Transferencia;
import aad.islas.filipinas.generacion.GenerarPatrocinadores;
import aad.islas.filipinas.persistence.CompeticionDAOImpl;
import aad.islas.filipinas.persistence.EquipoDAOImpl;
import aad.islas.filipinas.persistence.JugadorDAOImpl;
import aad.islas.filipinas.persistence.PartidoDAOImpl;
import aad.islas.filipinas.persistence.PatrocinadorDAOImpl;
import aad.islas.filipinas.persistence.TransferenciaDAOImpl;
import jakarta.persistence.EntityManager;

public class ConsultasCompeticion {

	public static void consulta(EntityManager entityManager) {
		
		System.out.println("\n##### CONSULTAS ####");
		
		// Consulta 1
		CompeticionDAOImpl competicionDAOImpl = new CompeticionDAOImpl(entityManager);
		Competicion competicion = competicionDAOImpl.find(Competicion.class, 1);
		imprimirConsulta(1,"Utiliza una consulta nativa(NativeQuery) para obtener las características de la competición.", competicion);
		
		// Consulta 2
		EquipoDAOImpl equipoDAOImpl = new EquipoDAOImpl(entityManager);
		List<Equipo> equipos = equipoDAOImpl.findAll(Equipo.class);
		imprimirConsulta(2, "Consulta y recupera todos los equipos participantes en la competición.", equipos);
		
		// Consulta 3
		JugadorDAOImpl jugadorDAOImpl = new JugadorDAOImpl(entityManager);
		List<Jugador> deportistasEquipoEspecifico = jugadorDAOImpl.obtenerDeportistasEquipoEspecifico(getRandomEquipo(equipoDAOImpl));
		imprimirConsulta(3, "Obtén la lista de todos los deportistas de un equipo específico.", deportistasEquipoEspecifico);
		
		// Consulta 4
		PatrocinadorDAOImpl patrocinadorDAOImpl = new PatrocinadorDAOImpl(entityManager);
		imprimirConsulta(4, "Identifica y lista todos los patrocinadores asociados a un equipo concreto.", patrocinadorDAOImpl.listarPatrocinadoresAsociadosEquipo(getRandomEquipo(equipoDAOImpl)));
		
		// Consulta 5
		imprimirConsulta(5, "Genera una lista de deportistas y patrocinadores vinculados a un equipo específico.", equipoDAOImpl.generarListaDeportistasPatrocinadoresVinculadosEquipoEspecifico(getRandomEquipo(equipoDAOImpl)));
		
		// Consulta 6
		imprimirConsulta(6, "Calcula y presenta la edad promedio de los deportistas de un equipo determinado.", jugadorDAOImpl.calcularEdadPromedioDeEquipoDeterminado(getRandomEquipo(equipoDAOImpl)));
		
		// Consulta 7
		imprimirConsulta(7, "Cuenta cuantos deportistas tienen más de veintitrés años en la competición agrupados por nacionalidad.", jugadorDAOImpl.contarDeportistasDeMasDeVeintitresAniosAgrupadosPorNacionalidad());
	
		// Consulta 8
		PartidoDAOImpl partidoDAOImpl = new PartidoDAOImpl(entityManager);
		// Inicio
		String msg = partidoDAOImpl.visualizarClasificacion(LocalDate.of(2024, 11, 19), 1);
		// Medio
		msg += partidoDAOImpl.visualizarClasificacion(LocalDate.of(2025, 3, 04), 1);
		// Final
		msg += partidoDAOImpl.visualizarClasificacion(LocalDate.of(2025, 6, 30), 1);
		imprimirConsulta(8, "Visualiza la clasificación al inicio, a mitad de temporada y al final de esta.", msg);
	
		// Consulta 9
		msg = partidoDAOImpl.mostrarEquiposConMasYMenosPuntos(true, 1);
		msg += partidoDAOImpl.mostrarEquiposConMasYMenosPuntos(false, 1);
		imprimirConsulta(9, "Determina y muestra los tres equipos con más puntos y los tres con menos.", msg);
		
		// Consulta 10
		TransferenciaDAOImpl transferenciaDAOImpl = new TransferenciaDAOImpl(entityManager);
		imprimirConsulta(10, "Muestra las nuevas incorporaciones a la competición(utiliza una NamedQuery)", transferenciaDAOImpl.findAll(Transferencia.class));
		
		// Consulta 11
		imprimirConsulta(11, "Enumera todos los fichajes realizados entre los diferentes equipos.", transferenciaDAOImpl.enumerarFichajes());
		
		// Consulta 12
		imprimirConsulta(12, "Realiza un recuento del total de deportistas que participan en la competición.", jugadorDAOImpl.contarTotalDeportistas());
		
		// Consulta 13
		imprimirConsulta(13, "Dado dos equipos muestra sus patrocinadores comunes.", patrocinadorDAOImpl.encontrarPatrocinadoresComunes(getRandomEquipo(equipoDAOImpl).getId(), getRandomEquipo(equipoDAOImpl).getId()));
		
		// Consulta 14
		msg = jugadorDAOImpl.buscarJugadores(36, null, null);
		msg += jugadorDAOImpl.buscarJugadores(25, "Barcelona", null);
		msg += jugadorDAOImpl.buscarJugadores(35, "Real Madrid", "nombre");
		imprimirConsulta(14, "Utiliza CriteriaQuery para poder filtrar por todos los atributos de\r\n"
				+ "los deportistas, edad, nombre, equipo, etc ordenados por un\r\n"
				+ "criterio. Lanza tres ejemplos distintos con diferentes atributos,\r\n"
				+ "uno debe incluir todos los atributos y el resto solo una parte de\r\n"
				+ "ellos. Ejemplo: Dame la lista de deportistas, que tenga X edad ,\r\n"
				+ "pertenezcan al equipo Y ordenados por nombre.", msg);
	}

	private static <T> void imprimirConsulta(int numConsulta, String descripcion, T obj) {
		System.out.println("## " + numConsulta + ". " + descripcion + " ##");
		System.out.println("Resultado query…");
		
		if (obj instanceof List<?>) {
			List<?> list = (List<?>) obj;
			for (Object item : list) {
				System.out.println(item);
			}
		} else {
			System.out.println(obj);
		}

		System.out.println("##################### FIN Consulta " + numConsulta + " #####################\n");
	}
	
	private static Equipo getRandomEquipo(EquipoDAOImpl equipoDAOImpl) {
		List<Equipo> equipos = equipoDAOImpl.findAll(Equipo.class);
		Collections.shuffle(equipos);
		return equipos.get(0);
	}

}
