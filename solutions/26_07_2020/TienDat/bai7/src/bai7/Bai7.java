/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

/**
 *
 * @author King Midas
 */
public class Bai7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fraction x = new Fraction();
        Fraction y = new Fraction();
        System.out.println("--- Nhap phan so X ---");
        x.inputFraction();
        x.outputFraction();
        x.abridgedFraction();
        x.inverseFraction();
        System.out.println("--- Nhap phan so Y ---");
        y.inputFraction();
        y.outputFraction();
        y.abridgedFraction();
        y.inverseFraction();
        System.out.println("-------------------------------------------------");
        x.addFraction(x,y);
        x.subFraction(x,y);
        x.mulFraction(x,y);
        x.delFraction(x,y);
    }
    
}
