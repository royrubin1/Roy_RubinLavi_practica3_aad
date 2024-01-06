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
	
}
