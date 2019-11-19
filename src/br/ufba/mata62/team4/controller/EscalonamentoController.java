package br.ufba.mata62.team4.controller;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.ScrollPane;

public class EscalonamentoController extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EscalonamentoController frame = new EscalonamentoController();
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
	public EscalonamentoController() {
		setTitle("Escalonamento");
		setBounds(100, 100, 478, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCriterioDeEscalonamento = new JLabel("Criterio de escalonamento");
		lblCriterioDeEscalonamento.setBounds(10, 11, 414, 14);
		contentPane.add(lblCriterioDeEscalonamento);
		
		JButton btnOrdemCrescenteDe = new JButton("Ordem crescente de semestre");
		btnOrdemCrescenteDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOrdemCrescenteDe.setBounds(238, 29, 214, 23);
		contentPane.add(btnOrdemCrescenteDe);
		
		JLabel lblEscalonamento = new JLabel("Escalonamento");
		lblEscalonamento.setBounds(10, 59, 414, 14);
		contentPane.add(lblEscalonamento);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(10, 79, 442, 172);
		contentPane.add(scrollPane);
		
		JButton btnOrdemDecrescenteDe = new JButton("Ordem decrescente de CR");
		btnOrdemDecrescenteDe.setBounds(10, 29, 214, 23);
		contentPane.add(btnOrdemDecrescenteDe);
	}
}
