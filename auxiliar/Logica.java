package auxiliar;
import actores.*;
import java.util.Scanner;

public class Logica {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador();
        Palabras palabra = new Palabras();
        Scanner console = new Scanner(System.in);
        Ronda ronda = new Ronda();
        
        System.out.println("Ingresa tu nombre: ");
        jugador1.setName(console.nextLine());
        System.out.println("Escoja una categoria: ");
        palabra.setSeleccion(console.nextLine());
        System.out.println(palabra.toString());
        System.out.println("Cuantas palabras desea para jugar?: ");
        ronda.setNumeroPalabras(Integer.parseInt(console.nextLine()));
        System.out.println("Jugador " + jugador1.getName() + " ha seleccionado la categoria " + 
                palabra.getSeleccion() + " y jugará " + 
                ronda.getNumeroPalabras() + " palabras");
        
        Juego juego = new Juego(palabra.getSeleccion(), palabra);
        System.out.println(juego);
        System.out.println("Palabra random = " + juego.getPalabraRandom());
    }
}
