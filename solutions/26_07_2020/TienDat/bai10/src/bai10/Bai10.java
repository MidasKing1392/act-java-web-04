/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

/**
 *
 * @author King Midas
 */
public class Bai10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Polylomial x = new Polylomial();
        System.out.println("--- Nhap vao da thuc X ---");
        x.inputPolylomial();;
        x.outputPolylomial();
        
        Polylomial y = new Polylomial();
        System.out.println("--- Nhap vao da thuc Y ---");
        y.inputPolylomial();;
        y.outputPolylomial();
        
        System.out.println("-------------------------------------------------");
        x.addPolylomial(x,y);
        x.subPolylomial(x,y);
        x.mulPolylomial(x,y);
    }
    
}
