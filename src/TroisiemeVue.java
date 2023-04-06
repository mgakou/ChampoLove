import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TroisiemeVue extends JPanel{
	
	public TroisiemeVue() {
		JLabel headTitle = new JLabel("Quelles sont vos affinités ?");
		this.add(headTitle);
		this.setBackground(Color.ORANGE);
	}

}
