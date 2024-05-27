package uniandes.dpoo.taller7.interfaz4;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;

public class PanelInferior extends JPanel {
    public PanelInferior() {
        // Configurar el layout del panel
        setLayout(new GridLayout(1, 2, 5, 5));

        // Crear y personalizar componentes
        JLabel label = new JLabel("Jugador:");
        label.setFont(new Font("Arial", Font.BOLD, 14));
        JTextField textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 14));

        setBackground(Color.CYAN);
        add(label);
        add(textField);
    }
}
