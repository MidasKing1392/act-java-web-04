/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai13;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class Diem {
    protected float x1, y1;

    Scanner input = new Scanner(System.in);
    
    public Diem() {
    }

    public Diem(float x, float y) {
        this.x1 = x;
        this.y1 = y;
    }

    public float getX() {
        return x1;
    }

    public void setX(float x) {
        this.x1 = x;
    }

    public float getY() {
        return y1;
    }

    public void setY(float y) {
        this.y1 = y;
    }
}
