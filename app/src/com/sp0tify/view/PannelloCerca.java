package com.sp0tify.view;

import javax.swing.*;

import com.sp0tify.control.*;

import java.awt.*;

public class PannelloCerca extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField textFieldCerca;
	private JButton btnCerca;
	private JList<String> list;
	private JPanel panelRisultati;
	private JPanel panelRis1;
	private JLabel lblNC1;
	private JButton btnLike1;
	private JButton btnAddTo1;
	private JPanel panelRis2;
	private JLabel lblNC2;
	private JButton btnLike2;
	private JButton btnAddTo2;
	private JPanel panelRis3;
	private JLabel lblNC3;
	private JButton btnLike3;
	private JButton btnAddTo3;
	private JPanel panelRis4;
	private JLabel lblNC4;
	private JButton btnLike4;
	private JButton btnAddTo4;
	private JPanel panelRis5;
	private JLabel lblNC5;
	private JButton btnLike5;
	private JButton btnAddTo5;
	private JPanel panelRis6;
	private JLabel lblNC6;
	private JButton btnLike6;
	private JButton btnAddTo6;
	private JPanel panelRis7;
	private JLabel lblNC7;
	private JButton btnLike7;
	private JButton btnAddTo7;
	private JPanel panelRis8;
	private JLabel lblNC8;
	private JButton btnLike8;
	private JButton btnAddTo8;
	
	

	/**
	 * Create the panel.
	 */
	public PannelloCerca() {
		setBackground(new Color(6, 95, 70));
		setBounds(new Rectangle(0, 0, 1700, 1000));
		
		setLayout(null);
		
		textFieldCerca = new JTextField();
		textFieldCerca.setBounds(581, 22, 514, 31);
		textFieldCerca.setVisible(false);
		add(textFieldCerca);
		textFieldCerca.setColumns(10);
		
		btnCerca = new JButton("");
		btnCerca.setBorderPainted(false);
		btnCerca.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCerca.setContentAreaFilled(false);
		btnCerca.setDefaultCapable(false);
		btnCerca.setFocusable(false);
		btnCerca.setFocusTraversalKeysEnabled(false);
		btnCerca.setFocusPainted(false);
		btnCerca.setRolloverEnabled(false);
		btnCerca.setRequestFocusEnabled(false);
		btnCerca.setOpaque(false);
		btnCerca.setBounds(1120, 22, 50, 31);
		btnCerca.setIcon(new ImageIcon(PannelloCerca.class.getResource("/media/images/searchLogo.png")));
		btnCerca.setVisible(false);
		add(btnCerca);
		
		list = new JList<String>();
		list.setBounds(581, 74, 514, 296);
		add(list);
		
		panelRisultati = new JPanel();
		panelRisultati.setBackground(new Color(0, 0, 0));
		panelRisultati.setBounds(226, 127, 1286, 760);
		panelRisultati.setVisible(false);
		add(panelRisultati);
		panelRisultati.setLayout(null);
		
		panelRis1 = new JPanel();
		panelRis1.setForeground(new Color(0, 0, 0));
		panelRis1.setBackground(new Color(0, 0, 0));
		panelRis1.setVisible(false);
		panelRis1.setBounds(33, 11, 1217, 80);
		panelRisultati.add(panelRis1);
		panelRis1.setLayout(null);
		
		lblNC1 = new JLabel("New label");
		lblNC1.setForeground(new Color(255, 255, 255));
		lblNC1.setBounds(50, 11, 206, 33);
		panelRis1.add(lblNC1);
		
		btnLike1 = new JButton("");
		btnLike1.setFocusable(false);
		btnLike1.setFocusTraversalKeysEnabled(false);
		btnLike1.setFocusPainted(false);
		btnLike1.setDefaultCapable(false);
		btnLike1.setBorderPainted(false);
		btnLike1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLike1.setRequestFocusEnabled(false);
		btnLike1.setRolloverEnabled(false);
		btnLike1.setVerifyInputWhenFocusTarget(false);
		btnLike1.setOpaque(false);
		btnLike1.setBackground(new Color(0, 0, 0));
		btnLike1.setIcon(new ImageIcon(PannelloCerca.class.getResource("/media/images/notLikedLogo.png")));
		btnLike1.setBounds(1062, 21, 40, 33);
		panelRis1.add(btnLike1);
		
		btnAddTo1 = new JButton("");
		btnAddTo1.setIcon(new ImageIcon(PannelloCerca.class.getResource("/media/images/addPlaylistLogo.png")));
		btnAddTo1.setBounds(1142, 21, 40, 33);
		panelRis1.add(btnAddTo1);
		
		panelRis2 = new JPanel();
		panelRis2.setBackground(new Color(0, 0, 0));
		panelRis2.setVisible(false);
		panelRis2.setLayout(null);
		panelRis2.setBounds(33, 102, 1217, 80);
		panelRisultati.add(panelRis2);
		
		lblNC2 = new JLabel("New label");
		lblNC2.setForeground(new Color(255, 255, 255));
		lblNC2.setBounds(50, 11, 206, 33);
		panelRis2.add(lblNC2);
		
		btnLike2 = new JButton("");
		btnLike2.setRolloverEnabled(false);
		btnLike2.setRequestFocusEnabled(false);
		btnLike2.setOpaque(false);
		btnLike2.setFocusable(false);
		btnLike2.setFocusTraversalKeysEnabled(false);
		btnLike2.setFocusPainted(false);
		btnLike2.setDefaultCapable(false);
		btnLike2.setContentAreaFilled(false);
		btnLike2.setBorderPainted(false);
		btnLike2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLike2.setVerifyInputWhenFocusTarget(false);
		btnLike2.setIcon(new ImageIcon(PannelloCerca.class.getResource("/media/images/notLikedLogo.png")));
		btnLike2.setBounds(1062, 21, 40, 33);
		panelRis2.add(btnLike2);
		
		btnAddTo2 = new JButton("");
		btnAddTo2.setIcon(new ImageIcon(PannelloCerca.class.getResource("/media/images/addPlaylistLogo.png")));
		btnAddTo2.setBounds(1142, 21, 40, 33);
		panelRis2.add(btnAddTo2);
		
		panelRis3 = new JPanel();
		panelRis3.setBackground(new Color(0, 0, 0));
		panelRis3.setVisible(false);
		panelRis3.setLayout(null);
		panelRis3.setBounds(33, 193, 1217, 80);
		panelRisultati.add(panelRis3);
		
		lblNC3 = new JLabel("New label");
		lblNC3.setForeground(new Color(255, 255, 255));
		lblNC3.setBackground(new Color(255, 255, 255));
		lblNC3.setBounds(50, 11, 206, 33);
		panelRis3.add(lblNC3);
		
		btnLike3 = new JButton("");
		btnLike3.setVerifyInputWhenFocusTarget(false);
		btnLike3.setRolloverEnabled(false);
		btnLike3.setRequestFocusEnabled(false);
		btnLike3.setOpaque(false);
		btnLike3.setFocusable(false);
		btnLike3.setFocusTraversalKeysEnabled(false);
		btnLike3.setFocusPainted(false);
		btnLike3.setDefaultCapable(false);
		btnLike3.setContentAreaFilled(false);
		btnLike3.setBorderPainted(false);
		btnLike3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLike3.setIcon(new ImageIcon(PannelloCerca.class.getResource("/media/images/notLikedLogo.png")));
		btnLike3.setBounds(1062, 21, 40, 33);
		panelRis3.add(btnLike3);
		
		btnAddTo3 = new JButton("");
		btnAddTo3.setIcon(new ImageIcon(PannelloCerca.class.getResource("/media/images/addPlaylistLogo.png")));
		btnAddTo3.setBounds(1142, 21, 40, 33);
		panelRis3.add(btnAddTo3);
		
		panelRis4 = new JPanel();
		panelRis4.setBackground(new Color(0, 0, 0));
		panelRis4.setVisible(false);
		panelRis4.setLayout(null);
		panelRis4.setBounds(33, 284, 1217, 80);
		panelRisultati.add(panelRis4);
		
		lblNC4 = new JLabel("New label");
		lblNC4.setForeground(new Color(255, 255, 255));
		lblNC4.setBounds(50, 11, 206, 33);
		panelRis4.add(lblNC4);
		
		btnLike4 = new JButton("");
		btnLike4.setFocusTraversalKeysEnabled(false);
		btnLike4.setFocusable(false);
		btnLike4.setFocusPainted(false);
		btnLike4.setOpaque(false);
		btnLike4.setRolloverEnabled(false);
		btnLike4.setRequestFocusEnabled(false);
		btnLike4.setVerifyInputWhenFocusTarget(false);
		btnLike4.setDefaultCapable(false);
		btnLike4.setContentAreaFilled(false);
		btnLike4.setBorderPainted(false);
		btnLike4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLike4.setIcon(new ImageIcon(PannelloCerca.class.getResource("/media/images/notLikedLogo.png")));
		btnLike4.setBounds(1062, 21, 40, 33);
		panelRis4.add(btnLike4);
		
		btnAddTo4 = new JButton("");
		btnAddTo4.setIcon(new ImageIcon(PannelloCerca.class.getResource("/media/images/addPlaylistLogo.png")));
		btnAddTo4.setBounds(1142, 21, 40, 33);
		panelRis4.add(btnAddTo4);
		
		panelRis5 = new JPanel();
		panelRis5.setBackground(new Color(0, 0, 0));
		panelRis5.setVisible(false);
		panelRis5.setLayout(null);
		panelRis5.setBounds(33, 375, 1217, 80);
		panelRisultati.add(panelRis5);
		
		lblNC5 = new JLabel("New label");
		lblNC5.setForeground(new Color(255, 255, 255));
		lblNC5.setBounds(50, 11, 206, 33);
		panelRis5.add(lblNC5);
		
		btnLike5 = new JButton("");
		btnLike5.setVerifyInputWhenFocusTarget(false);
		btnLike5.setRolloverEnabled(false);
		btnLike5.setRequestFocusEnabled(false);
		btnLike5.setOpaque(false);
		btnLike5.setFocusable(false);
		btnLike5.setFocusTraversalKeysEnabled(false);
		btnLike5.setFocusPainted(false);
		btnLike5.setDefaultCapable(false);
		btnLike5.setContentAreaFilled(false);
		btnLike5.setBorderPainted(false);
		btnLike5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLike5.setIcon(new ImageIcon(PannelloCerca.class.getResource("/media/images/notLikedLogo.png")));
		btnLike5.setBounds(1062, 21, 40, 33);
		panelRis5.add(btnLike5);
		
		btnAddTo5 = new JButton("");
		btnAddTo5.setIcon(new ImageIcon(PannelloCerca.class.getResource("/media/images/addPlaylistLogo.png")));
		btnAddTo5.setBounds(1142, 21, 40, 33);
		panelRis5.add(btnAddTo5);
		
		panelRis6 = new JPanel();
		panelRis6.setBackground(new Color(0, 0, 0));
		panelRis6.setVisible(false);
		panelRis6.setLayout(null);
		panelRis6.setBounds(33, 466, 1217, 80);
		panelRisultati.add(panelRis6);
		
		lblNC6 = new JLabel("New label");
		lblNC6.setForeground(new Color(255, 255, 255));
		lblNC6.setBounds(50, 11, 206, 33);
		panelRis6.add(lblNC6);
		
		btnLike6 = new JButton("");
		btnLike6.setFocusPainted(false);
		btnLike6.setFocusTraversalKeysEnabled(false);
		btnLike6.setFocusable(false);
		btnLike6.setOpaque(false);
		btnLike6.setRequestFocusEnabled(false);
		btnLike6.setRolloverEnabled(false);
		btnLike6.setVerifyInputWhenFocusTarget(false);
		btnLike6.setDefaultCapable(false);
		btnLike6.setContentAreaFilled(false);
		btnLike6.setBorderPainted(false);
		btnLike6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLike6.setIcon(new ImageIcon(PannelloCerca.class.getResource("/media/images/notLikedLogo.png")));
		btnLike6.setBounds(1062, 21, 40, 33);
		panelRis6.add(btnLike6);
		
		btnAddTo6 = new JButton("");
		btnAddTo6.setIcon(new ImageIcon(PannelloCerca.class.getResource("/media/images/addPlaylistLogo.png")));
		btnAddTo6.setBounds(1142, 21, 40, 33);
		panelRis6.add(btnAddTo6);
		
		panelRis7 = new JPanel();
		panelRis7.setBackground(new Color(0, 0, 0));
		panelRis7.setVisible(false);
		panelRis7.setLayout(null);
		panelRis7.setBounds(33, 557, 1217, 80);
		panelRisultati.add(panelRis7);
		
		lblNC7 = new JLabel("New label");
		lblNC7.setForeground(new Color(255, 255, 255));
		lblNC7.setBounds(50, 11, 206, 33);
		panelRis7.add(lblNC7);
		
		btnLike7 = new JButton("");
		btnLike7.setVerifyInputWhenFocusTarget(false);
		btnLike7.setRolloverEnabled(false);
		btnLike7.setRequestFocusEnabled(false);
		btnLike7.setOpaque(false);
		btnLike7.setFocusable(false);
		btnLike7.setFocusTraversalKeysEnabled(false);
		btnLike7.setFocusPainted(false);
		btnLike7.setDefaultCapable(false);
		btnLike7.setContentAreaFilled(false);
		btnLike7.setBorderPainted(false);
		btnLike7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLike7.setIcon(new ImageIcon(PannelloCerca.class.getResource("/media/images/notLikedLogo.png")));
		btnLike7.setBounds(1062, 21, 40, 33);
		panelRis7.add(btnLike7);
		
		btnAddTo7 = new JButton("");
		btnAddTo7.setIcon(new ImageIcon(PannelloCerca.class.getResource("/media/images/addPlaylistLogo.png")));
		btnAddTo7.setBounds(1142, 21, 40, 33);
		panelRis7.add(btnAddTo7);
		
		panelRis8 = new JPanel();
		panelRis8.setBackground(new Color(0, 0, 0));
		panelRis8.setVisible(false);
		panelRis8.setLayout(null);
		panelRis8.setBounds(33, 648, 1217, 80);
		panelRisultati.add(panelRis8);
		
		lblNC8 = new JLabel("New label");
		lblNC8.setForeground(new Color(255, 255, 255));
		lblNC8.setBounds(50, 11, 206, 33);
		panelRis8.add(lblNC8);
		
		btnLike8 = new JButton("");
		btnLike8.setFocusable(false);
		btnLike8.setFocusTraversalKeysEnabled(false);
		btnLike8.setFocusPainted(false);
		btnLike8.setOpaque(false);
		btnLike8.setRequestFocusEnabled(false);
		btnLike8.setRolloverEnabled(false);
		btnLike8.setVerifyInputWhenFocusTarget(false);
		btnLike8.setDefaultCapable(false);
		btnLike8.setContentAreaFilled(false);
		btnLike8.setBorderPainted(false);
		btnLike8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLike8.setIcon(new ImageIcon(PannelloCerca.class.getResource("/media/images/notLikedLogo.png")));
		btnLike8.setBounds(1062, 21, 40, 33);
		panelRis8.add(btnLike8);
		
		btnAddTo8 = new JButton("");
		btnAddTo8.setDefaultCapable(false);
		btnAddTo8.setFocusPainted(false);
		btnAddTo8.setFocusTraversalKeysEnabled(false);
		btnAddTo8.setFocusable(false);
		btnAddTo8.setOpaque(false);
		btnAddTo8.setRequestFocusEnabled(false);
		btnAddTo8.setRolloverEnabled(false);
		btnAddTo8.setVerifyInputWhenFocusTarget(false);
		btnAddTo8.setIcon(new ImageIcon(PannelloCerca.class.getResource("/media/images/inAddPlaylistLogo.png")));
		btnAddTo8.setBounds(1142, 21, 40, 33);
		panelRis8.add(btnAddTo8);
		
		
		
	}

	public JButton getBtnCerca() {
		return btnCerca;
	}

	public void setBtnCerca(JButton btnCerca) {
		this.btnCerca = btnCerca;
	}

	public JTextField getTextFieldCerca() {
		return textFieldCerca;
	}

	public void setTextFieldCerca(JTextField textFieldCerca) {
		this.textFieldCerca = textFieldCerca;
	}
	
	public JList<String> getJList() {
		return list;
	}
	
	
	public JPanel getPanelRisultati() {
		return panelRisultati;
	}
	/**
	 * registra gli eventi della barra di ricerca e del botto di ricerca
	 * @param controllerCerca
	 */
	public void registraEventi(ControllerCerca controllerCerca) {
		textFieldCerca.addKeyListener(controllerCerca);
		btnCerca.addActionListener(controllerCerca);
		btnAddTo1.addActionListener(controllerCerca);
		btnAddTo2.addActionListener(controllerCerca);
		btnAddTo3.addActionListener(controllerCerca);
		btnAddTo4.addActionListener(controllerCerca);
		btnAddTo5.addActionListener(controllerCerca);
		btnAddTo6.addActionListener(controllerCerca);
		btnAddTo7.addActionListener(controllerCerca);
		btnAddTo8.addActionListener(controllerCerca);
		
		btnLike1.addActionListener(controllerCerca);
		btnLike2.addActionListener(controllerCerca);
		btnLike3.addActionListener(controllerCerca);
		btnLike4.addActionListener(controllerCerca);
		btnLike5.addActionListener(controllerCerca);
		btnLike6.addActionListener(controllerCerca);
		btnLike7.addActionListener(controllerCerca);
		btnLike8.addActionListener(controllerCerca);
		
	}
	
	/**
	 * Metodo per aggiornare la lista con i suggerimenti
	 * @param a
	 */
	
	public void aggiornaJList(String[] a) {
		list.setListData(a);
	}
	
	/**
	 * Getters dei pannelli
	 */
	
	public JPanel getPanelRis1() {
		return panelRis1;
	}

	public JPanel getPanelRis2() {
		return panelRis2;
	}

	public JPanel getPanelRis3() {
		return panelRis3;
	}

	public JPanel getPanelRis4() {
		return panelRis4;
	}

	public JPanel getPanelRis5() {
		return panelRis5;
	}

	public JPanel getPanelRis6() {
		return panelRis6;
	}

	public JPanel getPanelRis7() {
		return panelRis7;
	}

	public JPanel getPanelRis8() {
		return panelRis8;
	}
	
	/**
	 * Getters delle label nomi canzoni
	 */
	
	public JLabel getLblNC1() {
		return lblNC1;
	}

	public JLabel getLblNC2() {
		return lblNC2;
	}

	public JLabel getLblNC3() {
		return lblNC3;
	}

	public JLabel getLblNC4() {
		return lblNC4;
	}

	public JLabel getLblNC5() {
		return lblNC5;
	}

	public JLabel getLblNC6() {
		return lblNC6;
	}

	public JLabel getLblNC7() {
		return lblNC7;
	}

	public JLabel getLblNC8() {
		return lblNC8;
	}
	
	/**
	 * Getters dei bottoni per aggiungere alla playlist
	 * @return
	 */

	public JButton getBtnAddTo1() {
		return btnAddTo1;
	}

	public JButton getBtnAddTo2() {
		return btnAddTo2;
	}

	public JButton getBtnAddTo3() {
		return btnAddTo3;
	}

	public JButton getBtnAddTo4() {
		return btnAddTo4;
	}

	public JButton getBtnAddTo5() {
		return btnAddTo5;
	}

	public JButton getBtnAddTo6() {
		return btnAddTo6;
	}

	public JButton getBtnAddTo7() {
		return btnAddTo7;
	}

	public JButton getBtnAddTo8() {
		return btnAddTo8;
	}
	
	
	public JButton getBtnLike1() {
		return btnLike1;
	}
	
	public JButton getBtnLike2() {
		return btnLike2;
	}
	
	public JButton getBtnLike3() {
		return btnLike3;
	}
	
	public JButton getBtnLike4() {
		return btnLike4;
	}
	
	public JButton getBtnLike5() {
		return btnLike5;
	}
	
	public JButton getBtnLike6() {
		return btnLike6;
	}
	
	public JButton getBtnLike7() {
		return btnLike7;
	}
	
	public JButton getBtnLike8() {
		return btnLike8;
	}
	
}

