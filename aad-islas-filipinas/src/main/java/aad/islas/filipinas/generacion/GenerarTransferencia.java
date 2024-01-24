package aad.islas.filipinas.generacion;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

import aad.islas.filipinas.entities.Equipo;
import aad.islas.filipinas.entities.Jugador;
import aad.islas.filipinas.entities.Partido;
import aad.islas.filipinas.entities.Transferencia;
import aad.islas.filipinas.persistence.EquipoDAOImpl;
import aad.islas.filipinas.persistence.JugadorDAOImpl;
import aad.islas.filipinas.persistence.PartidoDAOImpl;
import aad.islas.filipinas.persistence.TransferenciaDAOImpl;
import jakarta.persistence.EntityManager;

public class GenerarTransferencia {
	static void transferir(EntityManager entityManager, Jugador jugador, Equipo delEquipo, Equipo alEquipo,
			LocalDate fehcaTransferencia) {
		JugadorDAOImpl jdp = new JugadorDAOImpl(entityManager);
		jugador.setEquipo(alEquipo);
		jdp.update(jugador);
		
		TransferenciaDAOImpl tdp = new TransferenciaDAOImpl(entityManager);
		tdp.insert(new Transferencia(jugador, delEquipo, alEquipo, fehcaTransferencia));
	}
	
	public static void generarTransferenciasAleatorias(EntityManager entityManager, int numTransferencias) {
		Random rand = new Random();
		EquipoDAOImpl equipoDAOImpl = new EquipoDAOImpl(entityManager);
		JugadorDAOImpl jugadorDAOImpl = new JugadorDAOImpl(entityManager);
		PartidoDAOImpl partidoDAOImpl = new PartidoDAOImpl(entityManager);
		
		List<Equipo> equipos = equipoDAOImpl.findAll(Equipo.class);
		List<Jugador> jugadores = jugadorDAOImpl.findAll(Jugador.class);
		List<Partido> partidos = partidoDAOImpl.findAll(Partido.class);
		Jugador jugadorTransferido;
		Equipo delEquipo, alEquipo;
		LocalDate fechaTransferencia = partidos.get(partidos.size()-1).getFechaPartido();
		
		for (int i = 0; i < numTransferencias; i++) {
			jugadorTransferido = jugadores.get(rand.nextInt(jugadores.size()));
			delEquipo = equipos.get(rand.nextInt(equipos.size()-1));
			alEquipo = equipos.get(rand.nextInt(equipos.size()-1));
			fechaTransferencia = fechaTransferencia.plusDays(rand.nextInt(60/numTransferencias));
			transferir(entityManager, jugadorTransferido, delEquipo, alEquipo, fechaTransferencia);
		}
	}
}
