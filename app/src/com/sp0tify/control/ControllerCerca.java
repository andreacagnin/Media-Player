package com.sp0tify.control;

import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.text.*;
import java.util.*;

import javax.swing.*;

import com.sp0tify.model.*;
import com.sp0tify.view.*;

public class ControllerCerca implements ActionListener, KeyListener{
	
	private PannelloHome pannelloHome;
	private DynamicMixer dynamicMixer;
	private ArrayCanzoni arrayCanzoni;
	private ArrayDettagliCanzoni arrayDettagliCanzoni;
	private ControllerDynamicMixer controllerDynamicMixer;
	private MainController mainController;
	private PannelloCerca pannelloCerca;
	private DefaultListModel mod;
	private ArrayList<JButton> arrayBottoniPlay;
	private ArrayList<JButton> arrayBottoniLike;
	private HomePlaylist homePlaylist;
	
	public ControllerCerca(PannelloCerca pannelloCerca,ArrayDettagliCanzoni arrayDettagliCanzoni) {
		this.pannelloCerca=pannelloCerca;
		this.arrayDettagliCanzoni = arrayDettagliCanzoni;
		arrayBottoniPlay= new ArrayList<JButton>();
		arrayBottoniLike = new ArrayList<JButton>();
		initBottoni();
		
		pannelloCerca.registraEventi(this);
	}
	
	private void initBottoni() {
		arrayBottoniPlay.add(pannelloCerca.getBtnAddTo1());
		arrayBottoniPlay.add(pannelloCerca.getBtnAddTo2());
		arrayBottoniPlay.add(pannelloCerca.getBtnAddTo3());
		arrayBottoniPlay.add(pannelloCerca.getBtnAddTo4());
		arrayBottoniPlay.add(pannelloCerca.getBtnAddTo5());
		arrayBottoniPlay.add(pannelloCerca.getBtnAddTo6());
		arrayBottoniPlay.add(pannelloCerca.getBtnAddTo7());
		arrayBottoniPlay.add(pannelloCerca.getBtnAddTo8());
		
		arrayBottoniLike.add(pannelloCerca.getBtnLike1());
		arrayBottoniLike.add(pannelloCerca.getBtnLike2());
		arrayBottoniLike.add(pannelloCerca.getBtnLike3());
		arrayBottoniLike.add(pannelloCerca.getBtnLike4());
		arrayBottoniLike.add(pannelloCerca.getBtnLike5());
		arrayBottoniLike.add(pannelloCerca.getBtnLike6());
		arrayBottoniLike.add(pannelloCerca.getBtnLike7());
		arrayBottoniLike.add(pannelloCerca.getBtnLike8());
		
	}
	
