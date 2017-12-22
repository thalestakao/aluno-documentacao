package br.com.unialfa.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter @Setter @EqualsAndHashCode
public class Coordenador extends AbstractEntity{

	@NotNull
	@Column(name = "nome_completo", nullable = false)
	private String nomeCompleto;
	
	@OneToMany(mappedBy = "coordenador", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Curso> cursos;
	
	@OneToMany(mappedBy = "coordenador", cascade = {CascadeType.MERGE, CascadeType.PERSIST}, fetch = FetchType.EAGER)
	private Set<Documento> documentos;
}
