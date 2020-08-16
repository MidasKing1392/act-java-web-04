/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai14;

/**
 *
 * @author King Midas
 */
public class Bai14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--- Tam giac thuong ---");
        Triangle T = new Triangle();
        T.inputTriangle();
        T.Perimeter();
        T.Acreage();
        System.out.print("\n");
        
        System.out.println("--- Tam giac can ---");
        IsoscelesTriangle I = new IsoscelesTriangle();
        I.inputTriangle();
        I.Perimeter();
        I.Acreage();
        System.out.print("\n");
        
        System.out.println("--- Tam giac vuong ---");
        RightTriangle R = new RightTriangle();
        R.inputTriangle();
        R.Perimeter();
        R.Acreage();
        System.out.print("\n");
        
        System.out.println("--- Tam giac deu ---");
        EquilateralTriangle E = new EquilateralTriangle();
        E.inputTriangle();
        E.Perimeter();
        E.Acreage();
        System.out.print("\n");
    }
    
}
