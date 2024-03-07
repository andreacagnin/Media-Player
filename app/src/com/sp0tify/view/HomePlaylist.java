package com.sp0tify.view;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

import com.sp0tify.control.*;
import com.sp0tify.model.*;

/**
 * Class <code>HomePlaylist</code> pannello di una playlist
 * @author andre
 *
 */
public class HomePlaylist extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel homePlaylist;
	private Playlist playlist;
	private String nomePannello;
	private JLabel lblUser;
	private JLabel lblNumeroBrani;
	private JButton btnPlaylist;
	private Label lblDescrizione;
	private JPanel pannelloPlaylist;
	private JButton btnPlayPlaylist;
	private ScrollPane scrollPane_1;
	private JPanel containerCanzoni;
	private JScrollPane scrollPane;
	
	private ArrayCanzoniPlaylist arrayCanzoniPlaylist;
	private PannelloCanzone pannelloCanzone;
	private ArrayList<PannelloCanzone> arrayPannelli;
	private ArrayList<JButton> arrayBottoniPlay; //array dei bottoni play
	private ArrayList<JButton> arrayBottoniLike; //array dei bottoni like
	private int indexRemove;
	
	/**
	 * Create the panel.
	 */
	public HomePlaylist(String nomePannello, Playlist playlist) {
		arrayCanzoniPlaylist = new ArrayCanzoniPlaylist();
		arrayPannelli = new ArrayList<PannelloCanzone>();
		arrayBottoniPlay = new ArrayList<JButton>();
		arrayBottoniLike = new ArrayList<JButton>();
		
		setVisible(false);
		this.nomePannello = nomePannello;
		this.playlist =  playlist;
		
		setLayout(null);
		setBounds(0, 0, 1670, 965);
		
		homePlaylist = new JPanel();
		homePlaylist.setLayout(null);
		homePlaylist.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		homePlaylist.setVerifyInputWhenFocusTarget(false);
		homePlaylist.setRequestFocusEnabled(false);
		homePlaylist.setFocusTraversalKeysEnabled(false);
		homePlaylist.setFocusable(false);
		homePlaylist.setBounds(0, 0, 1670, 965);
		homePlaylist.setBackground(new Color(4, 120, 87));
		add(homePlaylist);
		
		btnPlaylist = new JButton(playlist.getNomePlaylist());
		btnPlaylist.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPlaylist.setHorizontalTextPosition(SwingConstants.LEFT);
		btnPlaylist.setHorizontalAlignment(SwingConstants.LEFT);
		btnPlaylist.setFont(new Font("Tahoma", Font.PLAIN, 49));
		btnPlaylist.setForeground(new Color(0, 0, 0));
		btnPlaylist.setBorderPainted(false);
		btnPlaylist.setContentAreaFilled(false);
		btnPlaylist.setDefaultCapable(false);
		btnPlaylist.setFocusPainted(false);
		btnPlaylist.setFocusTraversalKeysEnabled(false);
		btnPlaylist.setFocusable(false);
		btnPlaylist.setVerifyInputWhenFocusTarget(false);
		btnPlaylist.setOpaque(false);
		btnPlaylist.setRequestFocusEnabled(false);
		btnPlaylist.setRolloverEnabled(false);
		btnPlaylist.setBounds(40, 74, 1008, 112);
		homePlaylist.add(btnPlaylist);
		
		lblUser = new JLabel("User");
		lblUser.setForeground(new Color(0, 0, 0));
		lblUser.setVerticalAlignment(SwingConstants.TOP);
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUser.setBounds(56, 240, 89, 19);
		homePlaylist.add(lblUser);
		
		lblNumeroBrani = new JLabel("Numero brani");
		lblNumeroBrani.setForeground(new Color(0, 0, 0));
		lblNumeroBrani.setVerticalAlignment(SwingConstants.TOP);
		lblNumeroBrani.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNumeroBrani.setBounds(155, 240, 193, 19);
		homePlaylist.add(lblNumeroBrani);
		
		lblDescrizione = new Label("");
		lblDescrizione.setForeground(new Color(0, 0, 0));
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
		btnPlayPlaylist.setIcon(new ImageIcon(HomePlaylist.class.getResource("/media/images/playLogoPlaylist.png")));
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
	
	public Playlist getPlaylist() {
		return playlist;
	}

	public void setPlaylist(Playlist playlist) {
		this.playlist = playlist;
	}

	public Label getLblDescrizione() {
		return lblDescrizione;
	}

	public void setLblDescrizione(String descrizione) {
		this.lblDescrizione.setText(descrizione);
	}
	
	public String getlblDescrizione() {
		return this.lblDescrizione.getText();
	}

	public void setNomePlaylist(String nome) {
		this.btnPlaylist.setText(nome);
	}
	
	public String getNomePannello() {
		return nomePannello;
	}

	public void setNomePannello(String nomePannello) {
		this.nomePannello = nomePannello;
	}

	public JPanel getHomePlaylist() {
		// TODO Auto-generated method stub
		return homePlaylist;
	}

	public void setBtnNewButton(JButton btnNewButton) {
		this.btnPlayPlaylist = btnNewButton;
	}
	
	public Object getBtnPlayPlaylist() {
		return this.btnPlayPlaylist;
	}
	
	public Object getBtnPlaylist() {
		return this.btnPlaylist;
	}
	
	public void aggiungiCanzone(String fs) {
		arrayCanzoniPlaylist.inserimento(fs);
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

	public void registraEventi(MainController controllerContainer1Bottoni) {
		// TODO Auto-generated method stub
		this.btnPlaylist.addActionListener(controllerContainer1Bottoni);
		this.btnPlayPlaylist.addActionListener(controllerContainer1Bottoni);
	}
	
}
