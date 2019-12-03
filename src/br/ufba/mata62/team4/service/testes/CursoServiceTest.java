package br.ufba.mata62.team4.service.testes;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.ufba.mata62.team4.domain.ComponenteCurricular;
import br.ufba.mata62.team4.domain.Curso;
import br.ufba.mata62.team4.domain.Disciplina;
import br.ufba.mata62.team4.domain.Semestre;
import br.ufba.mata62.team4.service.CursoService;

class CursoServiceTest {

	CursoService cursoService;
	Curso curso;
	
	@BeforeEach
	void setUp() throws Exception {
		cursoService = new CursoService();
		curso = new Curso("001", "SI");
		Disciplina engSoft = new Disciplina("MATA63", "Engenharia de Software I", 68);
		ComponenteCurricular cmp = new ComponenteCurricular(engSoft, curso, "OB");
		Disciplina adm = new Disciplina("MATA55", "ADM", 68);
		ComponenteCurricular cmp2 = new ComponenteCurricular(adm, curso, "OP");
		cursoService.getCurso().addDisciplinaCurso(cmp);
		Semestre semestre = new Semestre("2019.1", cursoService.getCurso());
		semestre.addDisciplina(cmp2);
		ArrayList<Semestre> semestres= new ArrayList<Semestre>();
		semestres.add(semestre);
		cursoService.getCurso().setDisc_obrigatorias(semestres);
		cursoService.cadastrarAluno("paula", "3", "2019.2");
	}

	@Test
	void testCadastrarAluno() {
		Assertions.assertTrue(cursoService.cadastrarAluno("carla", "2", "2019.2"));
	}

	@Test
	void testGetCurso() {
		Assertions.assertEquals("1", cursoService.getCurso().getCodigo());
	}

	@Test
	void testGetComponentes() {
		Assertions.assertEquals(7, cursoService.getComponentes().size());
	}

	@Test
	void testGetAlunos() {
		Assertions.assertEquals(6, cursoService.getAlunos().size());
	}

	@Test
	void testExists() {
		Assertions.assertTrue(cursoService.exists("3", "aa"));
		Assertions.assertTrue(cursoService.exists("44", "paula"));
		Assertions.assertFalse(cursoService.exists("44", "aa"));	
	}

	@Test
	void testImprimeCurriculoCursoTXT() throws IOException {
		Assertions.assertTrue(cursoService.imprimeCurriculoCursoTXT());
	}
}