/**
 * Esta clase representa una implementación específica de DAO para la entidad Patrocinador.
 * Se encarga de realizar operaciones de persistencia relacionadas con patrocinadores en la base de datos.
 *
 * @author Roy
 */
package aad.islas.filipinas.persistence;

import java.util.List;

import aad.islas.filipinas.entities.Equipo;
import aad.islas.filipinas.entities.Patrocinador;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;


public class PatrocinadorDAOImpl extends GenericDAOImpl<Patrocinador> {

	public PatrocinadorDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	public List<Patrocinador> listarPatrocinadoresAsociadosEquipo(Equipo equipo) {
		Query query = entityManager.createQuery("SELECT p FROM Patrocinador "
											  + "p JOIN p.equipos e WHERE e.id = :id", Patrocinador.class);
		query.setParameter("id", equipo.getId());
		@SuppressWarnings("unchecked")
		List<Patrocinador> patrocinadores = query.getResultList();
		return patrocinadores;
	}
	
	public List<Patrocinador> encontrarPatrocinadoresComunes(int idEquipo1, int idEquipo2) {
        return entityManager.createQuery("SELECT p FROM Patrocinador p " +
                "JOIN p.equipos e1 " +
                "JOIN p.equipos e2 " +
                "WHERE e1.id = :idEquipo1 AND e2.id = :idEquipo2", Patrocinador.class)
		        .setParameter("idEquipo1", idEquipo1)
		        .setParameter("idEquipo2", idEquipo2)
		        .getResultList();
    }
}
