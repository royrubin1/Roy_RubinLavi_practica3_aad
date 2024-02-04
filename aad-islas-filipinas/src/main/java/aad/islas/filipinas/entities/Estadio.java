/**
 * Esta clase representa una entidad de estadio en el sistema.
 * Contiene información sobre el estadio, como su nombre y el equipo asociado que lo utiliza.
 * 
 * @author Roy
 */

package aad.islas.filipinas.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Estadio {
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String nombre;

	@OneToOne(mappedBy = "estadio", cascade = CascadeType.ALL)
	private Equipo equipo;
	
	public Estadio() {
		super();
	}

	public Estadio(String nombre, Equipo equipo) {
		this.nombre = nombre;
		this.equipo = equipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
}
