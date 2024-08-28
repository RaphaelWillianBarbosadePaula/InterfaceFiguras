package interfacefiguras.beans;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raphael Willian
 */
public class Ponto2D implements Objeto2D{
    private double x;
    private double y;

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public void moveX(double dX) {
        x += dX; //x = x + dX
    }

    @Override
    public void moveY(double dY) {
        y += dY;
    }

    @Override
    public void moveXY(double dX, double dY) {
        x += dX;
        y += dY;
    }

    @Override
    public String toString() {
        return "interfacefiguras.beans.Ponto2D{" + x + "," + y + '}';
    }
    
}
