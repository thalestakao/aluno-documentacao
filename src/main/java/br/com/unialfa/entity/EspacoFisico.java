package br.com.unialfa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter @Setter @EqualsAndHashCode
public class EspacoFisico extends AbstractEntity {

	@Column(name = "nome_espaco_fisico", nullable = false)
	@NotNull
	private String nomeEspaco;
	
	@Column(name = "qtd_alocacao")
	private Integer qtdAlocacao;
	
}
