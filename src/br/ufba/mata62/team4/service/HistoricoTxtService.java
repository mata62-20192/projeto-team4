package br.ufba.mata62.team4.service;

import java.io.IOException;

import br.ufba.mata62.team4.domain.Aluno;

public class HistoricoTxtService extends HistoricoService {

	@Override
	public void GerarHistorico(Aluno aluno) {
		AlunoService alunoService = new AlunoService();
		try {
			alunoService.imprimeHistoricoTXT(aluno);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
