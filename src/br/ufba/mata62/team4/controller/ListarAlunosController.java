package br.ufba.mata62.team4.controller;

import java.awt.BorderLayout;
import java.awt.Container;
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

import javax.swing.JScrollPane;
import java.awt.GridLayout;
import java.awt.ScrollPane;

public class ListarAlunosController extends JFrame {

	private CursoService cursoService;
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
		this.cursoService = cursoService;
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		criarBotoesDosAlunos();
	}
	
	private void criarBotoesDosAlunos() {

		ArrayList<Aluno> alunos = this.cursoService.getAlunos();
		for (Aluno aluno : alunos) {
			JButton buttonAluno = new JButton(aluno.getNome());
			buttonAluno.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("Clicou no aluno " + aluno.getNome());
					new ExibirAlunoController(aluno.getNome(), aluno.getNum_matricula(), aluno.getPeriodo_ingresso()).setVisible(true);
				}
			});
			contentPane.add(buttonAluno);
			
		}
	}

}
