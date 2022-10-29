package actores;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Juego {
    String palabraAdivinar;
    int intentosEjecutados;
    int intentosRestantes;
    List<String> letrasUsadas = new ArrayList<>();
    String palabraRandom;
    Palabras palabra;
    
    public Juego(){
        palabraAdivinar = "";
        intentosEjecutados = 0;
        intentosRestantes = 0;
        palabraRandom = "";
    }
    
    public Juego(String categoria, Palabras palabra){
        palabraAdivinar = categoria;
        intentosEjecutados = 0;
        intentosRestantes = 8;
        this.palabra = palabra;
        palabraRandom = randomSelect();
    }
    
    private String randomSelect(){
        String palabraRandom = "";
        int auxiliar = 0;
        Random rand = new Random();
        int limiteSuperior = 0;
        
        switch (palabraAdivinar) {
            case "Deportes" -> {
                limiteSuperior = palabra.deportes.length;
                auxiliar = rand.nextInt(limiteSuperior);
                palabraRandom = palabra.deportes[auxiliar];
            }
            case "Animales" -> {
                limiteSuperior = palabra.animales.length;
                auxiliar = rand.nextInt(limiteSuperior);
                palabraRandom = palabra.animales[auxiliar];
            }
            case "Frutas" -> {
                limiteSuperior = palabra.frutas.length;
                auxiliar = rand.nextInt(limiteSuperior);
                palabraRandom = palabra.frutas[auxiliar];
            }
            case "Profesiones" -> {
                limiteSuperior = palabra.profesiones.length;
                auxiliar = rand.nextInt(limiteSuperior);
                palabraRandom = palabra.profesiones[auxiliar];
            }
            case "Colores" -> {
                limiteSuperior = palabra.colores.length;
                auxiliar = rand.nextInt(limiteSuperior);
                palabraRandom = palabra.colores[auxiliar];
            }
            default -> {
            }
        }
        return palabraRandom;
    }

    public String getPalabraAdivinar() {
        return palabraAdivinar;
    }

    public void setPalabraAdivinar(String palabraAdivinar) {
        this.palabraAdivinar = palabraAdivinar;
    }

    public int getIntentosEjecutados() {
        return intentosEjecutados;
    }

    public void setIntentosEjecutados(int intentosEjecutados) {
        this.intentosEjecutados = intentosEjecutados;
    }
    
    public int getIntentosRestantes() {
        return intentosRestantes;
    }

    public void setIntentosRestantes(int intentosRestantes) {
        this.intentosRestantes = intentosRestantes;
    }
    
    public String getPalabraRandom(){
        return palabraRandom;
    }

    public String getLetrasUsadas() {
        String letras = "";
        for(String letra : letrasUsadas){
            letras += letra;
        }
        return letras;
    }

    public boolean addLetrasUsadas(String letra) {
        int contador = 0;
        for(String letras : letrasUsadas){
                if(letras.equals(letra)){
                    System.out.println("letras= " + letras + " y letra= " + letra);
                    contador++;
                    if (contador > 0){
                        return false;
                    }
                }
        }
        if(contador == 0){
            letrasUsadas.add(letra);
        }
        return true;
    }
    @Override
    public String toString() {
        return "Juego{" + "palabraAdivinar=" + palabraAdivinar + 
                ", intentosEjecutados=" + intentosEjecutados + 
                ", intentosRestantes=" + intentosRestantes + '}';
    }
    
}
