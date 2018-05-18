package edu.leilao.view;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import edu.leilao.model.Login;


public class LoginView implements ActionListener{
	JTextField tfU = new JTextField();
	JTextField tfS = new JTextField();
	JButton btSalvar = new JButton("Salvar");
	JButton btPesquisar = new JButton("Pesquisar");
	Login login = new Login();
	List<Login> lista = new ArrayList<Login>();
	
	public LoginView() {
		JLabel lbU = new JLabel("Usuário");
		JLabel lbS = new JLabel("Senha");

		JPanel panel = new JPanel(new GridLayout(1, 6));
		JFrame frame = new JFrame("Tela de Login");
		
		btSalvar.addActionListener(this);
		btPesquisar.addActionListener(this);
		
		panel.add(lbU);
		panel.add(tfU);
		panel.add(lbS);
		panel.add(tfS);
		panel.add(btSalvar);
		panel.add(btPesquisar);
		
		frame.setSize(500, 100);
		frame.setContentPane(panel);
		frame.setVisible(true);
		
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Salvar")) {
			login.criarLogin(tfU.getText(),
							 tfS.getText());
			lista.add(login);
			System.out.println("Item adicionado."
					+ "\nA list contém : " +lista.size() +" usuários");
		}
		
	}

}
