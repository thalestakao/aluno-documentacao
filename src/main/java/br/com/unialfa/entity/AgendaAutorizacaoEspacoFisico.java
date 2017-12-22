package br.com.unialfa.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter @Setter @EqualsAndHashCode
public class AgendaAutorizacaoEspacoFisico extends AbstractEntity {
	
	@NotNull
	@Column(name = "data", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date data;
	
	@NotNull
	@Column(name = "horario_inicio", nullable = false)
	@Temporal(TemporalType.TIME)
	private Date horarioInicio;
	
	@NotNull
	@Column(name = "horario_fim", nullable = false)
	@Temporal(TemporalType.TIME)
	private Date horarioFim;
	
	@NotNull
	@Column(name = "espaco", nullable = false)
	private String espacoFisico;
	
	
}