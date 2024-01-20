package aad.islas.filipinas.entities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "team")

public class Equipo {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "team_name")
	private String nombreEquipo;
	
	@OneToMany(mappedBy = "equipo",cascade = CascadeType.ALL)
	private Set<Jugador> jugadores;
	
	@ManyToMany
    @JoinTable(
        name = "team_sponsor",
        joinColumns = @JoinColumn(name = "team_id"),
        inverseJoinColumns = @JoinColumn(name = "sponsor_id")
    )
    private Set<Patrocinador> patrocinadores;

	public Equipo(String nombreEquipo, Set<Jugador> jugadores, Set<Patrocinador> patrocinadores) {
		this.nombreEquipo = nombreEquipo;
		this.jugadores = jugadores;
		this.patrocinadores = patrocinadores;
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

	public Set<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(Set<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public Set<Patrocinador> getpatrocinadores() {
		return patrocinadores;
	}

	public void setpatrocinadores(Set<Patrocinador> patrocinadores) {
		this.patrocinadores = patrocinadores;
	}
	
}
