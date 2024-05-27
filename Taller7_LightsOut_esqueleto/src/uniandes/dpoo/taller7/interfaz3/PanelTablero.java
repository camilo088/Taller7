package uniandes.dpoo.taller7.interfaz3;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

public class PanelTablero extends JPanel {
    private int tamañoTablero = 5;

    public PanelTablero() {
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int ancho = getWidth() / tamañoTablero;
        int alto = getHeight() / tamañoTablero;

        // Dibujar el tablero de juego
        for (int i = 0; i < tamañoTablero; i++) {
            for (int j = 0; j < tamañoTablero; j++) {
                // Dibujar una celda
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillRect(i * ancho, j * alto, ancho, alto);
                g2d.setColor(Color.BLACK);
                g2d.drawRect(i * ancho, j * alto, ancho, alto);
            }
        }
    }

    public void setTamañoTablero(int tamaño) {
        this.tamañoTablero = tamaño;
        repaint();
    }
}
