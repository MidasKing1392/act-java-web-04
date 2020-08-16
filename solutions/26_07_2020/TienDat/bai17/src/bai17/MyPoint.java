/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai17;

/**
 *
 * @author King Midas
 */
public class MyPoint {
    protected int x, y;

    public MyPoint() {
        MyPoint point = new MyPoint();
        point.x = 0;
        point.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        System.out.println("MyPoint: (" + this.x + ", " + this.y + ")");
        return "MyPoint{" + "x=" + x + ", y=" + y + '}';
    }

    
    
    
    
    
}
