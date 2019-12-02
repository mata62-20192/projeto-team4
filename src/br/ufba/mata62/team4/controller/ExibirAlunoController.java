package br.ufba.mata62.team4.controller;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.ufba.mata62.team4.domain.Aluno;
import br.ufba.mata62.team4.service.AlunoService;
import br.ufba.mata62.team4.service.HistoricoHtmlService;
import br.ufba.mata62.team4.service.HistoricoTxtService;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExibirAlunoController extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblNome;
	private JLabel lblMatricula;
	private JLabel lblSemestre;
	private JPanel contentPane;
	private Aluno aluno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExibirAlunoController frame = new ExibirAlunoController(new AlunoService(), new HistoricoTxtService(), new HistoricoHtmlService() );
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public ExibirAlunoController(String aluno, String matricula, String semestre, Aluno aluno2) {
		this(new AlunoService(), new HistoricoTxtService(), new HistoricoHtmlService());
		this.aluno = aluno2;
		lblMatricula.setText("Matricula: "+ matricula);
		lblSemestre.setText("Semestre: "+ semestre);
		lblNome.setText(aluno);
	}

	/**
	 * Create the frame.
	 * @param alunoService 
	 * @wbp.parser.constructor
	 */
	
	public ExibirAlunoController(AlunoService alunoService, HistoricoTxtService historicoTxt, HistoricoHtmlService historicoHtml) {
		setTitle("Exibir aluno");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 211);
		contentPane.add(panel);
		
		JLabel lblNomeDoAluno = new JLabel("Nome do aluno:");
		lblNomeDoAluno.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		panel.add(lblNomeDoAluno);
		
		JButton btnNewButton = new JButton("Imprimir historico TXT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				historicoTxt.GerarHistorico(aluno);
				System.out.println("Imprimiu historico em arquivo txt criado na pasta do projeto");
			}
		});
		btnNewButton.setBounds(10, 227, 196, 23);
		contentPane.add(btnNewButton);
		
		JButton btnImprimirHistoricoHtml = new JButton("Imprimir historico HTML");
		btnImprimirHistoricoHtml.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				historicoHtml.GerarHistorico(aluno);
				System.out.println("Imprimiu historico em arquivo html criado na pasta do projeto");
			}
		});
		btnImprimirHistoricoHtml.setBounds(228, 227, 196, 23);
		contentPane.add(btnImprimirHistoricoHtml);
		
		lblNome = new JLabel("XYZ");
		panel.add(lblNome);
		lblMatricula = new JLabel("XYZ");
		panel.add(lblMatricula);
		lblSemestre = new JLabel("XYZ");
		panel.add(lblSemestre);
	}
}