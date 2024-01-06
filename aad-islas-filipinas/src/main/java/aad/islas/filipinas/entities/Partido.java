package aad.islas.filipinas.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
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
	
	@ManyToMany
	@JoinColumn(name = "team_home_id")
	private Equipo teamHome;

	public Partido(Date matchDate, Equipo teamHome) {
		super();
		this.matchDate = matchDate;
		this.teamHome = teamHome;
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
}