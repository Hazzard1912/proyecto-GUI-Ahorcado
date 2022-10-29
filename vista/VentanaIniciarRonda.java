package vista;

import actores.Palabras;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;
import actores.*;
import java.awt.GridLayout;

class VentanaIniciarRonda extends JFrame implements ActionListener{
    
    JLabel lblSolicitarNombre;
    JTextField txtNombre;
    JLabel lblTematicas;
    String tematicas[] = {"Deportes", "Animales", "Frutas", "Profesiones", 
        "Colores"};
    JComboBox<String> comboTematicas;
    JLabel lblPalabras;
    JTextField txtPalabras;
    JButton boton;
    
    public VentanaIniciarRonda(){
        iniciarVentana();
    }
    
    private void iniciarVentana(){
        setSize(400,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Configurar Partida");
        
        Container contenedor = getContentPane();
        
        lblSolicitarNombre = new JLabel("Ingrese su nombre");
        txtNombre = new JTextField(10);
        lblTematicas = new JLabel("Seleccione una tematica");
        comboTematicas = new JComboBox<>(tematicas);
        lblPalabras = new JLabel("Cuantas palabras desea jugar");
        txtPalabras = new JTextField(10);
        boton = new JButton("INICIAR");
        boton.addActionListener(this);
        
        contenedor.setLayout(new GridLayout(10,10));
        contenedor.add(lblSolicitarNombre);
        contenedor.add(txtNombre);
        contenedor.add(lblTematicas);
        contenedor.add(comboTematicas);
        contenedor.add(lblPalabras);
        contenedor.add(txtPalabras);
        contenedor.add(boton);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == boton){
            String palabra = (String)comboTematicas.getSelectedItem();
            this.palabra.setSeleccion(palabra);
            juego = new Juego(palabra, this.palabra);
            jugador.setName(txtNombre.getText());
            ronda.setNumeroPalabras(Integer.parseInt(txtPalabras.getText()));
            System.out.println("Nombre jugador: " + jugador.getName() + "\n"
                    + "Categoria seleccionada: " + this.palabra.getSeleccion() + "\n"
                    + "Jugara una cantidad de: " + ronda.getNumeroPalabras() + "\n");
            setVisible(false);
        }
    }
    
    static Palabras palabra =  new Palabras();
    static Juego juego = new Juego();
    static Jugador jugador = new Jugador();
    static Ronda ronda = new Ronda();
}
