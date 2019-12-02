package br.ufba.mata62.team4.controller;

import java.awt.EventQueue;

import javax.swing.JFrame;

import br.ufba.mata62.team4.service.CrStrategyService;
import br.ufba.mata62.team4.service.CursoService;
import br.ufba.mata62.team4.service.SemestreStrategyService;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UniversidadeController {

	private JFrame frmUniversidade;

	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UniversidadeController window = new UniversidadeController();
					window.frmUniversidade.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UniversidadeController() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUniversidade = new JFrame();
		frmUniversidade.setTitle("Universidade");
		frmUniversidade.setBounds(100, 100, 497, 300);
		frmUniversidade.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUniversidade.getContentPane().setLayout(null);
		
		JButton btnCadastrarAluno = new JButton("Cadastrar aluno");
		btnCadastrarAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new CadastrarAlunoController(new CursoService()).setVisible(true);
			}
		});
		btnCadastrarAluno.setBounds(93, 88, 147, 23);
		frmUniversidade.getContentPane().add(btnCadastrarAluno);
		
		JButton btnListarAlunos = new JButton("Listar alunos");
		btnListarAlunos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ListarAlunosController(new CursoService()).setVisible(true);
			}
		});
		btnListarAlunos.setBounds(250, 88, 147, 23);
		frmUniversidade.getContentPane().add(btnListarAlunos);
		
		JButton btnListarCurrculo = new JButton("Listar curriculo");
		btnListarCurrculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ListarCurriculoController(new CursoService()).setVisible(true);
			}
		});
		btnListarCurrculo.setBounds(250, 136, 147, 23);
		frmUniversidade.getContentPane().add(btnListarCurrculo);
		
		JButton btnEscalonamento = new JButton("Escalonamento");
		btnEscalonamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new EscalonamentoController(new SemestreStrategyService(), new CrStrategyService()).setVisible(true);
			}
		});
		btnEscalonamento.setBounds(93, 136, 147, 23);
		frmUniversidade.getContentPane().add(btnEscalonamento);
	}
}