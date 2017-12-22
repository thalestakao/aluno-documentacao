package br.com.unialfa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.unialfa.entity.Aluno;
import br.com.unialfa.entity.Disciplina;
import br.com.unialfa.entity.Matricula;
import br.com.unialfa.repository.AlunoRepository;
import br.com.unialfa.view.LoginView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;

@SpringBootApplication
public class AlunoDocumentacaoApplication extends AbstractJavaFxApplicationSupport implements CommandLineRunner {

	@Autowired
	AlunoRepository alunoRepository;
	
	public static void main(String[] args) {
		launchApp(AlunoDocumentacaoApplication.class, LoginView.class, args);
		SpringApplication.run(AlunoDocumentacaoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		Disciplina calculo = new Disciplina();
		Disciplina calculo2 = new Disciplina();
		
		calculo.setCodigoTurma("MAT5119");
		calculo.setNomeDisciplina("Cálculo I");
		calculo.setNomeProfessor("Professor de Cálculo I");
		calculo.setCodigoTurma("GO1301");
		
		calculo2.setCodigoDisciplina("MAT5121");
		calculo2.setNomeDisciplina("Calculo II");
		calculo2.setNomeProfessor("Professor de Cálculo II");
		calculo2.setCodigoTurma("GO1301");
		
		
		Aluno aluno = new Aluno();
		aluno.setCodigoMatricula("20172141030");
		aluno.setEmail("joao@teste.com.br");
		aluno.setNomeCompleto("Joao da Silva");
		aluno.setPeriodo(1);
		
		Matricula matricula = new Matricula();
		matricula.setAno(2017);
		matricula.setAluno(aluno);
		matricula.setSemestre(2);
		matricula.setDisciplina(calculo);
		
		
		Matricula matricula2 = new Matricula();
		matricula2.setAno(2017);
		matricula2.setAluno(aluno);
		matricula2.setSemestre(2);
		matricula2.setDisciplina(calculo2);
		
		Set<Matricula> colecaoDeMatriculas = new HashSet<>();
		colecaoDeMatriculas.add(matricula);
		colecaoDeMatriculas.add(matricula2);
		aluno.setMatirculas(colecaoDeMatriculas);
		
//		alunoRepository.save(aluno);
		
//		Aluno aluno2 = alunoRepository.findOne(1L);
		
//		System.out.println(aluno2.getMatirculas().get(0).getDisciplina().getNomeDisciplina());
//		System.out.println(aluno2.getMatirculas().get(1).getDisciplina().getNomeDisciplina());
				
//		Coordenador coordenador = new Coordenador();
//		coordenador.setNomeCompleto("Thales Baliero Takáo");
//		
//		Curso cursoEngenhariaDaComputacao = new Curso();
//		cursoEngenhariaDaComputacao.setNomeCurso("Engenharia da Computação");
//		cursoEngenhariaDaComputacao.setCoordenador(coordenador);
//		
//		Curso cursoSistemasDeInformacao  = new Curso();
//		cursoSistemasDeInformacao.setCoordenador(coordenador);
//		cursoSistemasDeInformacao.setNomeCurso("Sistemas de Informação");
//		
		
	}
}
