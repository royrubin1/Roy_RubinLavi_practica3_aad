package aad.islas.filipinas.entities;

import java.util.Set;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "sponsor")
public class Patrocinador {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "sponsor_name")
	private String nombrePatrocinador;
	
	@ManyToMany(mappedBy = "sponsors")
    private Set<Equipo> equipos;

	public Patrocinador(String nombrePatrocinador, Set<Equipo> equipos) {
		this.nombrePatrocinador = nombrePatrocinador;
		this.equipos = equipos;
	}

	public int getId() {
		return id;
	}

	public String getNombrePatrocinador() {
		return nombrePatrocinador;
	}

	public void setNombrePatrocinador(String nombrePatrocinador) {
		this.nombrePatrocinador = nombrePatrocinador;
	}

	public Set<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(Set<Equipo> equipos) {
		this.equipos = equipos;
	}
	
}
