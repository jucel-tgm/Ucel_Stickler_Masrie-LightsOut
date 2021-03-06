package teamarbeit2;

import java.awt.*;

import javax.swing.*;

/**
 * 
 */

/**
 * View Klasse
 * 
 * @author Matthias Stickler
 * @version 1.0
 */
public class LightsPanel extends JPanel {
	private JButton[] buttons;
	private Controller lc;
	private JButton restart;
	private JLabel moves;
	private int moveCounter;

	/**
	 * Konstruktor zum Initialisieren
	 */
	public LightsPanel(Controller lc, int fieldSize) {
		this.setLayout(new GridLayout(fieldSize + 1, fieldSize, 4, 4));
		this.lc = lc;
		buttons = new JButton[fieldSize * fieldSize];
		restart = new JButton("Neustart");

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			buttons[i].addActionListener(lc);
			buttons[i].setBackground(Color.GREEN);
			buttons[i].setOpaque(true);
			this.add(buttons[i]);
		}
		restart = new JButton("Restart");
		restart.addActionListener(lc);
		this.add(restart);
		moveCounter = 0;
		moves = new JLabel("Moves: " + moveCounter);
		this.add(new JLabel());
		this.add(moves);
	}

	/**
	 * @return the moves
	 */
	public JLabel getMoves() {
		return moves;
	}

	/**
	 * @param moves
	 *            the moves to set
	 */
	public void setMoves(JLabel moves) {
		this.moves = moves;
	}

	/**
	 * @return the moveCounter
	 */
	public int getMoveCounter() {
		return moveCounter;
	}

	/**
	 * @param moveCounter
	 *            the moveCounter to set
	 */
	public void setMoveCounter(int moveCounter) {
		this.moveCounter = moveCounter;
		this.repaint();
	}

	/**
	 * @return the lc
	 */
	public Controller getLc() {
		return lc;
	}

	/**
	 * @param lc
	 *            the lc to set
	 */
	public void setLc(Controller lc) {
		this.lc = lc;
	}

	/**
	 * @return the restart
	 */
	public JButton getRestart() {
		return restart;
	}

	/**
	 * @param restart
	 *            the restart to set
	 */
	public void setRestart(JButton restart) {
		this.restart = restart;
	}

	/**
	 * @return the buttons
	 */
	public JButton[] getButtons() {
		return buttons;
	}

	/**
	 * @param buttons
	 *            the buttons to set
	 */
	public void setButtons(JButton[] buttons) {
		this.buttons = buttons;
	}

}
