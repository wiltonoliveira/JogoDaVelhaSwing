package br.ucsal.velha;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Botao extends JFrame implements ActionListener {
	
	
	JButton l1c1 = new JButton(" ");
	JButton l1c2 = new JButton(" ");
	JButton l1c3 = new JButton(" ");
	
	JButton l2c1 = new JButton(" ");
	JButton l2c2 = new JButton(" ");
	JButton l2c3 = new JButton(" ");
	
	JButton l3c1 = new JButton(" ");
	JButton l3c2 = new JButton(" ");
	JButton l3c3 = new JButton(" ");
	
	public Botao() {
		
		setLayout(new GridLayout(3,3));
		
		add(l1c1);
		l1c1.addActionListener(this);
		
		add(l1c2);
		add(l1c3);
		
		add(l2c1);
		add(l2c2);
		add(l2c3);
		
		add(l3c1);
		add(l3c2);
		add(l3c3);
		
		setTitle("Jogo Da Velha");
		setSize(700,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == l1c1) {
			l1c1.setText("X");
		}
		
		else if (e.getSource() == l1c2) {
			l1c2.setText("O");
		}
	}
	
	
}
