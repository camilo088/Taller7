package uniandes.dpoo.taller7.interfaz2;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class PanelInferior extends JPanel {
    public PanelInferior() {
        // Configurar el layout del panel
        setLayout(new GridLayout(1, 2, 5, 5));

        // Crear y agregar componentes
        JLabel label = new JLabel("Jugador:");
        JTextField textField = new JTextField();

        add(label);
        add(textField);
    }
}
