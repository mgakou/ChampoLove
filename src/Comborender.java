import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class Comborender implements ListCellRenderer{
	JLabel label;
	public Comborender() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Component getListCellRendererComponent(JList list, Object value, 
			int index, boolean selected,
			boolean focused) {
		// TODO Auto-generated method stub
		if(value instanceof Component) {
			Component c = (Component)value;
			if (selected) {
				c.setBackground(list.getSelectionBackground());
				c.setForeground(list.getSelectionForeground());
			}
			else
			{
				c.setBackground(list.getBackground());
				c.setForeground(list.getForeground());
			}
			return c;
		}
		else
		{
			if(label==null) {
				label=new JLabel(value.toString());
				
			}
			else {
				label.setText(value.toString());
			}
			return label;
		}
	
	}

}