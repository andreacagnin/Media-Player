package com.sp0tify.model;

import java.io.*;
import java.util.*;

/**
 * Class <code>ArrayCanzoni</code> contenente i file delle canzoni
 * @author andre
 *
 */
public class ArrayCanzoni {
	private ArrayList<File> m;
	
	/**
	 * Creazione dell'array
	 */
	public ArrayCanzoni() {
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