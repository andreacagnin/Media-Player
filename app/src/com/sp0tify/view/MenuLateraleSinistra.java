package com.sp0tify.view;

import java.awt.*;
import javax.swing.*;

/**
 * Class <code>MenuLateraleSinistra</code> contenente il <code>ContainerBottoni</code>
 * e il <code>PannelloLateralePlaylist</code>
 * @author andre
 *
 */
public class MenuLateraleSinistra extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ContainerBottoni container1Bottoni;
	private PannelloLateralePlaylist pannelloLateralePlaylist;
	private Panel gapContainer;
	
	/**
	 * Creazione del menu
	 */
	public MenuLateraleSinistra() {
		this.setBackground(new Color(5, 150, 105));
		this.setBounds(0, 0, 251, 1020);
		setLayout(null);
		
		container1Bottoni = new ContainerBottoni();
		container1Bottoni.setBounds(0, 0, 250, 354);
		this.add(container1Bottoni);
		
		gapContainer = new Panel();
		gapContainer.setBounds(26, 356, 200, 2);
		gapContainer.setBackground(new Color(0, 0, 0));
		add(gapContainer);
		
		pannelloLateralePlaylist = new PannelloLateralePlaylist();
		pannelloLateralePlaylist.setSize(250, 666);
		pannelloLateralePlaylist.setLocation(0, 356);
		this.add(pannelloLateralePlaylist);
	}
	
	public ContainerBottoni getContainer1Bottoni() {
		// TODO Auto-generated method stub
		return container1Bottoni;
	}

	public PannelloLateralePlaylist getPannelloLateralePlaylist() {
		// TODO Auto-generated method stub
		return pannelloLateralePlaylist;
	}

}
