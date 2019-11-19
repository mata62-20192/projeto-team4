package br.ufba.mata62.team4.controller;

import java.awt.EventQueue;
import br.ufba.mata62.team4.service.*;

import javax.swing.JFrame;


import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainController {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainController window = new MainController();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainController() {
		initialize();
		System.out.println(UniversidadeService.getUniversidade().getNome());
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		CursoService cs = new CursoService();
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnCadastrarAluno = new JButton("Cadastrar Aluno");
		btnCadastrarAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CadastrarAlunoController(cs).setVisible(true);
			}
		});
		frame.getContentPane().add(btnCadastrarAluno);
		
		JButton btnNewButton = new JButton("Listar Alunos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ListarAlunosController(cs).setVisible(true);
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JButton btnExibirCurrculo = new JButton("Exibir Currículo");
		frame.getContentPane().add(btnExibirCurrculo);
		
		JButton btnExibirEscalonamento = new JButton("Exibir Escalonamento");
		frame.getContentPane().add(btnExibirEscalonamento);
	}

}
