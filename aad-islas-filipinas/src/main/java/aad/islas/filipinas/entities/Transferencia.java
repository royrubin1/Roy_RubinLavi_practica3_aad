package aad.islas.filipinas.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "transfer")
public class Transferencia {
	@Id
	@GeneratedValue
	private int id;
	
	@ManyToMany
	@JoinColumn(name = "player_id")
	private Jugador jugador;
	
	@ManyToOne
	@JoinColumn(name = "from_team_id")
	private Equipo delEquipo;
	
	@ManyToOne
	@JoinColumn(name = "to_team_id")
	private Equipo alEquipo;
	
	@Column(name = "transfer_date")
	@Temporal(TemporalType.DATE)
	private Date transferDate;

	public Transferencia(Jugador jugador, Equipo delEquipo, Equipo alEquipo, Date transferDate) {
		super();
		this.jugador = jugador;
		this.delEquipo = delEquipo;
		this.alEquipo = alEquipo;
		this.transferDate = transferDate;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Equipo getDelEquipo() {
		return delEquipo;
	}

	public void setDelEquipo(Equipo delEquipo) {
		this.delEquipo = delEquipo;
	}

	public Equipo getAlEquipo() {
		return alEquipo;
	}

	public void setAlEquipo(Equipo alEquipo) {
		this.alEquipo = alEquipo;
	}

	public Date getTransferDate() {
		return transferDate;
	}

	public void setTransferDate(Date transferDate) {
		this.transferDate = transferDate;
	}

	public int getId() {
		return id;
	}
	
}
