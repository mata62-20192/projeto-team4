package br.ufba.mata62.team4.controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.ufba.mata62.team4.service.CursoService;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastrarAlunoController extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtMatricula;
	private JTextField txtSemestre;
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
	public CadastrarAlunoController(CursoService cursoService) {
		setTitle("Cadastrar aluno");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 11, 414, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 30, 414, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtMatricula = new JTextField();
		txtMatricula.setColumns(10);
		txtMatricula.setBounds(10, 80, 414, 20);
		contentPane.add(txtMatricula);
		
		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setBounds(10, 61, 414, 14);
		contentPane.add(lblMatricula);
		
		txtSemestre = new JTextField();
		txtSemestre.setColumns(10);
		txtSemestre.setBounds(10, 130, 414, 20);
		contentPane.add(txtSemestre);
		
		JLabel lblSemestre = new JLabel("Semestre");
		lblSemestre.setBounds(10, 111, 414, 14);
		contentPane.add(lblSemestre);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String matricula = txtMatricula.getText();
				String semestre = txtSemestre.getText();
				if (nome.isEmpty() || matricula.isEmpty() || semestre.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum dos campos pode ser vazio.");
				} else if (cursoService.exists(matricula, nome)) {
					JOptionPane.showMessageDialog(null, "O aluno ja esta cadastrado.");
				} else {
					try {
						cursoService.cadastrarAluno(nome, matricula, semestre);
					} catch (IllegalStateException er) {
						JOptionPane.showMessageDialog(null, er.getMessage());
					}catch(IllegalArgumentException err) {
						JOptionPane.showMessageDialog(null, err.getMessage());
					}
					setVisible(false);
				}
			}
		});
		btnConfirmar.setBounds(287, 227, 137, 23);
		contentPane.add(btnConfirmar);
	}

}
