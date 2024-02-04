/**
 * Esta clase representa una implementación específica de DAO para la entidad Jugador.
 * Se encarga de realizar operaciones de persistencia relacionadas con jugadores en la base de datos.
 *
 * @author Roy
 */
package aad.islas.filipinas.persistence;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import aad.islas.filipinas.entities.Equipo;
import aad.islas.filipinas.entities.Jugador;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;


public class JugadorDAOImpl extends GenericDAOImpl<Jugador>{

	public JugadorDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}
	
	public List<Jugador> obtenerDeportistasEquipoEspecifico(Equipo equipo) {
		Query query = this.entityManager.createQuery("SELECT j FROM Jugador j WHERE j.equipo = :equipo", Jugador.class);
		query.setParameter("equipo", equipo);
		@SuppressWarnings("unchecked")
		List<Jugador> jugaodres = query.getResultList();
		return jugaodres;
	}
	
	public String calcularEdadPromedioDeEquipoDeterminado(Equipo equipo) {
		@SuppressWarnings("unchecked")
		List<LocalDate> fechasNacimiento = entityManager.createQuery("SELECT j.fechaNacimiento FROM Jugador j WHERE equipo = :equipo").setParameter("equipo", equipo).getResultList();
		
		double edadTotal = 0;
		for (LocalDate fechaNacimiento : fechasNacimiento) {
			Period edad = Period.between(fechaNacimiento, LocalDate.now());
			edadTotal += edad.getYears();
		}
		return "La edad media de " + equipo.getNombreEquipo() + " es: " + (edadTotal / fechasNacimiento.size()) + " años";
	}
	
    public String contarDeportistasDeMasDeVeintitresAniosAgrupadosPorNacionalidad() {
        LocalDate fechaActualHaceVeintitresAnios = LocalDate.now().minusYears(23);
        
        List<Object[]> resultados = entityManager.createQuery(
            "SELECT j.nacionalidad, COUNT(j) FROM Jugador j WHERE j.fechaNacimiento <= :fechaLimite "
            + "GROUP BY j.nacionalidad", Object[].class)
            .setParameter("fechaLimite", fechaActualHaceVeintitresAnios)
            .getResultList();
        
        String resultado = "";
        for (Object[] registro : resultados) {
            String nacionalidad = (String) registro[0];
            Long cuenta = (Long) registro[1];
            resultado = "Nacionalidad: " + nacionalidad + ", número de filas: " + cuenta + "\n";
        }

        return resultado;
    }
    
	public String contarTotalDeportistas(){
		return "Total de deportistas que participan en la competición: " + entityManager.createQuery("SELECT count(j) FROM Jugador j", int.class).getSingleResult();
    }
	
	public String buscarJugadores(Integer edad, String nombreEquipo, String ordenarPor) {
		String msg = "\nConsulta de jugadores con los parametros: ";
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Jugador> cq = cb.createQuery(Jugador.class);
        Root<Jugador> jugador = cq.from(Jugador.class);
        
        Predicate predicate = cb.conjunction();
        
        if (edad != null) {
        	msg += "edad,";
            LocalDate fechaCorte = LocalDate.now().minusYears(edad);
            predicate = cb.and(predicate, cb.lessThanOrEqualTo(jugador.get("fechaNacimiento"), fechaCorte));
        }
        
        if (nombreEquipo != null) {
        	msg += "equipo, ";
            predicate = cb.and(predicate, cb.equal(jugador.get("equipo").get("nombreEquipo"), nombreEquipo));
        }
        
        cq.select(jugador).where(predicate);
        
        if (ordenarPor != null) {
        	msg += "orden";
            if (ordenarPor.equals("nombre")) {
                cq.orderBy(cb.asc(jugador.get("nombreJugador")));
            }
        }

        List<Jugador> jugadores = entityManager.createQuery(cq).getResultList();
        
        for (Jugador registro : jugadores) {
        	msg += "\n" + registro.toString();
        }
		return msg;
    }
	

}
