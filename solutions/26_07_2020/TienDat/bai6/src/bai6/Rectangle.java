/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class Rectangle {
    private float length;
    private float width;
    
    Scanner input = new Scanner(System.in);

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }
    
    public Rectangle(){
    }
    
    public float getLenghth(){
        return length;
    }
    
    public void setLenghth(float length){
        this.length = length;
    }
    
    public float getWidth(){
        return width;
    }
    
    public void setWidth(float width){
        this.width = width;
    }
    
    public void input(){
        System.out.println("--- Nhap vao chieu dai va chieu rong cua hinh chu nhat ---");
        System.out. print("Nhap chieu dai: ");
        this.length = input.nextFloat();
        System.out. print("Nhap chieu rong: ");
        this.width = input.nextFloat();
    }
    
    public void perimeter(){
        float P = 2*(this.length + this.width);
        System.out.printf("> Chu vi hinh chu nhat = %1.2f\n",P);
    }
    
    public void acreage(){
        float S = this.length * this.width;
        System.out.printf("> Dien tich hinh chu nhat = %1.2f\n",S);
    }
}
