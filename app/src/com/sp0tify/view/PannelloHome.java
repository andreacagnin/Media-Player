package com.sp0tify.view;

import javax.swing.*;

import com.sp0tify.control.*;
import com.sp0tify.model.*;

import java.awt.*;

public class PannelloHome extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JLabel lblPiuPopolari;
	private JLabel lblArtisti;
	private JLabel lblBraniPopolari;
	private JPanel containerCanzoni;
	private JPanel panelWhatIsLove;
	private JButton btnPlay_WhatIsLove;
	private Label labelWhatIsLove;
	private Label labelHaddaway;
	private JButton btnLikeWhatIsLove;
	private Label labelTimeWhatIsLove;
	private JPanel panelUnderPressure;
	private Label labelSweetHomeChicago;
	private Label labelTheBluesBrothers;
	private JButton btnPlay_SweetHomeChicago;
	private JButton btnLikeSweetHomeChicago;
	private Label labelTimeSweetHomeChicago;
	private JPanel panelStayinAlive;
	private Label labelStayinAlive;
	private Label labelBeeGees;
	private JButton btnPlay_StayinAlive;
	private JButton btnLikeStayinAlive;
	private Label labelTimeStayinAlive;
	private JPanel panelDanzaKuduro;
	private Label labelDanzaKuduro;
	private Label labelDonOmarftLucenzo;
	private JButton btnPlay_DanzaKuduro;
	private JButton btnLikeDanzaKuduro;
	private Label labelTimeDanzaKuduro;
	private JPanel panelNightcall;
	private Label labelNightcall;
	private Label labelKavinski;
	private JButton btnPlay_NigthCall;
	private JButton btnLikeNightcall;
	private Label labelTimeNightCall;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblCanzoni;
	private JLabel lblNewLabel_3;
	
	private ArrayCanzoniPreferiti arrayCanzoniPreferiti;
	private PannelloCanzone pannelloCanzone;
	private PannelloLikedSongs pannelloLikedSongs;
	private ArrayDettagliCanzoni arrayDettagliCanzoni;
	
	private boolean likeWIL;
	private boolean likeSA;
	private boolean likeDK;
	private boolean likeNC;
	private boolean likeUP;
	private MainController mainController;
	private int indexCanzone;

	/**
	 * Create the panel.
	 */
	public PannelloHome() {
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setForeground(new Color(24, 24, 24));
		setBackground(new Color(6, 95, 70));
		this.setBounds(0, 0, 1669, 965);
		setLayout(null);
		
		panel = new JPanel();
		panel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		panel.setDoubleBuffered(false);
		panel.setFocusTraversalKeysEnabled(false);
		panel.setFocusable(false);
		panel.setRequestFocusEnabled(false);
		panel.setOpaque(false);
		panel.setBounds(0, 0, 1669, 965);
		add(panel);
		panel.setLayout(null);
		
		lblPiuPopolari = new JLabel("Più popolari");
		lblPiuPopolari.setForeground(new Color(0, 0, 0));
		lblPiuPopolari.setVerticalTextPosition(SwingConstants.TOP);
		lblPiuPopolari.setVerticalAlignment(SwingConstants.TOP);
		lblPiuPopolari.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblPiuPopolari.setBounds(144, 105, 483, 55);
		panel.add(lblPiuPopolari);
		
		lblArtisti = new JLabel("Artisti");
		lblArtisti.setForeground(new Color(0, 0, 0));
		lblArtisti.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblArtisti.setVerticalTextPosition(SwingConstants.TOP);
		lblArtisti.setVerticalAlignment(SwingConstants.TOP);
		lblArtisti.setBounds(144, 63, 135, 31);
		panel.add(lblArtisti);
		
		lblBraniPopolari = new JLabel("Popolari");
		lblBraniPopolari.setForeground(new Color(0, 0, 0));
		lblBraniPopolari.setVerticalTextPosition(SwingConstants.TOP);
		lblBraniPopolari.setVerticalAlignment(SwingConstants.TOP);
		lblBraniPopolari.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblBraniPopolari.setBounds(144, 466, 531, 55);
		panel.add(lblBraniPopolari);
		
		containerCanzoni = new JPanel();
		containerCanzoni.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		containerCanzoni.setBackground(new Color(24, 24, 24));
		containerCanzoni.setBounds(144, 532, 1078, 399);
		panel.add(containerCanzoni);
		containerCanzoni.setLayout(new GridLayout(5, 0, 0, 0));
		
		panelWhatIsLove = new JPanel();
		panelWhatIsLove.setBackground(new Color(24, 24, 24));
		panelWhatIsLove.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		containerCanzoni.add(panelWhatIsLove);
		panelWhatIsLove.setLayout(null);
		
		labelWhatIsLove = new Label("What is Love");
		labelWhatIsLove.setForeground(new Color(255, 255, 255));
		labelWhatIsLove.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelWhatIsLove.setBounds(64, 15, 265, 22);
		panelWhatIsLove.add(labelWhatIsLove);
		
		labelHaddaway = new Label("Haddaway");
		labelHaddaway.setBounds(64, 43, 191, 22);
		panelWhatIsLove.add(labelHaddaway);
		labelHaddaway.setForeground(new Color(255, 255, 255));
		labelHaddaway.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		btnPlay_WhatIsLove = new JButton("");
		btnPlay_WhatIsLove.setBorderPainted(false);
		btnPlay_WhatIsLove.setContentAreaFilled(false);
		btnPlay_WhatIsLove.setDefaultCapable(false);
		btnPlay_WhatIsLove.setFocusPainted(false);
		btnPlay_WhatIsLove.setFocusTraversalKeysEnabled(false);
		btnPlay_WhatIsLove.setFocusable(false);
		btnPlay_WhatIsLove.setVerifyInputWhenFocusTarget(false);
		btnPlay_WhatIsLove.setRolloverEnabled(false);
		btnPlay_WhatIsLove.setOpaque(false);
		btnPlay_WhatIsLove.setRequestFocusEnabled(false);
		btnPlay_WhatIsLove.setIcon(new ImageIcon(PannelloHome.class.getResource("/media/images/playLogo1.png")));
		btnPlay_WhatIsLove.setBounds(10, 25, 30, 29);
		panelWhatIsLove.add(btnPlay_WhatIsLove);
		btnPlay_WhatIsLove.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPlay_WhatIsLove.setActionCommand("What Is Love");
		
		btnLikeWhatIsLove = new JButton("");
		btnLikeWhatIsLove.setIcon(new ImageIcon(PannelloHome.class.getResource("/media/images/notLikedLogo.png")));
		btnLikeWhatIsLove.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLikeWhatIsLove.setVerifyInputWhenFocusTarget(false);
		btnLikeWhatIsLove.setRolloverEnabled(false);
		btnLikeWhatIsLove.setRequestFocusEnabled(false);
		btnLikeWhatIsLove.setOpaque(false);
		btnLikeWhatIsLove.setFocusable(false);
		btnLikeWhatIsLove.setFocusTraversalKeysEnabled(false);
		btnLikeWhatIsLove.setFocusPainted(false);
		btnLikeWhatIsLove.setDefaultCapable(false);
		btnLikeWhatIsLove.setContentAreaFilled(false);
		btnLikeWhatIsLove.setBorderPainted(false);
		btnLikeWhatIsLove.setActionCommand("likeWhat Is Love");
		btnLikeWhatIsLove.setBounds(936, 25, 30, 29);
		panelWhatIsLove.add(btnLikeWhatIsLove);
		
		labelTimeWhatIsLove = new Label("4:10");
		labelTimeWhatIsLove.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelTimeWhatIsLove.setForeground(new Color(255, 255, 255));
		labelTimeWhatIsLove.setBounds(984, 25, 62, 22);
		panelWhatIsLove.add(labelTimeWhatIsLove);
		
		panelStayinAlive = new JPanel();
		panelStayinAlive.setLayout(null);
		panelStayinAlive.setBackground(new Color(24, 24, 24));
		containerCanzoni.add(panelStayinAlive);
		
		labelStayinAlive = new Label("Stayin Alive");
		labelStayinAlive.setForeground(Color.WHITE);
		labelStayinAlive.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelStayinAlive.setBounds(64, 15, 265, 22);
		panelStayinAlive.add(labelStayinAlive);
		
		labelBeeGees = new Label("Bee Gees");
		labelBeeGees.setForeground(Color.WHITE);
		labelBeeGees.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelBeeGees.setBounds(64, 43, 172, 22);
		panelStayinAlive.add(labelBeeGees);
		
		btnPlay_StayinAlive = new JButton("");
		btnPlay_StayinAlive.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPlay_StayinAlive.setIcon(new ImageIcon(PannelloHome.class.getResource("/media/images/playLogo1.png")));
		btnPlay_StayinAlive.setVerifyInputWhenFocusTarget(false);
		btnPlay_StayinAlive.setRolloverEnabled(false);
		btnPlay_StayinAlive.setRequestFocusEnabled(false);
		btnPlay_StayinAlive.setOpaque(false);
		btnPlay_StayinAlive.setFocusable(false);
		btnPlay_StayinAlive.setFocusTraversalKeysEnabled(false);
		btnPlay_StayinAlive.setFocusPainted(false);
		btnPlay_StayinAlive.setDefaultCapable(false);
		btnPlay_StayinAlive.setContentAreaFilled(false);
		btnPlay_StayinAlive.setBorderPainted(false);
		btnPlay_StayinAlive.setActionCommand("Stayin Alive");
		btnPlay_StayinAlive.setBounds(10, 25, 30, 29);
		panelStayinAlive.add(btnPlay_StayinAlive);
		
		btnLikeStayinAlive = new JButton("");
		btnLikeStayinAlive.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLikeStayinAlive.setIcon(new ImageIcon(PannelloHome.class.getResource("/media/images/notLikedLogo.png")));
		btnLikeStayinAlive.setVerifyInputWhenFocusTarget(false);
		btnLikeStayinAlive.setRolloverEnabled(false);
		btnLikeStayinAlive.setRequestFocusEnabled(false);
		btnLikeStayinAlive.setOpaque(false);
		btnLikeStayinAlive.setFocusable(false);
		btnLikeStayinAlive.setFocusTraversalKeysEnabled(false);
		btnLikeStayinAlive.setFocusPainted(false);
		btnLikeStayinAlive.setDefaultCapable(false);
		btnLikeStayinAlive.setContentAreaFilled(false);
		btnLikeStayinAlive.setBorderPainted(false);
		btnLikeStayinAlive.setActionCommand("likeStayin Alive");
		btnLikeStayinAlive.setBounds(936, 25, 30, 29);
		panelStayinAlive.add(btnLikeStayinAlive);
		
		labelTimeStayinAlive = new Label("4:09");
		labelTimeStayinAlive.setForeground(Color.WHITE);
		labelTimeStayinAlive.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelTimeStayinAlive.setBounds(984, 27, 62, 22);
		panelStayinAlive.add(labelTimeStayinAlive);
		
		panelDanzaKuduro = new JPanel();
		panelDanzaKuduro.setLayout(null);
		panelDanzaKuduro.setBackground(new Color(24, 24, 24));
		containerCanzoni.add(panelDanzaKuduro);
		
		labelDanzaKuduro = new Label("Danza Kuduro");
		labelDanzaKuduro.setForeground(Color.WHITE);
		labelDanzaKuduro.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelDanzaKuduro.setBounds(64, 15, 265, 22);
		panelDanzaKuduro.add(labelDanzaKuduro);
		
		labelDonOmarftLucenzo = new Label("Don Omar ft. Lucenzo");
		labelDonOmarftLucenzo.setForeground(Color.WHITE);
		labelDonOmarftLucenzo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelDonOmarftLucenzo.setBounds(64, 43, 208, 22);
		panelDanzaKuduro.add(labelDonOmarftLucenzo);
		
		btnPlay_DanzaKuduro = new JButton("");
		btnPlay_DanzaKuduro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPlay_DanzaKuduro.setIcon(new ImageIcon(PannelloHome.class.getResource("/media/images/playLogo1.png")));
		btnPlay_DanzaKuduro.setVerifyInputWhenFocusTarget(false);
		btnPlay_DanzaKuduro.setRolloverEnabled(false);
		btnPlay_DanzaKuduro.setRequestFocusEnabled(false);
		btnPlay_DanzaKuduro.setOpaque(false);
		btnPlay_DanzaKuduro.setFocusable(false);
		btnPlay_DanzaKuduro.setFocusTraversalKeysEnabled(false);
		btnPlay_DanzaKuduro.setFocusPainted(false);
		btnPlay_DanzaKuduro.setDefaultCapable(false);
		btnPlay_DanzaKuduro.setContentAreaFilled(false);
		btnPlay_DanzaKuduro.setBorderPainted(false);
		btnPlay_DanzaKuduro.setActionCommand("Danza Kuduro");
		btnPlay_DanzaKuduro.setBounds(10, 25, 30, 29);
		panelDanzaKuduro.add(btnPlay_DanzaKuduro);
		
		btnLikeDanzaKuduro = new JButton("");
		btnLikeDanzaKuduro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLikeDanzaKuduro.setIcon(new ImageIcon(PannelloHome.class.getResource("/media/images/notLikedLogo.png")));
		btnLikeDanzaKuduro.setVerifyInputWhenFocusTarget(false);
		btnLikeDanzaKuduro.setRolloverEnabled(false);
		btnLikeDanzaKuduro.setRequestFocusEnabled(false);
		btnLikeDanzaKuduro.setOpaque(false);
		btnLikeDanzaKuduro.setFocusable(false);
		btnLikeDanzaKuduro.setFocusTraversalKeysEnabled(false);
		btnLikeDanzaKuduro.setFocusPainted(false);
		btnLikeDanzaKuduro.setDefaultCapable(false);
		btnLikeDanzaKuduro.setContentAreaFilled(false);
		btnLikeDanzaKuduro.setBorderPainted(false);
		btnLikeDanzaKuduro.setActionCommand("likeDanza Kuduro");
		btnLikeDanzaKuduro.setBounds(936, 25, 30, 29);
		panelDanzaKuduro.add(btnLikeDanzaKuduro);
		
		labelTimeDanzaKuduro = new Label("3:18");
		labelTimeDanzaKuduro.setForeground(Color.WHITE);
		labelTimeDanzaKuduro.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelTimeDanzaKuduro.setBounds(984, 27, 62, 22);
		panelDanzaKuduro.add(labelTimeDanzaKuduro);
		
		panelNightcall = new JPanel();
		panelNightcall.setLayout(null);
		panelNightcall.setBackground(new Color(24, 24, 24));
		containerCanzoni.add(panelNightcall);
		
		labelNightcall = new Label("Nightcall");
		labelNightcall.setForeground(Color.WHITE);
		labelNightcall.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelNightcall.setBounds(64, 15, 265, 22);
		panelNightcall.add(labelNightcall);
		
		labelKavinski = new Label("Kavinski");
		labelKavinski.setForeground(Color.WHITE);
		labelKavinski.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelKavinski.setBounds(64, 43, 208, 22);
		panelNightcall.add(labelKavinski);
		
		btnPlay_NigthCall = new JButton("");
		btnPlay_NigthCall.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPlay_NigthCall.setIcon(new ImageIcon(PannelloHome.class.getResource("/media/images/playLogo1.png")));
		btnPlay_NigthCall.setVerifyInputWhenFocusTarget(false);
		btnPlay_NigthCall.setRolloverEnabled(false);
		btnPlay_NigthCall.setRequestFocusEnabled(false);
		btnPlay_NigthCall.setOpaque(false);
		btnPlay_NigthCall.setFocusable(false);
		btnPlay_NigthCall.setFocusTraversalKeysEnabled(false);
		btnPlay_NigthCall.setFocusPainted(false);
		btnPlay_NigthCall.setDefaultCapable(false);
		btnPlay_NigthCall.setContentAreaFilled(false);
		btnPlay_NigthCall.setBorderPainted(false);
		btnPlay_NigthCall.setActionCommand("Nightcall");
		btnPlay_NigthCall.setBounds(10, 25, 30, 29);
		panelNightcall.add(btnPlay_NigthCall);
		
		btnLikeNightcall = new JButton("");
		btnLikeNightcall.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLikeNightcall.setIcon(new ImageIcon(PannelloHome.class.getResource("/media/images/notLikedLogo.png")));
		btnLikeNightcall.setVerifyInputWhenFocusTarget(false);
		btnLikeNightcall.setRolloverEnabled(false);
		btnLikeNightcall.setRequestFocusEnabled(false);
		btnLikeNightcall.setOpaque(false);
		btnLikeNightcall.setFocusable(false);
		btnLikeNightcall.setFocusTraversalKeysEnabled(false);
		btnLikeNightcall.setFocusPainted(false);
		btnLikeNightcall.setDefaultCapable(false);
		btnLikeNightcall.setContentAreaFilled(false);
		btnLikeNightcall.setBorderPainted(false);
		btnLikeNightcall.setActionCommand("likeNightcall");
		btnLikeNightcall.setBounds(936, 25, 30, 29);
		panelNightcall.add(btnLikeNightcall);
		
		labelTimeNightCall = new Label("4:16");
		labelTimeNightCall.setForeground(Color.WHITE);
		labelTimeNightCall.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelTimeNightCall.setBounds(984, 27, 62, 22);
		panelNightcall.add(labelTimeNightCall);
		
		panelUnderPressure = new JPanel();
		containerCanzoni.add(panelUnderPressure);
		panelUnderPressure.setLayout(null);
		panelUnderPressure.setBackground(new Color(24, 24, 24));
		
		labelSweetHomeChicago = new Label("Sweet Home Chicago");
		labelSweetHomeChicago.setForeground(Color.WHITE);
		labelSweetHomeChicago.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelSweetHomeChicago.setBounds(64, 15, 265, 22);
		panelUnderPressure.add(labelSweetHomeChicago);
		
		labelTheBluesBrothers = new Label("The Blues Brothers");
		labelTheBluesBrothers.setForeground(Color.WHITE);
		labelTheBluesBrothers.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelTheBluesBrothers.setBounds(64, 43, 208, 22);
		panelUnderPressure.add(labelTheBluesBrothers);
		
		btnPlay_SweetHomeChicago = new JButton("");
		btnPlay_SweetHomeChicago.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPlay_SweetHomeChicago.setIcon(new ImageIcon(PannelloHome.class.getResource("/media/images/playLogo1.png")));
		btnPlay_SweetHomeChicago.setVerifyInputWhenFocusTarget(false);
		btnPlay_SweetHomeChicago.setRolloverEnabled(false);
		btnPlay_SweetHomeChicago.setRequestFocusEnabled(false);
		btnPlay_SweetHomeChicago.setOpaque(false);
		btnPlay_SweetHomeChicago.setFocusable(false);
		btnPlay_SweetHomeChicago.setFocusTraversalKeysEnabled(false);
		btnPlay_SweetHomeChicago.setFocusPainted(false);
		btnPlay_SweetHomeChicago.setDefaultCapable(false);
		btnPlay_SweetHomeChicago.setContentAreaFilled(false);
		btnPlay_SweetHomeChicago.setBorderPainted(false);
		btnPlay_SweetHomeChicago.setActionCommand("Sweet Home Chicago");
		btnPlay_SweetHomeChicago.setBounds(10, 25, 30, 29);
		panelUnderPressure.add(btnPlay_SweetHomeChicago);
		
		btnLikeSweetHomeChicago = new JButton("");
		btnLikeSweetHomeChicago.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLikeSweetHomeChicago.setIcon(new ImageIcon(PannelloHome.class.getResource("/media/images/notLikedLogo.png")));
		btnLikeSweetHomeChicago.setVerifyInputWhenFocusTarget(false);
		btnLikeSweetHomeChicago.setRolloverEnabled(false);
		btnLikeSweetHomeChicago.setRequestFocusEnabled(false);
		btnLikeSweetHomeChicago.setOpaque(false);
		btnLikeSweetHomeChicago.setFocusable(false);
		btnLikeSweetHomeChicago.setFocusTraversalKeysEnabled(false);
		btnLikeSweetHomeChicago.setFocusPainted(false);
		btnLikeSweetHomeChicago.setDefaultCapable(false);
		btnLikeSweetHomeChicago.setContentAreaFilled(false);
		btnLikeSweetHomeChicago.setBorderPainted(false);
		btnLikeSweetHomeChicago.setActionCommand("likeSweet Home Chicago");
		btnLikeSweetHomeChicago.setBounds(936, 25, 30, 29);
		panelUnderPressure.add(btnLikeSweetHomeChicago);
		
		labelTimeSweetHomeChicago = new Label("7:47");
		labelTimeSweetHomeChicago.setForeground(Color.WHITE);
		labelTimeSweetHomeChicago.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelTimeSweetHomeChicago.setBounds(984, 27, 62, 22);
		panelUnderPressure.add(labelTimeSweetHomeChicago);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setRequestFocusEnabled(false);
		lblNewLabel.setVerifyInputWhenFocusTarget(false);
		lblNewLabel.setInheritsPopupMenu(false);
		lblNewLabel.setFocusable(false);
		lblNewLabel.setFocusTraversalKeysEnabled(false);
		lblNewLabel.setIcon(new ImageIcon(PannelloHome.class.getResource("/media/images/sfera.png")));
		lblNewLabel.setBounds(144, 180, 234, 234);
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(PannelloHome.class.getResource("/media/images/lazza.png")));
		lblNewLabel_1.setVerifyInputWhenFocusTarget(false);
		lblNewLabel_1.setRequestFocusEnabled(false);
		lblNewLabel_1.setInheritsPopupMenu(false);
		lblNewLabel_1.setFocusable(false);
		lblNewLabel_1.setFocusTraversalKeysEnabled(false);
		lblNewLabel_1.setBounds(513, 180, 234, 234);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(PannelloHome.class.getResource("/media/images/haddaway.png")));
		lblNewLabel_2.setVerifyInputWhenFocusTarget(false);
		lblNewLabel_2.setRequestFocusEnabled(false);
		lblNewLabel_2.setInheritsPopupMenu(false);
		lblNewLabel_2.setFocusable(false);
		lblNewLabel_2.setFocusTraversalKeysEnabled(false);
		lblNewLabel_2.setBounds(882, 180, 234, 234);
		panel.add(lblNewLabel_2);
		
		lblCanzoni = new JLabel("Canzoni");
		lblCanzoni.setVerticalTextPosition(SwingConstants.TOP);
		lblCanzoni.setVerticalAlignment(SwingConstants.TOP);
		lblCanzoni.setForeground(Color.BLACK);
		lblCanzoni.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblCanzoni.setBounds(144, 436, 135, 31);
		panel.add(lblCanzoni);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(PannelloHome.class.getResource("/media/images/donOmar.png")));
		lblNewLabel_3.setVerifyInputWhenFocusTarget(false);
		lblNewLabel_3.setRequestFocusEnabled(false);
		lblNewLabel_3.setInheritsPopupMenu(false);
		lblNewLabel_3.setFocusable(false);
		lblNewLabel_3.setFocusTraversalKeysEnabled(false);
		lblNewLabel_3.setBounds(1251, 180, 234, 234);
		panel.add(lblNewLabel_3);

	}

	public void registraEventi(ControllerHome controllerHome) {
		// TODO Auto-generated method stub
		btnPlay_WhatIsLove.addActionListener(controllerHome);
		btnPlay_StayinAlive.addActionListener(controllerHome);
		btnPlay_DanzaKuduro.addActionListener(controllerHome);
		btnPlay_NigthCall.addActionListener(controllerHome);
		btnPlay_SweetHomeChicago.addActionListener(controllerHome);
		
		btnLikeWhatIsLove.addActionListener(controllerHome);
		btnLikeStayinAlive.addActionListener(controllerHome);
		btnLikeDanzaKuduro.addActionListener(controllerHome);
		btnLikeNightcall.addActionListener(controllerHome);
		btnLikeSweetHomeChicago.addActionListener(controllerHome);
		
	}

	public Object getBtnPlay(String actionCommand) {
		// TODO Auto-generated method stub
		if(btnPlay_WhatIsLove.getActionCommand().compareTo(actionCommand) == 0) {
			return btnPlay_WhatIsLove;
		}else if(btnPlay_StayinAlive.getActionCommand().compareTo(actionCommand) == 0)
			return btnPlay_StayinAlive;
		else if(btnPlay_DanzaKuduro.getActionCommand().compareTo(actionCommand) == 0)
			return btnPlay_DanzaKuduro;
		else if(btnPlay_NigthCall.getActionCommand().compareTo(actionCommand) == 0)
			return btnPlay_NigthCall;
		else
			return btnPlay_SweetHomeChicago;
	}

	public Object getBtnLike(String actionCommand) {
		String nomeCanzone, nomeArtista, tempo, actionCommandPlay, actionCommandLike, percorsoFile = "";
		
		if(btnLikeWhatIsLove.getActionCommand().compareTo(actionCommand) == 0) {
			if(isLikeWIL()) {
				setLikeWIL(false);
				pannelloLikedSongs.removePanel(actionCommand);
				indexCanzone--;
				nomeCanzone = btnPlay_WhatIsLove.getActionCommand();
				percorsoFile = arrayDettagliCanzoni.getPercorsoFile(nomeCanzone);
				arrayCanzoniPreferiti.elimina(percorsoFile);
				btnLikeWhatIsLove.setIcon(new ImageIcon(PannelloHome.class.getResource("/media/images/notLikedLogo.png")));
			}else {
				
				nomeCanzone = btnPlay_WhatIsLove.getActionCommand();
				nomeArtista = labelHaddaway.getText();
				tempo = labelTimeWhatIsLove.getText();
				actionCommandPlay = btnPlay_WhatIsLove.getActionCommand();
				actionCommandLike = btnLikeWhatIsLove.getActionCommand();
				percorsoFile = arrayDettagliCanzoni.getPercorsoFile(nomeCanzone);

				pannelloCanzone = new PannelloCanzone(nomeCanzone, nomeArtista, tempo, actionCommandPlay, actionCommandLike, true, 
						indexCanzone);
				indexCanzone++;
				pannelloCanzone.registraEventi(mainController);
				pannelloLikedSongs.setpannelloCanzone(pannelloCanzone);
				pannelloCanzone.setPannelloLikedSongs(pannelloLikedSongs);
				
				arrayCanzoniPreferiti.inserimentoFile(percorsoFile);
				btnLikeWhatIsLove.setIcon(new ImageIcon(PannelloHome.class.getResource("/media/images/likedLogo.png")));
				setLikeWIL(true);
			}
			 return btnLikeWhatIsLove;
		}else if(btnLikeStayinAlive.getActionCommand().compareTo(actionCommand) == 0) {
			if(isLikeSA()) {
				setLikeSA(false);
				
				indexCanzone--;
				pannelloLikedSongs.removePanel(actionCommand);
				nomeCanzone = btnPlay_StayinAlive.getActionCommand();
				percorsoFile = arrayDettagliCanzoni.getPercorsoFile(nomeCanzone);
				arrayCanzoniPreferiti.elimina(percorsoFile);
				btnLikeStayinAlive.setIcon(new ImageIcon(PannelloHome.class.getResource("/media/images/notLikedLogo.png")));
			}else {
				setLikeSA(true);
				
				nomeCanzone = btnPlay_StayinAlive.getActionCommand();
				nomeArtista = labelBeeGees.getText();
				tempo = labelTimeSweetHomeChicago.getText();
				actionCommandPlay = btnPlay_StayinAlive.getActionCommand();
				actionCommandLike = btnLikeStayinAlive.getActionCommand();
				percorsoFile = arrayDettagliCanzoni.getPercorsoFile(nomeCanzone);

				pannelloCanzone = new PannelloCanzone(nomeCanzone, nomeArtista, tempo, actionCommandPlay, actionCommandLike, true,
						indexCanzone);
				indexCanzone++;
				pannelloCanzone.registraEventi(mainController);
				pannelloLikedSongs.setpannelloCanzone(pannelloCanzone);
				pannelloCanzone.setPannelloLikedSongs(pannelloLikedSongs);
				
				arrayCanzoniPreferiti.inserimentoFile(percorsoFile);
				btnLikeStayinAlive.setIcon(new ImageIcon(PannelloHome.class.getResource("/media/images/likedLogo.png")));
			}
			return btnLikeStayinAlive;
		}else if(btnLikeDanzaKuduro.getActionCommand().compareTo(actionCommand) == 0) {
			if(isLikeDK()) {
				setLikeDK(false);
				
				pannelloLikedSongs.removePanel(actionCommand);
				indexCanzone--;
				nomeCanzone = btnPlay_DanzaKuduro.getActionCommand();
				percorsoFile = arrayDettagliCanzoni.getPercorsoFile(nomeCanzone);
				arrayCanzoniPreferiti.elimina(percorsoFile);
				btnLikeDanzaKuduro.setIcon(new ImageIcon(PannelloHome.class.getResource("/media/images/notLikedLogo.png")));
			}else {
				setLikeDK(true);

				nomeCanzone = btnPlay_DanzaKuduro.getActionCommand();
				nomeArtista = labelDonOmarftLucenzo.getText();
				tempo = labelTimeStayinAlive.getText();
				actionCommandPlay = btnPlay_DanzaKuduro.getActionCommand();
				actionCommandLike = btnLikeDanzaKuduro.getActionCommand();
				percorsoFile = arrayDettagliCanzoni.getPercorsoFile(nomeCanzone);

				pannelloCanzone = new PannelloCanzone(nomeCanzone, nomeArtista, tempo, actionCommandPlay, actionCommandLike, true,
						indexCanzone);
				indexCanzone++;
				pannelloCanzone.registraEventi(mainController);
				pannelloLikedSongs.setpannelloCanzone(pannelloCanzone);
				pannelloCanzone.setPannelloLikedSongs(pannelloLikedSongs);
				
				arrayCanzoniPreferiti.inserimentoFile(percorsoFile);
				btnLikeDanzaKuduro.setIcon(new ImageIcon(PannelloHome.class.getResource("/media/images/likedLogo.png")));
			}
			return btnLikeDanzaKuduro;
		}else if(btnLikeNightcall.getActionCommand().compareTo(actionCommand) == 0) {
			if(isLikeNC()) {
				setLikeNC(false);
				
				pannelloLikedSongs.removePanel(actionCommand);
				indexCanzone--;
				nomeCanzone = btnPlay_NigthCall.getActionCommand();
				percorsoFile = arrayDettagliCanzoni.getPercorsoFile(nomeCanzone);
				arrayCanzoniPreferiti.elimina(percorsoFile);
				btnLikeNightcall.setIcon(new ImageIcon(PannelloHome.class.getResource("/media/images/notLikedLogo.png")));
			}else {
				setLikeNC(true);
				
				nomeCanzone = btnPlay_NigthCall.getActionCommand();
				nomeArtista = labelKavinski.getText();
				tempo = labelTimeDanzaKuduro.getText();
				actionCommandPlay = btnPlay_NigthCall.getActionCommand();
				actionCommandLike = btnLikeNightcall.getActionCommand();
				percorsoFile = arrayDettagliCanzoni.getPercorsoFile(nomeCanzone);

				pannelloCanzone = new PannelloCanzone(nomeCanzone, nomeArtista, tempo, actionCommandPlay, actionCommandLike, true,
						indexCanzone);
				indexCanzone++;
				pannelloCanzone.registraEventi(mainController);
				pannelloLikedSongs.setpannelloCanzone(pannelloCanzone);
				pannelloCanzone.setPannelloLikedSongs(pannelloLikedSongs);
				
				arrayCanzoniPreferiti.inserimentoFile(percorsoFile);
				btnLikeNightcall.setIcon(new ImageIcon(PannelloHome.class.getResource("/media/images/likedLogo.png")));
			}
			return btnLikeNightcall;
		}else if(btnLikeSweetHomeChicago.getActionCommand().compareTo(actionCommand) == 0){
			if(isLikeUP()) {
				setLikeUP(false);
				
				pannelloLikedSongs.removePanel(actionCommand);
				indexCanzone--;
				nomeCanzone = btnPlay_SweetHomeChicago.getActionCommand();
				percorsoFile = arrayDettagliCanzoni.getPercorsoFile(nomeCanzone);
				arrayCanzoniPreferiti.elimina(percorsoFile);
				btnLikeSweetHomeChicago.setIcon(new ImageIcon(PannelloHome.class.getResource("/media/images/notLikedLogo.png")));
			}else {
				setLikeUP(true);
				
				nomeCanzone = btnPlay_SweetHomeChicago.getActionCommand();
				nomeArtista = labelTheBluesBrothers.getText();
				tempo = labelTimeNightCall.getText();
				actionCommandPlay = btnPlay_SweetHomeChicago.getActionCommand();
				actionCommandLike = btnLikeSweetHomeChicago.getActionCommand();
				percorsoFile = arrayDettagliCanzoni.getPercorsoFile(nomeCanzone);

				pannelloCanzone = new PannelloCanzone(nomeCanzone, nomeArtista, tempo, actionCommandPlay, actionCommandLike, true,
						indexCanzone);
				indexCanzone++;
				pannelloCanzone.registraEventi(mainController);
				pannelloLikedSongs.setpannelloCanzone(pannelloCanzone);
				pannelloCanzone.setPannelloLikedSongs(pannelloLikedSongs);
				
				arrayCanzoniPreferiti.inserimentoFile(percorsoFile);
				btnLikeSweetHomeChicago.setIcon(new ImageIcon(PannelloHome.class.getResource("/media/images/likedLogo.png")));
			}
			return btnLikeSweetHomeChicago;
		}
		
		return null;
	}
	
	public boolean isLikeWIL() {
		return likeWIL;
	}

	public void setLikeWIL(boolean like) {
		this.likeWIL = like;
	}
	
	public boolean isLikeSA() {
		return likeSA;
	}

	public void setLikeSA(boolean likeSA) {
		this.likeSA = likeSA;
	}

	public boolean isLikeDK() {
		return likeDK;
	}

	public void setLikeDK(boolean likeDK) {
		this.likeDK = likeDK;
	}

	public boolean isLikeNC() {
		return likeNC;
	}

	public void setLikeNC(boolean likeNC) {
		this.likeNC = likeNC;
	}

	public boolean isLikeUP() {
		return likeUP;
	}

	public void setLikeUP(boolean likeUP) {
		this.likeUP = likeUP;
	}
	
	public void setArrayDettagliCanzoni(ArrayDettagliCanzoni arrayDettagliCanzoni) {
		this.arrayDettagliCanzoni = arrayDettagliCanzoni;
	}

	public ArrayCanzoniPreferiti getArrayCanzoniPreferiti() {
		return arrayCanzoniPreferiti;
	}

	public void setArrayCanzoniPreferiti(ArrayCanzoniPreferiti arrayCanzoniPreferiti) {
		this.arrayCanzoniPreferiti = arrayCanzoniPreferiti;
	}

	public void setMainController(MainController mainController) {
		// TODO Auto-generated method stub
		this.mainController = mainController;
	}
	
	public void setPannelloLikedSongs(PannelloLikedSongs pannelloLikedSongs) {
		this.pannelloLikedSongs = pannelloLikedSongs;
	}
	
}