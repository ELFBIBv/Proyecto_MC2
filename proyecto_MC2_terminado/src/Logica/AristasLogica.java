package Logica;

import Clases.Arista;
import Datos.AristasDatos;
import java.util.List;

/**
 * @author jm543
 */
public class AristasLogica {
    
    private static AristasDatos lineasDatos = new AristasDatos();
    
    public static boolean addArista(Arista linea) {
        return lineasDatos.addLine(linea);
    }

    public static boolean removerArista(char v) {
        return lineasDatos.removeLine(v);
    }
    
    public static boolean removeAllAristas() {
        return lineasDatos.removeAllLines();
    }
    
    public static List<Arista> getAristas() {
       return lineasDatos.getCirculos();
   }
}
