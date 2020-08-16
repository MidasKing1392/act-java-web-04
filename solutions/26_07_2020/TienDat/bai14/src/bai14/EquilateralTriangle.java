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
public class EquilateralTriangle extends IsoscelesTriangle {

    public EquilateralTriangle() {
    }

    public EquilateralTriangle(float a, float b, float c) {
        super(a, b, c);
    }
    
    @Override
    public void inputTriangle() {
        do {
            System.out.print("Nhap canh a: ");
            this.a = input.nextFloat();
            System.out.print("Nhap canh b: ");
            this.b = input.nextFloat();
            System.out.print("Nhap canh c: ");
            this.c = input.nextFloat();
            if ((this.a != this.b) || (this.b != this.c)) {
                System.out.println("Do dai a, b, c khong hop le ! Moi nhap lai !");
            }
        } while ((this.a != this.b) || (this.b != this.c));
    }
    
}
