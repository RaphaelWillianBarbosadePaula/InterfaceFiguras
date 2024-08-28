package interfacefiguras.beans;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raphael Willian
 */
public class Retangulo implements Figura2D{
    private double base;
    private double altura;
    private Ponto2D p0;

    public Retangulo(double base, double altura, Ponto2D p0) {
        this.base = base;
        this.altura = altura;
        this.p0 = new Ponto2D (p0.getX(), p0.getY());
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return 2*(base + altura);
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

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public Ponto2D getP0() {
        return p0;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public Ponto2D encontrarP1() {
        return new Ponto2D(p0.getX() + base, p0.getY());
    }
    
    public Ponto2D encontrarP2() {
        return new Ponto2D(p0.getX(), p0.getY() + altura);
    }
    
    public Ponto2D encontrarP3() {
        return new Ponto2D(p0.getX() + base, p0.getY() + altura);
    }
    
    @Override
    public String toString() {
        return "interfacefiguras.beans.Retangulo{" + "\n   base = " + base
                + ",\n   altura = " + altura
                + ",\n   area = " + area()
                + ",\n   perimetro = " + perimetro()
                + ",\n   p0 = " + p0 
                + ",\n   p1 = " + this.encontrarP1()
                + ",\n   p2 = " + encontrarP2()
                + ",\n   p3 = " + encontrarP2() + "\n}";
    }
    
}
