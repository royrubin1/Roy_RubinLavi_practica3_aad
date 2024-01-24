package aad.islas.filipinas.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Competicion {
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String nombre;
	
	@Column(name = "num_jornadas")
	private int numJornadas;
	
	@Column(name = "num_equipos")
	private int numEquipos;

	public Competicion(String nombre, int numJornadas, int numEquipos) {
		super();
		this.nombre = nombre;
		this.numJornadas = numJornadas;
		this.numEquipos = numEquipos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumJornadas() {
		return numJornadas;
	}

	public void setNumJornadas(int numJornadas) {
		this.numJornadas = numJornadas;
	}

	public int getNumEquipos() {
		return numEquipos;
	}

	public void setNumEquipos(int numEquipos) {
		this.numEquipos = numEquipos;
	}

	public int getId() {
		return id;
	}
	
	
}
