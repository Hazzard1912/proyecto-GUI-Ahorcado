package vista;

import javax.swing.*;
import java.awt.*;
import actores.*;

class VentanaUtilidad extends JFrame{
    String utilidad = """
                      Estimula la inteligencia.
                      Aumenta la concentraci\u00f3n y atenci\u00f3n.
                      Ense\u00f1an a manejar y practicar las letras del alfabeto a los ni\u00f1os.
                      Ense\u00f1an a escribir a los ni\u00f1os.
                      Ayuda en la pronunciaci\u00f3n de los ni\u00f1os.
                      Aumenta el vocabulario de los ni\u00f1os. Les ayuda a aprender palabras nuevas.""";
    
    JTextArea lblParaQueSirve;
    JLabel lblTitulo;
    
    
    public VentanaUtilidad(){
        iniciarVentana();
    }
    
    private void iniciarVentana(){
        setSize(500, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setTitle("Para que sirve");
        
        Container contenedor = getContentPane();
        contenedor.setLayout(new GridLayout(10, 10));
        
        
        lblParaQueSirve = new JTextArea(utilidad);
        lblTitulo = new JLabel("BENEFICIOS DE JUGAR AHORCADO");
        
        contenedor.add(lblTitulo);
        contenedor.add(lblParaQueSirve);
    }

}
