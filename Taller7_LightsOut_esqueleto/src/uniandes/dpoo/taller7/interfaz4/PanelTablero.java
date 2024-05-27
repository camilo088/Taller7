package uniandes.dpoo.taller7.interfaz4;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelTablero extends JPanel implements MouseListener {
    private int tamañoTablero = 5; 
    private boolean[][] luces; 
    private int jugadas; 

    public PanelTablero() {
        
        luces = new boolean[tamañoTablero][tamañoTablero];
        addMouseListener(this);
        inicializarLuces();
    }

    private void inicializarLuces() {
        for (int i = 0; i < tamañoTablero; i++) {
            for (int j = 0; j < tamañoTablero; j++) {
                luces[i][j] = Math.random() > 0.5;
            }
        }
        jugadas = 0; 
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
                Color color = luces[i][j] ? Color.YELLOW : Color.DARK_GRAY;
                g2d.setPaint(new GradientPaint(0, 0, color, ancho, alto, Color.WHITE));
                g2d.fillRoundRect(i * ancho, j * alto, ancho, alto, 10, 10);
                g2d.setColor(Color.BLACK);
                g2d.drawRoundRect(i * ancho, j * alto, ancho, alto, 10, 10);
            }
        }
    }

    
    public void setTamañoTablero(int tamaño) {
        this.tamañoTablero = tamaño;
        luces = new boolean[tamaño][tamaño];
        inicializarLuces();
        repaint();
    }

    public void reiniciarTablero() {
        inicializarLuces();
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int click_x = e.getX();
        int click_y = e.getY();
        int ancho = getWidth() / tamañoTablero;
        int alto = getHeight() / tamañoTablero;
        int fila = click_y / alto;
        int columna = click_x / ancho;
        if (fila >= 0 && fila < tamañoTablero && columna >= 0 && columna < tamañoTablero) {
            // Cambiar el estado de la luz y las adyacentes
            toggleLight(fila, columna);
            if (fila > 0) toggleLight(fila - 1, columna);
            if (fila < tamañoTablero - 1) toggleLight(fila + 1, columna);
            if (columna > 0) toggleLight(fila, columna - 1);
            if (columna < tamañoTablero - 1) toggleLight(fila, columna + 1);
            jugadas++; // Incrementar el contador de jugadas
            repaint();
        }
    }

    private void toggleLight(int fila, int columna) {
        luces[fila][columna] = !luces[fila][columna];
    }

    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
}
