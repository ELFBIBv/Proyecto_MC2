package Logica;

import Clases.Vertice;
import Datos.VerticesDatos;
import java.util.List;

/**
 * @author jm543
 */
public class VerticesLogica {

    private static VerticesDatos verticesDatos = new VerticesDatos();

    public static boolean addVertice(Vertice circulo) {
        return verticesDatos.addCircle(circulo);
    }

    public static boolean removeVertice(char identificador) {
        return verticesDatos.removeCircle(identificador);
    }

    public static boolean removeAllVertice() {
        return verticesDatos.removeAllCircles();
    }
    
    public static List<Vertice> getVertice() {
       return verticesDatos.getBDvertices();
   }
}
