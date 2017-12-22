package br.com.unialfa.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.EqualsAndHashCode;

import lombok.Setter;

import lombok.Getter;

@Entity
@Table
@Getter @Setter @EqualsAndHashCode
public class Curso extends AbstractEntity {

	@NotNull
	@Column(name = "nome_curso", nullable = false)
	private String nomeCurso;
	
	@NotNull
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "coordenador_id")
	private Coordenador coordenador;
}
