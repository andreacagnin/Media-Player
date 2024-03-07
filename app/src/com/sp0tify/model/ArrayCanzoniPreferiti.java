package com.sp0tify.model;

import java.io.File;
import java.util.ArrayList;

/**
 * Class <code>ArrayCanzoniPreferiti</code> contenente le canzoni preferite
 * @author andre
 *
 */
public class ArrayCanzoniPreferiti {
	private ArrayList<File> arrayPreferiti;
	
	/**
	 * Creazione dell'array
	 */
	public ArrayCanzoniPreferiti() {
		arrayPreferiti=new ArrayList<File>();
	}
	
	public void inserimentoFile(String fs) {
		File file=new File(fs);
		arrayPreferiti.add(file);
		
	}
	
	public void elimina(String fs) {
		File file=new File(fs);
		
		for(int i = 0; i < arrayPreferiti.size(); i++) {
			if(arrayPreferiti.get(i).compareTo(file) == 0) {
				arrayPreferiti.remove(i);
			}
		}
	}
	
	public File getCanzone(String fs) {
		File file=new File(fs);
		
		for(int i = 0; i < arrayPreferiti.size(); i++) {
			if(arrayPreferiti.get(i).compareTo(file) == 0) {
				return arrayPreferiti.get(i);
			}
		}
		
		return null;
	}

	public File getCanzone(int i) {
		// TODO Auto-generated method stub
		return arrayPreferiti.get(i);
	}

	public int getSize() {
		// TODO Auto-generated method stub
		return arrayPreferiti.size();
	}
	
	
	
}
