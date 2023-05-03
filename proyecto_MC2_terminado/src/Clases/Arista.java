package Clases;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

/**
 * @author jm543
 */
public class Arista {
    
    //Atributos
    private int identificador;
    private char v1;
    private char v2;
    private String texto;
    private Color color;
    private int x1, y1, x2, y2;
    
    //Constructor
    public Arista(int identificador, char v1, char v2, int x1, int y1, int x2, int y2) {
        this.identificador = identificador;
        this.v1 = v1;
        this.v2 = v2;
        this.texto = String.valueOf(v1);
        this.texto += " - "+String.valueOf(v2);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = Color.BLACK;
    }

    //Getter and Setters
    public int getIdentificador() {
        return identificador;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public char getV1() {
        return v1;
    }

    public void setV1(char v1) {
        this.v1 = v1;
    }

    public char getV2() {
        return v2;
    }

    public void setV2(char v2) {
        this.v2 = v2;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    
    public void draw(Graphics g) {
        Graphics2D linea = (Graphics2D) g;
        Stroke stroke = new BasicStroke(2);
        linea.setStroke(stroke);
        linea.setColor(getColor());
        linea.drawLine(x1, y1, x2, y2);
        
    }
}
