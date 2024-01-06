package aad.islas.filipinas.entities;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "season")
public class Temporada {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "league_year")
	private int anoLiga;
	
	@OneToMany(mappedBy = "season")
	private ArrayList<Partido> partidos;
	
}
	
