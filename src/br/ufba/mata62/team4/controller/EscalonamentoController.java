package br.ufba.mata62.team4.controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.ufba.mata62.team4.service.CrStrategyService;
import br.ufba.mata62.team4.service.SemestreStrategyService;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.ScrollPane;

public class EscalonamentoController extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EscalonamentoController frame = new EscalonamentoController(new SemestreStrategyService(), new CrStrategyService());
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
	public EscalonamentoController(SemestreStrategyService semestreStrategy, CrStrategyService crStrategy) {
		setTitle("Escalonamento");
		setBounds(100, 100, 478, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCriterioDeEscalonamento = new JLabel("Criterio de escalonamento");
		lblCriterioDeEscalonamento.setBounds(10, 11, 414, 14);
		contentPane.add(lblCriterioDeEscalonamento);
		
		JButton btnOrdemCrescenteDeSemestre = new JButton("Ordem crescente de semestre");
		btnOrdemCrescenteDeSemestre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				semestreStrategy.calculaEscalonamento();
			}
		});
		btnOrdemCrescenteDeSemestre.setBounds(238, 29, 214, 23);
		contentPane.add(btnOrdemCrescenteDeSemestre);
		
		JLabel lblEscalonamento = new JLabel("Escalonamento");
		lblEscalonamento.setBounds(10, 59, 414, 14);
		contentPane.add(lblEscalonamento);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(10, 79, 442, 172);
		contentPane.add(scrollPane);
		
		JButton btnOrdemDecrescenteDeCr = new JButton("Ordem decrescente de CR");
		btnOrdemDecrescenteDeCr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crStrategy.calculaEscalonamento();
			}
		});
		btnOrdemDecrescenteDeCr.setBounds(10, 29, 214, 23);
		contentPane.add(btnOrdemDecrescenteDeCr);
	}
}