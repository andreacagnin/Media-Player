package com.sp0tify.model;

/**
 * Class <code>DettagliCanzoni</code> contenente i dettagli di UNA canzone
 * @author andre
 *
 */
public class DettagliCanzoni {
	private String nomeCanzone;
	private String nomeArtista;
	private int durata;
	private String percorsoFile;
	
	/**
	 * Creazione di un dettaaglio canzone
	 * 
	 * @param nomeCanzone : nome della canzone
	 * @param nomeArtista : nome dell'autore
	 * @param durata : durata della canzone in millisecondi
	 * @param percorsoFile : percorso file
	 */
	public DettagliCanzoni(String nomeCanzone, String nomeArtista, int durata, String percorsoFile) {
		super();
		this.nomeCanzone = nomeCanzone;
		this.nomeArtista = nomeArtista;
		this.durata = durata;
		this.percorsoFile = percorsoFile;
	}

	public String getNomeCanzone() {
		return nomeCanzone;
	}

	public void setNomeCanzone(String nomeCanzone) {
		this.nomeCanzone = nomeCanzone;
	}

	public String getNomeArtista() {
		return nomeArtista;
	}

	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public String getPercorsoFile() {
		return percorsoFile;
	}

	public void setPercorsoFile(String percorsoFile) {
		this.percorsoFile = percorsoFile;
	}
	
	
	
}

