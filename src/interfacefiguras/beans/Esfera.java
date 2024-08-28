package interfacefiguras.beans;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Esfera implements Figura3D{
    private Ponto3D centro;
    private double raio;

    public Esfera(Ponto3D centro, double raio) {
        this.centro = new Ponto3D(centro.getX(), centro.getY(), centro.getZ());
        this.raio = raio;
    }

    @Override
    public double volume() {
        return (4/3)*Math.PI*Math.pow(raio, 3);
    }

    @Override
    public double superficie() {
        return 4*Math.PI*raio*raio;
    }

    @Override
    public void moveZ(double dZ) {
        centro.moveZ(dZ);
    }

    @Override
    public void moveXZ(double dX, double dZ) {
        centro.moveXZ(dX, dZ);
    }

    @Override
    public void moveYZ(double dY, double dZ) {
        centro.moveYZ(dY, dZ);
    }

    @Override
    public void moveXYZ(double dX, double dY, double dZ) {
        centro.moveXYZ(dX, dY, dZ);
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

    public Ponto3D getCentro() {
        return centro;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "interfacefiguras.beans.Esfera{" + "centro=" + centro
                + ", raio=" + raio 
                +  ", superficie=" + this.superficie() 
                + "volume=" + volume() + '}';
    }
    
    
}
