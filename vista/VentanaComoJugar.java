package vista;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

class VentanaComoJugar extends JFrame{
    String comoJugar = "El ahorcado (también llamado colgado) es un juego de adivinanzas\n"
            + " para dos o más jugadores. Un jugador piensa en una palabra, frase u oración \n"
            + "y el otro trata de adivinarla según lo que sugiere por letras o dentro de un \n"
            + "cierto número de oportunidades.";
    JLabel lblComoJugar;
    JTextArea txtComoJugar;
    
    public VentanaComoJugar(){
        iniciarVentana();
    }
    
    private void iniciarVentana(){
        setSize(500, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setTitle("Como jugar");
        
        Container contenedor = getContentPane();
        contenedor.setLayout(new GridLayout(10, 10));
        
        lblComoJugar = new JLabel("Como jugar: ");
        txtComoJugar = new JTextArea(comoJugar);
        
        contenedor.add(lblComoJugar);
        contenedor.add(txtComoJugar);
    }

}
