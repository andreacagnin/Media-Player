package com.sp0tify.view;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

import com.sp0tify.control.MainController;


/**
 * Class <code>PannelloLikedSongs</code> pannello contenente tutte le canzoni preferite
 * @author andre
 *
 */
public class PannelloLikedSongs extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel homePlaylist;
	private JButton btnBraniPreferiti;
	private JLabel lblUser;
	private JLabel lblNumeroBrani;
	private Label lblDescrizione;
	private JPanel pannelloPlaylist;
	private JButton btnPlayPlaylist;
	private JScrollPane scrollPane;
	private JPanel containerCanzoni;
	private ScrollPane scrollPane_1;
	private PannelloCanzone pannelloCanzone;
	
	private ArrayList<PannelloCanzone> arrayPannelli;
	private ArrayList<JButton> arrayBottoniPlay; //array dei bottoni play
	private ArrayList<JButton> arrayBottoniLike; //array dei bottoni like
	private int indexRemove;

	/**
	 * Creazione del pannello
	 */
	public PannelloLikedSongs() {
		arrayPannelli = new ArrayList<PannelloCanzone>();
		arrayBottoniPlay = new ArrayList<JButton>();
		arrayBottoniLike = new ArrayList<JButton>();
		
		setLayout(null);
		setVisible(false);
		setBounds(0, 0, 1669, 965);
		
		homePlaylist = new JPanel();
		homePlaylist.setLayout(null);
		homePlaylist.setVerifyInputWhenFocusTarget(false);
		homePlaylist.setRequestFocusEnabled(false);
		homePlaylist.setFocusable(false);
		homePlaylist.setFocusTraversalKeysEnabled(false);
		homePlaylist.setBackground(new Color(4, 120, 87));
		homePlaylist.setBounds(0, 0, 1670, 965);
		add(homePlaylist);
		
		btnBraniPreferiti = new JButton("Brani che ti piacciono");
		btnBraniPreferiti.setVerifyInputWhenFocusTarget(false);
		btnBraniPreferiti.setRolloverEnabled(false);
		btnBraniPreferiti.setRequestFocusEnabled(false);
		btnBraniPreferiti.setOpaque(false);
		btnBraniPreferiti.setHorizontalTextPosition(SwingConstants.LEFT);
		btnBraniPreferiti.setHorizontalAlignment(SwingConstants.LEFT);
		btnBraniPreferiti.setForeground(Color.BLACK);
		btnBraniPreferiti.setFont(new Font("Tahoma", Font.PLAIN, 49));
		btnBraniPreferiti.setFocusable(false);
		btnBraniPreferiti.setFocusTraversalKeysEnabled(false);
		btnBraniPreferiti.setFocusPainted(false);
		btnBraniPreferiti.setDefaultCapable(false);
		btnBraniPreferiti.setContentAreaFilled(false);
		btnBraniPreferiti.setBorderPainted(false);
		btnBraniPreferiti.setBounds(40, 74, 1008, 112);
		homePlaylist.add(btnBraniPreferiti);
		
		lblUser = new JLabel("User");
		lblUser.setVerticalAlignment(SwingConstants.TOP);
		lblUser.setForeground(Color.BLACK);
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUser.setBounds(56, 240, 89, 19);
		homePlaylist.add(lblUser);
		
		lblNumeroBrani = new JLabel("Numero brani");
		lblNumeroBrani.setVerticalAlignment(SwingConstants.TOP);
		lblNumeroBrani.setForeground(Color.BLACK);
		lblNumeroBrani.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNumeroBrani.setBounds(155, 240, 193, 19);
		homePlaylist.add(lblNumeroBrani);
		
		lblDescrizione = new Label("");
		lblDescrizione.setForeground(Color.BLACK);
		lblDescrizione.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDescrizione.setFocusable(false);
		lblDescrizione.setFocusTraversalKeysEnabled(false);
		lblDescrizione.setBounds(56, 192, 826, 22);
		homePlaylist.add(lblDescrizione);
		
		pannelloPlaylist = new JPanel();
		pannelloPlaylist.setLayout(null);
		pannelloPlaylist.setBackground(new Color(13, 148, 136));
		pannelloPlaylist.setBounds(0, 270, 1670, 695);
		homePlaylist.add(pannelloPlaylist);
		
		btnPlayPlaylist = new JButton("");
		btnPlayPlaylist.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPlayPlaylist.setIcon(new ImageIcon(PannelloLikedSongs.class.getResource("/media/images/playLogoPlaylist.png")));
		btnPlayPlaylist.setVerifyInputWhenFocusTarget(false);
		btnPlayPlaylist.setSelected(true);
		btnPlayPlaylist.setRolloverEnabled(false);
		btnPlayPlaylist.setRequestFocusEnabled(false);
		btnPlayPlaylist.setOpaque(false);
		btnPlayPlaylist.setFocusable(false);
		btnPlayPlaylist.setFocusTraversalKeysEnabled(false);
		btnPlayPlaylist.setFocusPainted(false);
		btnPlayPlaylist.setDefaultCapable(false);
		btnPlayPlaylist.setContentAreaFilled(false);
		btnPlayPlaylist.setBorderPainted(false);
		btnPlayPlaylist.setBounds(48, 25, 37, 43);
		pannelloPlaylist.add(btnPlayPlaylist);
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setRequestFocusEnabled(false);
		scrollPane.setVerifyInputWhenFocusTarget(false);
		scrollPane.setBorder(null);
		scrollPane.setFocusable(false);
		scrollPane.setFocusTraversalKeysEnabled(false);
		scrollPane.setBackground(new Color(13, 148, 136));
		
		scrollPane.setBounds(48, 79, 1300, 577);
		pannelloPlaylist.add(scrollPane);
		
		containerCanzoni = new JPanel();
		containerCanzoni.setBackground(new Color(24, 24, 24));
		scrollPane.setViewportView(containerCanzoni);
		
		scrollPane_1 = new ScrollPane();
		scrollPane_1.setVisible(false);
		scrollPane_1.setBounds(0, 0, 1570, 68);
		containerCanzoni.setLayout(new GridLayout(30, 1, 0, 0));
		scrollPane_1.setFocusable(false);
		scrollPane_1.setFocusTraversalKeysEnabled(false);
		scrollPane_1.setBackground(new Color(24, 24, 24));
		containerCanzoni.add(scrollPane_1);
		
		
	}
	
	/**
	 * Aggiunge al pannello il <code>pannelloCanzone</code>
	 */
	private void addPanel() {
		containerCanzoni.add(pannelloCanzone);
	}
	
	public void setpannelloCanzone(PannelloCanzone pannelloCanzone) {
		this.pannelloCanzone = pannelloCanzone;
		this.arrayPannelli.add(pannelloCanzone);
		addPanel();
	}
	
	/**
	 * Aggiunge i bottoni in 2 array diversi
	 * @param bottonePlay : bottone play
	 * @param bottoneLike : bottone like
	 */
	public void aggiungiBottone(JButton bottonePlay, JButton bottoneLike) {
		this.arrayBottoniPlay.add(bottonePlay);
		this.arrayBottoniLike.add(bottoneLike);
	}
	
	public Object getBtnPlay(String actionCommand) {
		// TODO Auto-generated method stub
		for(int i = 0; i < arrayBottoniPlay.size(); i++) {
			if(arrayBottoniPlay.get(i).getActionCommand().compareTo(actionCommand) == 0) {
				return arrayBottoniPlay.get(i);
			}
		}
		
		return null;
	}

	public Object getBtnLike(String actionCommand) {
		// TODO Auto-generated method stub
		for(int i = 0; i < arrayBottoniLike.size(); i++) {
			if(arrayBottoniLike.get(i).getActionCommand().compareTo(actionCommand) == 0) {
				this.indexRemove = i;
				return arrayBottoniLike.get(i);
			}
		}
		
		return null;
	}
	
	/**
	 * Rimuove il pannello canzone tramite indice
	 */
	public void removePanel() {
		containerCanzoni.remove(arrayPannelli.get(indexRemove));
	}

	/**
	 * Rimuove il pannello canzone tramite il comando d'azione
	 * @param actionCommand : comando d'azione
	 */
	public void removePanel(String actionCommand) {
		// TODO Auto-generated method stub
		for(int i = 0; i < arrayPannelli.size(); i++) {
			if(arrayPannelli.get(i).getNome().compareTo(actionCommand) == 0) {
				containerCanzoni.remove(arrayPannelli.get(i));
			}
		}
	}

	public Object getBtnPlayPlaylist() {
		// TODO Auto-generated method stub
		return this.btnPlayPlaylist;
	}

	public void registraEventi(MainController mainController) {
		// TODO Auto-generated method stub
		this.btnPlayPlaylist.addActionListener(mainController);
	}
}
