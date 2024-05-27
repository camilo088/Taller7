package uniandes.dpoo.taller7.interfaz3;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

public class PanelTablero extends JPanel {
    private int tama�oTablero = 5;

    public PanelTablero() {
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int ancho = getWidth() / tama�oTablero;
        int alto = getHeight() / tama�oTablero;

        // Dibujar el tablero de juego
        for (int i = 0; i < tama�oTablero; i++) {
            for (int j = 0; j < tama�oTablero; j++) {
                // Dibujar una celda
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillRect(i * ancho, j * alto, ancho, alto);
                g2d.setColor(Color.BLACK);
                g2d.drawRect(i * ancho, j * alto, ancho, alto);
            }
        }
    }

    public void setTama�oTablero(int tama�o) {
        this.tama�oTablero = tama�o;
        repaint();
    }
}
