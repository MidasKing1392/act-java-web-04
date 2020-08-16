/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

/**
 *
 * @author King Midas
 */
public class Bai11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matrix a = new Matrix();
        System.out.println("--- Nhap ma tran A ---");
        a.inputMatrix();
        a.outputMatrix();
    
    
        Matrix b = new Matrix();
        System.out.println("--- Nhap ma tran B ---");
        b.inputMatrix();
        b.outputMatrix();
        
        System.out.println("-------------------------------------------------");
        a.addMatrix(a,b);
        a.mulMatrix(a,b);
    }
}
