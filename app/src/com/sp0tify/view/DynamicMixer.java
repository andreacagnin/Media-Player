package com.sp0tify.view;

import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;

import com.sp0tify.control.*;

/**
 * Mixer in basso che gestisce le canzoni
 * @author andre
 *
 */
public class DynamicMixer extends JPanel implements Runnable{
	
	private static final long serialVersionUID = 1L;
	
	private Clip clip;
	
	private JPanel Mixer;
	private JButton btnPlay;
	private JButton btnSkipForward;
	private JButton btnRewind;
	private JButton btnAudio;
	
	private boolean isPlaying;
	private JProgressBar progressBarCanzoni;
	private JProgressBar progressBarAudio;

	/**
	 * Creazione del mixer
	 */
	public DynamicMixer() {
		
		setLayout(null);
		this.setBounds(0, 0, 1920, 93);
		Mixer = new JPanel();
		Mixer.setForeground(new Color(24, 24, 24));
		Mixer.setBackground(new Color(4, 120, 87));
		Mixer.setAutoscrolls(true);
		Mixer.setVerifyInputWhenFocusTarget(false);
		Mixer.setBounds(0, 0, 1920, 93);
		add(Mixer);
		Mixer.setLayout(null);
		
		btnPlay = new JButton("");
		btnPlay.setForeground(new Color(24, 24, 24));
		btnPlay.setVerifyInputWhenFocusTarget(false);
		btnPlay.setRolloverEnabled(false);
		btnPlay.setRequestFocusEnabled(false);
		btnPlay.setOpaque(false);
		btnPlay.setFocusable(false);
		btnPlay.setFocusTraversalKeysEnabled(false);
		btnPlay.setFocusPainted(false);
		btnPlay.setDefaultCapable(false);
		btnPlay.setContentAreaFilled(false);
		btnPlay.setBorderPainted(false);
		btnPlay.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPlay.setBounds(950, 32, 15, 15);
		Mixer.add(btnPlay);
		
		btnSkipForward = new JButton("");
		btnSkipForward.setForeground(new Color(24, 24, 24));
		btnSkipForward.setVerifyInputWhenFocusTarget(false);
		btnSkipForward.setRolloverEnabled(false);
		btnSkipForward.setRequestFocusEnabled(false);
		btnSkipForward.setOpaque(false);
		btnSkipForward.setFocusable(false);
		btnSkipForward.setFocusTraversalKeysEnabled(false);
		btnSkipForward.setFocusPainted(false);
		btnSkipForward.setDefaultCapable(false);
		btnSkipForward.setContentAreaFilled(false);
		btnSkipForward.setBorderPainted(false);
		btnSkipForward.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSkipForward.setIcon(new ImageIcon(DynamicMixer.class.getResource("/media/images/skipForwardLogo.png")));
		btnSkipForward.setBounds(998, 32, 22, 15);
		Mixer.add(btnSkipForward);
		
		btnRewind = new JButton("");
		btnRewind.setForeground(new Color(24, 24, 24));
		btnRewind.setVerifyInputWhenFocusTarget(false);
		btnRewind.setFocusable(false);
		btnRewind.setFocusTraversalKeysEnabled(false);
		btnRewind.setFocusPainted(false);
		btnRewind.setDefaultCapable(false);
		btnRewind.setContentAreaFilled(false);
		btnRewind.setBorderPainted(false);
		btnRewind.setRolloverEnabled(false);
		btnRewind.setRequestFocusEnabled(false);
		btnRewind.setOpaque(false);
		btnRewind.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRewind.setIcon(new ImageIcon(DynamicMixer.class.getResource("/media/images/skipBackLogo.png")));
		btnRewind.setBounds(895, 32, 22, 15);
		Mixer.add(btnRewind);
		
		btnAudio = new JButton("");
		btnAudio.setForeground(new Color(24, 24, 24));
		btnAudio.setVerifyInputWhenFocusTarget(false);
		btnAudio.setRolloverEnabled(false);
		btnAudio.setRequestFocusEnabled(false);
		btnAudio.setOpaque(false);
		btnAudio.setFocusable(false);
		btnAudio.setFocusTraversalKeysEnabled(false);
		btnAudio.setFocusPainted(false);
		btnAudio.setDefaultCapable(false);
		btnAudio.setContentAreaFilled(false);
		btnAudio.setBorderPainted(false);
		btnAudio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAudio.setIcon(new ImageIcon(DynamicMixer.class.getResource("/media/images/audioLogo.png")));
		btnAudio.setBounds(1803, 32, 22, 15);
		Mixer.add(btnAudio);
		
		progressBarCanzoni = new JProgressBar();
		progressBarCanzoni.setBorderPainted(false);
		progressBarCanzoni.setFocusTraversalKeysEnabled(false);
		progressBarCanzoni.setFocusable(false);
		progressBarCanzoni.setRequestFocusEnabled(false);
		progressBarCanzoni.setForeground(new Color(24, 24, 24));
		progressBarCanzoni.setValue(0);
		progressBarCanzoni.setString("");
		progressBarCanzoni.setStringPainted(true);
		progressBarCanzoni.setBounds(676, 69, 564, 6);
		Mixer.add(progressBarCanzoni);
		
		progressBarAudio = new JProgressBar();
		progressBarAudio.setValue(100);
		progressBarAudio.setString("");
		progressBarAudio.setRequestFocusEnabled(false);
		progressBarAudio.setStringPainted(true);
		progressBarAudio.setForeground(new Color(24, 24, 24));
		progressBarAudio.setFocusable(false);
		progressBarAudio.setFocusTraversalKeysEnabled(false);
		progressBarAudio.setBorderPainted(false);
		progressBarAudio.setBounds(1832, 36, 64, 6);
		Mixer.add(progressBarAudio);
		
		initSong();

	}

