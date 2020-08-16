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
public class Circle extends Elip {
    protected float r;

    public Circle() {
    }

    public Circle(float x, float y, float r) {
        this.x1 = x;
        this.y1 = y;
        this.r = r;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }
    
    public void inputCircle() {
        System.out.println("--- NHAP CIRCLE ---");
        System.out.println("> Nhap tam O: ");
        System.out.print("\t> Nhap x: ");
        this.x1 = Float.parseFloat(input.nextLine());
        System.out.print("\t> Nhap y: ");
        this.y1 = Float.parseFloat(input.nextLine());
        System.out.print("> Nhap ban kinh r: ");
        this.r = Float.parseFloat(input.nextLine());
    }
    
    @Override
    public void Acreage() {
        this.acreage = Math.PI * Math.pow(this.r, 2);
        System.out.printf("> Dien tich Circle = %1.1f \n", this.acreage);
    }
}
