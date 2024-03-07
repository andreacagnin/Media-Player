package com.sp0tify.view;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.SwingConstants;

/**
 * Class <code>BottoniPlaylist</code>, le plylist che vengono creati sotto
 * i bottoni in alto a sinistra
 * 
 * @author andre
 *
 */
public class BottoniPlaylist extends JButton {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Creazione del bottone
	 */
	public BottoniPlaylist() {
		setHorizontalAlignment(SwingConstants.LEADING);
		setHorizontalTextPosition(SwingConstants.LEADING);
		new JButton();
		this.setVerifyInputWhenFocusTarget(false);
		this.setFocusable(false);
		this.setBorderPainted(false);
		this.setBackground(new Color(5, 150, 105));
		this.setDefaultCapable(false);
		this.setFocusPainted(false);
		this.setFocusTraversalKeysEnabled(false);
		this.setRolloverEnabled(false);
		this.setRequestFocusEnabled(false);
		this.setForeground(new Color(0, 0, 0));
		this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		this.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.setBounds(20, 11, 220, 60);
		
	}
}
