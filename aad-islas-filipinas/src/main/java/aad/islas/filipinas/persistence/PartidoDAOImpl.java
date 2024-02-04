/**
 * Esta clase representa una implementación específica de DAO para la entidad Partido.
 * Se encarga de realizar operaciones de persistencia relacionadas con partidos en la base de datos.
 *
 * @author Roy
 */
package aad.islas.filipinas.persistence;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import aad.islas.filipinas.entities.Partido;
import jakarta.persistence.EntityManager;

public class PartidoDAOImpl extends GenericDAOImpl<Partido> {

	public PartidoDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	public String visualizarClasificacion(LocalDate fecha, int idTemporada) {
	    String query = "SELECT t.id, t.nombreEquipo, "
	            + "SUM(CASE WHEN t = m.equipoLocal AND m.fechaPartido <= :fecha THEN CASE WHEN m.golesEquipoLocal > m.golesEquipoVistante THEN 3 WHEN m.golesEquipoLocal = m.golesEquipoVistante THEN 1 ELSE 0 END ELSE 0 END) + "
	            + "SUM(CASE WHEN t = m.equipoVisitante AND m.fechaPartido <= :fecha THEN CASE WHEN m.golesEquipoVistante > m.golesEquipoLocal THEN 3 WHEN m.golesEquipoVistante = m.golesEquipoLocal THEN 1 ELSE 0 END ELSE 0 END) "
	            + "AS puntos "
	            + "FROM Partido m JOIN m.equipoLocal el JOIN m.equipoVisitante ev, Equipo t "
	            + "WHERE m.temporada.id = :temporadaId AND (el = t OR ev = t) "
	            + "GROUP BY t.id, t.nombreEquipo "
	            + "ORDER BY puntos DESC";
	    List<Object[]> clasificaciones = entityManager.createQuery(query, Object[].class)
	            .setParameter("fecha", fecha)
	            .setParameter("temporadaId", idTemporada)
	            .getResultList();
	    String msg = "\nClasificación hasta la fecha: " + fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n";
	    for (Object[] clasificacion : clasificaciones) {
	        Integer id = (Integer) clasificacion[0];
	        String nombreEquipo = (String) clasificacion[1];
	        Long puntos = (Long) clasificacion[2];
	        msg += "Equipo: " + id + " - " + nombreEquipo + ", puntos: " + puntos + "\n";
	    }
	    return msg;
	}
	
	public String mostrarEquiposConMasYMenosPuntos(boolean mas, int idTemporada) {
		String orden;
		String msg;
		if (mas) {
			orden = "DESC";
			msg = "\nEquipos con más puntos: \n";
		}else{
			orden = "ASC";
			msg = "\nEquipos con menos puntos: \n";
		}
	    // Consulta para los tres equipos con más puntos
	    String jpqlMasPuntos = "SELECT t.nombreEquipo, "
	            + "SUM(CASE WHEN t = m.equipoLocal THEN CASE WHEN m.golesEquipoLocal > m.golesEquipoVistante THEN 3 WHEN m.golesEquipoLocal = m.golesEquipoVistante THEN 1 ELSE 0 END ELSE 0 END) + "
	            + "SUM(CASE WHEN t = m.equipoVisitante THEN CASE WHEN m.golesEquipoVistante > m.golesEquipoLocal THEN 3 WHEN m.golesEquipoVistante = m.golesEquipoLocal THEN 1 ELSE 0 END ELSE 0 END) "
	            + "AS puntos "
	            + "FROM Partido m JOIN m.equipoLocal el JOIN m.equipoVisitante ev, Equipo t "
	            + "WHERE m.temporada.id = :temporadaId AND (el.id = t.id OR ev.id = t.id) "
	            + "GROUP BY t.nombreEquipo "
	            + "ORDER BY puntos " + orden;
	    List<Object[]> clasificacion = entityManager.createQuery(jpqlMasPuntos, Object[].class)
	            .setParameter("temporadaId", idTemporada)
	            .setMaxResults(3)
	            .getResultList();

	    
	    for (Object[] registro : clasificacion) {
	        String nombreEquipo = (String) registro[0];
	        Long puntos = (Long) registro[1];
	        msg += "Equipo: " + nombreEquipo + ", puntos: " + puntos + "\n";
	    }
	    return msg;
	}


}
