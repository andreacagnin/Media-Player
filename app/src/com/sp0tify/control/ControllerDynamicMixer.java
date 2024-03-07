package com.sp0tify.control;

import java.awt.event.*;

import javax.sound.sampled.Clip;

import com.sp0tify.model.*;
import com.sp0tify.view.*;

/**
 * Classe <code>ControllerDynamicMixer</code> gestisce gli eventi in input del mixer in
 * basso
 * @author andre
 *
 */
public class ControllerDynamicMixer implements ActionListener{
	
	private PannelloHome pannelloHome;
	private DynamicMixer dynamicMixer;
	private ContainerBottoni container1Bottoni;
	private MainController mainController;
	
	private Clip clip;
	private PlayMusic playMusic;

	/**
	 * Creazione del controller per gli eventi presenti nel <code>DynamicMixer</code>, il mixer
	 * in basso
	 * 
	 * @param dynamicMixer : Mixer dinamico in basso 
	 * @param container1Bottoni : Menu laterale in alto a sinistra con i bottoni
	 * @param pannelloHome : pannello home
	 */
	public ControllerDynamicMixer(DynamicMixer dynamicMixer, ContainerBottoni container1Bottoni, PannelloHome pannelloHome, 
			MainController mainController) {
		super();
		this.dynamicMixer = dynamicMixer;
		this.container1Bottoni = container1Bottoni;
		this.pannelloHome = pannelloHome;
		this.mainController = mainController;
		
		dynamicMixer.registraEventi(this);
	}

	/**
	 * Il metodo imposta tutti i pannelli a visibilita' <i>false</i>
	 */
	public void buffer() {
		container1Bottoni.setInHome(false);
		container1Bottoni.setInSearch(false);
		container1Bottoni.setInLibrary(false);
		container1Bottoni.setInAddPlaylist(false);
		container1Bottoni.setInLikedSongs(false);
		
		pannelloHome.setVisible(false);
	}
	
	public Clip getClip() {
		return clip;
	}

	public void setClip(Clip clip) {
		this.clip = clip;
	}
	
	public boolean isPlaying() {
		return dynamicMixer.isPlaying();
	}

	public void setPlaying(boolean playing) {
		this.dynamicMixer.setPlaying(playing);
	}
	
	public void setPlayMusic(PlayMusic playMusic) {
		this.playMusic = playMusic;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		/**
		 * Se viene premuto il {@code BtnPlay} inizia la canzone
		 */
		if(e.getSource() == dynamicMixer.getBtnPlay() && clip != null) {
			if(!mainController.isPlaying() || !dynamicMixer.isPlaying()) {
				dynamicMixer.setPlaying(true);
				clip.start();
				new Thread(dynamicMixer, mainController.getCanzoneInPlay()).start();
			}
			else {
				dynamicMixer.setPlaying(false);
				clip.stop();
				
			}
			
		}
		
		if(e.getSource() == dynamicMixer.getBtnSkipForward()) {
			playMusic.setSkipForward(true);
			playMusic.setSkipPrevious(false);
		}
		
		if(e.getSource() == dynamicMixer.getBtnRewind()) {
			playMusic.setSkipPrevious(true);
			playMusic.setSkipForward(false);
		}
	}



}











