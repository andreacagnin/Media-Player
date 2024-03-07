package com.sp0tify.view;

import java.awt.Color;

import javax.swing.JPanel;

import com.sp0tify.control.MainController;
import com.sp0tify.model.Playlist;

import java.util.ArrayList;
 /**
  * Class <code>PannelloHomePlaylist<code> pannello che mostra la playlist selezionata
  * @author andre
  *
  */
public class PannelloHomePlaylist extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<HomePlaylist> pannelliPlaylist;
	private MainController mainController;
	private ModificaPlaylist modificaPlaylist;
	private PannelloLateralePlaylist pannelloLateralePlaylist;
	private HomePlaylist homePlaylist;
	private int index;
	private Playlist playlist;
	
	/**
	 * Creazione del pannello
	 */
	public PannelloHomePlaylist() {
		pannelliPlaylist = new ArrayList<HomePlaylist>();
		this.index = 0;
		
		setLayout(null);
		setVisible(true);
		setForeground(new Color(24, 24, 24));
		setBackground(new Color(6, 95, 70));
		setBounds(251, 0, 1670, 965);
		
		
		modificaPlaylist = new ModificaPlaylist();
		modificaPlaylist.setBounds(355, 211, 354, 345);
		add(modificaPlaylist);
	}
	
	/**
	 * Metodo per aggiungere un <code>HomePlaylist</code> all'array delle playlist
	 * 
	 * @param playlist : playlist
	 * @param mainController : controller principale
	 */
	public HomePlaylist addPannelloHomePlaylist(Playlist playlist, MainController mainController) {
		HomePlaylist homePLaylist;
		this.playlist = playlist;
		
		homePLaylist = new HomePlaylist(this.getPlaylist().getNomePlaylist(), playlist);
		
		pannelliPlaylist.add(homePLaylist);
		add(pannelliPlaylist.get(index));
		pannelliPlaylist.get(index).registraEventi(mainController);
		
		setHomePlaylist(homePLaylist);
		this.index++;
		
		return homePLaylist;
	}
	
	public Playlist getPlaylist() {
		return playlist;
	}
	
	public void setPlaylist(Playlist playlist) {
		this.playlist = playlist;
	}
	
	/**
	 * Mostra il pannello della playlist selezionata
	 * @param string : comando d'azione del <code>BottoniPlaylist</code>, oppure tramite il nome
	 * della laylist
	 */
	public void goPlaylist(String string) {
		for(int j = 0; j < pannelliPlaylist.size(); j++) {
			if(pannelliPlaylist.get(j).getNomePannello().equals(string)) {
				pannelliPlaylist.get(j).setVisible(true);
				this.setVisible(true);
			}
		}
	}
	
	/**
	 * Ritorna la playlist tramite l'<code>ActionCommand</code>, o il nome della playlist
	 * @param string : comando d'azione del <code>BottoniPlaylist</code>, oppure tramite il nome
	 * della laylist
	 * @return : l'indice dell'array di pannelli
	 */
	public int returnPlaylist(String string) {
		
		for(int j = 0; j < pannelliPlaylist.size(); j++) {
			if(pannelliPlaylist.get(j).getNomePannello().equals(string)) {
				pannelliPlaylist.get(j).setVisible(true);
				this.setVisible(true);
				return j;
			}
		}
		
		return 0;
	}
	
	/**
	 * Imposta tutti i pannelli a false
	 */
	public void goBack() {
		int i = 0;
		while(i < pannelliPlaylist.size()) {
			pannelliPlaylist.get(i).setVisible(false);
			this.setVisible(false);
			modificaPlaylist.setVisible(false);
			i++;
		}
	}

	public Object getBtnPlayPlaylist(String actionCommand) {
		// TODO Auto-generated method stub
		return homePlaylist.getBtnPlayPlaylist();
	}

	public Object getBtnPlaylist(String actionCommand) {
		// TODO Auto-generated method stub
		int j = 0;
		boolean flag = false;
		
		while(j < pannelliPlaylist.size() && !flag) {
			if(pannelliPlaylist.get(j).getNomePannello().equals(actionCommand)) {
				flag = true;
				return pannelliPlaylist.get(j).getBtnPlaylist();
			}else
				j++;
		}
		return null;
	}

	/**
	 * Inizia le modifiche della playlist
	 * @param actionCommand : nome della playlist
	 * @return : l'indice dell'array di pannelli
	 */
	public int InitModificaPlaylist(String actionCommand) {
		// TODO Auto-generated method stub
		modificaPlaylist.setVisible(true);
		modificaPlaylist.setTextFieldNome(actionCommand);
		
		
		int j = 0;
		boolean flag = false;
		
		while(j < pannelliPlaylist.size() && !flag) {
			if(pannelliPlaylist.get(j).getNomePannello().equals(actionCommand)) {
				modificaPlaylist.setTextAreaDescrizione(pannelliPlaylist.get(j).getlblDescrizione());
				return j;
			}else
				j++;
		}
		
		return 0;
	}
	
	/**
	 * Modifica la playlist
	 * @param indexModifica : indice dell'array di pannelli
	 * @return : nome della playlist
	 */
	public String modificaPlaylist(int indexModifica) {
		String nomePlaylist = "", descrizione = "";
		
		nomePlaylist = modificaPlaylist.getTextNome();
		descrizione = modificaPlaylist.getTextDescrizione();
		pannelliPlaylist.get(indexModifica).setNomePlaylist(nomePlaylist);
		pannelliPlaylist.get(indexModifica).setLblDescrizione(descrizione);
		pannelliPlaylist.get(indexModifica).setNomePannello(nomePlaylist);
		pannelloLateralePlaylist.setNomeBottoniPLaylist(nomePlaylist, indexModifica);
		
		return nomePlaylist;
		
	}
	
	public boolean getVisible() {
		return modificaPlaylist.getVisible();
	}
	
	/**
	 * Chiude la modifica e imposta il pannello di modifica a <code>False</code>
	 */
	public void EndModificaPlaylist() {
		// TODO Auto-generated method stub
		modificaPlaylist.buffer();
		modificaPlaylist.setVisible(false);
	}

	public Object getBtnChiudiModifica() {
		// TODO Auto-generated method stub
		return modificaPlaylist.getBtnChiudiModifica();
	}

	public Object getBtnSalvaModifica() {
		// TODO Auto-generated method stub
		return modificaPlaylist.getBtnSalvaModifica();
	}
	
	public Object getBtnEliminaPlaylist() {
		return modificaPlaylist.getBtnEliminaPlaylist();
	}

	/**
	 * Elimina una playlist
	 * 
	 * @param indexModifica : indice dell'array di pannelli
	 */
	public void eliminaPlaylist(int indexModifica) {
		// TODO Auto-generated method stub
		remove(pannelliPlaylist.get(indexModifica));
		pannelliPlaylist.remove(indexModifica);
		this.index--;
	}

	public PannelloLateralePlaylist getPannelloLateralePlaylist() {
		return pannelloLateralePlaylist;
	}

	public void setPannelloLateralePlaylist(PannelloLateralePlaylist pannelloLateralePlaylist) {
		this.pannelloLateralePlaylist = pannelloLateralePlaylist;
	}

	public MainController getMainController() {
		return mainController;
	}

	public void setMainController(MainController mainController) {
		this.mainController = mainController;
		modificaPlaylist.registraEventi(mainController);
	}
	
	public void setHomePlaylist(HomePlaylist homePlaylist) {
		this.homePlaylist = homePlaylist;
	}

}
