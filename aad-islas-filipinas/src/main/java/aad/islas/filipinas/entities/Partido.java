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
	
	
}
