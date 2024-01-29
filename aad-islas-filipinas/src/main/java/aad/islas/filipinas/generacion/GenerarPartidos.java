/**
 * Esta clase se encarga de generar partidos para una temporada de liga.
 * Utiliza equipos existentes en la base de datos y programa partidos aleatorios
 * con fechas durante la temporada.
 *
 * @author Roy
 */

package aad.islas.filipinas.generacion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import aad.islas.filipinas.entities.Equipo;
import aad.islas.filipinas.entities.Partido;
import aad.islas.filipinas.entities.Temporada;
import aad.islas.filipinas.persistence.EquipoDAOImpl;
import aad.islas.filipinas.persistence.PartidoDAOImpl;
import aad.islas.filipinas.persistence.TemporadaDAOImpl;
import jakarta.persistence.EntityManager;

public class GenerarPartidos {
	static List<Partido> partidos = new ArrayList<Partido>();
	
	public static void generarPartidos(EntityManager entityManager, Temporada temporada) {

		// Importamos todos los equipos de la BBDD
		EquipoDAOImpl edp = new EquipoDAOImpl(entityManager);
		List<Equipo> equipos = edp.findAll(Equipo.class);
		
		
		LocalDate fechaPartido = LocalDate.of(temporada.getAnoLiga(), 8, 20);
		
		fechaPartido = programarPartidos(equipos, fechaPartido, temporada);
		
		programarPartidos(equipos, fechaPartido, temporada);
        

		// Verificamos que la temporada esté insertada
		TemporadaDAOImpl tdp = new TemporadaDAOImpl(entityManager);
		PartidoDAOImpl pdp = new PartidoDAOImpl(entityManager);
		temporada.setPartidos(partidos);
		tdp.insert(temporada);
		pdp.insertAll(partidos);
	}
	
    private static LocalDate programarPartidos(List<Equipo> equipos, LocalDate fechaPartido, Temporada temporada) {
        Random rand = new Random();
    	for (int i = 0; i < equipos.size(); i++) {
    		fechaPartido = fechaPartido.plusWeeks(rand.nextInt(3)+1);
            for (int j = 0; j < equipos.size(); j++) {
                if (i != j) {
                    partidos.add(new Partido(fechaPartido, equipos.get(i), equipos.get(j), rand.nextInt(6), rand.nextInt(6), temporada));
                }
            }
        }
        return fechaPartido;
    }
}
