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
public class Square extends Rectangle {

    public Square() {
    }

    public Square(float length) {
        this.length = length;
    }
    
    @Override
    public void inputPolygons() {
        System.out.print("Nhap do dai canh: ");
        this.length = input.nextFloat();
    }
    
    @Override
    public void Perimeter() {
        this.perimeter = this.length * 4;
        System.out.printf("> Chu vi = %1.1f \n", this.perimeter);
    }
    
    @Override
    public void Acreage() {
        this.acreage = this.length * this.length;
        System.out.printf("> Dien tich = %1.1f \n", this.acreage);
    }
    
}