	/**
	 * Metodo per gestire il click del bottone di ricerca
	 */
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == pannelloCerca.getBtnCerca()) {
			pannelloCerca.getJList().setVisible(false);
			pannelloCerca.getPanelRisultati().setVisible(true);
			pannelloCerca.getPanelRis1().setVisible(false);
			pannelloCerca.getPanelRis2().setVisible(false);
			pannelloCerca.getPanelRis3().setVisible(false);
			pannelloCerca.getPanelRis4().setVisible(false);
			pannelloCerca.getPanelRis5().setVisible(false);
			pannelloCerca.getPanelRis6().setVisible(false);
			pannelloCerca.getPanelRis7().setVisible(false);
			pannelloCerca.getPanelRis8().setVisible(false);
			stampaCanzoni(ricerca(pannelloCerca.getTextFieldCerca().getText()));
		}
		
		if(e.getSource() == getBtnAdd(e.getActionCommand())) {
			
		}
		
	}
	
	private Object getBtnAdd(String actionCommand) {
		// TODO Auto-generated method stub
		PannelloCanzone pannelloCanzone;
		
		for(int i = 0; i < arrayBottoniPlay.size(); i++) {
			if(arrayBottoniPlay.get(i).getActionCommand().compareTo(actionCommand) == 0) {
				homePlaylist.aggiungiBottone(arrayBottoniPlay.get(i), arrayBottoniLike.get(i));
				
				pannelloCanzone = new PannelloCanzone(arrayBottoniPlay.get(i).getActionCommand(), 
						arrayDettagliCanzoni.getNomeArtista(actionCommand), "", actionCommand, arrayBottoniLike.get(i).getActionCommand(), 
						false, i);
				
				homePlaylist.setpannelloCanzone(pannelloCanzone);
				
				return arrayBottoniPlay.get(i);
			}
		}
		return null;
	}

	/**
	 * Metodo per stampare i risultati della ricerca
	 * @param ricerca
	 */
	private void stampaCanzoni(String[] ricerca) {
		if(pannelloCerca.getTextFieldCerca().getText().compareTo("") == 0 ) {
			pannelloCerca.getPanelRisultati().setVisible(false);
			JOptionPane.showMessageDialog(pannelloCerca, "La ricerca non ha prodotto alcun risultato");
		}else {
			if(ricerca[0].compareTo("") != 0 ) {
				pannelloCerca.getLblNC1().setText(ricerca[0]);
				pannelloCerca.getPanelRis1().setVisible(true);
				arrayBottoniPlay.get(0).setActionCommand(arrayDettagliCanzoni.getNomeCanzone(ricerca[0]));
				arrayBottoniLike.get(0).setActionCommand("like" + arrayDettagliCanzoni.getNomeArtista(ricerca[0]));
			}
			
			if(ricerca[1].compareTo("") != 0) {
				pannelloCerca.getLblNC2().setText(ricerca[1]);
				pannelloCerca.getPanelRis2().setVisible(true);
				arrayBottoniPlay.get(1).setActionCommand(arrayDettagliCanzoni.getNomeCanzone(ricerca[1]));
				arrayBottoniLike.get(1).setActionCommand("like" + arrayDettagliCanzoni.getNomeArtista(ricerca[1]));
			}
			
			if(ricerca[2].compareTo("") != 0) {
				pannelloCerca.getLblNC3().setText(ricerca[2]);
				pannelloCerca.getPanelRis3().setVisible(true);
				arrayBottoniPlay.get(2).setActionCommand(arrayDettagliCanzoni.getNomeCanzone(ricerca[2]));
				arrayBottoniLike.get(2).setActionCommand("like" + arrayDettagliCanzoni.getNomeArtista(ricerca[2]));
			}
			
			if(ricerca[3].compareTo("") != 0) {
				pannelloCerca.getLblNC4().setText(ricerca[3]);
				pannelloCerca.getPanelRis4().setVisible(true);
				arrayBottoniPlay.get(3).setActionCommand(arrayDettagliCanzoni.getNomeCanzone(ricerca[3]));
				arrayBottoniLike.get(3).setActionCommand("like" + arrayDettagliCanzoni.getNomeArtista(ricerca[3]));
			}
			
			if(ricerca[4].compareTo("") != 0) {
				pannelloCerca.getLblNC5().setText(ricerca[4]);
				pannelloCerca.getPanelRis5().setVisible(true);
				arrayBottoniPlay.get(4).setActionCommand(arrayDettagliCanzoni.getNomeCanzone(ricerca[4]));
				arrayBottoniLike.get(4).setActionCommand("like" + arrayDettagliCanzoni.getNomeArtista(ricerca[4]));
			}
			
			if(ricerca[5].compareTo("") != 0) {
				pannelloCerca.getLblNC6().setText(ricerca[5]);
				pannelloCerca.getPanelRis6().setVisible(true);
				arrayBottoniPlay.get(5).setActionCommand(arrayDettagliCanzoni.getNomeCanzone(ricerca[5]));
				arrayBottoniLike.get(5).setActionCommand("like" + arrayDettagliCanzoni.getNomeArtista(ricerca[5]));
			}
			
			if(ricerca[6].compareTo("") != 0) {
				pannelloCerca.getLblNC7().setText(ricerca[6]);
				pannelloCerca.getPanelRis7().setVisible(true);
				arrayBottoniPlay.get(6).setActionCommand(arrayDettagliCanzoni.getNomeCanzone(ricerca[6]));
				arrayBottoniLike.get(6).setActionCommand("like" + arrayDettagliCanzoni.getNomeArtista(ricerca[6]));
			}
			
			if(ricerca[7].compareTo("") != 0) {
				pannelloCerca.getLblNC8().setText(ricerca[7]);
				pannelloCerca.getPanelRis8().setVisible(true);
				arrayBottoniPlay.get(7).setActionCommand(arrayDettagliCanzoni.getNomeCanzone(ricerca[7]));
				arrayBottoniLike.get(7).setActionCommand("like" + arrayDettagliCanzoni.getNomeArtista(ricerca[7]));
			}
			
		}
		
	}
	
	/**
	 * Metodo per ottenere i suggerimenti per la barra di ricerca
	 * @param ricerca
	 * @return
	 */
	
	private String[] ricerca(String ricerca) {
		ArrayList<String> risultato=new ArrayList<String>();
		for(int i=0;i<arrayDettagliCanzoni.getSize();i++) {
			
			if(arrayDettagliCanzoni.get(i).getNomeCanzone().toLowerCase().contains(ricerca.toLowerCase()) || arrayDettagliCanzoni.get(i).getNomeArtista().toLowerCase().contains(ricerca.toLowerCase())) {
				risultato.add(arrayDettagliCanzoni.get(i).getNomeCanzone());
			}
			
		}
		
		
		return Arrays.copyOf(risultato.toArray(),risultato.size(),String[].class);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == pannelloCerca.getTextFieldCerca()) {
			pannelloCerca.getJList().setVisible(true);
			pannelloCerca.aggiornaJList(ricerca(pannelloCerca.getTextFieldCerca().getText()));
			
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == pannelloCerca.getTextFieldCerca()) {
			pannelloCerca.getJList().setVisible(true);
			pannelloCerca.aggiornaJList(ricerca(pannelloCerca.getTextFieldCerca().getText()));
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == pannelloCerca.getTextFieldCerca()) {
			pannelloCerca.getJList().setVisible(true);
			pannelloCerca.aggiornaJList(ricerca(pannelloCerca.getTextFieldCerca().getText()));
		}
	}
	
	public void setHomePlaylist(HomePlaylist homePlaylist) {
		this.homePlaylist = homePlaylist;
	}

}



