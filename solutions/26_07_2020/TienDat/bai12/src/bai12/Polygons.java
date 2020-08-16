/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class Polygons {
    protected float length, width;
    
    Scanner input = new Scanner(System.in);

    public Polygons() {
    }

    public Polygons(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void inputPolygons() {
        System.out.print("Nhap chieu dai: ");
        this.length = input.nextFloat();
        System.out.print("Nhap hieu rong: ");
        this.width = input.nextFloat();
    }
}
