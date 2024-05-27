package uniandes.dpoo.taller7.interfaz2;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

public class PanelSuperior extends JPanel {
    public PanelSuperior() {
        // Configurar el panel y agregar componentes
        JLabel label = new JLabel("Tamaño del Tablero:");
        JComboBox<String> comboBox = new JComboBox<>(new String[] {"5x5", "6x6", "7x7"});
        JRadioButton radioButton = new JRadioButton("Difícil");

        add(label);
        add(comboBox);
        add(radioButton);
    }
}