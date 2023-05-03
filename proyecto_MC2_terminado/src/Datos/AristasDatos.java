package Datos;

import Clases.Arista;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jm543
 */
public class AristasDatos {

    private List<Arista> BDaristas;

    public AristasDatos() {
        BDaristas = new ArrayList<>();
    }

    public int buscar(char v1, char v2) {
        int n = -1;
        try {
            for (int i = 0; i < BDaristas.size(); i++) {
                if ((BDaristas.get(i).getV1() == v1 && BDaristas.get(i).getV2() == v2)
                        || (BDaristas.get(i).getV1() == v2 && BDaristas.get(i).getV2() == v1)) {
                    n = i;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Lista de vertices vacia");
        }
        return n;
    }

    public int buscar(char v) {
        int n = -1;
        try {
            for (int i = 0; i < BDaristas.size(); i++) {
                if (BDaristas.get(i).getV1() == v || BDaristas.get(i).getV2() == v) {
                    n = i;
                    break;
                }
            }
        } catch (Exception e) {
        }
        return n;
    }

    public boolean addLine(Arista linea) {
        if (buscar(linea.getV1(), linea.getV2()) == -1) {
            BDaristas.add(linea);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeLine(char v) {
        if (buscar(v) != -1) {
            BDaristas.remove(buscar(v));
            return removeLine(v);
        } else {
            return true;
        }
    }

    public boolean removeAllLines() {
        BDaristas.clear();
        return true;
    }

    public List<Arista> getCirculos() {
        return BDaristas;
    }
}
