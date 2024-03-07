package com.sp0tify.control;

import java.awt.event.*;

import javax.sound.sampled.*;
import javax.swing.*;

import com.sp0tify.view.*;
import com.sp0tify.model.*;

/**
 * Classe <code>MainController</code> controller principale, gestisce principalmente i bottoni a sinistra
 * 
 * @author andre
 *
 */
public class MainController implements ActionListener{
	
	private DynamicMixer dynamicMixer;
	private ControllerDynamicMixer controllerDynamicMixer;
	private ControllerHome controllerHome;
	private ControllerCerca controllerCerca;
	private ContainerBottoni containerBottoni;
	private PannelloHome pannelloHome;
	private PannelloLateralePlaylist pannelloLateralePlaylist;
	private PannelloHomePlaylist pannelloHomePlaylist;
	private PannelloLikedSongs pannelloLikedSongs;
	private PannelloLibreria pannelloLibreria;
	private PannelloCerca pannelloCerca;
	private Playlist playlist;
	private Finestra finestra;
	private ArrayDettagliCanzoni arrayDettagliCanzoni;
	private ArrayCanzoniPreferiti arrayCanzoniPreferiti;
	private ArrayCanzoni arrayCanzoni;
	private ArrayCanzoniPlaylist arrayCanzoniPlaylist;
	private PlayMusic playMusic;
	
	private String canzoneInPlay;
	private String nomePlaylist;
	private int i;
	private int indexModifica;
	private boolean playList;
	private boolean playing;
	private Clip clip;

	/**
	 * Creazione del controller per gli eventi presenti nel <i>Container1Bottoni</i>, il menu
	 * laterale in alto a sinistra
	 * 
	 * @param container1Bottoni : Menu laterale in alto a sinistra con i bottoni
	 * @param pannelloHome : Schermata home
	 * @param dynamicMixer : Mixer in basso 
	 * @param pannelloLateralePlaylist : Menu laterale in basso a sinistra dove andranno posizionate
	 * le playlist
	 * @param pannelloHomePlaylist : Schermata contenente le varie playlist
	 * @param finestra : Finestra grafica
	 * @param arrayCanzoni : l'array contenente i file delle canzoni 
	 * @param arrayDettagliCanzoni : l'array contenente i dettagli dellle cannzoni: 
	 * <li>Nome della canzone</li>
	 * <li>Nome dell'artista</li>
	 * <li>Durata della canzone</li>
	 * <li>Percorso della canzone</li>
	 * @param codaCanzoni 
	 * @param pilaCanzoni 
	 * @param arrayCanzoniPreferiti : l'array contenete le canzoni preferite
	 * @param pannelloLikedSongs : il pannello dove sono contenute le canzoni preferite
	 */
	public MainController(ContainerBottoni container1Bottoni, PannelloHome pannelloHome,
			DynamicMixer dynamicMixer, PannelloLateralePlaylist pannelloLateralePlaylist, PannelloHomePlaylist pannelloHomePlaylist, 
			PannelloLibreria pannelloLibreria ,Finestra finestra, ArrayCanzoni arrayCanzoni, ArrayDettagliCanzoni arrayDettagliCanzoni,
			ArrayCanzoniPreferiti arrayCanzoniPreferiti, PannelloLikedSongs pannelloLikedSongs, PannelloCerca pannelloCerca) {
		
		super();
		this.containerBottoni = container1Bottoni;
		this.pannelloHome = pannelloHome;
		this.pannelloHome.setMainController(this);
		this.dynamicMixer = dynamicMixer;
		this.pannelloLateralePlaylist = pannelloLateralePlaylist;
		this.pannelloHomePlaylist = pannelloHomePlaylist;
		this.pannelloLibreria = pannelloLibreria;
		this.pannelloCerca = pannelloCerca;
		this.finestra = finestra;
		this.pannelloLikedSongs = pannelloLikedSongs;
		this.arrayDettagliCanzoni = arrayDettagliCanzoni;
		this.arrayCanzoniPreferiti = arrayCanzoniPreferiti;
		this.arrayCanzoni = arrayCanzoni;
		
		playMusic = new PlayMusic();
		
		pannelloHome.setArrayDettagliCanzoni(arrayDettagliCanzoni);
		
		this.controllerDynamicMixer = new ControllerDynamicMixer(dynamicMixer,
				container1Bottoni, pannelloHome, this);
		
		this.controllerHome = new ControllerHome(pannelloHome, dynamicMixer, arrayCanzoni, arrayDettagliCanzoni, 
				controllerDynamicMixer, this, arrayCanzoniPreferiti, this.pannelloLikedSongs);
		
		controllerCerca = new ControllerCerca(pannelloCerca, arrayDettagliCanzoni);
		
		this.i = 0;
		this.indexModifica = 0;
		this.playList = false;
		this.playing = false;
		this.canzoneInPlay = "";
		
		container1Bottoni.registraEventi(this);
		pannelloLibreria.registraEventi(this);
		pannelloLikedSongs.registraEventi(this);
	}
	
