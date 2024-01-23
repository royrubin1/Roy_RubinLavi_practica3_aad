package aad.islas.filipinas.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
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
	
	@ManyToMany(mappedBy = "patrocinadores", cascade = CascadeType.PERSIST)
    private List<Equipo> equipos;

	public Patrocinador(String nombrePatrocinador) {
		this.nombrePatrocinador = nombrePatrocinador;
		this.equipos = new ArrayList<Equipo>();
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

	public List<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
	}
	
	public void addEquipo(Equipo equipo) {
	    this.equipos.add(equipo);
	}
	
}
