package com.sp0tify.model;

import java.util.ArrayList;

/**
 * Class <code>ArrayPlaylist</code> contenente tutte le playlist
 * @author andre
 *
 */
public class ArrayPlaylist{
	private ArrayList<Playlist> arrayPlaylist;
	
	/**
	 * Creazione dell'array
	 */
	public ArrayPlaylist() {
		arrayPlaylist = new ArrayList<Playlist>();
	}
	
	public void addPlaylist(Playlist p) {
		arrayPlaylist.add(p);
	}

}
