package uniandes.dpoo.taller7.interfaz4;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

public class PanelDerecho extends JPanel {
    private JButton nuevo;
    private JButton reiniciar;
    private JButton top10;
    private JButton cambiarJugador;

    public PanelDerecho(ActionListener listener) {
        
        setLayout(new GridLayout(4, 1, 5, 5));

        nuevo = new JButton("Nuevo");
        nuevo.setBackground(Color.GREEN);
        nuevo.setFont(new Font("Arial", Font.BOLD, 14));
        nuevo.addActionListener(listener);

        reiniciar = new JButton("Reiniciar");
        reiniciar.setBackground(Color.YELLOW);
        reiniciar.setFont(new Font("Arial", Font.BOLD, 14));
        reiniciar.addActionListener(listener);

        top10 = new JButton("Top-10");
        top10.setBackground(Color.ORANGE);
        top10.setFont(new Font("Arial", Font.BOLD, 14));
        top10.addActionListener(listener);

        cambiarJugador = new JButton("Cambiar Jugador");
        cambiarJugador.setBackground(Color.RED);
        cambiarJugador.setFont(new Font("Arial", Font.BOLD, 14));
        cambiarJugador.addActionListener(listener);

        add(nuevo);
        add(reiniciar);
        add(top10);
        add(cambiarJugador);

        setBackground(Color.LIGHT_GRAY);
    }

    public JButton getNuevoButton() {
        return nuevo;
    }

    public JButton getReiniciarButton() {
        return reiniciar;
    }

    public JButton getTop10Button() {
        return top10;
    }

    public JButton getCambiarJugadorButton() {
        return cambiarJugador;
    }
}

