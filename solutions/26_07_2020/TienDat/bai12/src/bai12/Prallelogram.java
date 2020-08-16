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
public class Prallelogram extends Polygons {
    protected double h, perimeter, acreage;
    
    public Prallelogram() {
    }

    public Prallelogram(float length, float width) {
        super(length, width);
    }

    public void Heigh() {
        float temp1 = this.length;
        float temp2 = this.width;
        do {
             if (temp1 > temp2) {
                 temp1 -= temp2;
             } else {
                 temp2 -= temp1;
             }
        }while (temp1 != temp2);
        this.h = this.width / temp1;
    }    
    
    public void Perimeter() {
        this.perimeter = (this.length + this.width)*2;
        System.out.printf("> Chu vi = %1.1f \n", this.perimeter);
    }
    
    public void Acreage() {
        Heigh();
        this.acreage = this.length * this.h;
        System.out.printf("> Dien tich = %1.1f \n", this.acreage);
    }
}
