package br.ufba.mata62.team4.controller;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.ufba.mata62.team4.service.CursoService;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Canvas;
import java.awt.ScrollPane;
import java.awt.Panel;
import javax.swing.JButton;

public class BuscarAlunoController extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private CursoService cursoService;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuscarAlunoController frame = new BuscarAlunoController(new CursoService());
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param cursoService 
	 */
	public BuscarAlunoController(CursoService cursoService) {
		setTitle("Buscar aluno");
		this.cursoService = cursoService;
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomeDoAluno = new JLabel("Nome do aluno");
		lblNomeDoAluno.setBounds(10, 11, 414, 14);
		contentPane.add(lblNomeDoAluno);
		
		textField = new JTextField();
		textField.setBounds(10, 27, 293, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(10, 58, 414, 14);
		contentPane.add(lblResultado);
		
		ScrollPane scrollPane_1 = new ScrollPane();
		scrollPane_1.setBounds(10, 78, 414, 173);
		contentPane.add(scrollPane_1);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(319, 26, 105, 23);
		contentPane.add(btnPesquisar);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(10, 78, 100, 100);
	}
}
