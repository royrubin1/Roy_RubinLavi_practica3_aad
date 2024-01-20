package add.islas.filipinas.main;

import aad.islas.filipinas.persistence.GenerarJugadores;
import aad.islas.filipinas.persistence.JugadorDAOPersistence;

public class SimulacionMain {
	public static void main(String[] args) {
		JugadorDAOPersistence jdp = new JugadorDAOPersistence();
		jdp.insertAll(GenerarJugadores.generarJugadores());
	}
}
