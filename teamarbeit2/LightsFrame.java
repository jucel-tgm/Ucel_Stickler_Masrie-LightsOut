package teamarbeit2;

import javax.swing.*;
import java.awt.*;

/**
 * Frame Klasse
 * 
 * @author Johannes Ucel
 * @version 22.09.2014
 *
 */
public class LightsFrame extends JFrame {
	/**
	 * @param fp
	 * @param title
	 */
	public LightsFrame(LightsPanel fp, String title) {
		super(title);
		this.add(fp);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Definiere die Größe des Fensters
		this.setSize(650, 300);
		this.setLocationRelativeTo(null);
		// Mache den Frame sichtbar!
		this.setVisible(true);

	}
}