package br.ufba.mata62.team4.service;

import br.ufba.mata62.team4.domain.Universidade;

public class UniversidadeService {
	
	private static Universidade universidade = new Universidade("UFBA");
	
	public static Universidade getUniversidade() {
		return universidade;
	}
}