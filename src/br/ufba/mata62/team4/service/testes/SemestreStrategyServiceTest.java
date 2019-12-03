package br.ufba.mata62.team4.service.testes;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.ufba.mata62.team4.service.SemestreStrategyService;

class SemestreStrategyServiceTest {
	@Test
	void testCalculaEscalonamento() {
		SemestreStrategyService semestreStrategyService = new SemestreStrategyService();
		
		Assertions.assertTrue(semestreStrategyService.calculaEscalonamento());
	}
}