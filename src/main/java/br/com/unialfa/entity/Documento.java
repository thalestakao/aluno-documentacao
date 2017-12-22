package br.com.unialfa.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter @Setter @EqualsAndHashCode
public abstract class Documento implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.TABLE) 
	private Long id;
	
	@Version
	private int version;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "aluno_id", nullable = false)
	protected Aluno aluno;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "coordenador_id")
	protected Coordenador coordenador;
}
