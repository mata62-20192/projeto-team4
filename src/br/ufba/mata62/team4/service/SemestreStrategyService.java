package br.ufba.mata62.team4.service;

public class SemestreStrategyService extends EscalonamentoStrategyService {

	@Override
	public boolean calculaEscalonamento() {
		System.out.println("implementar logica de escalonamento por semestre");
		return true;
	}
}