	/**
	 * 
	 * @return {@code progressBarCanzoni}
	 */
	public JProgressBar getProgressBarCanzoni() {
		return progressBarCanzoni;
	}

	/**
	 * Imposta la progressBar
	 * @param progressBarCanzoni : {@code progressBarCanzoni}
	 */
	public void setProgressBarCanzoni(JProgressBar progressBarCanzoni) {
		this.progressBarCanzoni = progressBarCanzoni;
	}
	
	public void setMaxProgressBarCanzoni(int i) {
		this.progressBarCanzoni.setMaximum(i);
	}

	public JButton getBtnPlay() {
		return btnPlay;
	}

	public void setBtnPlay(JButton btnPlay) {
		this.btnPlay = btnPlay;
	}

	public JButton getBtnSkipForward() {
		return btnSkipForward;
	}

	public void setBtnSkipForward(JButton btnSkipForward) {
		this.btnSkipForward = btnSkipForward;
	}

	public JButton getBtnRewind() {
		return btnRewind;
	}

	public void setBtnRewind(JButton btnRewind) {
		this.btnRewind = btnRewind;
	}

	public JButton getBtnAudio() {
		return btnAudio;
	}

	public void setBtnAudio(JButton btnAudio) {
		this.btnAudio = btnAudio;
	}

	public JProgressBar getProgressBarAudio() {
		return progressBarAudio;
	}

	public void setProgressBarAudio(JProgressBar progressBarAudio) {
		this.progressBarAudio = progressBarAudio;
	}

	public boolean isPlaying() {
		return isPlaying;
	}

	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
		if(!isPlaying)
			btnPlay.setIcon(new ImageIcon(DynamicMixer.class.getResource("/media/images/playLogo.png")));
		else
			btnPlay.setIcon(new ImageIcon(DynamicMixer.class.getResource("/media/images/pauseLogo.png")));
	}

	/**
	 * Inizializza le immagini
	 */
	public void initSong() {
		setPlaying(false);
	}

	public void registraEventi(ControllerDynamicMixer controllerDynamicMixer) {
		// TODO Auto-generated method stub
		this.btnAudio.addActionListener(controllerDynamicMixer);
		this.btnPlay.addActionListener(controllerDynamicMixer);
		this.btnRewind.addActionListener(controllerDynamicMixer);
		this.btnSkipForward.addActionListener(controllerDynamicMixer);
	}

	public DynamicMixer getDynamicMixer() {
		// TODO Auto-generated method stub
		return this;
	}
	
	public void setClip(Clip clip) {
		this.clip = clip;
	}

	@SuppressWarnings("static-access")
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.currentThread().sleep(clip.getMicrosecondPosition()/1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(clip.isActive()) {
			progressBarCanzoni.setValue((int) clip.getMicrosecondPosition()/1000);
		}
	}

	

}
