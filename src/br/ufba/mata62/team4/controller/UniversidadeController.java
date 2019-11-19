package br.ufba.mata62.team4.controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import br.ufba.mata62.team4.service.CursoService;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UniversidadeController {

	private JFrame frmUniversidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		CursoService cursoService = new CursoService();
		frmUniversidade = new JFrame();
		frmUniversidade.setTitle("Universidade");
		frmUniversidade.setBounds(100, 100, 497, 300);
		frmUniversidade.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUniversidade.getContentPane().setLayout(null);
		
		JButton btnCadastrarAluno = new JButton("Cadastrar aluno");
		btnCadastrarAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new CadastrarAlunoController(cursoService).setVisible(true);
			}
		});
		btnCadastrarAluno.setBounds(10, 76, 147, 23);
		frmUniversidade.getContentPane().add(btnCadastrarAluno);
		
		JButton btnListarAlunos = new JButton("Listar alunos");
		btnListarAlunos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ListarAlunosController(cursoService).setVisible(true);
			}
		});
		btnListarAlunos.setBounds(167, 76, 147, 23);
		frmUniversidade.getContentPane().add(btnListarAlunos);
		
		JButton btnBuscarAluno = new JButton("Buscar aluno");
		btnBuscarAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new BuscarAlunoController(cursoService).setVisible(true);
			}
		});
		btnBuscarAluno.setBounds(324, 76, 147, 23);
		frmUniversidade.getContentPane().add(btnBuscarAluno);
		
		JButton btnListarCurrculo = new JButton("Listar curr\u00EDculo");
		btnListarCurrculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ListarCurriculoController().setVisible(true);
			}
		});
		btnListarCurrculo.setBounds(10, 125, 147, 23);
		frmUniversidade.getContentPane().add(btnListarCurrculo);
		
		JButton btnEscalonamento = new JButton("Escalonamento");
		btnEscalonamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ListarCurriculoController().setVisible(true);
			}
		});
		btnEscalonamento.setBounds(167, 125, 147, 23);
		frmUniversidade.getContentPane().add(btnEscalonamento);
	}
}
