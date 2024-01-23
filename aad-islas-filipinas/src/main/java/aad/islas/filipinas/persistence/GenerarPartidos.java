package aad.islas.filipinas.persistence;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import aad.islas.filipinas.entities.Equipo;
import aad.islas.filipinas.entities.Partido;
import aad.islas.filipinas.entities.Temporada;
import jakarta.persistence.EntityManager;

public class GenerarPartidos {
	static List<Partido> partidos = new ArrayList<Partido>();
	
	public static void generarPartidos(EntityManager entityManager, Temporada temporada) {

		// Importamos todos los equipos de la BBDD
		EquipoDAOPersistence edp = new EquipoDAOPersistence(entityManager);
		List<Equipo> equipos = edp.getAll();
		
		
		LocalDate fechaPartido = LocalDate.of(temporada.getAnoLiga(), 8, 20);
		
		fechaPartido = programarPartidos(equipos, fechaPartido, temporada);
		
		programarPartidos(equipos, fechaPartido, temporada);
        

		// Verificamos que la temporada esté insertada
		TemporadaDAOPersistence tdp = new TemporadaDAOPersistence(entityManager);
		PartidoDAOPersistence pdp = new PartidoDAOPersistence(entityManager);
		temporada.setPartidos(partidos);
		tdp.insert(temporada);
		pdp.insertAll(partidos);
	}
	
    private static LocalDate programarPartidos(List<Equipo> equipos, LocalDate fechaPartido, Temporada temporada) {
        Random rand = new Random();
    	for (int i = 0; i < equipos.size(); i++) {
            for (int j = 0; j < equipos.size(); j++) {
                if (i != j) {
                    partidos.add(new Partido(fechaPartido, equipos.get(i), equipos.get(j), rand.nextInt(6), rand.nextInt(6), temporada));
                    fechaPartido = fechaPartido.plusWeeks(1);
                }
            }
        }
        return fechaPartido;
    }
}
