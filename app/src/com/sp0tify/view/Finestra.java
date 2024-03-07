package com.sp0tify.view;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

/**
 * Class <code>Finestra</code> e' l'interfaccia grafica che contiene tutti i pannelli
 * @author andre
 *
 */
public class Finestra extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private MenuLateraleSinistra menuLateraleSinistra;
	private DynamicMixer dynamicMixer;
	private PannelloHome pannelloHome;
	private PannelloHomePlaylist pannelloHomePlaylist;
	private PannelloLikedSongs pannelloLikedSongs;
	private PannelloLibreria pannelloLibreria;
	private PannelloCerca pannelloCerca;
	
	/**
	 * Crea la finestra
	 */
	public Finestra() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Finestra.class.getResource("/media/images/sp0tifyLogo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setFocusable(false);
		contentPane.setBackground(new Color(6, 95, 70));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		getContentPane().setLayout(null);
		
		dynamicMixer = new DynamicMixer();
		dynamicMixer.setLocation(0, 927);
		contentPane.add(dynamicMixer);
		
		menuLateraleSinistra = new MenuLateraleSinistra();
		menuLateraleSinistra.setBounds(0, 0, 251, 1020);
		contentPane.add(menuLateraleSinistra);
		menuLateraleSinistra.getContainer1Bottoni().setLocation(0, 0);
		
		pannelloHome = new PannelloHome();
		pannelloHome.setSize(1669, 929);
		pannelloHome.setLocation(251, 0);
		contentPane.add(pannelloHome);
		
		pannelloHomePlaylist = new PannelloHomePlaylist();
		pannelloHomePlaylist.setVisible(false);
		contentPane.add(pannelloHomePlaylist);
		
		pannelloLikedSongs = new PannelloLikedSongs();
		pannelloLikedSongs.setBounds(251, 0, 1669, 929);
		contentPane.add(pannelloLikedSongs);
		
		pannelloHome.setPannelloLikedSongs(pannelloLikedSongs);
		
		pannelloLibreria = new PannelloLibreria();
		pannelloLibreria.setVisible(false);
		pannelloLibreria.setSize(1669, 929);
		pannelloLibreria.setLocation(251, 0);
		contentPane.add(pannelloLibreria);
		
		pannelloCerca = new PannelloCerca();
		pannelloCerca.setSize(1669, 929);
		pannelloCerca.setLocation(251, 0);
		contentPane.add(pannelloCerca);
	}

	public ContainerBottoni getContainerBottoni() {
		// TODO Auto-generated method stub
		return menuLateraleSinistra.getContainer1Bottoni();
	}

	public DynamicMixer getDynamicMixer() {
		// TODO Auto-generated method stub
		return dynamicMixer.getDynamicMixer();
	}

	public PannelloHome getPannelloHome() {
		// TODO Auto-generated method stub
		return pannelloHome;
	}

	public PannelloLateralePlaylist getPannelloLateralePlaylist() {
		// TODO Auto-generated method stub
		return menuLateraleSinistra.getPannelloLateralePlaylist();
	}
	

	public PannelloHomePlaylist getpannelloHomePlaylist() {
		// TODO Auto-generated method stub
		return pannelloHomePlaylist;
	}
	
	/**
	 * Aggiunge il <code>pannelloHomePlaylist</code> una volta creato
	 * @param pannelloHomePlaylist : il container delle playlist che verranno create in basso a sinistra
	 */
	public void addPannelloHomePlaylist(PannelloHomePlaylist pannelloHomePlaylist) {
		contentPane.add(pannelloHomePlaylist);
	}

	public MenuLateraleSinistra getMenuLateraleSinistra() {
		// TODO Auto-generated method stub
		return menuLateraleSinistra;
	}

	public PannelloLikedSongs getPannelloLikedSongs() {
		// TODO Auto-generated method stub
		return pannelloLikedSongs;
	}
	
	public PannelloLibreria getPannelloLibreria() {
		return pannelloLibreria;
	}
	
	public PannelloCerca getPannelloCerca() {
		return pannelloCerca;
	}
}
