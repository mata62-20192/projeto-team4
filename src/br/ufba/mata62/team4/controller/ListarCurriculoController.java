package br.ufba.mata62.team4.controller;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.ScrollPane;

public class ListarCurriculoController extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarCurriculoController frame = new ListarCurriculoController();
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
	public ListarCurriculoController() {
		setTitle("Listar curriculo");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCurriculoDoCurso = new JLabel("Curriculo do curso");
		lblCurriculoDoCurso.setBounds(10, 11, 414, 14);
		contentPane.add(lblCurriculoDoCurso);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(10, 31, 414, 220);
		contentPane.add(scrollPane);
	}

}
