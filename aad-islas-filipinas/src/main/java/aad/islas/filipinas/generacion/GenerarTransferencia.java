package aad.islas.filipinas.generacion;

import java.time.LocalDate;

import aad.islas.filipinas.entities.Equipo;
import aad.islas.filipinas.entities.Jugador;
import aad.islas.filipinas.entities.Transferencia;
import aad.islas.filipinas.persistence.JugadorDAOImpl;
import aad.islas.filipinas.persistence.TransferenciaDAOImpl;
import jakarta.persistence.EntityManager;

public class GenerarTransferencia {
	static void generarTransferencia(EntityManager entityManager, Jugador jugador, Equipo delEquipo, Equipo alEquipo,
			LocalDate fehcaTransferencia) {
		JugadorDAOImpl jdp = new JugadorDAOImpl(entityManager);
		jugador.setEquipo(alEquipo);
		jdp.update(jugador);
		
		TransferenciaDAOImpl tdp = new TransferenciaDAOImpl(entityManager);
		tdp.insert(new Transferencia(jugador, delEquipo, alEquipo, fehcaTransferencia));
	}
}
