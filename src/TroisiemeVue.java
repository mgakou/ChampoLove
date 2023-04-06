import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.border.EmptyBorder;

public class TroisiemeVue extends JPanel{

    private JCheckBox checkbox1, checkbox2, checkbox3;
    
    private JList<CheckboxListItem> dropdown;

    public TroisiemeVue() {
        // Initialisation des éléments de la liste
        CheckboxListItem item1 = new CheckboxListItem("Option 1");
        CheckboxListItem item2 = new CheckboxListItem("Option 2");
        CheckboxListItem item3 = new CheckboxListItem("Option 3");

        // Initialisation du modèle et de la liste déroulante
        DefaultListModel<CheckboxListItem> listModel = new DefaultListModel<>();
        listModel.addElement(item1);
        listModel.addElement(item2);
        listModel.addElement(item3);
        dropdown = new JList<>(listModel);
        dropdown.setCellRenderer(new CheckboxListRenderer());

        // Mise en forme de la vue3
        setLayout(new BorderLayout());
        add(new JLabel("Dropdown :"), BorderLayout.NORTH);
        add(new JScrollPane(dropdown), BorderLayout.CENTER);
        setBorder(new EmptyBorder(10, 10, 10, 10));
    }

    // Getters pour les éléments de la vue3
    public JList<CheckboxListItem> getDropdown() {
        return dropdown;
    }

    // Classe interne pour les éléments de la liste déroulante
    private class CheckboxListItem {
        private String label;
        private boolean isSelected = false;

        public CheckboxListItem(String label) {
            this.label = label;
        }

        public boolean isSelected() {
            return isSelected;
        }

        public void setSelected(boolean isSelected) {
            this.isSelected = isSelected;
        }

        @Override
        public String toString() {
            return label;
        }
    }

    // Classe interne pour afficher les éléments de la liste déroulante
    private class CheckboxListRenderer extends JCheckBox implements ListCellRenderer<CheckboxListItem> {
        @Override
        public Component getListCellRendererComponent(JList<? extends CheckboxListItem> list, CheckboxListItem value, int index, boolean isSelected, boolean cellHasFocus) {
            setEnabled(list.isEnabled());
            setSelected(value.isSelected());
            setFont(list.getFont());
            setText(value.toString());
            return this;
        }
    }

	}


