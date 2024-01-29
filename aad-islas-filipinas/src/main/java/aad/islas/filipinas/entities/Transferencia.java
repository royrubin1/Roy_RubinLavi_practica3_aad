/**
 * Esta clase representa una entidad de transferencia en el sistema.
 * Contiene información sobre la transferencia de un jugador de un equipo a otro, 
 * incluyendo el jugador involucrado, los equipos de origen y destino, y la fecha de la transferencia.
 * 
 * @author Roy
 */

package aad.islas.filipinas.entities;

import java.time.LocalDate;
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
@Table(name = "transfer")
public class Transferencia {
	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne
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
	private LocalDate fechaTransferencia;

	public Transferencia(Jugador jugador, Equipo delEquipo, Equipo alEquipo, LocalDate transferDate) {
		super();
		this.jugador = jugador;
		this.delEquipo = delEquipo;
		this.alEquipo = alEquipo;
		this.fechaTransferencia = transferDate;
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

	public LocalDate getFechaTransferencia() {
		return fechaTransferencia;
	}

	public void setFechaTransferencia(LocalDate fechaTransferencia) {
		this.fechaTransferencia = fechaTransferencia;
	}

	public int getId() {
		return id;
	}
	
}
