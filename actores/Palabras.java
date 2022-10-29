package actores;

public class Palabras {
    
    String seleccion = "";
    
    String categorias[] = {"Deportes", "Animales", "Frutas"
            + "Profesiones", "Colores"};
    
    String deportes[] = {"atletismo", "baloncesto", "balonmano", "beisbol", 
            "boxeo", "ciclismo", "esgrima", "esqui", "futbol", "gimnasia",
            "hockey", "karate", "natacion", "patinaje", "skateboarding",
            "snowboard", "taekwondo", "voleibol", "waterpolo"};
    
    String animales[] = {"calamar", "delfin", "sardina", "caracol", "salmon",
        "pinguino", "tortuga", "langosta", "camello", "tarantula", "gallina",
        "bufalo", "rinoceronte", "leopardo", "serpiente", "escorpion",
        "anaconda", "armadillo", "hormiga", "lagartija", "conejo"};
    
    String frutas[] = {"pomelo", "aguacate", "arandano", "manzana",
        "granadilla", "mango", "limones", "aceituna", "naranja", "platano",
        "banano", "guayaba", "papaya", "cereza"};
    
    String profesiones[] = {"abogado", "historiador", "medico", "cirujano",
        "periodista", "botanico", "enfermero", "economista", "antropologo", 
        "electricista", "psicoanalista", "contador", "radiologo", "matematico",
        "geografo", "farmacologo", "paramedico", "linguista"};
    
    String colores[] = {"rojo", "carmesi", "escarlata", "verde", "esmeralda",
        "azul", "cobalto", "zafiro", "indigo", "magenta", "lavanda", "morado",
        "cian", "turquesa", "amarillo", "topacio", "marron", "violeta", "purpura",
        "naranja", "beige", "albaricoque", "blanco", "plateado", "negro"};
    
    public Palabras(){
    }

    public String getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(String seleccion) {
        this.seleccion = seleccion;
    }


    @Override
    public String toString() {
        String palabras = "";
        for(String palabra : categorias){
            palabras += palabra + " ";
        }
        return palabras;
    }
}
