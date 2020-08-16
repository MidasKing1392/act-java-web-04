/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9;

/**
 *
 * @author King Midas
 */
public class Bai9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vecto x = new Vecto();
        Vecto y = new Vecto();
        
        System.out.println("--- Nhap vecto X ---");
        x.inputVecto();
        x.outputVecto();
        System.out.printf("> Modul vecto X = %1.3f \n",x.modulVecto());
        
        System.out.println("--- Nhap vecto Y ---");
        y.inputVecto();
        y.outputVecto();
        System.out.printf("> Modul vecto Y = %1.3f \n",y.modulVecto());
        
        System.out.println("-------------------------------------------------");
        x.directionVecto(x,y);
        x.compareVecto(x,y);
        x.angleVecto(x,y);
        x.addVecto(x,y);
        x.subVecto(x,y);
        x.mulVecto(x,y);
    }
    
}
