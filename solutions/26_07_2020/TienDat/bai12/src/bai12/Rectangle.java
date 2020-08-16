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
public class Rectangle extends Prallelogram {

    public Rectangle() {
    }

    public Rectangle(float length, float width) {
        super(length, width);
    }
    
    @Override
    public void Perimeter() {
       this.perimeter = (this.width + this.length)*2; 
       System.out.printf("> Chu vi = %1.1f \n", this.perimeter);
    }
    
    @Override
    public void Acreage() {
        this.acreage = this.length * this.width;
        System.out.printf("> Dien tich = %1.1f \n", this.acreage);
    }
}
