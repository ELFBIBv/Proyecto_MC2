package Datos;

import Clases.CaminosCortos;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jm543
 */
public class CaminosCortosDatos {
    
    private List<CaminosCortos> caminos;
    
    public CaminosCortosDatos() {
        caminos = new ArrayList<>();
    }
    
    public boolean addCamino(CaminosCortos camino){
        caminos.add(camino);
        return true;
    } 
    
    public void removeall() {
        caminos.clear();
    }
    
    public List<CaminosCortos> getCaminos() {
        return caminos;
    }
}
