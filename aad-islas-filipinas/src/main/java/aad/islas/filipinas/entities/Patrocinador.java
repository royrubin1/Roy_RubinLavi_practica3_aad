package aad.islas.filipinas.entities;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "sponsor")
public class Patrocinador {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "sponsor_name")
	private String nombrePatrocinador;
	
	@ManyToMany
    @JoinTable(
            name = "team_sponsor",
            joinColumns = @JoinColumn(name = "sponsor_id"),
            inverseJoinColumns = @JoinColumn(name = "team_id")
        )
	private ArrayList<Equipo> equipos;

	public Patrocinador(String nombrePatrocinador, ArrayList<Equipo> equipos) {
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

	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}
	
}
