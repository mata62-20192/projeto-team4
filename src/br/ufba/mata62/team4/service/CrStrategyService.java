package br.ufba.mata62.team4.service;

import  java.util.Collections;
import br.ufba.mata62.team4.domain.Aluno;

public class CrStrategyService extends EscalonamentoStrategyService{

	@Override
	public boolean calculaEscalonamento() {
		CursoService cursoService = new CursoService();
		cursoService.cadastrarAluno("mateus", "1", "2019.1");
		AlunoService alunoService = new AlunoService();
		System.out.println("Escalonamento:");
		Collections.sort(cursoService.getAlunos());
		 for(Aluno aluno : cursoService.getAlunos()) {
			 System.out.println("Nome: " + aluno.getNome() +" " + "Cr: " + alunoService.calculaCr(aluno));
		 }
		return true;
	}
}