/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class Vecto {
    private float headX;
    private float finalX;
    private float headY;
    private float finalY;
    private float x;
    private float y;
    boolean flag = true;
        
    Scanner input = new Scanner(System.in);

    public Vecto() {
    }

    public Vecto(float headX, float finalX, float headY, float finalY) {
        this.headX = headX;
        this.finalX = finalX;
        this.headY = headY;
        this.finalY = finalY;
    }

    public float getHeadX() {
        return headX;
    }

    public void setHeadX(float headX) {
        this.headX = headX;
    }

    public float getFinalX() {
        return finalX;
    }

    public void setFinalX(float finalX) {
        this.finalX = finalX;
    }

    public float getHeadY() {
        return headY;
    }

    public void setHeadY(float headY) {
        this.headY = headY;
    }

    public float getFinalY() {
        return finalY;
    }

    public void setFinalY(float finalY) {
        this.finalY = finalY;
    }
    
    public void inputVecto() {
        System.out.print("Nhap hoanh do dau: ");
        headX = input.nextFloat();
        System.out.print("Nhap hoanh do cuoi: ");
        finalX = input.nextFloat();
        System.out.print("Nhap tung do dau: ");
        headY = input.nextFloat();
        System.out.print("Nhap tung do cuoi: ");
        finalY = input.nextFloat();
    }
    
    public void outputVecto() {
        this.x = finalX - headX;
        this.y = finalY - headY;
        System.out.printf("> Vec to vưa nhap la (%1.1f,%1.1f) \n",x,y);
    }
    
    public void directionVecto(Vecto x, Vecto y) {
        float temp1 = y.x / x.x;
        float temp2 = y.y / x.y;
        if ((temp1 == temp2)) {
            if (temp1 > 0) {
                System.out.println ("> Hai vecto cung phuong cung huong ! ");
            } else {
                System.out.println ("> Hai vecto cung phuong nguoc huong ! ");
            }
            this.flag = true;
        } else {
            System.out.println ("> Hai vecto khong cung phuong ! ");
            this. flag = false;
        }
    }
    
    public double modulVecto() {
        double temp = Math.sqrt(this.x*this.x + this.y*this.y);
        return temp;
    }
    
    public void compareVecto(Vecto x, Vecto y) {
        if (flag && (x.modulVecto() == y.modulVecto())) {
            System.out.println("> Hai vecto bang nhau !");
        } else {
            System.out.println("> Hai vecto khong bang nhau !");
        }
    }
    
    public void angleVecto(Vecto x, Vecto y) {
        double cos = (x.x*y.x + x.y*y.y) / Math.sqrt((x.x*x.x + x.y*x.y)*(y.x*y.x + y.y*y.y));
        if (cos == 1) {
            System.out.println("> Goc giua hai vecto = 0 ");
        } else if (cos == -1) {
            System.out.println("> Goc giua hai vecto = 180 ");
        } else if (cos == 0) {
            System.out.println("> Goc giua hai vecto = 90 ");
        } else if (Math.abs(cos) == (Math.sqrt(3)/2)) {
            System.out.println("> Goc giua hai vecto = 30 ");
        } else if (Math.abs(cos) == (Math.sqrt(2)/2)) {
            System.out.println("> Goc giua hai vecto = 45 ");
        } else if (Math.abs(cos) == 1/2) {
            System.out.println("> Goc giua hai vecto = 60 ");
        } else {
            System.out.printf("> Goc giua hai vecto = ShiftCos(%f) \n", cos);
        }
            
    }
    
    public void addVecto(Vecto x, Vecto y) {
        Vecto z = new Vecto();
        z.x = x.x + y.x;
        z.y = x.y + y.y;
        System.out.printf("> Tong hai vec to la (%1.1f,%1.1f) \n",z.x,z.y);
    }
    
    public void subVecto(Vecto x, Vecto y) {
        Vecto z = new Vecto();
        z.x = x.x - y.x;
        z.y = x.y - y.y;
        System.out.printf("> Hieu hai vec to la (%1.1f,%1.1f) \n",z.x,z.y);
    }
    
    public void mulVecto(Vecto x, Vecto y) {
        float temp = (x.x*y.x) + (x.y*y.y);
        System.out.printf("> TIch hai vec to la %1.1f \n",temp);
    }
}