	/**
	 * Il metodo imposta tutti i pannelli a visibilita' <i>false</i>
	 */
	public void buffer() {
		containerBottoni.setInHome(false);
		containerBottoni.setInSearch(false);
		containerBottoni.setInLibrary(false);
		containerBottoni.setInAddPlaylist(false);
		containerBottoni.setInLikedSongs(false);
		
		pannelloHome.setVisible(false);
		pannelloCerca.setVisible(false);
		pannelloCerca.getTextFieldCerca().setVisible(false);
		pannelloCerca.getBtnCerca().setVisible(false);
		pannelloLibreria.setVisible(false);
		pannelloLikedSongs.setVisible(false);
		
		if(pannelloHomePlaylist != null) {
			pannelloHomePlaylist.setVisible(false);
			pannelloHomePlaylist.goBack();
			pannelloHomePlaylist.EndModificaPlaylist();
		}
	}
	
	public boolean isPlaying() {
		return playing;
	}

	public void setPlaying(boolean playing) {
		this.playing = playing;
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		/**
		 * Se viene premuto il tasto {@code BtnHome} viene visualizzato il pannello home
		 */
		if(e.getSource() == containerBottoni.getBtnHome()) {
			buffer();
			containerBottoni.setInHome(true);
			pannelloHome.setVisible(true);
			
		}
		
		/**
		 * Se viene premuto il tasto {@code BtnCerca} viene visualizzato il pannello di ricerca
		 */
		if(e.getSource() == containerBottoni.getBtnCerca()) {
			buffer();
			containerBottoni.setInSearch(true);
			pannelloCerca.setVisible(true);
			pannelloCerca.getTextFieldCerca().setVisible(true);
			pannelloCerca.getBtnCerca().setVisible(true);
		}
		
		/**
		 * Se viene premuto il tasto {@code BtnLibrary} viene visualizzato il pannello libreria 
		 */
		if(e.getSource() == containerBottoni.getBtnLibrary()) {
			buffer();
			pannelloLibreria.setVisible(true);
			containerBottoni.setInLibrary(true);
		}
		
		
		if(e.getSource() == pannelloLibreria.getBtnBraniFavoriti(e.getActionCommand())) {
			containerBottoni.setInLibrary(true);
			if(e.getActionCommand().compareTo("Brani che ti piacciono") == 0) {
				buffer();
				pannelloLikedSongs.setVisible(true);
			}else {
				buffer();
				containerBottoni.setInAddPlaylist(true);
				pannelloHomePlaylist.goPlaylist(e.getActionCommand());
				pannelloHomePlaylist.EndModificaPlaylist();
			}
		}
		
		/**
		 * Se viene premuto il tasto {@code BtnAddPlaylist} crea una plylist nel menu laterale in basso a sinistra
		 */
		if(e.getSource() == containerBottoni.getBtnAddPlaylist()) {
			if(i < 1) {
				HomePlaylist homePlaylist;
				
				if(i != 0) { 
					buffer(); 
				}else { 
					containerBottoni.setInHome(false);
					pannelloHome.setVisible(false); 
				}
				
				if(this.i == 0) {
					pannelloHomePlaylist.setMainController(this);
					pannelloHomePlaylist.setPannelloLateralePlaylist(pannelloLateralePlaylist);
				}
				
				this.playlist = pannelloLateralePlaylist.addButton(this);
				homePlaylist = pannelloHomePlaylist.addPannelloHomePlaylist(playlist, this);
				pannelloLibreria.aggiungi(playlist.getNomePlaylist());
				pannelloLibreria.registraEventiThis(this);
				containerBottoni.setInAddPlaylist(true);
				
				this.setPlayList(true);
				pannelloCerca.setVisible(false);
				pannelloHomePlaylist.goPlaylist("PlayList "+(i + 1));
				pannelloHomePlaylist.EndModificaPlaylist();
				
				controllerCerca.setHomePlaylist(homePlaylist);
			}
			this.i++;
			
			if(i > 1) {
				JOptionPane.showMessageDialog(finestra, "massimo 1 playlist.\nPer ottenere piu' playlist aggiornare "
						+ "\nla versione base "
						+ "a quella premium (6€ al mese)");
			}
		}
		
		/**
		 * Se viene premuto il tasto di una playlist nel menu laterale in basso a sinistra 
		 * va nella playlist selezionata
		 */
		if(isPlayList()) {
			if(e.getSource() == pannelloLateralePlaylist.getBtnPlaylist(e.getActionCommand())) {
				buffer();
				
				containerBottoni.setInAddPlaylist(true);
				pannelloHomePlaylist.goPlaylist(e.getActionCommand());
			}
		}
		
		/**
		 * Se viene premuto il tasto {@code BtnLikedSongs}
		 */
		if(e.getSource() == containerBottoni.getBtnLikedSongs()) {
			buffer();
			
			pannelloLikedSongs.setVisible(true);
			containerBottoni.setInLikedSongs(true);
		}
		
		/**
		 * parte la canzone dal pannello brani preferiti
		 */
		if(e.getSource() == pannelloLikedSongs.getBtnPlay(e.getActionCommand())) {

			if(e.getActionCommand().compareTo(canzoneInPlay) == 0) {
				if(isPlaying()) {
					
					clip.stop(); 
					this.setPlaying(false);
					controllerHome.setPlaying(false);
					dynamicMixer.setPlaying(false);
					
				}
				else {
					
					clip.start();
					new Thread(dynamicMixer,getCanzoneInPlay()).start();
					this.setPlaying(true);
					controllerHome.setPlaying(true);
					dynamicMixer.setPlaying(true);
					
				}
				
			}else {
				if(isPlaying()) {clip.close(); }
				
				if(Thread.currentThread().isAlive())
					playMusic.setFlag(true);
				
				playMusic = new PlayMusic(arrayCanzoniPreferiti.getCanzone(arrayDettagliCanzoni.getPercorsoFile(e.getActionCommand())), 
						controllerDynamicMixer, controllerHome, this, arrayCanzoni, arrayCanzoniPreferiti, null, dynamicMixer, 
						"Canzoni preferite");
				
				controllerDynamicMixer.setPlayMusic(playMusic);
				canzoneInPlay = e.getActionCommand();
				controllerHome.setCanzoneInPlay(canzoneInPlay);
				
				dynamicMixer.setPlaying(true);
				this.setPlaying(true);
				controllerHome.setPlaying(true);
				
				new Thread(playMusic).start();
				
			}
		}
		
		if(e.getSource() == pannelloLikedSongs.getBtnPlayPlaylist()){
			
			if(isPlaying()) {clip.close(); }
			
			if(Thread.currentThread().isAlive())
				playMusic.setFlag(true);
			
			playMusic = new PlayMusic(arrayCanzoniPreferiti.getCanzone(0), 
					controllerDynamicMixer, controllerHome, this, arrayCanzoni, arrayCanzoniPreferiti, null, dynamicMixer, "Canzoni preferite");
			
			controllerDynamicMixer.setPlayMusic(playMusic);
			canzoneInPlay = e.getActionCommand();
			controllerHome.setCanzoneInPlay(canzoneInPlay);
			
			dynamicMixer.setPlaying(true);
			this.setPlaying(true);
			controllerHome.setPlaying(true);
			
			new Thread(playMusic).start();
		}
		
		if(e.getSource() == pannelloLikedSongs.getBtnLike(e.getActionCommand())) {
			
			pannelloLikedSongs.removePanel(e.getActionCommand());
			pannelloHome.getBtnLike(e.getActionCommand());
			pannelloLikedSongs.setVisible(false);
			pannelloLikedSongs.setVisible(true);
			
		}
		
		if(isPlayList()) {
			/**
			 * Modifica la playlist
			 */
			if(e.getSource() == pannelloHomePlaylist.getBtnPlaylist(e.getActionCommand())) {
				indexModifica = pannelloHomePlaylist.InitModificaPlaylist(e.getActionCommand());
				this.nomePlaylist = e.getActionCommand();
			}
			/**
			 * Salva la modifica
			 */
			if(e.getSource() == pannelloHomePlaylist.getBtnSalvaModifica()) {
				String nomePlaylist;
				
				nomePlaylist = pannelloHomePlaylist.modificaPlaylist(indexModifica);
				pannelloHomePlaylist.EndModificaPlaylist();
				
				pannelloLibreria.setNomePlayList(this.nomePlaylist, nomePlaylist);
			}
			/**
			 * Chiude la modifica
			 */
			if(e.getSource() == pannelloHomePlaylist.getBtnChiudiModifica()) {
				pannelloHomePlaylist.EndModificaPlaylist();
			}
			/**
			 * Elimina la playlist
			 */
			if(e.getSource() == pannelloHomePlaylist.getBtnEliminaPlaylist()) {
				pannelloHomePlaylist.eliminaPlaylist(indexModifica);
				pannelloLateralePlaylist.removeButton(indexModifica);
				pannelloLibreria.rimuovi(indexModifica);
				
				this.i--;
				buffer();
				pannelloHome.setVisible(true);
				containerBottoni.setInHome(true);
			}
			
			/**
			 * Inizia la playlist
			 */
			if(e.getSource() == pannelloHomePlaylist.getBtnPlayPlaylist(e.getActionCommand())) {
				
			}
			
		
		}
		
		
	}
	
	public String getCanzoneInPlay() {
		return canzoneInPlay;
	}
	
	public void setCanzoneInPlay(String canzoneInPlay) {
		this.canzoneInPlay = canzoneInPlay;
	}
	
	/**
	 * Ritorna il valore <i>playlist</i>
	 * @return true se e' stata creata <i>almeno</i> una playlist altrimenti false
	 */
	public boolean isPlayList() {
		return this.playList;
	}
	
	/**
	 * Imposta il valore <i>playlist</i>
	 * @param flag true or false
	 */
	public void setPlayList(boolean flag) {
		this.playList = flag;
	}

	public void setClip(Clip clip) {
		// TODO Auto-generated method stub
		this.clip = clip;
	}
	
	public void setNomePlaylist(String nomePlaylist) {
		this.nomePlaylist = nomePlaylist;
	}

}
