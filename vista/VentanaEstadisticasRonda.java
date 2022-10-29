package vista;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class VentanaEstadisticasRonda extends JFrame{
    int palabrasAdivinadas;
    float porcentajeAdivinadas;
    int palabrasErradas;
    float porcentajeErradas;
    
    JLabel lblPalabrasAdivinadas;
    JTextField txtPalabrasAdivinadas;
    JLabel lblPorcentajeAdivinadas;
    JTextField txtPorcentajeAdivinadas;
    JLabel lblPalabrasErradas;
    JTextField txtPalabrasErradas;
    JLabel lblPorcentajeErradas;
    JTextField txtPorcentajeErradas;
    
    
    public VentanaEstadisticasRonda(){
        iniciarVentana();
    }
    
    private void iniciarVentana(){
        setSize(500, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setTitle("Estadisticas Ronda");
        
        Container contenedor = getContentPane();
        contenedor.setLayout(new GridLayout(10, 10));
        
        lblPalabrasAdivinadas = new JLabel("Palabras adivinadas: ");
        txtPalabrasAdivinadas = new JTextField(5);
        lblPorcentajeAdivinadas = new JLabel("Porcentaje palabras adivinadas: ");
        txtPorcentajeAdivinadas = new JTextField(5);
        lblPalabrasErradas = new JLabel("Palabras erradas: ");
        txtPalabrasErradas = new JTextField(5);
        lblPorcentajeErradas = new JLabel("Porcentaje palabras erradas: ");
        txtPorcentajeErradas = new JTextField(5);
        
        contenedor.add(lblPalabrasAdivinadas);
        contenedor.add(txtPalabrasAdivinadas);
        contenedor.add(lblPorcentajeAdivinadas);
        contenedor.add(txtPorcentajeAdivinadas);
        contenedor.add(lblPalabrasErradas);
        contenedor.add(txtPalabrasErradas);
        contenedor.add(lblPorcentajeErradas);
        contenedor.add(txtPorcentajeErradas);
        
    }

}
