/**
 * Esta clase representa una entidad de temporada en el sistema.
 * Contiene información sobre la temporada, como el año de la liga y 
 * la lista de partidos asociados a la misma.
 * 
 * @author Roy
 */

package aad.islas.filipinas.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "season")
public class Temporada {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "league_year")
	private int anoLiga;
	
	@OneToMany(mappedBy = "temporada")
	private List<Partido> partidos;
	
	public Temporada() {
		super();
	}

	public Temporada(int anoLiga, List<Partido> partidos) {
		this.anoLiga = anoLiga;
		this.partidos = partidos;
	}

	public int getId() {
		return id;
	}

	public int getAnoLiga() {
		return anoLiga;
	}

	public void setAnoLiga(int anoLiga) {
		this.anoLiga = anoLiga;
	}

	public List<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}
	
}
	
