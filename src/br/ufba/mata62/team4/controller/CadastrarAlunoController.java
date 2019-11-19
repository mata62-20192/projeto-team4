package br.ufba.mata62.team4.controller;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import br.ufba.mata62.team4.service.*;
public class CadastrarAlunoController extends JFrame {
	private CursoService cs;
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textMatricula;
	private JTextField textSemestre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarAlunoController frame = new CadastrarAlunoController(new CursoService());
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
	public CadastrarAlunoController(CursoService cs) {
		this.cs = cs;
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNome = new JLabel("Nome");
		contentPane.add(lblNome);
		
		textNome = new JTextField();
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblMatrcula = new JLabel("Matrícula");
		contentPane.add(lblMatrcula);
		
		textMatricula = new JTextField();
		contentPane.add(textMatricula);
		textMatricula.setColumns(10);
		
		JLabel lblSemestre = new JLabel("Semestre");
		contentPane.add(lblSemestre);
		
		textSemestre = new JTextField();
		contentPane.add(textSemestre);
		textSemestre.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		contentPane.add(label_1);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textNome.getText();
				String matricula = textMatricula.getText();
				String semestre = textSemestre.getText();
				
				if (nome.isEmpty()) {
					JOptionPane.showMessageDialog(null, "O nome não pode ser vazio.");
				} else {
					System.out.println(nome + "\n" + matricula + "\n" + semestre);
					
					try {
						cs.cadastrarAluno(nome, matricula, semestre);
					} catch (IllegalStateException er) {
						JOptionPane.showMessageDialog(null, er.getMessage());
					}catch(IllegalArgumentException err) {
						JOptionPane.showMessageDialog(null, err.getMessage());
					}
					setVisible(false);
				}
			}
		});
		contentPane.add(btnSalvar);
		
		JLabel label_2 = new JLabel("");
		contentPane.add(label_2);
	}

}
