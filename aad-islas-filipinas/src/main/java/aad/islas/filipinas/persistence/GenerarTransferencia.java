package aad.islas.filipinas.persistence;

import java.time.LocalDate;

import aad.islas.filipinas.entities.Equipo;
import aad.islas.filipinas.entities.Jugador;
import aad.islas.filipinas.entities.Transferencia;
import jakarta.persistence.EntityManager;

public class GenerarTransferencia {
	static void generarTransferencia(EntityManager entityManager, Jugador jugador, Equipo delEquipo, Equipo alEquipo,
			LocalDate fehcaTransferencia) {
		JugadorDAOPersistence jdp = new JugadorDAOPersistence(entityManager);
		jugador.setEquipo(alEquipo);
		jdp.update(jugador);
		
		TransferenciaDAOPersistence tdp = new TransferenciaDAOPersistence(entityManager);
		tdp.insert(new Transferencia(jugador, delEquipo, alEquipo, fehcaTransferencia));
	}
}
