package aad.islas.filipinas.entities;

import java.util.Date;

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
	private Date matchDate;
	
	@ManyToOne
	@JoinColumn(name = "team_home_id")
	private Equipo teamHome;
	
	@ManyToOne
	@JoinColumn(name = "season_id")
	private Temporada season;

	public Partido(Date matchDate, Equipo teamHome, Temporada season) {
	    this.matchDate = matchDate;
	    this.teamHome = teamHome;
	    this.season = season;
	}

	public Date getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}

	public Equipo getTeamHome() {
		return teamHome;
	}

	public void setTeamHome(Equipo teamHome) {
		this.teamHome = teamHome;
	}

	public int getId() {
		return id;
	}
	
	public Temporada getSeason() {
	    return season;
	}

	public void setSeason(Temporada season) {
	    this.season = season;
	}
}
