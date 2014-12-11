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
 * Die Model - Klasse enthält eine ArrayList mit den Wörtern und Methoden, um
 * Buchstaben mit dem Ratewort zu vergleichen bzw. um Wörter hinzuzufügen/zu
 * entfernen
 * 
 * @author Johannes Ucel
 * @version 10.10.2014
 * 
 */
public class LightsModel {
	private boolean field[];

	/**
	 * Standardkonstruktor
	 */
	public LightsModel() {
		field = new boolean[25];
		for (int i = 0; i < field.length; i++)
			field[i] = false;
	}

	public void randomStart() {
		int anzahl = (int) (Math.random() * 5 + 1);
		int feldNr;
		for (int i = 0; i < anzahl; i++) {
			feldNr = (int) (Math.random() * 25 + 1);
			field[feldNr] = true;
		}
	}

	public void onClick(int position) throws IllegalArgumentException {
		/*
		 * if (position - 1 < 0 || position > field.length - 1 || position >=
		 * 5|| position >= 21) { throw new IllegalArgumentException(); }
		 */
		for (int i = 0; i < field.length; i += 5) {
			if (position == i){
				// KANNST DU NICHT NACH LINKS
				field[position + 1] = !field[position + 1];
			}
		}
		for (int i = 5; i < field.length; i += 5)
			if (position == i)
				field[position - 1] = !field[position - 1];

		if (position < 5)
			field[position + 5] = !field[position + 5];

		if (position > 19)
			field[position - 5] = !field[position - 5];
		field[position] = !field[position];
		/*
		 * field[position + 1] = !field[position + 1]; field[position - 1] =
		 * !field[position - 1]; field[position + 5] = !field[position + 5];
		 * field[position - 5] = !field[position - 5];
		 */
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
}