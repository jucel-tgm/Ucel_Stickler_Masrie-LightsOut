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
			}
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
