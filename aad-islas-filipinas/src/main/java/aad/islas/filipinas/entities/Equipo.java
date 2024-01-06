package aad.islas.filipinas.entities;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
	
	@OneToMany(mappedBy = "team")
	private ArrayList<Jugador> jugadores;
	
	@OneToMany(mappedBy = "teams")
	private ArrayList<Patrocinador> sponsors;

	public Equipo(String nombreEquipo, ArrayList<Jugador> jugadores, ArrayList<Patrocinador> sponsors) {
		this.nombreEquipo = nombreEquipo;
		this.jugadores = jugadores;
		this.sponsors = sponsors;
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

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public ArrayList<Patrocinador> getSponsors() {
		return sponsors;
	}

	public void setSponsors(ArrayList<Patrocinador> sponsors) {
		this.sponsors = sponsors;
	}
	
}
