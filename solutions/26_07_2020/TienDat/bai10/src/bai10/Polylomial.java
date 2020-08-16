/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class Polylomial {
    private int n;
    private float [] a = new float[1000];
    
    Scanner input = new Scanner(System.in);

    public Polylomial() {
    }

    public Polylomial(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public void inputPolylomial() {
        System.out.print("Nhap bac cua da thuc: ");
        this.n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ",i+1);
            this.a[i] = input.nextFloat();
        }
    }
    
    public void outputPolylomial() {
        System.out.printf("> Da thuc vua nhap: \n");
        for (int i = 0; i <= (n - 1); i++) {
            if ( i == 0) {
                System.out.printf("%1.1f + ",a[i]);
            } else if (i == (n - 1)) {
                System.out.printf("%1.1f x^%d \n",a[i],i);
            } else {
                System.out.printf("%1.1f x^%d + ",a[i],i);
            }
        }
    }
    
    public void addPolylomial(Polylomial x, Polylomial y) {
        System.out.printf("> Tong hai thuc vua nhap: \n");
        Polylomial z = new Polylomial();
        if (x.n >= y.n){
            z.n = x.n;
        } else {
            z.n = y.n;
        }
        for (int i = 0; i < z.n; i++) {
            z.a[i] = x.a[i] + y.a[i];
        }
        for (int i = 0; i <= (z.n - 1); i++) {
            if ( i == 0) {
                System.out.printf("%1.1f + ",z.a[i]);
            } else if (i == (z.n - 1)) {
                System.out.printf("%1.1f x^%d \n",z.a[i],i);
            } else {
                System.out.printf("%1.1f x^%d + ",z.a[i],i);
            }
        }
    }
    
    public void subPolylomial(Polylomial x, Polylomial y) {
        System.out.printf("> Hieu hai thuc vua nhap: \n");
        Polylomial z = new Polylomial();
        if (x.n >= y.n){
            z.n = x.n;
        } else {
            z.n = y.n;
        }
        for (int i = 0; i < z.n; i++) {
            z.a[i] = x.a[i] - y.a[i];
        }
        for (int i = 0; i <= (z.n - 1); i++) {
            if ( i == 0) {
                System.out.printf("%1.1f + ",z.a[i]);
            } else if (i == (z.n - 1)) {
                System.out.printf("%1.1f x^%d \n",z.a[i],i);
            } else {
                System.out.printf("%1.1f x^%d + ",z.a[i],i);
            }
        }
    }
    
    public void mulPolylomial(Polylomial x, Polylomial y) {
        System.out.printf("> Tich hai thuc vua nhap: \n");
        Polylomial z = new Polylomial();
        z.n = x.n + y.n;
        for (int i = 0; i < x.n; i++) {
            for (int j = 0; j < y.n; j++) {
                z.a[i+j] = z.a[i+j] + x.a[i]*y.a[j]; 
            }    
        }
        for (int i = 0; i <= (z.n - 1); i++) {
            if ( i == 0) {
                System.out.printf("%1.1f + ",z.a[i]);
            } else if (i == (z.n - 1)) {
                System.out.printf("%1.1f x^%d \n",z.a[i],i);
            } else {
                System.out.printf("%1.1f x^%d + ",z.a[i],i);
            }
        }
    }
}
