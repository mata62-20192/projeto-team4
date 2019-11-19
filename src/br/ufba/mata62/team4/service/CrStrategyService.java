package br.ufba.mata62.team4.service;

import java.util.ArrayList;
import  java.util.Collections; 

import br.ufba.mata62.team4.domain.Aluno;

public class CrStrategyService extends EscalonamentoStrategyService{

	@Override
	public ArrayList<Aluno> calculaEscalonamento() {
		CursoService cursoService = new CursoService();
		System.out.println("implementar logica de escalonamento por CR");
		Collections.sort(cursoService.getAlunos());
		 for(Aluno aluno : cursoService.getAlunos()) {
			 System.out.println("Nome: " + aluno.getNome() +" " + "Cr: " + aluno.getcR());
		 }
		return null;
	}

}