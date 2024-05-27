package uniandes.dpoo.taller7.interfaz3;

import javax.swing.JFrame;

import uniandes.dpoo.taller7.interfaz2.PanelDerecho;
import uniandes.dpoo.taller7.interfaz2.PanelInferior;
import uniandes.dpoo.taller7.interfaz2.PanelSuperior;

import java.awt.BorderLayout;

public class VentanaPrincipal extends JFrame {
    private PanelTablero panelTablero;

    public VentanaPrincipal() {
        setTitle("Lights Out");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        PanelSuperior panelSuperior = new PanelSuperior();
        add(panelSuperior, BorderLayout.NORTH);

        PanelDerecho panelDerecho = new PanelDerecho();
        add(panelDerecho, BorderLayout.EAST);

        PanelInferior panelInferior = new PanelInferior();
        add(panelInferior, BorderLayout.SOUTH);

        panelTablero = new PanelTablero();
        add(panelTablero, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        // Crear una instancia de VentanaPrincipal
        VentanaPrincipal ventana = new VentanaPrincipal();

        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}

