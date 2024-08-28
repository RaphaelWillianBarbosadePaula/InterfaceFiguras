package interfacefiguras.beans;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raphael Willian
 */
public interface Objeto3D extends Objeto2D{
    public void moveZ(double dZ);
    public void moveXZ(double dX, double dZ);    
    public void moveYZ(double dY, double dZ);    
    public void moveXYZ(double dX, double dY, double dZ);


}
