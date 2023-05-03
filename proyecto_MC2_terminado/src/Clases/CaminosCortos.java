package Clases;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jm543
 */
public class CaminosCortos {
    
    //Atributos
    private int camino;
    private int pasos;
    private List<String> Lista;

    //Cosntructor
    public CaminosCortos(int camino, int pasos, List<String> Lista) {
        this.camino = camino;
        this.pasos = pasos;
        this.Lista = new ArrayList<>();
    }

    public int getCamino() {
        return camino;
    }

    public void setCamino(int camino) {
        this.camino = camino;
    }

    public int getPasos() {
        return pasos;
    }

    public void setPasos(int pasos) {
        this.pasos = pasos;
    }

    public List<String> getLista() {
        return Lista;
    }

    public void addLista(String dato) {
        this.Lista.add(dato);
    }
    
    public void removeLista(int dato) {
        this.Lista.remove(dato);
    }
}
