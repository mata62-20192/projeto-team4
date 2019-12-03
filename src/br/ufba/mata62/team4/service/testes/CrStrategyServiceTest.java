package br.ufba.mata62.team4.service.testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.ufba.mata62.team4.service.CrStrategyService;

class CrStrategyServiceTest {
	@Test
	void testCalculaEscalonamento() {
		CrStrategyService crStrategyService = new CrStrategyService();
		
		Assertions.assertTrue(crStrategyService.calculaEscalonamento());
	}
}