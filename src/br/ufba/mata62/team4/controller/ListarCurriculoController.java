package br.ufba.mata62.team4.controller;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.ufba.mata62.team4.domain.Aluno;
import br.ufba.mata62.team4.domain.ComponenteCurricular;
import br.ufba.mata62.team4.service.CursoService;

import javax.swing.JLabel;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.GridLayout;

public class ListarCurriculoController extends JFrame {

	private CursoService cursoService;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarCurriculoController frame = new ListarCurriculoController(new CursoService());
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
	public ListarCurriculoController(CursoService cursoService) {
		this.cursoService = cursoService;
		setTitle("Listar curriculo");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		criarBotoesDosComponentes();
	}
	
	private void criarBotoesDosComponentes() {
		
		ArrayList<ComponenteCurricular> componentes = this.cursoService.getComponentes();
		for (ComponenteCurricular cmp : componentes) {
			JButton buttonComponente = new JButton(cmp.getDisciplina().getNome());
			contentPane.add(buttonComponente);
		}
		
	}
}
