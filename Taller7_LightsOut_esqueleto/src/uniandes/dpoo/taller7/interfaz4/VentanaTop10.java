package uniandes.dpoo.taller7.interfaz4;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class VentanaTop10 extends JDialog {
    public VentanaTop10(JFrame parent, List<String> top10) {
        super(parent, "Top-10 Puntajes", true);
        setLayout(new BorderLayout());
        setSize(300, 400);
        setLocationRelativeTo(parent);

        JList<String> listaTop10 = new JList<>(top10.toArray(new String[0]));
        listaTop10.setFont(new Font("Arial", Font.BOLD, 16));
        JScrollPane scrollPane = new JScrollPane(listaTop10);
        add(scrollPane, BorderLayout.CENTER);

        JButton cerrar = new JButton("Cerrar");
        cerrar.addActionListener(e -> setVisible(false));
        add(cerrar, BorderLayout.SOUTH);
    }
}