package com.sp0tify.model;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import com.sp0tify.control.*;
import com.sp0tify.view.DynamicMixer;

/**
 * Class <code>PlayMusic</code> fa partire le canzoni
 * @author andre
 *
 */
public class PlayMusic implements Runnable{
	
	private Clip clip;
	private File file;
	private DynamicMixer dynamicMixer;
	private ArrayCanzoni arrayCanzoni;
	private ArrayCanzoniPreferiti arrayCanzoniPreferiti;
	private ArrayCanzoniPlaylist arrayCanzoniPlaylist;
	
	private ControllerDynamicMixer controllerDynamicMixer;
	private ControllerHome controllerHome;
	private MainController mainController;
	
	private boolean skipForward;
	private boolean skipPrevious;
	private String array;
	private boolean flag;

	/**
	 * Inizializzazione di una canzone
	 * 
	 * @param fs : percorso file
	 * @param controllerDynamicMixer : controller del mixer dinamico
	 * @param controllerHome : controller del pannello home
	 * @param mainController : controller principale
	 * @param arrayCanzoni : l'array contenente le canzoni 
	 * <li>Nome della canzone</li>
	 * <li>Nome dell'artista</li>
	 * <li>Durata della canzone</li>
	 * <li>Percorso della canzone</li>
	 * @param dynamicMixer : mixer dinamico
	 * @param s : seleziona quale array di canzoni fa partire
	 * @param canzoneStart : canzone iniziale
	 */
	public PlayMusic(File fs, ControllerDynamicMixer controllerDynamicMixer, ControllerHome controllerHome, 
			MainController mainController, ArrayCanzoni arrayCanzoni, ArrayCanzoniPreferiti arrayCanzoniPreferiti, ArrayCanzoniPlaylist arrayCanzoniPlaylist, 
			DynamicMixer dynamicMixer, 
			String s) {
		this.file = fs;
		this.arrayCanzoni = arrayCanzoni;
		this.array = s;
		this.arrayCanzoniPreferiti = arrayCanzoniPreferiti;
		this.controllerDynamicMixer = controllerDynamicMixer;
		
		this.controllerHome = controllerHome;
		this.mainController = mainController;
		
		this.dynamicMixer = dynamicMixer;
	}

