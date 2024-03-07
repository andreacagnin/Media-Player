package com.sp0tify.view;

import javax.swing.JPanel;

import com.sp0tify.control.MainController;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Cursor;

/**
 * Class <code>PannelloInLibreria</code> pannello per selezionare le verie
 * playlist e anche i brani che ti piacciono
 * 
 * @author andre
 *
 */
public class PannelloInLibreria extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel panel;
	private JButton btnNewButton;

	/**
	 * Creazione del pannello
	 */
	public PannelloInLibreria() {
		setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(13, 148, 136));
		panel.setBounds(0, 0, 283, 185);
		add(panel);
		panel.setLayout(null);
		
		btnNewButton = new JButton("Brani che ti piacciono");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setRolloverEnabled(false);
		btnNewButton.setRequestFocusEnabled(false);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setDefaultCapable(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setFocusTraversalKeysEnabled(false);
		btnNewButton.setFocusable(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setOpaque(false);
		btnNewButton.setBounds(0, 0, 282, 185);
		panel.add(btnNewButton);

	}

	public void registraEventi(MainController mainController) {
		// TODO Auto-generated method stub
		btnNewButton.addActionListener(mainController);
	}
	
	public void setNomeBtn(String nome) {
		btnNewButton.setText(nome);
	}
	
	public JButton getBtnBraniFavoriti() {
		// TODO Auto-generated method stub
		return btnNewButton;
	}
	
	public Object getActionBtnBraniFavoriti() {
		// TODO Auto-generated method stub
		return btnNewButton;
	}

}
