package com.sp0tify.view;

import java.awt.*;
import java.util.*;
import javax.swing.*;

import com.sp0tify.control.MainController;
import com.sp0tify.model.*;

/**
 * Class <code>PannelloLateralePlaylist</code> contenente tutte le playlist
 * @author andre
 *
 */
public class PannelloLateralePlaylist extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<BottoniPlaylist> arrayBottoni;
	private ArrayPlaylist arrayPlaylist;
	private BottoniPlaylist bottoniPlaylist;
	private Playlist playlist;
	private JPanel panel;
	private int i;
	
	/**
	 * Create the panel.
	 */
	public PannelloLateralePlaylist() {
		this.i = 0;
		arrayBottoni = new ArrayList<BottoniPlaylist>();
		arrayPlaylist = new ArrayPlaylist();
		
		setBackground(new Color(5, 150, 105));
		setBounds(0, 0, 250, 666);
		setLayout(null);
		
		panel = new JPanel();
		panel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		panel.setVerifyInputWhenFocusTarget(false);
		panel.setRequestFocusEnabled(false);
		panel.setFocusable(false);
		panel.setFocusTraversalKeysEnabled(false);
		panel.setDoubleBuffered(false);
		panel.setBackground(new Color(5, 150, 105));
		panel.setBounds(0, 0, 250, 666);
		add(panel);
		panel.setLayout(new GridLayout(10, 0, 0, 0));
		
	}
	
	/**
	 * Metodo per aggiungere una playlist
	 * 
	 * @param mainController : controller principale
	 * @return la playlist aggiunta
	 */
	public Playlist addButton(MainController mainController) {
		Playlist playlist;
		
		bottoniPlaylist = new BottoniPlaylist();
		bottoniPlaylist.setText("PlayList "+(i+1));
		bottoniPlaylist.setName("PlayList "+(i+1));
		
		playlist = addPlaylist(bottoniPlaylist.getName());
		
		arrayBottoni.add(bottoniPlaylist);
		
		panel.add(bottoniPlaylist);
		
		this.registraEventi(mainController, bottoniPlaylist);
		
		this.i++;
		
		return playlist;
	}
	
	/**
	 * Eliminazione di una playlist
	 * 
	 * @param indexModifica : indice dell'array di bottoni
	 */
	public void removeButton(int indexModifica) {
		
		panel.remove(arrayBottoni.get(indexModifica));
		arrayBottoni.remove(indexModifica);
	}
	
	/**
	 * Aggiunge una nuova playlist
	 * @param name : nome della playlist
	 * @return la playlist aggiunta
	 */
	public Playlist addPlaylist(String name) {
		playlist = new Playlist(name, "");
		arrayPlaylist.addPlaylist(playlist);
		
		return playlist;
	}

	public void registraEventi(MainController controllerContainer1Bottoni, BottoniPlaylist bottoniPlaylist) {
		// TODO Auto-generated method stub
		bottoniPlaylist.addActionListener(controllerContainer1Bottoni);
	}
	
	public Object getBtnPlaylist(String name) {
		// TODO Auto-generated method stub
		for(int i = 0; i < arrayBottoni.size(); i++) {
			if(arrayBottoni.get(i).getText().equals(name)) {
				return arrayBottoni.get(i);
			}
		}
		return null;
	}
	
	public void setNomeBottoniPLaylist(String string, int index) {
		arrayBottoni.get(index).setText(string);
	}
}
