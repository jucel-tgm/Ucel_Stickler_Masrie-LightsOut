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
		this.lp = new LightsPanel(this, 5);
		this.lm = new LightsModel(lp.getButtons().length);
		lm.setSize(lp.getButtons().length);
		lm.randomStart();
		this.lf = new LightsFrame(lp, "Lights Out");
		color();
		lf.repaint();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (e.getActionCommand().equals("Restart")) {
			lm.randomStart();
		} else {
			int i = 0;
			for (; i < lp.getButtons().length; ++i) {
				if (lp.getButtons()[i] == o)
					break;
			}
			System.out.println("Number" + i);
			lm.onClick(i);
			color();
			if (lm.win())
				JOptionPane.showMessageDialog(null, "Gewonnen",
						"Gut Gemacht :)", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public void color() {
		for (int x = 0; x < lm.getField().length; x++) {
			System.out.println("COUNTER:" + x);
			if (lm.getField()[x])
				lp.getButtons()[x].setBackground(Color.WHITE);
			else
				lp.getButtons()[x].setBackground(Color.BLACK);
		}
	}

	public static void main(String[] args) {
		new Controller();
	}
}