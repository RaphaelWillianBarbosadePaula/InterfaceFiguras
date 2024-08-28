package interfacefiguras.beans;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raphael Willian
 */
public class Circulo implements Figura2D{
    private double raio;
    private Ponto2D centro;

    public Circulo(double raio, Ponto2D centro) {
        this.raio = raio;
        this.centro = new Ponto2D(centro.getX(), centro.getY());
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public Ponto2D getCentro() {
        return centro;
    }

    @Override
    public double area() {
        return Math.PI*(raio*raio);
    }

    @Override
    public double perimetro() {
        return 2*Math.PI*raio;
    }

    @Override
    public void moveX(double dX) {
        centro.moveX(dX);
    }

    @Override
    public void moveY(double dY) {
        centro.moveY(dY);
    }

    @Override
    public void moveXY(double dX, double dY) {
        centro.moveXY(dX, dY);
    }

    @Override
    public String toString() {
        return "interfacefiguras.beans.Circulo{" + "\n   raio = " + raio
                + ",\n   centro = " + centro 
                + ",\n   area = " + area()
                + ",\n   perimetro = " + perimetro() + "\n}";
    }
    
    
}
