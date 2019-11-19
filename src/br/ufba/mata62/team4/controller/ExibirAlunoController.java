package br.ufba.mata62.team4.controller;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.ufba.mata62.team4.domain.Aluno;
import br.ufba.mata62.team4.service.AlunoService;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class ExibirAlunoController extends JFrame {
	
	private JLabel lblNome;
	private JLabel lblMatricula;
	private JLabel lblSemestre;
	private JPanel contentPane;
	private AlunoService alunoService;
	private Aluno aluno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExibirAlunoController frame = new ExibirAlunoController(new AlunoService());
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public ExibirAlunoController(String aluno, String matricula, String semestre) {
		this(new AlunoService());
		lblMatricula.setText("Matricula: "+ matricula);
		lblSemestre.setText("Semestre: "+ semestre);
		lblNome.setText(aluno);
	}

	/**
	 * Create the frame.
	 * @param alunoService 
	 * @wbp.parser.constructor
	 */
	
	public ExibirAlunoController(AlunoService alunoService) {
		this.alunoService = alunoService;
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
				String al = lblNome.toString();
				try {
					alunoService.imprimeHistoricoTXT(alunoService.getAluno(al));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(10, 227, 196, 23);
		contentPane.add(btnNewButton);
		
		JButton btnImprimirHistoricoHtml = new JButton("Imprimir historico HTML");
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
