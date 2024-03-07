package com.sp0tify.model;

import java.io.File;
import java.util.ArrayList;

public class ArrayCanzoniPlaylist {
	private ArrayList<File> m;
	
	/**
	 * Creazione dell'array
	 */
	public ArrayCanzoniPlaylist() {
		m=new ArrayList<File>();
	}
	
	public void inserimento(String fs) {
		File file=new File(fs);
		m.add(file);
	}
	
	public File getCanzone(int i) {
		return m.get(i);
	}
	
	public void eliminazione(String fs) {
		File file=new File(fs);
		m.remove(file);
	}
	
	public int getSize() {
		return m.size();
	}
}
