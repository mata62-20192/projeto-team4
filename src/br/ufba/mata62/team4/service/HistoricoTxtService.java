package br.ufba.mata62.team4.service;

import java.io.IOException;

import br.ufba.mata62.team4.domain.Aluno;

public class HistoricoTxtService extends HistoricoService {

	@Override
	public boolean GerarHistorico(Aluno aluno) {
		AlunoService alunoService = new AlunoService();
		try {
			alunoService.imprimeHistoricoTXT(aluno);
			return true;
		} catch (IOException e) {
			return false;
		}
	}
}