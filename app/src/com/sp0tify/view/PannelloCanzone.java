package com.sp0tify.view;

import javax.swing.JPanel;

import com.sp0tify.control.MainController;

import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Cursor;

/**
 * Class <code>PannelloCanzone</code> pannello di una canzone
 * @author andre
 *
 */
public class PannelloCanzone extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel panelWhatIsLove;
	private Label lblNomeCanzone;
	private Label lblNomeArtista;
	private JButton btnPlay;
	private JButton btnLike;
	private Label lblTime;
	private JButton btnQueue;
	private JLabel lblNumeroCanzone;
	
	private PannelloLikedSongs pannelloLikedSongs;

	/**
	 * Creazione del pannello
	 * 
	 * @param labelNomeCanzone : nome della canzone
	 * @param labelNomeArtista : nome dell'artista
	 * @param labelminuti : durata della canzone
	 * @param actionCommand : comando d'azione del <code>BtnPlay</code>
	 * @param actionCommandLike : comando d'azione del <code>BtnLike</code>
	 * @param flag : 
	 * <li><code>true</code> imposta l'icon del <code>BtnLike</code> a <i>likedLogo</i> </li>
	 * <li><code>false</code> imposta l'icon del <code>BtnLike</code> a <i>notlikedLogo</i> </li>
	 * @param indexCanzone : numero della canzone
	 */
	public PannelloCanzone(String labelNomeCanzone, String labelNomeArtista, String labelminuti, String actionCommand,
			String actionCommandLike, boolean flag, int indexCanzone) {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		panelWhatIsLove = new JPanel();
		panelWhatIsLove.setLayout(null);
		panelWhatIsLove.setBackground(new Color(24, 24, 24));
		add(panelWhatIsLove);
		
		lblNomeCanzone = new Label(labelNomeCanzone);
		lblNomeCanzone.setForeground(Color.WHITE);
		lblNomeCanzone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNomeCanzone.setBounds(268, 20, 265, 22);
		panelWhatIsLove.add(lblNomeCanzone);
		
		lblNomeArtista = new Label(labelNomeArtista);
		lblNomeArtista.setForeground(Color.WHITE);
		lblNomeArtista.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNomeArtista.setBounds(268, 48, 387, 22);
		panelWhatIsLove.add(lblNomeArtista);
		
		btnPlay = new JButton("");
		btnPlay.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPlay.setIcon(new ImageIcon(PannelloCanzone.class.getResource("/media/images/playLogo1.png")));
		btnPlay.setActionCommand(actionCommand);
		btnPlay.setVerifyInputWhenFocusTarget(false);
		btnPlay.setRolloverEnabled(false);
		btnPlay.setRequestFocusEnabled(false);
		btnPlay.setOpaque(false);
		btnPlay.setFocusable(false);
		btnPlay.setFocusTraversalKeysEnabled(false);
		btnPlay.setFocusPainted(false);
		btnPlay.setDefaultCapable(false);
		btnPlay.setContentAreaFilled(false);
		btnPlay.setBorderPainted(false);
		btnPlay.setBounds(214, 30, 30, 29);
		panelWhatIsLove.add(btnPlay);
		
		btnLike = new JButton("");
		btnLike.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLike.setVerifyInputWhenFocusTarget(false);
		btnLike.setRolloverEnabled(false);
		btnLike.setRequestFocusEnabled(false);
		btnLike.setOpaque(false);
		btnLike.setFocusable(false);
		btnLike.setFocusTraversalKeysEnabled(false);
		btnLike.setFocusPainted(false);
		btnLike.setDefaultCapable(false);
		btnLike.setContentAreaFilled(false);
		btnLike.setBorderPainted(false);
		btnLike.setActionCommand(actionCommandLike);
		btnLike.setBounds(1140, 30, 30, 29);
		panelWhatIsLove.add(btnLike);
		
		lblTime = new Label(labelminuti);
		lblTime.setForeground(Color.WHITE);
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTime.setBounds(1188, 30, 62, 22);
		panelWhatIsLove.add(lblTime);
		
		btnQueue = new JButton("");
		btnQueue.setVerifyInputWhenFocusTarget(false);
		btnQueue.setRolloverEnabled(false);
		btnQueue.setRequestFocusEnabled(false);
		btnQueue.setOpaque(false);
		btnQueue.setFocusable(false);
		btnQueue.setFocusTraversalKeysEnabled(false);
		btnQueue.setFocusPainted(false);
		btnQueue.setDefaultCapable(false);
		btnQueue.setContentAreaFilled(false);
		btnQueue.setBorderPainted(false);
		btnQueue.setActionCommand("WhatIsLove_queue");
		btnQueue.setBounds(1256, 30, 30, 29);
		panelWhatIsLove.add(btnQueue);
		
		lblNumeroCanzone = new JLabel("CANZONE " + (indexCanzone +1));
		lblNumeroCanzone.setForeground(Color.WHITE);
		lblNumeroCanzone.setBounds(28, 28, 131, 31);
		panelWhatIsLove.add(lblNumeroCanzone);
		
		if(flag)
			btnLike.setIcon(new ImageIcon(PannelloCanzone.class.getResource("/media/images/likedLogo.png")));
		else
			btnLike.setIcon(new ImageIcon(PannelloCanzone.class.getResource("/media/images/notLikedLogo.png")));
		
	}
	
	public void setPannelloLikedSongs(PannelloLikedSongs pannelloLikedSongs) {
		this.pannelloLikedSongs = pannelloLikedSongs;
		this.pannelloLikedSongs.aggiungiBottone(btnPlay, btnLike);
	}
	
	public PannelloCanzone getPannelloCanzone() {
		return this;
	}

	public void registraEventi(MainController mainController) {
		// TODO Auto-generated method stub
		this.btnLike.addActionListener(mainController);
		this.btnPlay.addActionListener(mainController);
		this.btnQueue.addActionListener(mainController);
	}

	public String getNome() {
		// TODO Auto-generated method stub
		return btnLike.getActionCommand();
	}
	
}
