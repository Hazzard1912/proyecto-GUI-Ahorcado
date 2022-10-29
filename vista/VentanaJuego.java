package vista;
import javax.swing.*;
import java.awt.*;
import actores.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaJuego extends JFrame implements ActionListener{
    
    VentanaIniciarRonda ventanaIniciarRonda;
    VentanaEstadisticasRonda ventanaEstadisticasRonda;
    VentanaEstadisticaJuego ventanaEstadisticasJuego;
    VentanaUtilidad ventanaParaQueSirve;
    VentanaComoJugar ventanaComoJugar;
    
    JLabel lblNombre;
    JTextField txtNombre;
    
    JLabel lblTematicaActual;
    JTextField txtTematica;
    
    JLabel lblIntentosEjecutados;
    JTextField txtIntentosEjectuados;
    
    JLabel lblIntentosRestantes;
    JTextField txtIntentosRestantes;
    
    JLabel lblLetrasUtilizadas;
    JTextField txtLetrasUtilizadas;
    
    JLabel lblPalabra;
    JTextField txtPalabra;
    
    JButton comoJugar;
    JButton paraQueSirve;
    JButton jugar;
    
    public VentanaJuego (){
        iniciarVentana();
    }
    
    private void iniciarVentana(){
        setSize(1080, 720);
        setVisible(true);
        setBackground(Color.BLACK);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("JUEGO AHORCADO");
        
        ventanaIniciarRonda = new VentanaIniciarRonda();
        Container contenedor = getContentPane();
        contenedor.setLayout(new GridLayout(10,10));
        
        lblNombre = new JLabel("Nombre del jugador: ");
        txtNombre = new JTextField(VentanaIniciarRonda.jugador.getName(),5);
        
        lblTematicaActual = new JLabel("Tematica actual: ");
        txtTematica = new JTextField(VentanaIniciarRonda.palabra.getSeleccion(), 5);
        
        lblIntentosEjecutados =  new JLabel("Intentos ejecutados: ");
        txtIntentosEjectuados = new JTextField(Integer.toString(VentanaIniciarRonda.juego.getIntentosEjecutados()), 5);
        
        lblIntentosRestantes = new JLabel("Intentos restantes: ");
        txtIntentosRestantes = new JTextField(Integer.toString(VentanaIniciarRonda.juego.getIntentosRestantes()), 5);
        
        lblLetrasUtilizadas =  new JLabel("Letras utilizadas: ");
        txtLetrasUtilizadas = new JTextField(VentanaIniciarRonda.juego.getLetrasUsadas(), 5);
        
        lblPalabra = new JLabel("Palabra a adivinar: ");
        txtPalabra = new JTextField(10);
        
        comoJugar = new JButton("Como jugar?");
        comoJugar.addActionListener(this);
        
        paraQueSirve = new JButton("Para que sirve?");
        paraQueSirve.addActionListener(this);
        
        jugar = new JButton("Jugar");
        jugar.addActionListener(this);
        
        contenedor.add(lblNombre);
        contenedor.add(txtNombre);
        contenedor.add(lblTematicaActual);
        contenedor.add(txtTematica);
        contenedor.add(lblIntentosEjecutados);
        contenedor.add(txtIntentosEjectuados);
        contenedor.add(lblIntentosRestantes);
        contenedor.add(txtIntentosRestantes);
        contenedor.add(lblLetrasUtilizadas);
        contenedor.add(txtLetrasUtilizadas);
        contenedor.add(lblPalabra);
        contenedor.add(txtPalabra);
        contenedor.add(comoJugar);
        contenedor.add(paraQueSirve);
        contenedor.add(jugar);
        
        while(contenedor.isEnabled()){
            txtNombre.setText(VentanaIniciarRonda.jugador.getName());
            txtTematica.setText(VentanaIniciarRonda.palabra.getSeleccion());
            txtIntentosEjectuados.setText(Integer.toString(VentanaIniciarRonda.juego.getIntentosEjecutados()));
            txtIntentosRestantes.setText(Integer.toString(VentanaIniciarRonda.juego.getIntentosRestantes()));
            txtLetrasUtilizadas.setText(VentanaIniciarRonda.juego.getLetrasUsadas());
        }
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comoJugar){
            ventanaComoJugar = new VentanaComoJugar();
        }
        else if(e.getSource() == paraQueSirve){
            ventanaParaQueSirve = new VentanaUtilidad();
        }
        else if(e.getSource() ==  jugar){
            String espacios = "";
            String palabraAdivinar = VentanaIniciarRonda.juego.getPalabraRandom();
            for(int i = 0; i < palabraAdivinar.length();){
                espacios += "_";
            }
            txtPalabra.setText(espacios);
            
       }
    }
}
