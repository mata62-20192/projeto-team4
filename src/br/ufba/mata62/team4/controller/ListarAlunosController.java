package br.ufba.mata62.team4.controller;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.ufba.mata62.team4.domain.Aluno;
import br.ufba.mata62.team4.service.CursoService;

import java.awt.GridLayout;

public class ListarAlunosController extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarAlunosController frame = new ListarAlunosController(new CursoService());
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ListarAlunosController(CursoService cursoService) {
		setTitle("Listar alunos");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		criarBotoesDosAlunos(cursoService);
	}
	
	private void criarBotoesDosAlunos(CursoService cursoService) {
		ArrayList<Aluno> alunos = cursoService.getAlunos();
		for (Aluno aluno : alunos) {
			JButton buttonAluno = new JButton(aluno.getNome());
			buttonAluno.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new ExibirAlunoController(aluno.getNome(), aluno.getNum_matricula(), aluno.getPeriodoIngresso(), aluno).setVisible(true);
				}
			});
			contentPane.add(buttonAluno);
		}
	}

}