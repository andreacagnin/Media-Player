package com.sp0tify.view;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Label;
import java.awt.Font;
import javax.swing.SwingConstants;

import com.sp0tify.control.MainController;

import javax.swing.JTextArea;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import java.awt.Color;

/**
 * Class <code>ModificaPlaylist</code> pannello per modificare una playlist
 * @author andre
 *
 */
public class ModificaPlaylist extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel panel;
	private JTextField textFieldNome;
	private JLabel lblNome;
	private JLabel lblDescrizione;
	private Label labelModificaDettagli;
	private JTextArea textAreaDescrizione;
	private JButton btnSalvaModifica;
	private JButton btnChiudiModifica;
	private JButton btnEliminaPlaylist;

	/**
	 * Creazione del pannello
	 */
	public ModificaPlaylist() {
		setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(24, 24, 24));
		panel.setBounds(0, 0, 354, 345);
		add(panel);
		panel.setLayout(null);
		
		textFieldNome = new JTextField();
		textFieldNome.setAutoscrolls(false);
		textFieldNome.setDoubleBuffered(true);
		textFieldNome.setDragEnabled(true);
		textFieldNome.setIgnoreRepaint(true);
		textFieldNome.setInheritsPopupMenu(true);
		textFieldNome.setFocusCycleRoot(true);
		textFieldNome.setFocusTraversalPolicyProvider(true);
		textFieldNome.setForeground(new Color(255, 255, 255));
		textFieldNome.setBorder(null);
		textFieldNome.setBackground(new Color(64, 64, 64));
		textFieldNome.setBounds(10, 71, 324, 36);
		panel.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		lblNome = new JLabel("Nome");
		lblNome.setForeground(new Color(255, 255, 255));
		lblNome.setBounds(10, 57, 46, 14);
		panel.add(lblNome);
		
		lblDescrizione = new JLabel("Descrizione (facoltativa)");
		lblDescrizione.setForeground(new Color(255, 255, 255));
		lblDescrizione.setBounds(10, 145, 182, 14);
		panel.add(lblDescrizione);
		
		labelModificaDettagli = new Label("Modifica Caratteristiche");
		labelModificaDettagli.setFocusable(false);
		labelModificaDettagli.setFocusTraversalKeysEnabled(false);
		labelModificaDettagli.setForeground(new Color(255, 255, 255));
		labelModificaDettagli.setAlignment(Label.RIGHT);
		labelModificaDettagli.setFont(new Font("Tahoma", Font.BOLD, 15));
		labelModificaDettagli.setBounds(10, 10, 172, 36);
		panel.add(labelModificaDettagli);
		
		textAreaDescrizione = new JTextArea();
		textAreaDescrizione.setForeground(new Color(255, 255, 255));
		textAreaDescrizione.setBackground(new Color(64, 64, 64));
		textAreaDescrizione.setLineWrap(true);
		textAreaDescrizione.setFocusTraversalKeysEnabled(false);
		textAreaDescrizione.setInheritsPopupMenu(true);
		textAreaDescrizione.setMaximumSize(new Dimension(30, 30));
		textAreaDescrizione.setBounds(10, 170, 324, 119);
		panel.add(textAreaDescrizione);
		
		btnSalvaModifica = new JButton("Salva modifiche");
		btnSalvaModifica.setForeground(new Color(255, 255, 255));
		btnSalvaModifica.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSalvaModifica.setContentAreaFilled(false);
		btnSalvaModifica.setDefaultCapable(false);
		btnSalvaModifica.setFocusPainted(false);
		btnSalvaModifica.setFocusTraversalKeysEnabled(false);
		btnSalvaModifica.setFocusable(false);
		btnSalvaModifica.setRequestFocusEnabled(false);
		btnSalvaModifica.setRolloverEnabled(false);
		btnSalvaModifica.setVerifyInputWhenFocusTarget(false);
		btnSalvaModifica.setHorizontalAlignment(SwingConstants.LEFT);
		btnSalvaModifica.setBounds(195, 311, 139, 23);
		panel.add(btnSalvaModifica);
		
		btnChiudiModifica = new JButton("");
		btnChiudiModifica.setIcon(new ImageIcon("C:\\Users\\andre\\eclipse-workspace\\Sp0tify\\src\\media\\images\\cancelLogo.png"));
		btnChiudiModifica.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnChiudiModifica.setVerifyInputWhenFocusTarget(false);
		btnChiudiModifica.setOpaque(false);
		btnChiudiModifica.setRolloverEnabled(false);
		btnChiudiModifica.setRequestFocusEnabled(false);
		btnChiudiModifica.setFocusTraversalKeysEnabled(false);
		btnChiudiModifica.setFocusable(false);
		btnChiudiModifica.setFocusPainted(false);
		btnChiudiModifica.setDefaultCapable(false);
		btnChiudiModifica.setContentAreaFilled(false);
		btnChiudiModifica.setBorderPainted(false);
		btnChiudiModifica.setBounds(324, 10, 20, 20);
		panel.add(btnChiudiModifica);
		
		btnEliminaPlaylist = new JButton("Elimina playlist");
		btnEliminaPlaylist.setVerifyInputWhenFocusTarget(false);
		btnEliminaPlaylist.setRolloverEnabled(false);
		btnEliminaPlaylist.setRequestFocusEnabled(false);
		btnEliminaPlaylist.setHorizontalAlignment(SwingConstants.LEFT);
		btnEliminaPlaylist.setForeground(Color.WHITE);
		btnEliminaPlaylist.setFocusable(false);
		btnEliminaPlaylist.setFocusTraversalKeysEnabled(false);
		btnEliminaPlaylist.setFocusPainted(false);
		btnEliminaPlaylist.setDefaultCapable(false);
		btnEliminaPlaylist.setContentAreaFilled(false);
		btnEliminaPlaylist.setBounds(10, 311, 139, 23);
		panel.add(btnEliminaPlaylist);
		
	}
	
	public void setTextFieldNome(String string) {
		this.textFieldNome.setText(string);
	}

	public void setTextAreaDescrizione(String string) {
		this.textAreaDescrizione.setText(string);
	}

	/**
	 * Pulizia dei campi 
	 */
	public void buffer() {
		textFieldNome.setText("");
		textAreaDescrizione.setText("");
	}
	
	public boolean getVisible() {
		return isVisible();
	}
	
	public String getTextNome() {
		return textFieldNome.getText();
	}
	
	public String getTextDescrizione() {
		return textAreaDescrizione.getText();
	}

	public void registraEventi(MainController controllerContainer1Bottoni) {
		// TODO Auto-generated method stub
		btnSalvaModifica.addActionListener(controllerContainer1Bottoni);
		btnChiudiModifica.addActionListener(controllerContainer1Bottoni);
		btnEliminaPlaylist.addActionListener(controllerContainer1Bottoni);
	}

	public Object getBtnChiudiModifica() {
		// TODO Auto-generated method stub
		return btnChiudiModifica;
	}

	public Object getBtnSalvaModifica() {
		// TODO Auto-generated method stub
		return btnSalvaModifica;
	}

	public Object getBtnEliminaPlaylist() {
		// TODO Auto-generated method stub
		return btnEliminaPlaylist;
	}
}