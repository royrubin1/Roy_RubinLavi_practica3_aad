package aad.islas.filipinas.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

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
}
