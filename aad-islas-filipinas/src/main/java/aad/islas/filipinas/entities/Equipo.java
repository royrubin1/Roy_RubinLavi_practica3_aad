/**
 * Esta clase representa una entidad de equipo en el sistema.
 * Contiene información sobre el equipo, como su nombre, presupuesto, jugadores, 
 * patrocinadores y estadio.
 * 
 * @author Roy
 */

package aad.islas.filipinas.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "team")

public class Equipo {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "team_name")
	private String nombreEquipo;
	
	@Column(name = "budget")
	private double presupuesto;
	
	@OneToMany(mappedBy = "equipo",cascade = CascadeType.PERSIST)
	private List<Jugador> jugadores;
	
	@ManyToMany
    @JoinTable(
        name = "team_sponsor",
        joinColumns = @JoinColumn(name = "team_id"),
        inverseJoinColumns = @JoinColumn(name = "sponsor_id")
    )
    private List<Patrocinador> patrocinadores;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "estadio_id")
	private Estadio estadio;

	public Equipo(String nombreEquipo, double presupuesto, List<Jugador> jugadores, List<Patrocinador> patrocinadores, Estadio estadio) {
		this.nombreEquipo = nombreEquipo;
		this.presupuesto = presupuesto;
		this.jugadores = jugadores;
		this.patrocinadores = patrocinadores;
		this.estadio = estadio;
	}

	public int getId() {
		return id;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public List<Patrocinador> getPatrocinadores() {
		return patrocinadores;
	}

	public void setPatrocinadores(List<Patrocinador> patrocinadores) {
		this.patrocinadores = patrocinadores;
	}

	public Estadio getEstadio() {
		return estadio;
	}

	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
	
}
