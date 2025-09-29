package marejadas;
import java.util.*;

public class Main {
    public static void main(String[] args){
        LectorArchivo lector = new LectorArchivo();
        List<Dato> datos = lector.leer("C:\\Users\\Duoc\\Downloads\\NodoIquique.txt");
        
        for(Dato d : datos){
            d.mostrar();
        }
    }
}
