package vista;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class VentanaEstadisticaJuego extends JFrame {

    int rondasRealizadas;
    int rondaMayorPorcentaje;
    int rondaMenorPorcentaje;

    JLabel lblRondasRealizadas;
    JTextField txtRondasRealizadas;
    JLabel lblRondaMayorPorcentaje;
    JTextField txtRondaMayorPorcentaje;
    JLabel lblRondaMenorPorcentaje;
    JTextField txtRondaMenorPorcentaje;

    public VentanaEstadisticaJuego() {
        iniciarVentana();
    }

    private void iniciarVentana() {
        setSize(500, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setTitle("Estadisticas Ronda");

        Container contenedor = getContentPane();
        contenedor.setLayout(new GridLayout(10, 10));

        lblRondasRealizadas = new JLabel("Rondas realizadas: ");
        txtRondasRealizadas = new JTextField(5);
        lblRondaMayorPorcentaje = new JLabel("Ronda con mayor porcentaje de aciertos: ");
        txtRondaMayorPorcentaje = new JTextField(5);
        lblRondaMenorPorcentaje = new JLabel("Ronda con menor porcentaje de aciertos: ");
        txtRondaMenorPorcentaje = new JTextField(5);

        contenedor.add(lblRondasRealizadas);
        contenedor.add(txtRondasRealizadas);
        contenedor.add(lblRondaMayorPorcentaje);
        contenedor.add(txtRondaMayorPorcentaje);
        contenedor.add(lblRondaMenorPorcentaje);
        contenedor.add(txtRondaMenorPorcentaje);

    }
}
