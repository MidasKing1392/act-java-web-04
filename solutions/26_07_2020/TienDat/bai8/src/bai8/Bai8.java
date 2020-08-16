/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;

/**
 *
 * @author King Midas
 */
public class Bai8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber();
        ComplexNumber b = new ComplexNumber();
        
        System.out.println("--- Nhap so phuc A ---");
        a.inputComplexNumber();;
        a.outputComplexNumber();
        
        System.out.println("--- Nhap so phuc B ---");
        b.inputComplexNumber();
        b.outputComplexNumber();
        
        System.out.println("-------------------------------------------------");
        a.addComplexNumber(a,b);
        a.subComplexNumber(a,b);
        a.mulComplexNumber(a,b);
        b.delComplexNumber(a,b);
    }
    
}
