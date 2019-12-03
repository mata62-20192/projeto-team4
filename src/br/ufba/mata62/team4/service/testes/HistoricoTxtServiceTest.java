package br.ufba.mata62.team4.service.testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.ufba.mata62.team4.domain.Aluno;
import br.ufba.mata62.team4.domain.Curso;
import br.ufba.mata62.team4.service.HistoricoTxtService;

class HistoricoTxtServiceTest {
	@Test
	void testGerarHistorico() {
		HistoricoTxtService historicoService = new HistoricoTxtService();
		Curso curso = new Curso("001", "SI");
		Aluno aluno = new Aluno("mario", "12345678", curso);
		Assertions.assertTrue(historicoService.GerarHistorico(aluno));
	}
}