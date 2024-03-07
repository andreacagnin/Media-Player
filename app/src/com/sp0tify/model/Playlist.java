package com.sp0tify.model;

/**
 * Class <code>Playlist</code> contenente i dettagli di UNA playlist
 * @author andre
 *
 */
public class Playlist {
	private String nomePlaylist;
	private String descrizione;
	private int numeroBrani;
	private double durata;
	
	/**
	 * Creazione di una playlist
	 * 
	 * @param nomePlaylist : nome della playlist
	 * @param descrizione : descrizione della playlist
	 */
	public Playlist(String nomePlaylist, String descrizione) {
		super();
		this.nomePlaylist = nomePlaylist;
		this.descrizione = descrizione;
	}

	public String getNomePlaylist() {
		return nomePlaylist;
	}

	public void setNomePlaylist(String nomePlaylist) {
		this.nomePlaylist = nomePlaylist;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getNumeroBrani() {
		return numeroBrani;
	}

	public void setNumeroBrani(int numeroBrani) {
		this.numeroBrani = numeroBrani;
	}

	public double getDurata() {
		return durata;
	}

	public void setDurata(double durata) {
		this.durata = durata;
	}
	
	
}
