import java.util.Vector;

import javax.swing.JCheckBox;

public class ResultatMatching {
	int score = 0;

	
	private Vector<JCheckBox> interetsItems;
	private Vector<JCheckBox> passionsItems;
	private Vector<JCheckBox> styleDeVieItems;
	private Vector<JCheckBox> educationItems;
	private Vector<JCheckBox> langueItems;
	
	public ResultatMatching() {
	    interetsItems = new Vector<>();
	    passionsItems = new Vector<>();
	    styleDeVieItems = new Vector<>();
	    educationItems = new Vector<>();
	    langueItems = new Vector<>();
	}

	

	
	public int calculerScore() {
		for (JCheckBox cb : interetsItems) {
			if (cb.isSelected()) {
				score += 5;
			}
		}
		for (JCheckBox cb : passionsItems) {
			if (cb.isSelected()) {
				score += 10;
			}
		}
		for (JCheckBox cb : styleDeVieItems) {
			if (cb.isSelected()) {
				score += 15;
			}
		}
		for (JCheckBox cb : educationItems) {
			if (cb.isSelected()) {
				score += 20;
			}
		}
		for (JCheckBox cb : langueItems) {
			if (cb.isSelected()) {
				score += 25;
			}
		}
		System.out.println(score);
		return score;
		
	}
	@Override
	public String toString() {
		
		return "hello"+ score;
	}
}
