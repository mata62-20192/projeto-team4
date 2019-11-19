package br.ufba.mata62.team4.controller;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;

public class ExibirAlunoController extends JFrame {
	private JLabel lblNome;
	private JLabel lblMatricula;
	private JLabel lblSemestre;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExibirAlunoController frame = new ExibirAlunoController();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ExibirAlunoController(String aluno, String matricula, String semestre) {
		this();
		lblMatricula.setText("Matricula: "+matricula);
		lblSemestre.setText("Semestre: "+ semestre);
		lblNome.setText(aluno);
	}
	
	/**
	 * Create the frame.
	 */
	public ExibirAlunoController() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNomeDoAluno = new JLabel("Nome do aluno:");
		lblNomeDoAluno.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		contentPane.add(lblNomeDoAluno);
		
		lblNome = new JLabel("XYZ");
		contentPane.add(lblNome);
		lblMatricula = new JLabel("XYZ");
		contentPane.add(lblMatricula);
		lblSemestre = new JLabel("XYZ");
		contentPane.add(lblSemestre);
	}

}
