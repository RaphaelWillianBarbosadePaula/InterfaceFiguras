/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import interfacefiguras.beans.Esfera;
import interfacefiguras.beans.Ponto3D;
import interfacefiguras.beans.SegmentoReta3D;

/**
 *
 * @author Raphael Willian
 */
public class InterfaceFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**interfacefiguras.beans.Ponto2D ponto01 = new interfacefiguras.beans.Ponto2D(2, 3);
        interfacefiguras.beans.Ponto2D ponto02 = new interfacefiguras.beans.Ponto2D(5, 7);

        ponto01.moveX(2);
        
        interfacefiguras.beans.Objeto2D segReta = new interfacefiguras.beans.SegmentoReta2D((interfacefiguras.beans.Ponto2D)ponto01, (interfacefiguras.beans.Ponto2D)ponto02);
        interfacefiguras.beans.Figura2D quadrado = new interfacefiguras.beans.Quadrado (4, (interfacefiguras.beans.Ponto2D)ponto01);
        interfacefiguras.beans.Figura2D retangulo = new interfacefiguras.beans.Retangulo (2, 4, ponto01);
        interfacefiguras.beans.Circulo circulo01 = new interfacefiguras.beans.Circulo (3, (interfacefiguras.beans.Ponto2D)ponto01);
        
        System.out.println(ponto01);  
        System.out.println();  
        System.out.println(segReta); 
        System.out.println();  
        System.out.println(quadrado);
        System.out.println();  
        System.out.println(retangulo);
        System.out.println();  
        System.out.println(circulo01);
        */
        Ponto3D p0 = new Ponto3D(2, 3, 5);        
        Ponto3D p1 = new Ponto3D(7, 12, 9);
        SegmentoReta3D sr = new SegmentoReta3D(p0, p1);
        Esfera esf = new Esfera(p1, 5);
        
        esf.moveXYZ(2, 3, 1);
        
        System.out.println("centro: " + esf.getCentro());        
        System.out.println("raio: " + esf.getRaio());
        System.out.println("volume: " + esf.volume());
        System.out.println("superficie: " + esf.superficie());
        System.out.println("ponto p1: " + p1);

    }
    
}
