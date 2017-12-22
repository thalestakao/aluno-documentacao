package br.com.unialfa.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.unialfa.entity.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, Long> {

}
