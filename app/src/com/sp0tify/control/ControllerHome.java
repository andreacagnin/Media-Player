package com.sp0tify.control;

import java.awt.event.*;

import javax.sound.sampled.*;

import com.sp0tify.model.*;
import com.sp0tify.view.*;

/**
 * Class <code>ControllerHome</code> gestisce tutti gli eventi del <code>pannelloHome</code>
 * @author andre
 *
 */
public class ControllerHome implements ActionListener{
	private PannelloHome pannelloHome;
	private DynamicMixer dynamicMixer;
	private ArrayCanzoni arrayCanzoni;
	private ArrayDettagliCanzoni arrayDettagliCanzoni;
	private ArrayCanzoniPreferiti arrayCanzoniPreferiti;
	private ControllerDynamicMixer controllerDynamicMixer;
	private MainController mainController;
	private PlayMusic playMusic;
	
	private String canzoneInPlay;
	private boolean playing;
	private Clip clip;
	
	/**
	 * Creazione del <code>Controller Home</code>
	 * 
	 * @param pannelloHome : il pannello home
	 * @param dynamicMixer : mixer dinamico in basso
	 * @param arrayCanzoni : l'array contenente i file delle canzoni
	 * @param arrayDettagliCanzoni : l'array contenente i dettagli dellle cannzoni: 
	 * <li>Nome della canzone</li>
	 * <li>Nome dell'artista</li>
	 * <li>Durata della canzone</li>
	 * <li>Percorso della canzone</li>
	 * @param controllerDynamicMixer : il controller del mixer dinamico
	 * @param mainController : il controller principale
	 * @param arrayCanzoniPreferiti : l'array delle canzoni preferite
	 * @param pannelloLikedSongs : il pannello dove sono contenute le canzoni preferite
	 * @param codaCanzoni
	 * @param pilaCanzoni
	 */
	public ControllerHome(PannelloHome pannelloHome, DynamicMixer dynamicMixer, ArrayCanzoni arrayCanzoni, 
			ArrayDettagliCanzoni arrayDettagliCanzoni, ControllerDynamicMixer controllerDynamicMixer, MainController mainController, 
			ArrayCanzoniPreferiti arrayCanzoniPreferiti, PannelloLikedSongs pannelloLikedSongs) {
		
		this.pannelloHome = pannelloHome;
		this.dynamicMixer = dynamicMixer;
		this.arrayCanzoni = arrayCanzoni;
		this.arrayDettagliCanzoni = arrayDettagliCanzoni;
		this.controllerDynamicMixer = controllerDynamicMixer;
		this.mainController = mainController;
		this.arrayCanzoniPreferiti = arrayCanzoniPreferiti;
		
		playMusic = new PlayMusic();
		
		this.pannelloHome.setArrayCanzoniPreferiti(this.arrayCanzoniPreferiti);
		
		this.canzoneInPlay = "";
		this.playing = false;
		
		pannelloHome.registraEventi(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == pannelloHome.getBtnPlay(e.getActionCommand())) {
			
			if(e.getActionCommand().compareTo(canzoneInPlay) == 0) {
				
				if(isPlaying()) {
					
					clip.stop(); 
					mainController.setPlaying(false);
					setPlaying(false);
					dynamicMixer.setPlaying(false);
					
				}
				else {
					
					clip.start();
					new Thread(dynamicMixer,getCanzoneInPlay()).start();
					mainController.setPlaying(true);
					setPlaying(true);
					dynamicMixer.setPlaying(true);
					
				}
				
			}else {
				if(isPlaying()) {clip.close(); }
				
				if(Thread.currentThread().isAlive()) 
					playMusic.setFlag(true);
				
				playMusic = new PlayMusic(arrayCanzoni.getCanzone(arrayDettagliCanzoni.getCanzone(e.getActionCommand())), 
						controllerDynamicMixer, this, mainController, arrayCanzoni, arrayCanzoniPreferiti, null, dynamicMixer, "");
				
				controllerDynamicMixer.setPlayMusic(playMusic);
				canzoneInPlay = e.getActionCommand();
				mainController.setCanzoneInPlay(canzoneInPlay);
				
				dynamicMixer.setPlaying(true);
				mainController.setPlaying(true);
				setPlaying(true);
				
				new Thread(playMusic).start();
				
				
			}
		}
		
		if(e.getSource() == pannelloHome.getBtnLike(e.getActionCommand())) {
			
		}
		
	}

	public boolean isPlaying() {
		return playing;
	}

	public void setPlaying(boolean playing) {
		this.playing = playing;
	}
	
	public Clip getClip() {
		return clip;
	}

	public void setClip(Clip clip) {
		this.clip = clip;
	}

	public String getCanzoneInPlay() {
		return canzoneInPlay;
	}

	public void setCanzoneInPlay(String canzoneInPlay) {
		this.canzoneInPlay = canzoneInPlay;
	}
	
	

}
