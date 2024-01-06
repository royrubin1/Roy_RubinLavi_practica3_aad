package aad.islas.filipinas.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "player")
public class Jugador {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "name")
	private String nombreJugador;
	
	@Column(name = "nationality")
	private String nacionalidad;
	
	@Column(name = "birthdate")
	private Date fechaNacimiento;
	
	@ManyToOne
	@JoinColumn(name = "team_id")
	private Equipo equipo;
}
