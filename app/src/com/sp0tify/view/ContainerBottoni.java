package com.sp0tify.view;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

import com.sp0tify.control.MainController;

/**
 * Class <code>ContainerBottoni</code> contenente tutti i bottoni in alto
 * nel menu laterale a sinistra
 * @author andre
 *
 */
public class ContainerBottoni extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel container1Bottoni;
	private JButton btnHome;
	private JLabel lblHome;
	private JLabel lblCerca;
	private JButton btnLibreria;
	private JLabel lblLaTuaLibreria;
	private JButton btnCerca;
	private JButton btnBraniFavoriti;
	private JButton btnAggiungiPlaylist;
	private JLabel lblAggiungiUnaPlaylist;
	private JLabel lblBraniPreferiti;
	
	private boolean inHome;
	private boolean inSearch;
	private boolean inLibrary;
	private boolean inAddPlaylist;
	private boolean inLikedSongs;
	
	/**
	 * Creazione del container
	 */
	public ContainerBottoni() {
		setLayout(null);
		
		container1Bottoni = new JPanel();
		container1Bottoni.setLayout(null);
		container1Bottoni.setBackground(new Color(5, 150, 105));
		container1Bottoni.setBounds(0, 0, 250, 354);
		add(container1Bottoni);
		
		btnHome = new JButton("");
		btnHome.setSelected(true);
		btnHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHome.setVerifyInputWhenFocusTarget(false);
		btnHome.setRolloverEnabled(false);
		btnHome.setRequestFocusEnabled(false);
		btnHome.setOpaque(false);
		btnHome.setForeground(Color.WHITE);
		btnHome.setFocusable(false);
		btnHome.setFocusTraversalKeysEnabled(false);
		btnHome.setFocusPainted(false);
		btnHome.setDefaultCapable(false);
		btnHome.setContentAreaFilled(false);
		btnHome.setBorderPainted(false);
		btnHome.setBorder(new LineBorder(new Color(255, 255, 255), 5, true));
		btnHome.setBackground(Color.WHITE);
		btnHome.setBounds(22, 25, 45, 45);
		container1Bottoni.add(btnHome);
		
		lblHome = new JLabel("Home");
		lblHome.setForeground(new Color(24, 24, 24));
		lblHome.setFont(new Font("Calibri", Font.BOLD, 17));
		lblHome.setBounds(77, 43, 58, 21);
		container1Bottoni.add(lblHome);
		
		lblCerca = new JLabel("Cerca");
		lblCerca.setForeground(new Color(24, 24, 24));
		lblCerca.setFont(new Font("Calibri", Font.BOLD, 17));
		lblCerca.setBounds(77, 98, 58, 21);
		container1Bottoni.add(lblCerca);
		
		btnLibreria = new JButton("");
		btnLibreria.setSelected(true);
		btnLibreria.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLibreria.setVerifyInputWhenFocusTarget(false);
		btnLibreria.setRolloverEnabled(false);
		btnLibreria.setRequestFocusEnabled(false);
		btnLibreria.setOpaque(false);
		btnLibreria.setForeground(Color.WHITE);
		btnLibreria.setFocusable(false);
		btnLibreria.setFocusTraversalKeysEnabled(false);
		btnLibreria.setFocusPainted(false);
		btnLibreria.setDefaultCapable(false);
		btnLibreria.setContentAreaFilled(false);
		btnLibreria.setBorderPainted(false);
		btnLibreria.setBorder(new LineBorder(new Color(255, 255, 255), 5, true));
		btnLibreria.setBackground(Color.WHITE);
		btnLibreria.setBounds(22, 137, 45, 45);
		container1Bottoni.add(btnLibreria);
		
		lblLaTuaLibreria = new JLabel("La tua libreria");
		lblLaTuaLibreria.setForeground(new Color(24, 24, 24));
		lblLaTuaLibreria.setFont(new Font("Calibri", Font.BOLD, 17));
		lblLaTuaLibreria.setBounds(77, 149, 111, 21);
		container1Bottoni.add(lblLaTuaLibreria);
		
		btnCerca = new JButton("");
		btnCerca.setSelected(true);
		btnCerca.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCerca.setVerifyInputWhenFocusTarget(false);
		btnCerca.setRolloverEnabled(false);
		btnCerca.setRequestFocusEnabled(false);
		btnCerca.setOpaque(false);
		btnCerca.setForeground(Color.WHITE);
		btnCerca.setFocusable(false);
		btnCerca.setFocusTraversalKeysEnabled(false);
		btnCerca.setFocusPainted(false);
		btnCerca.setDefaultCapable(false);
		btnCerca.setContentAreaFilled(false);
		btnCerca.setBorderPainted(false);
		btnCerca.setBorder(new LineBorder(new Color(255, 255, 255), 5, true));
		btnCerca.setBackground(Color.WHITE);
		btnCerca.setBounds(22, 81, 45, 45);
		container1Bottoni.add(btnCerca);
		
		btnBraniFavoriti = new JButton("");
		btnBraniFavoriti.setSelected(true);
		btnBraniFavoriti.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBraniFavoriti.setIcon(new ImageIcon(ContainerBottoni.class.getResource("/media/images/favouritesSongsLogo.png")));
		btnBraniFavoriti.setVerifyInputWhenFocusTarget(false);
		btnBraniFavoriti.setRolloverEnabled(false);
		btnBraniFavoriti.setRequestFocusEnabled(false);
		btnBraniFavoriti.setOpaque(false);
		btnBraniFavoriti.setForeground(Color.WHITE);
		btnBraniFavoriti.setFocusable(false);
		btnBraniFavoriti.setFocusTraversalKeysEnabled(false);
		btnBraniFavoriti.setFocusPainted(false);
		btnBraniFavoriti.setDefaultCapable(false);
		btnBraniFavoriti.setContentAreaFilled(false);
		btnBraniFavoriti.setBorderPainted(false);
		btnBraniFavoriti.setBorder(new LineBorder(new Color(255, 255, 255), 5, true));
		btnBraniFavoriti.setBackground(Color.WHITE);
		btnBraniFavoriti.setBounds(22, 282, 45, 45);
		container1Bottoni.add(btnBraniFavoriti);
		
		btnAggiungiPlaylist = new JButton("");
		btnAggiungiPlaylist.setSelected(true);
		btnAggiungiPlaylist.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAggiungiPlaylist.setVerifyInputWhenFocusTarget(false);
		btnAggiungiPlaylist.setRolloverEnabled(false);
		btnAggiungiPlaylist.setRequestFocusEnabled(false);
		btnAggiungiPlaylist.setOpaque(false);
		btnAggiungiPlaylist.setForeground(Color.WHITE);
		btnAggiungiPlaylist.setFocusable(false);
		btnAggiungiPlaylist.setFocusTraversalKeysEnabled(false);
		btnAggiungiPlaylist.setFocusPainted(false);
		btnAggiungiPlaylist.setDefaultCapable(false);
		btnAggiungiPlaylist.setContentAreaFilled(false);
		btnAggiungiPlaylist.setBorderPainted(false);
		btnAggiungiPlaylist.setBorder(new LineBorder(new Color(255, 255, 255), 5, true));
		btnAggiungiPlaylist.setBackground(Color.WHITE);
		btnAggiungiPlaylist.setBounds(22, 226, 45, 45);
		container1Bottoni.add(btnAggiungiPlaylist);
		
		lblAggiungiUnaPlaylist = new JLabel("Crea playlist");
		lblAggiungiUnaPlaylist.setForeground(new Color(24, 24, 24));
		lblAggiungiUnaPlaylist.setFont(new Font("Calibri", Font.BOLD, 17));
		lblAggiungiUnaPlaylist.setBounds(77, 241, 111, 21);
		container1Bottoni.add(lblAggiungiUnaPlaylist);
		
		lblBraniPreferiti = new JLabel("Brani preferiti");
		lblBraniPreferiti.setForeground(new Color(24, 24, 24));
		lblBraniPreferiti.setFont(new Font("Calibri", Font.BOLD, 17));
		lblBraniPreferiti.setBounds(77, 292, 111, 21);
		container1Bottoni.add(lblBraniPreferiti);
		
		this.InitBtnStatus();
		
	}
	
	public boolean isInHome() {
		return inHome;
	}

	public void setInHome(boolean inHome) {
		this.inHome = inHome;
		if(!this.inHome)
			btnHome.setIcon(new ImageIcon(ContainerBottoni.class.getResource("/media/images/home.png")));
		else
			btnHome.setIcon(new ImageIcon(ContainerBottoni.class.getResource("/media/images/inHome.png")));
	}

	public boolean isInSearch() {
		return inSearch;
	}

	public void setInSearch(boolean inSearch) {
		this.inSearch = inSearch;
		if(!this.inSearch)
			btnCerca.setIcon(new ImageIcon(ContainerBottoni.class.getResource("/media/images/searchLogo.png")));
		else
			btnCerca.setIcon(new ImageIcon(ContainerBottoni.class.getResource("/media/images/inSearchLogo.png")));
	}

	public boolean isInLibrary() {
		return inLibrary;
	}

	public void setInLibrary(boolean inLibrary) {
		this.inLibrary = inLibrary;
		if(!this.inLibrary)
			btnLibreria.setIcon(new ImageIcon(ContainerBottoni.class.getResource("/media/images/libraryLogo.png")));
		else
			btnLibreria.setIcon(new ImageIcon(ContainerBottoni.class.getResource("/media/images/inLibraryLogo.png")));
		
	}

	public boolean isInAddPlaylist() {
		return inAddPlaylist;
	}

	public void setInAddPlaylist(boolean inAddPlaylist) {
		this.inAddPlaylist = inAddPlaylist;
		if(!this.inAddPlaylist)
			btnAggiungiPlaylist.setIcon(new ImageIcon(ContainerBottoni.class.getResource("/media/images/addPlaylistLogo.png")));
		else
			btnAggiungiPlaylist.setIcon(new ImageIcon(ContainerBottoni.class.getResource("/media/images/inAddPlaylistLogo.png")));
	}

	public boolean isInLikedSongs() {
		return inLikedSongs;
	}

	public void setInLikedSongs(boolean inLikedSongs) {
		this.inLikedSongs = inLikedSongs;
	}

	/**
	 * Inizializza le immagini dei bottoni
	 */
	public void InitBtnStatus() {
		setInHome(true);
		setInSearch(false);
		setInLibrary(false);
		setInAddPlaylist(false);
		setInLikedSongs(false);
	}

	public void registraEventi(MainController controllerContainer1Bottoni) {
		// TODO Auto-generated method stub
		this.btnAggiungiPlaylist.addActionListener(controllerContainer1Bottoni);
		this.btnBraniFavoriti.addActionListener(controllerContainer1Bottoni);
		this.btnCerca.addActionListener(controllerContainer1Bottoni);
		this.btnHome.addActionListener(controllerContainer1Bottoni);
		this.btnLibreria.addActionListener(controllerContainer1Bottoni);
	}

	public Object getBtnHome() {
		// TODO Auto-generated method stub
		return this.btnHome;
	}

	public Object getBtnCerca() {
		// TODO Auto-generated method stub
		return this.btnCerca;
	}

	public Object getBtnLibrary() {
		// TODO Auto-generated method stub
		return this.btnLibreria;
	}

	public Object getBtnAddPlaylist() {
		// TODO Auto-generated method stub
		return this.btnAggiungiPlaylist;
	}

	public Object getBtnLikedSongs() {
		// TODO Auto-generated method stub
		return this.btnBraniFavoriti;
	}

}
