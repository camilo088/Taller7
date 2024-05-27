package uniandes.dpoo.taller7.interfaz4;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private PanelTablero panelTablero;
    private PanelSuperior panelSuperior;
    private List<String> top10;
    private String jugadorActual;

    public VentanaPrincipal() {
        
        setTitle("Lights Out");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        panelSuperior = new PanelSuperior();
        add(panelSuperior, BorderLayout.NORTH);

        PanelDerecho panelDerecho = new PanelDerecho(this);
        add(panelDerecho, BorderLayout.EAST);

        PanelInferior panelInferior = new PanelInferior();
        add(panelInferior, BorderLayout.SOUTH);

        panelTablero = new PanelTablero();
        add(panelTablero, BorderLayout.CENTER);

        top10 = new ArrayList<>();
        jugadorActual = "Jugador 1";
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "Nuevo":
                int tamaño = panelSuperior.getTamañoSeleccionado();
                panelTablero.setTamañoTablero(tamaño);
                break;
            case "Reiniciar":
                
                panelTablero.reiniciarTablero();
                break;
            case "Top-10":
                
                mostrarTop10();
                break;
            case "Cambiar Jugador":
                
                cambiarJugador();
                break;
        }
    }

    private void mostrarTop10() {
        // Crear y mostrar la ventana del top-10
        VentanaTop10 dialogoTop10 = new VentanaTop10(this, top10);
        dialogoTop10.setVisible(true);
    }

    private void cambiarJugador() {
        // Mostrar un diálogo para cambiar el nombre del jugador
        String nuevoJugador = JOptionPane.showInputDialog(this, "Ingrese su nombre:", jugadorActual);
        if (nuevoJugador != null && !nuevoJugador.trim().isEmpty()) {
            jugadorActual = nuevoJugador;
        }
    }

    public static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }
}


