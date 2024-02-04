/**
 * Esta clase representa una entidad de jugador en el sistema.
 * Contiene información sobre el jugador, como su nombre, nacionalidad, 
 * fecha de nacimiento y el equipo al que pertenece.
 * 
 * @author Roy
 */

package aad.islas.filipinas.entities;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

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
	
	@Temporal(TemporalType.DATE)
	@Column(name = "birthdate")
	private LocalDate fechaNacimiento;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "team_id")
	private Equipo equipo;
	
	public Jugador() {
		super();
	}

	public Jugador(String nombreJugador, String nacionalidad, LocalDate fechaNacimiento, Equipo equipo) {
		this.nombreJugador = nombreJugador;
		this.nacionalidad = nacionalidad;
		this.fechaNacimiento = fechaNacimiento;
		this.equipo = equipo;
	}

	public int getId() {
		return id;
	}

	public String getNombreJugador() {
		return nombreJugador;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	
	@Override
	public String toString() {
		return "Equipo: " + this.getEquipo().getNombreEquipo() + ", nombre jugador: " + this.nombreJugador + ", nacionalidad: " + this.nacionalidad;
	}
	
}
