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
public class LightsPanel extends JPanel{
	private JButton[] buttons;
	private Controller lc;
	private JButton restart;
	/**
	 * 
	 */
	public LightsPanel(Controller lc) {
		this.setLayout(new GridLayout(5,5));
		this.lc = lc;
		buttons = new JButton[25];
		restart = new JButton("Neustart");
		
		for(int i = 0; i<buttons.length;i++){
			
				buttons[i] = new JButton();
				this.add(buttons[i]);
				buttons[i].addActionListener(lc);
			}
		}
		
	
	/**
	 * @return the lc
	 */
	public Controller getLc() {
		return lc;
	}


	/**
	 * @param lc the lc to set
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
	 * @param restart the restart to set
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
	 * @param buttons the buttons to set
	 */
	public void setButtons(JButton[] buttons) {
		this.buttons = buttons;
	}

}
