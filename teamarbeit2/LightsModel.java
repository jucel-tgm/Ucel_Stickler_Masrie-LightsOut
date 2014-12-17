package teamarbeit2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * Die Model - Klasse enthält ein 1D - Array mit der Feldgröße Hier werden die
 * Bewegungen gesteuert und die Felder gesetzt
 * 
 * @author Johannes Ucel
 * @version 16.12.2014
 * 
 */
public class LightsModel {
	private boolean field[];
	private int size;

	/**
	 * Standardkonstruktor
	 */
	public LightsModel(int size) {
		this.size = size;
		field = new boolean[size];
	}

	/**
	 * Felder werden für den zufälligen Start initialisiert
	 */
	public void randomStart() {
		for (int i = 0; i < field.length; i++)
			field[i] = true;
		int anzahl = (int) (Math.random() * 5 + 1);
		int feldNr;
		int max = (int) (Math.random() * (size - 1) + 1);
		for (int i = 0; i < max; i++) {
			feldNr = (int) (Math.random() * max + 1);
			try {
				field[feldNr] = false;
			} catch (ArrayIndexOutOfBoundsException e1) {
				System.err.println("Falls der Startwert nicht passt");
			}
		}
	}

	/**
	 * Methode um den Gewinner zu erhalten. Schaut ob das gesamte Array auf
	 * false ist
	 * 
	 * @return gewonnen ja/nein
	 */
	public boolean win() {
		for (boolean val : field) {
			if (val)
				return false;
		}

		return true;
	}

	/**
	 * Methode, um bei einem Klick die Bewegungen durchzuführen
	 * 
	 * @param position
	 *            Ist der Button, der geklickt wurde
	 * @throws IllegalArgumentException - Erspart das übeprüfen der Randbereiche
	 */
	public void onClick(int position) throws IllegalArgumentException {
		int tmp = (int) Math.sqrt(size);
		//Mit try/catch realisiert, da dadurch das überprüfen, ob man nach oben/unten/links/rechts darf, nicht mehr notwendig ist
		try {
			if (position % tmp != 0)
				field[position - 1] = !field[position - 1];
		} catch (ArrayIndexOutOfBoundsException a1) {

		}
		try {
			if (position % tmp != tmp - 1)
				field[position + 1] = !field[position + 1];
		} catch (ArrayIndexOutOfBoundsException a2) {

		}
		try {
			if (position > tmp - 1)
				field[position - tmp] = !field[position - tmp];
		} catch (ArrayIndexOutOfBoundsException a3) {

		}
		try {
			if (position < field.length - tmp)
				field[position + tmp] = !field[position + tmp];
		} catch (ArrayIndexOutOfBoundsException a4) {

		}
		field[position] = !field[position];
	}

	/**
	 * @return the field
	 */
	public boolean[] getField() {
		return field;
	}

	/**
	 * @param field
	 *            the field to set
	 */
	public void setField(boolean[] field) {
		this.field = field;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
}