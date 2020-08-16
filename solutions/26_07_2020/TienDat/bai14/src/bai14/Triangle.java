/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai14;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class Triangle {
    protected float a, b, c;
    protected double h, perimeter, acreage;
    
    Scanner input = new Scanner(System.in);
    
    public Triangle() {
    }

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    
    public void inputTriangle() {
        do {
            System.out.print("Nhap canh a: ");
            this.a = input.nextFloat();
            System.out.print("Nhap canh b: ");
            this.b = input.nextFloat();
            System.out.print("Nhap canh c: ");
            this.c = input.nextFloat();
            if ((this.a + this.b < this.c) || (this.a + this.c < this.b) || (this.b + this.c < this.a)) {
                System.out.println("Do dai a, b, c khong hop le ! Moi nhap lai !");
            }
        } while ((this.a + this.b < this.c) || (this.a + this.c < this.b) || (this.b + this.c < this.a));
    }
    
    public void Perimeter() {
        this.perimeter = this.a + this.b + this.c;
        System.out.printf("> Chu vi tam giac = %1.1f \n",this.perimeter);
    }
    
    public void Acreage() {
        double p = (this.a + this.b + this.c)/2;
        this.acreage = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.printf("> Dien tich tam giac = %1.1f \n",this.acreage);
    }
}
