package br.com.unialfa.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Aluno extends AbstractEntity {
	
	@NotNull
	@Column(name = "nome_comppleto", nullable = false)
	private String nomeCompleto;
	
	@NotNull
	@Column(name = "codigo_matricula", nullable = false)
	private String codigoMatricula;
	
	@Column(name = "periodo")
	private Integer periodo;
	
	@Pattern(regexp = ".+@.+\\.[a-z]+", message = "Deve ser um e-mail válido")
	private String email;
	
	@OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Matricula> matirculas;
	
	@OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Documento> documemntos;

}
