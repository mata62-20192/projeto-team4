package br.ufba.mata62.team4.service;

import java.util.ArrayList;

import javax.swing.JPanel;

import br.ufba.mata62.team4.domain.Aluno;

public abstract class EscalonamentoStrategyService {
	
	public abstract ArrayList<Aluno> calculaEscalonamento(JPanel contentPane);
	
}