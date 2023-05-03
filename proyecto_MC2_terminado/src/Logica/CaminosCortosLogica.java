package Logica;

import Clases.CaminosCortos;
import Datos.CaminosCortosDatos;
import java.util.List;

/**
 * @author jm543
 */
public class CaminosCortosLogica {
    
    private static CaminosCortosDatos BDcaminoscortos = new CaminosCortosDatos();
    
    public static boolean addCamino(CaminosCortos camino){
        return BDcaminoscortos.addCamino(camino);
    } 
    
    public static void removeall() {
        BDcaminoscortos.removeall();
    }
    
    public static List<CaminosCortos> getCaminos() {
        return BDcaminoscortos.getCaminos();
    }
}
