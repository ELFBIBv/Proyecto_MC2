package Datos;

import Clases.Vertice;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jm543
 */
public class VerticesDatos {
    
   private List<Vertice> BDvertices;
   
   public VerticesDatos() {
       BDvertices= new ArrayList<>();
   }
   
   public int buscar(char identificardor){
       int n = -1;
       try {
           for (int i = 0; i < BDvertices.size(); i++) {
               if (BDvertices.get(i).getIdentificador() == identificardor) {
                   n = i;
                   break;
               }
           }
       } catch (Exception e) {
           System.out.println("Lista de vertices está vacia");
       }
       return n;
   }
   
   public boolean addCircle(Vertice circulo){
       if (buscar(circulo.getIdentificador()) == -1) {
          BDvertices.add(circulo); 
          return true;
       } else{
           return false;
       }
   }
   
   public boolean removeCircle(char identificador){
       if(buscar(identificador) != -1){
           BDvertices.remove(buscar(identificador));
           return true;
       } else{
           return false;
       }
   }
   
   public boolean removeAllCircles(){
       BDvertices.clear();
       return true;
   }
   
   public List<Vertice> getBDvertices() {
       return BDvertices;
   }
}
