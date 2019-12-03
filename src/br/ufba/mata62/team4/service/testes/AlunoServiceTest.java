package br.ufba.mata62.team4.service.testes;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.ufba.mata62.team4.domain.Aluno;
import br.ufba.mata62.team4.domain.ComponenteCurricular;
import br.ufba.mata62.team4.domain.Conceito;
import br.ufba.mata62.team4.domain.Curso;
import br.ufba.mata62.team4.domain.Disciplina;
import br.ufba.mata62.team4.service.AlunoService;
import br.ufba.mata62.team4.service.CursoService;

class AlunoServiceTest {

	CursoService cursoService;
	AlunoService alunoService;
	Curso curso;
	Aluno aluno2;
	Aluno aluno3;
	
		
	@BeforeEach
	void setUp() throws Exception {
		alunoService = new AlunoService();
		curso = new Curso("001", "SI");
		aluno2 = new Aluno("mario", "12345678", curso);
		aluno3 = new Aluno("pedro", "123456789", curso);
		Disciplina engSoft = new Disciplina("MATA63", "Engenharia de Software I", 68);
		Disciplina sistemasOperacioanais = new Disciplina("MATA55", "Sistemas Operacionais", 68);
		Disciplina adm = new Disciplina("MATA55", "ADM", 68);
		ComponenteCurricular cmp = new ComponenteCurricular(engSoft, curso, "OB");
		ComponenteCurricular cmp2 = new ComponenteCurricular(sistemasOperacioanais, curso, "OB");
		ComponenteCurricular cmp3 = new ComponenteCurricular(adm, curso, "OP");
		alunoService.addComponente(aluno3, cmp);
		aluno3.getDisciplinasCursadas().get(0).setConceito(Conceito.Aprovado);
		aluno3.getDisciplinasCursadas().get(0).setNota(7);
		alunoService.addComponente(aluno3, cmp2);
		aluno3.getDisciplinasCursadas().get(1).setConceito(Conceito.Aprovado);
		aluno3.getDisciplinasCursadas().get(1).setNota(3);
		alunoService.addComponente(aluno3, cmp3);
		aluno3.getDisciplinasCursadas().get(2).setConceito(Conceito.Aprovado);
		aluno3.getDisciplinasCursadas().get(2).setNota(5);
	}

	@Test
	void testCalculaChTotal() {
		Assertions.assertEquals(0, alunoService.calculaChTotal(aluno2));
		
		Assertions.assertEquals(204, alunoService.calculaChTotal(aluno3));
	}

	@Test
	void testCalculaChOb() {
		Assertions.assertEquals(0, alunoService.calculaChOb(aluno2));
		
		Assertions.assertEquals(136, alunoService.calculaChOb(aluno3));
	}

	@Test
	void testCalculaChOp() {
		Assertions.assertEquals(0, alunoService.calculaChOp(aluno2));
		
		Assertions.assertEquals(68, alunoService.calculaChOp(aluno3));
	}

	@Test
	void testCalculaCr() {		
		Assertions.assertEquals(0.0, alunoService.calculaCr(aluno2));

		Assertions.assertEquals(5.0, alunoService.calculaCr(aluno3));
	}

	@Test
	void testImprimeHistoricoTXT() throws IOException {
		Assertions.assertTrue(alunoService.imprimeHistoricoTXT(aluno3));
	}

	@Test
	void testImprimeHistoricoHTML() throws IOException {
		Assertions.assertTrue(alunoService.imprimeHistoricoHTML(aluno3));
	}

	@Test
	void testAddComponente() {
		Disciplina disciplina = new Disciplina("000", "Redes", 68); 
		ComponenteCurricular cmp = new ComponenteCurricular(disciplina, curso, "OB");
		Aluno aluno2 = new Aluno("mario", "12345678", curso);
		
		alunoService.addComponente(aluno2, cmp);
		
		Assertions.assertEquals(cmp.getDisciplina().getNome(), aluno2.getDisciplinasCursadas().get(0).getComponenteCurricular().getDisciplina().getNome());
	}
}