	/**
	 * Inizializzazione base della classe
	 */
	public PlayMusic() {
		this.flag = false;
		this.skipForward = false;
		this.skipPrevious = false;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		skipForward = false;
		skipPrevious = false;
		
		if(array.compareTo("") == 0) {
			while(i < arrayCanzoni.getSize() && !flag) {
				
				try {
					
					if(file.exists()) {
						
						AudioInputStream audio = AudioSystem.getAudioInputStream(file);
						clip = AudioSystem.getClip();
						clip.open(audio);
						clip.start();
						
						controllerHome.setPlaying(true);
						controllerDynamicMixer.setPlaying(true);
						dynamicMixer.setPlaying(true);
						
						if(controllerHome != null) controllerHome.setClip(clip);
						if(mainController != null) mainController.setClip(clip);
						if(controllerDynamicMixer != null) controllerDynamicMixer.setClip(clip);
						
						dynamicMixer.setMaxProgressBarCanzoni((int) clip.getMicrosecondLength() / 1000);
						dynamicMixer.setClip(clip);
						dynamicMixer.getProgressBarCanzoni().setValue(0);
						new Thread(dynamicMixer).start();
						
						setSkipForward(false);
						setSkipPrevious(false);
						
						while(clip.getMicrosecondLength() != clip.getMicrosecondPosition() && !skipForward && !skipPrevious && !flag) {
							
						}
						
						clip.stop();
						controllerHome.setPlaying(false);
						controllerHome.setCanzoneInPlay("");
						controllerDynamicMixer.setPlaying(false);
						dynamicMixer.setPlaying(false);
						
						}
					
					}catch(Exception e) {
						
					}
				if(skipPrevious) {
					
					i--;
					file = arrayCanzoni.getCanzone(i);
					
					
				}else  {
					
					i++;
					if(i < arrayCanzoni.getSize())
						file = arrayCanzoni.getCanzone(i);
					else
						flag = true;
				}
				
			}
		}
		if(array.compareTo("Canzoni preferite") == 0) {
			while(i < arrayCanzoni.getSize() && !flag) {
				
				try {
					
					if(file.exists()) {
						
						AudioInputStream audio = AudioSystem.getAudioInputStream(file);
						clip = AudioSystem.getClip();
						clip.open(audio);
						clip.start();
						
						controllerHome.setPlaying(true);
						controllerDynamicMixer.setPlaying(true);
						dynamicMixer.setPlaying(true);
						
						if(controllerHome != null) controllerHome.setClip(clip);
						if(mainController != null) mainController.setClip(clip);
						if(controllerDynamicMixer != null) controllerDynamicMixer.setClip(clip);
						
						dynamicMixer.setMaxProgressBarCanzoni((int) clip.getMicrosecondLength() / 1000);
						dynamicMixer.setClip(clip);
						dynamicMixer.getProgressBarCanzoni().setValue(0);
						new Thread(dynamicMixer).start();
						
						setSkipForward(false);
						setSkipPrevious(false);
						
						while(clip.getMicrosecondLength() != clip.getMicrosecondPosition() && !skipForward && !skipPrevious && !flag) {
							
						}
						
						clip.stop();
						controllerHome.setPlaying(false);
						controllerHome.setCanzoneInPlay("");
						controllerDynamicMixer.setPlaying(false);
						dynamicMixer.setPlaying(false);
						
						}
					
					}catch(Exception e) {
						
					}
				if(skipPrevious) {
					
					i--;
					if(i >= 0)
						file = arrayCanzoniPreferiti.getCanzone(i);
					
					
				}else  {
					
					i++;
					if(i < arrayCanzoniPreferiti.getSize())
						file = arrayCanzoniPreferiti.getCanzone(i);
					else
						flag = true;
				}
				
			}
		}if(array.compareTo("Playlist") == 0) {
			while(i < arrayCanzoni.getSize() && !flag) {
				
				try {
					
					if(file.exists()) {
						
						AudioInputStream audio = AudioSystem.getAudioInputStream(file);
						clip = AudioSystem.getClip();
						clip.open(audio);
						clip.start();
						
						controllerHome.setPlaying(true);
						controllerDynamicMixer.setPlaying(true);
						dynamicMixer.setPlaying(true);
						
						if(controllerHome != null) controllerHome.setClip(clip);
						if(mainController != null) mainController.setClip(clip);
						if(controllerDynamicMixer != null) controllerDynamicMixer.setClip(clip);
						
						dynamicMixer.setMaxProgressBarCanzoni((int) clip.getMicrosecondLength() / 1000);
						dynamicMixer.setClip(clip);
						dynamicMixer.getProgressBarCanzoni().setValue(0);
						new Thread(dynamicMixer).start();
						
						setSkipForward(false);
						setSkipPrevious(false);
						
						while(clip.getMicrosecondLength() != clip.getMicrosecondPosition() && !skipForward && !skipPrevious && !flag) {
							
						}
						
						clip.stop();
						controllerHome.setPlaying(false);
						controllerHome.setCanzoneInPlay("");
						controllerDynamicMixer.setPlaying(false);
						dynamicMixer.setPlaying(false);
						
						}
					
					}catch(Exception e) {
						
					}
				if(skipPrevious) {
					
					i--;
					file = arrayCanzoniPlaylist.getCanzone(i);
					
					
				}else  {
					
					i++;
					if(i < arrayCanzoniPreferiti.getSize())
						file = arrayCanzoniPlaylist.getCanzone(i);
					else
						flag = true;
				}
				
			}
		}
		
	}
	
	public void setSkipForward(boolean skip) {
		this.skipForward = skip;
	}
	
	public void setSkipPrevious(boolean skip) {
		this.skipPrevious = skip;
	}
	
	public void setFlag(boolean bool) {
		this.flag = bool;
	}
}
