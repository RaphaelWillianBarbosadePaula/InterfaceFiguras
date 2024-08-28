package interfacefiguras.beans;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raphael Willian
 */
public class Quadrado implements Figura2D{
    private double lado;
    private Ponto2D p0;
    
    public Quadrado(double lado, Ponto2D p0){
        this.lado = lado;
        this.p0 = new Ponto2D (p0.getX(), p0.getY());
    }
    
    @Override
    public double area() {
       return lado + lado; 
    }
    
    @Override
    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public void moveX(double dX) {
        p0.moveX(dX);
    }

    @Override
    public void moveY(double dY) {
        p0.moveY(dY);
    }

    @Override
    public void moveXY(double dX, double dY) {
        p0.moveXY(dX, dY);
    }

    public double getLado() {
        return lado;
    }

    public Ponto2D getP0() {
        return p0;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public Ponto2D encontrarP1() {
        return new Ponto2D(p0.getX() + lado, p0.getY());
    }
    
    public Ponto2D encontrarP2() {
        return new Ponto2D(p0.getX(), p0.getY() + lado);
    }
    
    public Ponto2D encontrarP3() {
        return new Ponto2D(p0.getX() + lado, p0.getY() + lado);
    }

    @Override
    public String toString() {
        return "interfacefiguras.beans.Quadrado{" + "\n   lado= " + lado
                + ",\n   area = " + area()
                + ",\n   perimetro = " + perimetro()
                + ",\n   p0 = " + p0 
                + ",\n   p1 = " + this.encontrarP1()
                + ",\n   p2 = " + encontrarP2()
                + ",\n   p3 = " + encontrarP2() + "\n}";
    }
    
}
