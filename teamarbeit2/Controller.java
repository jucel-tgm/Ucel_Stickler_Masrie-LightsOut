package teamarbeit2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.TreeSet;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Controller Klasse mit dem Listener, wo auf die Button-Klicks richtig reagiert
 * wird
 * 
 * @author Johannes Ucel
 * @version 10.10.2014
 * 
 */
public class Controller implements ActionListener {
	private LightsPanel lp;
	private LightsFrame lf;
	private LightsModel lm;

	/**
	 * Standardkonstruktor
	 * 
	 */
	public Controller() {
		this.lm = new LightsModel();
		this.lp = new LightsPanel(this);
		this.lf = new LightsFrame(lp, "Lights Out");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

	public static void main(String[] args) {
		new Controller();
	}
}