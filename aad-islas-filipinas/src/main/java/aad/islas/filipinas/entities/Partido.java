package aad.islas.filipinas.entities;

import java.time.LocalDate;

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
@Table(name = "league_match")
public class Partido {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "match_date")
	@Temporal(TemporalType.DATE)
	private LocalDate matchDate;
	
	@ManyToOne
	@JoinColumn(name = "team_home_id")
	private Equipo equipoLocal;
	
	@ManyToOne
	@JoinColumn(name = "team_away_id")
	private Equipo equipoVisitante;
	
	@Column(name = "team_home_goals")
	private int golesEquipoLocal;
	
	@Column(name = "team_away_goals")
	private int golesEquipoVistante;
	
	@ManyToOne
	@JoinColumn(name = "temporada_id")
	private Temporada temporada;


	public Partido(LocalDate matchDate, Equipo equipoLocal, Equipo equipoVisitante, int golesEquipoLocal,
			int golesEquipoVistante, Temporada temporada) {
		this.matchDate = matchDate;
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.golesEquipoLocal = golesEquipoLocal;
		this.golesEquipoVistante = golesEquipoVistante;
		this.temporada = temporada;
	}

	public LocalDate getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(LocalDate matchDate) {
		this.matchDate = matchDate;
	}

	public Equipo getequipoLocal() {
		return equipoLocal;
	}

	public void setequipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public int getId() {
		return id;
	}
	
	public Temporada getTemporada() {
	    return temporada;
	}

	public void setTemporada(Temporada temporada) {
	    this.temporada = temporada;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public int getGolesEquipoLocal() {
		return golesEquipoLocal;
	}

	public void setGolesEquipoLocal(int golesEquipoLocal) {
		this.golesEquipoLocal = golesEquipoLocal;
	}

	public int getGolesEquipoVistante() {
		return golesEquipoVistante;
	}

	public void setGolesEquipoVistante(int golesEquipoVistante) {
		this.golesEquipoVistante = golesEquipoVistante;
	}
}
