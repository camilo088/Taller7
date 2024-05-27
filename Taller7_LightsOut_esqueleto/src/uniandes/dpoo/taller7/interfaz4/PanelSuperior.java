package uniandes.dpoo.taller7.interfaz4;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Font;

public class PanelSuperior extends JPanel {
    private JComboBox<String> comboBox;

    public PanelSuperior() {
        JLabel label = new JLabel("Tamaño del Tablero:");
        label.setFont(new Font("Arial", Font.BOLD, 14));
        comboBox = new JComboBox<>(new String[] {"5", "6", "7"});
        comboBox.setBackground(Color.WHITE);
        comboBox.setFont(new Font("Arial", Font.PLAIN, 14));
        JRadioButton radioButton = new JRadioButton("Difícil");
        radioButton.setFont(new Font("Arial", Font.PLAIN, 14));
        radioButton.setBackground(Color.LIGHT_GRAY);

        setBackground(Color.CYAN);
        add(label);
        add(comboBox);
        add(radioButton);
    }

    public int getTamañoSeleccionado() {
        return Integer.parseInt((String) comboBox.getSelectedItem());
    }
}
