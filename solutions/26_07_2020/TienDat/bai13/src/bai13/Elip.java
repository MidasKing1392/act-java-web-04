/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai13;

/**
 *
 * @author King Midas
 */
public class Elip extends Diem { 
    protected float x2, y2, x3, y3, x4, y4;
    protected double a, b, acreage;
    
    public Elip() {
    }

    public Elip(float x2, float y2, float x3, float y3, float x4, float y4, float x1, float y1) {
        super(x1, y1);
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }

    public float getX2() {
        return x2;
    }

    public void setX2(float x2) {
        this.x2 = x2;
    }

    public float getY2() {
        return y2;
    }

    public void setY2(float y2) {
        this.y2 = y2;
    }

    public float getX3() {
        return x3;
    }

    public void setX3(float x3) {
        this.x3 = x3;
    }

    public float getY3() {
        return y3;
    }

    public void setY3(float y3) {
        this.y3 = y3;
    }

    public float getX4() {
        return x4;
    }

    public void setX4(float x4) {
        this.x4 = x4;
    }

    public float getY4() {
        return y4;
    }

    public void setY4(float y4) {
        this.y4 = y4;
    }
    
    public void inputElip () {
        System.out.println("--- NHAP ELIP ---");
        System.out.println("> Nhap diem A1: ");
        System.out.print("\t> Nhap x: ");
        this.x1 = Float.parseFloat(input.nextLine());
        System.out.print("\t> Nhap y: ");
        this.y1 = Float.parseFloat(input.nextLine());
        System.out.println("> Nhap diem A2: ");
        System.out.print("\t> Nhap x: ");
        this.x2 = Float.parseFloat(input.nextLine());
        System.out.print("\t> Nhap y: ");
        this.y2 = Float.parseFloat(input.nextLine());
        System.out.println("> Nhap diem B1: ");
        System.out.print("\t> Nhap x: ");
        this.x3 = Float.parseFloat(input.nextLine());
        System.out.print("\t> Nhap y: ");
        this.y3 = Float.parseFloat(input.nextLine());
        System.out.println("> Nhap diem B2: ");
        System.out.print("\t> Nhap x: ");
        this.x4 = Float.parseFloat(input.nextLine());
        System.out.print("\t> Nhap y: ");
        this.y4 = Float.parseFloat(input.nextLine());
    }
    
    public void Length() {
        Diem B = new Diem();
        B.x1 = this.x4 - this.x3;
        B.y1 = this.y4 - this.y3;
        this.a = Math.sqrt(B.x1*B.x1 + B.y1*B.y1) / 2;
        Diem A = new Diem();
        A.x1 = this.x2 - this.x1;
        A.y1 = this.y2 - this.y1;
        this.b = Math.sqrt(A.x1*A.x1 + A.y1*A.y1) / 2;
    }
    
    public void Acreage() {
        Length();
        this.acreage = Math.PI * this.a * this.b;
        System.out.printf("> Dien tich Elip = %1.1f \n", this.acreage);
    }
    
}
