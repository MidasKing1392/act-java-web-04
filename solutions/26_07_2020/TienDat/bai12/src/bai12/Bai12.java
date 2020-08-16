/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

/**
 *
 * @author King Midas
 */
public class Bai12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Prallelogram P = new Prallelogram();
        System.out.println("--- Hinh Binh Hanh ---");
        P.inputPolygons();
        P.Perimeter();
        P.Acreage();
        System.out.print("\n");
        
        System.out.println("--- Hinh Chu Nhat ---");
        Rectangle R = new Rectangle();
        R.inputPolygons();
        R.Perimeter();
        R.Acreage();
        System.out.print("\n");
        
        System.out.println("--- Hinh Vuong ---");
        Square S = new Square();
        S.inputPolygons();
        S.Perimeter();
        S.Acreage();
    }
}
