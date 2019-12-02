package br.ufba.mata62.team4.controller;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.ufba.mata62.team4.domain.ComponenteCurricular;
import br.ufba.mata62.team4.service.CursoService;

import java.util.ArrayList;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class ListarCurriculoController extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		
		JButton btnImprimirCurriculoTxt = new JButton("Imprimir Curriculo TXT");
		btnImprimirCurriculoTxt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					cursoService.imprimeCurriculoCursoTXT();
					System.out.println("Imprimiu curriculo do curso em arquivo txt criado na pasta do projeto");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		contentPane.add(btnImprimirCurriculoTxt);
		
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