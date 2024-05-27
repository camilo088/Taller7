package uniandes.dpoo.taller7.interfaz2;

import javax.swing.JFrame;
import java.awt.BorderLayout;

public class VentanaPrincipal extends JFrame {

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
    }

    public static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }
}

