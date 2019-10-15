package br.ucsal.velha;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Botao extends JFrame{
	
	private int jogador = 1;
	private String marcador = "X";
	private int jogadas = 0;
	
	
	JButton l1c1 = new JButton("");
	JButton l1c2 = new JButton("");
	JButton l1c3 = new JButton("");
	
	JButton l2c1 = new JButton("");
	JButton l2c2 = new JButton("");
	JButton l2c3 = new JButton("");
	
	JButton l3c1 = new JButton("");
	JButton l3c2 = new JButton("");
	JButton l3c3 = new JButton("");
	
	public Botao() {
		
		setLayout(new GridLayout(3,3));
		
		add(l1c1);
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
		
		acoes();
	}

	
	private void acoes() {
		
		l1c1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				defineMarcador();
				l1c1.setText(marcador);
				l1c1.setEnabled(false);
				jogadas++;
				if(testeTriunfo() == true && jogador ==1)
					JOptionPane.showMessageDialog(null, "Jogador " +l1c1.getText()+" venceu");
				
				else if(testeTriunfo() == true && jogador ==2)
					JOptionPane.showMessageDialog(null, "Jogador " +l1c1.getText()+ " venceu");
				
				else if (jogadas == 9)
					JOptionPane.showMessageDialog(null, "Empate (ou velha a depender da sua idade)");
				
			}
		});
		
		l1c2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				defineMarcador();
				l1c2.setText(marcador);
				l1c2.setEnabled(false);
				jogadas++;
				if(testeTriunfo() == true && jogador ==1)
					JOptionPane.showMessageDialog(null, "Jogador " +l1c2.getText()+" venceu");
				
				else if(testeTriunfo() == true && jogador ==2)
					JOptionPane.showMessageDialog(null, "Jogador " +l1c2.getText()+ " venceu");
				
				else if (jogadas == 9)
					JOptionPane.showMessageDialog(null, "Empate (ou velha a depender da sua idade)");
			}
		});
		
		l1c3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				defineMarcador();
				l1c3.setText(marcador);
				l1c3.setEnabled(false);
				jogadas++;
				if(testeTriunfo() == true && jogador ==1)
					JOptionPane.showMessageDialog(null, "Jogador " +l1c3.getText()+" venceu");
				
				else if(testeTriunfo() == true && jogador ==2)
					JOptionPane.showMessageDialog(null, "Jogador " +l1c3.getText()+ " venceu");
				
				else if (jogadas == 9)
					JOptionPane.showMessageDialog(null, "Empate (ou velha a depender da sua idade)");
						
			}
		});
		
		l2c1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				defineMarcador();
				l2c1.setText(marcador);
				l2c1.setEnabled(false);
				jogadas++;
				if(testeTriunfo() == true && jogador ==1)
					JOptionPane.showMessageDialog(null, "Jogador " +l2c1.getText()+" venceu");
				
				else if(testeTriunfo() == true && jogador ==2)
					JOptionPane.showMessageDialog(null, "Jogador " +l2c1.getText()+ " venceu");
				
				else if (jogadas == 9)
					JOptionPane.showMessageDialog(null, "Empate (ou velha a depender da sua idade)");
			}
		});
		
		l2c2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				defineMarcador();
				l2c2.setText(marcador);
				l2c2.setEnabled(false);
				jogadas++;
				if(testeTriunfo() == true && jogador ==1)
					JOptionPane.showMessageDialog(null, "Jogador " +l2c2.getText()+" venceu");
				
				else if(testeTriunfo() == true && jogador ==2)
					JOptionPane.showMessageDialog(null, "Jogador " +l2c2.getText()+ " venceu");
				
				else if (jogadas == 9)
					JOptionPane.showMessageDialog(null, "Empate (ou velha a depender da sua idade)");
			}
		});
		
		l2c3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				defineMarcador();
				l2c3.setText(marcador);
				l2c3.setEnabled(false);
				jogadas++;
				if(testeTriunfo() == true && jogador ==1)
					JOptionPane.showMessageDialog(null, "Jogador " +l2c3.getText()+" venceu");
				
				else if(testeTriunfo() == true && jogador ==2)
					JOptionPane.showMessageDialog(null, "Jogador " +l2c3.getText()+ " venceu");
				
				else if (jogadas == 9)
					JOptionPane.showMessageDialog(null, "Empate (ou velha a depender da sua idade)");
			}
		});
		
		l3c1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				defineMarcador();
				l3c1.setText(marcador);
				l3c1.setEnabled(false);
				jogadas++;
				if(testeTriunfo() == true && jogador ==1)
					JOptionPane.showMessageDialog(null, "Jogador " +l3c1.getText()+" venceu");
				
				else if(testeTriunfo() == true && jogador ==2)
					JOptionPane.showMessageDialog(null, "Jogador " +l3c1.getText()+ " venceu");

				else if (jogadas == 9)
					JOptionPane.showMessageDialog(null, "Empate (ou velha a depender da sua idade)");
			}
		});
		
		l3c2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				defineMarcador();
				l3c2.setText(marcador);
				l3c2.setEnabled(false);
				jogadas++;
				if(testeTriunfo() == true && jogador ==1)
					JOptionPane.showMessageDialog(null, "Jogador " +l3c2.getText()+" venceu");
				
				else if(testeTriunfo() == true && jogador ==2)
					JOptionPane.showMessageDialog(null, "Jogador " +l3c2.getText()+ " venceu");
				
				else if (jogadas == 9)
					JOptionPane.showMessageDialog(null, "Empate (ou velha a depender da sua idade)");
			}
		});
		
		l3c3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				defineMarcador();
				l3c3.setText(marcador);
				l3c3.setEnabled(false);
				jogadas++;
				if(testeTriunfo() == true && jogador ==1)
					JOptionPane.showMessageDialog(null, "Jogador " +l3c3.getText()+" venceu");
				
				else if(testeTriunfo() == true && jogador ==2)
					JOptionPane.showMessageDialog(null, "Jogador " +l3c3.getText()+ " venceu");
				
				else if (jogadas == 9)
					JOptionPane.showMessageDialog(null, "Empate (ou velha a depender da sua idade)");
			}
		});
	}
	
	
	private void defineMarcador() {
		if (jogador == 1) {
			marcador = "X";
			jogador = 2;
		}
		
		else if (jogador == 2) {
			marcador = "O";
			jogador = 1;
		}
	}
	
	
	private boolean testeTriunfo() {
		
		//caso de vitória na mesma linha
		if (l1c1.getText() == l1c2.getText() && l1c1.getText() == l1c3.getText() && l1c1.getText() != "") {
			return true;
		}
		
		else if (l2c1.getText() == l2c2.getText() && l2c1.getText() == l2c3.getText() && l2c1.getText() != "") {
			return true;
		}
		
		else if (l3c1.getText() == l3c2.getText() && l3c1.getText() == l3c3.getText() && l3c1.getText() != "") {
			return true;
		}
		
		
		//caso de vitória na mesma coluna
		else if (l1c1.getText() == l2c1.getText() && l1c1.getText() == l3c1.getText() && l1c1.getText() != "") {
			return true;
		}
		
		else if (l1c2.getText() == l2c2.getText() && l1c2.getText() == l3c2.getText() && l1c2.getText() != "") {
			return true;
		}
		
		else if (l1c3.getText() == l2c3.getText() && l1c3.getText() == l3c3.getText() && l1c3.getText() != "") {
			return true;
		}
		
		
		//caso de vitória na diagonal
		else if (l1c1.getText() == l2c2.getText() && l1c1.getText() == l3c3.getText() && l1c1.getText() != "") {
			return true;
		}
		
		else if (l3c1.getText() == l2c2.getText() && l3c1.getText() == l1c3.getText() && l3c1.getText() != "") {
			return true;
		}
		
		else
		return false;
	}
}
