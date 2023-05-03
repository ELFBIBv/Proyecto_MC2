package Clases;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author jm543
 */
public class Vertice {
    
    //Atributos de la clase
    private char identificador;
    private String texto;
    private int x, y, radio;
    private Color color;

    //Constructor
    public Vertice(char identificador,int x, int y) {
        this.identificador = identificador;
        this.texto = String.valueOf(identificador);
        this.x = x;
        this.y = y;
        this.radio = 8;
        this.color = Color.WHITE;
    }
    
    //Getter and Setters
    public char getIdentificador() {
        return identificador;
    }

    public void setIdentificador(char identificador) {
        this.identificador = identificador;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x - radio, y - radio, radio * 2, radio * 2);
    }
}
