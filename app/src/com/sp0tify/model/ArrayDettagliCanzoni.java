package com.sp0tify.model;

import java.io.File;
import java.util.ArrayList;

/**
 * Class <code>ArrayDettagliCanzoni</code> contenente tutti i dettagli delle canzoni
 * @author andre
 *
 */
public class ArrayDettagliCanzoni {
	private ArrayList<DettagliCanzoni> f;
	private ArrayCanzoni arrayCanzoni;

	/**
	 * Creazione dell'array
	 */
	public ArrayDettagliCanzoni() {
		f=new ArrayList<DettagliCanzoni>();
	}
	
	public void inserimento(DettagliCanzoni dettagliCanzoni) {
		f.add(dettagliCanzoni);
	}
	
	
	public int getDurata(String nomeCanzone) {
		for(int i = 0; i < f.size(); i++) {
			if(f.get(i).getNomeCanzone().compareTo(nomeCanzone) == 0) {
				return f.get(i).getDurata();
			}
		}
		return 0;
	}
	
	public String getCanzone(File file) {
		for(int i = 0; i < f.size(); i++) {
			if(arrayCanzoni.getCanzone(i).compareTo(file) == 0) {
				return f.get(i).getNomeCanzone();
			}
		}
		return null;
	}

	public int getCanzone(String nomeCanzone) {
		// TODO Auto-generated method stub
		for(int i = 0; i < f.size(); i++) {
			if(f.get(i).getNomeCanzone().compareTo(nomeCanzone) == 0) {
				return i;
			}
		}
		return 0;
	}
	
	public String getPercorsoFile(String nomeCanzone) {
	
		for(int i = 0; i < f.size(); i++) {
			if(f.get(i).getNomeCanzone().compareTo(nomeCanzone) == 0) {
				return f.get(i).getPercorsoFile();
			}
		}
		return null;
	}

	public int getSize() {
		return f.size();
	}

	public DettagliCanzoni get(int i) {
		return f.get(i);
	}

	public String getNomeCanzone(int i) {
		return f.get(i).getNomeCanzone();
	}
	
	public String getNomeCanzone(String r) {
		for(int i = 0; i < f.size(); i++) {
			if(f.get(i).getNomeCanzone().compareTo(r) == 0) {
				return f.get(i).getNomeCanzone();
			}
		}
		return null;
	}

	public String getNomeArtista(String r) {
		for(int i = 0; i < f.size(); i++) {
			if(f.get(i).getNomeCanzone().compareTo(r) == 0) {
				return f.get(i).getNomeArtista();
			}
		}
		return null;
	}
	
	public String getCanzone(int i) {
		return f.get(i).getNomeCanzone();
	}

	public void setArrayCanzoni(ArrayCanzoni arrayCanzoni) {
		this.arrayCanzoni = arrayCanzoni;
	}
}

