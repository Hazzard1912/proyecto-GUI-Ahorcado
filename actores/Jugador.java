package actores;

public class Jugador {
    private String name;
    
    public Jugador(){
        name = "None";
    }
    
    public Jugador(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Jugador{" + "name= " + name + '}';
    }
    
}
