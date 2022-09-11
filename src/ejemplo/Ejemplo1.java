
package ejemplo;

import static ejemplo.Ejemplo1.convertirenenter;
import static java.lang.Integer.parseInt;

public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena="1";
        int numero= Ejemplo1.convertirenenter(cadena);
    }
    
    static int convertirenenter(String s){
        return Integer.parseInt(s);
    }
    
}
