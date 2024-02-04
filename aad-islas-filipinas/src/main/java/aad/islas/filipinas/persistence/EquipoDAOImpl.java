/**
 * Esta clase representa una implementación específica de DAO para la entidad Equipo.
 * Se encarga de realizar operaciones de persistencia relacionadas con equipos en la base de datos.
 *
 * @author Roy
 */

package aad.islas.filipinas.persistence;

import java.util.ArrayList;
import java.util.List;

import aad.islas.filipinas.entities.Equipo;
import aad.islas.filipinas.entities.Jugador;
import aad.islas.filipinas.entities.Patrocinador;
import jakarta.persistence.EntityManager;


public class EquipoDAOImpl extends GenericDAOImpl<Equipo>{

	public EquipoDAOImpl(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}
	public List<Object> generarListaDeportistasPatrocinadoresVinculadosEquipoEspecifico(Equipo equipo) {
		List<Object> list = new ArrayList<>();
		list.add(equipo);
		List<Jugador> jugadores = entityManager.createQuery("SELECT j FROM Jugador j WHERE equipo = :equipo", Jugador.class).setParameter("equipo", equipo).getResultList();
		list.addAll(jugadores);
		List<Patrocinador> patrocinadores = entityManager.createQuery("SELECT p FROM Patrocinador p JOIN equipos e WHERE e.id = :id", Patrocinador.class).setParameter("id", equipo.getId()).getResultList();
		list.addAll(patrocinadores);
		return list;	
	}
}
