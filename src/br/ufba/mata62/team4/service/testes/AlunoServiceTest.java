package br.ufba.mata62.team4.service.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.ufba.mata62.team4.domain.Aluno;
import br.ufba.mata62.team4.domain.Curso;
import br.ufba.mata62.team4.service.AlunoService;
import junit.framework.Assert;

class AlunoServiceTest {

	AlunoService alunoService;
	Curso curso;
	Aluno aluno;
		
	@BeforeEach
	void setUp() throws Exception {
		alunoService = new AlunoService();
		curso = new Curso("01","Sistemas de informacao");
		aluno = new Aluno("carlos", "12345", curso);
		alunoService.cadastrarAluno(aluno.getNome(), aluno.getNum_matricula(), aluno.getCurso());
	}

	@Test
	void testCadastrarAluno() throws Exception {
		boolean result = alunoService.cadastrarAluno("marcelo", "1234567", curso);
		Assert.assertTrue(result);
		
	}

	@Test
	void testGetAluno() {
		Assert.assertEquals("carlos", alunoService.getAluno("carlos"));
	}

	@Test
	void testExists() {
		fail("Not yet implemented");
	}

	@Test
	void testEmpty() {
		fail("Not yet implemented");
	}

	@Test
	void testCalculaChTotal() {
		fail("Not yet implemented");
	}

	@Test
	void testCalculaChOb() {
		fail("Not yet implemented");
	}

	@Test
	void testCalculaChOp() {
		fail("Not yet implemented");
	}

	@Test
	void testCalculaCr() {
		fail("Not yet implemented");
	}

	@Test
	void testImprimeHistoricoTXT() {
		fail("Not yet implemented");
	}

	@Test
	void testImprimeHistoricoHTML() {
		fail("Not yet implemented");
	}

	@Test
	void testAddComponente() {
		fail("Not yet implemented");
	}

}
