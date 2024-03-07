package com.sp0tify.view;

import com.sp0tify.control.*;

import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 * Class <code>PannelloLibreria</code> visualizza tutte le playlist e 
 * la sezione <code>BraniCheTiPiacciono</code>
 * @author andre
 *
 */
public class PannelloLibreria extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel container;
	private JLabel lblNewLabel;
	private PannelloInLibreria pannelloInLibreria;
	private ArrayList<JButton> arrayBottoni;
	private ArrayList<JPanel> arrayPannelli;
	
	private int index;
	private int x;
	/**
	 * Creazione del pannello
	 */
	public PannelloLibreria() {
		arrayBottoni = new ArrayList<JButton>();
		arrayPannelli = new ArrayList<JPanel>();
		
		this.index = 0;
		this.x = 42;
		
		setBounds(0, 0, 1669, 965);
		setBackground(new Color(6, 95, 70));
		setLayout(null);
		
		container = new JPanel();
		container.setBounds(0, 0, 1669, 965);
		container.setBackground(new Color(6, 95, 70));
		add(container);
		container.setLayout(null);
		
		lblNewLabel = new JLabel("La tua libreria");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setBounds(42, 157, 361, 170);
		container.add(lblNewLabel);
		
		pannelloInLibreria = new PannelloInLibreria();
		pannelloInLibreria.setBounds(42, 338, 273, 185);
		container.add(pannelloInLibreria);
		
	}
	
	public Object getBtnBraniFavoriti(String actionCommand) {
		if(pannelloInLibreria.getBtnBraniFavoriti().getActionCommand().compareTo(actionCommand) == 0)
			return pannelloInLibreria.getActionBtnBraniFavoriti();
		else {
			for(int i = 0; i < arrayBottoni.size(); i++) {
				if(arrayBottoni.get(i).getActionCommand().compareTo(actionCommand) == 0) {
					return arrayBottoni.get(i);
				}
			}
		}
		return null;
	}

	public void registraEventi(MainController mainController) {
		// TODO Auto-generated method stub
		pannelloInLibreria.registraEventi(mainController);
	}
	
	public void registraEventiThis(MainController mainController) {
		// TODO Auto-generated method stub
		arrayBottoni.get(index).addActionListener(mainController);
		this.index ++;
	}

	/**
	 * Aggiunge un nuovo pannello playlist 
	 * @param nomePlaylist : nome della playlist
	 */
	public void aggiungi(String nomePlaylist) {
		// TODO Auto-generated method stub
		PannelloInLibreria pannelloInLibreria1;
		
		x += 330;
		pannelloInLibreria1 = new PannelloInLibreria();
		pannelloInLibreria1.setNomeBtn(nomePlaylist);
		pannelloInLibreria1.setBounds(x, 338, 272, 185);
		container.add(pannelloInLibreria1);
		
		arrayPannelli.add(pannelloInLibreria1);
		arrayBottoni.add(pannelloInLibreria1.getBtnBraniFavoriti());
		arrayBottoni.get(index).setActionCommand(nomePlaylist);
	}
	
	/**
	 * Rimuove un pannello playlist
	 * @param indexModifica : indice del pannello da rimuovere
	 */
	public void rimuovi(int indexModifica) {
		container.remove(arrayPannelli.get(indexModifica));
		arrayPannelli.remove(indexModifica);
		arrayBottoni.remove(indexModifica);
		this.x -= 330;
		this.index--;
	}
	
	public void setNomePlayList(String playlist, String nomePlaylist) {
		for(int i = 0; i < arrayBottoni.size(); i++) {
			if(arrayBottoni.get(i).getText().compareTo(playlist) == 0) {
				arrayBottoni.get(i).setText(nomePlaylist);
				arrayBottoni.get(i).setActionCommand(nomePlaylist);
			}
		}
	}
}
