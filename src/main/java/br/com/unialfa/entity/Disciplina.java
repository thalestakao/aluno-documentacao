package br.com.unialfa.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import lombok.EqualsAndHashCode;
import lombok.Getter; 
import lombok.Setter;

@Entity
@Getter @Setter @EqualsAndHashCode
public class Disciplina extends AbstractEntity {

	private String codigoDisciplina;
	private String nomeDisciplina;
	private String codigoTurma;
	private String nomeProfessor;
	
	@OneToMany(mappedBy = "disciplina", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Matricula> matriculas;
}
