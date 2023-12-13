package tde.modulo5.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "reserva")
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long idReserva;
	
	@Column(nullable=false)
	private String checkout;
	
	@Column(nullable=false)
	private String checkin;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario", nullable=false)
	private Usuario idUsuario;
	
	@ManyToOne
	@JoinColumn(name = "idDestino", nullable=false)
	private Destino idDestino;

}

