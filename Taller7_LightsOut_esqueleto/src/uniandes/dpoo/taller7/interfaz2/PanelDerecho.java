package uniandes.dpoo.taller7.interfaz2;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;

public class PanelDerecho extends JPanel {
    public PanelDerecho() {
        // Configurar el layout del panel
        setLayout(new GridLayout(4, 1, 5, 5));

        // Crear y agregar botones
        JButton nuevo = new JButton("Nuevo");
        JButton reiniciar = new JButton("Reiniciar");
        JButton top10 = new JButton("Top-10");
        JButton cambiarJugador = new JButton("Cambiar Jugador");

        add(nuevo);
        add(reiniciar);
        add(top10);
        add(cambiarJugador);
    }
}