/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class Fraction {
    private int numerator;
    private int deminorator;
    
    Scanner input = new Scanner(System.in);

    public Fraction() {
    }
    
    public Fraction(int numerator, int deminorator) {
        this.numerator = numerator;
        this.deminorator = deminorator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDeminorator() {
        return deminorator;
    }

    public void setDeminorator(int deminorator) {
        this.deminorator = deminorator;
    }

    public void inputFraction(){
        System.out.print("Nhap tu so: ");
        this.numerator = input.nextInt();
        System.out.print("Nhap mau so: ");
        this.deminorator = input.nextInt();
    }
    
    public void outputFraction(){
        System.out.printf("> Phan so vua nhap la %d/%d \n",this.numerator,this.deminorator);
    }
    
    public void abridgedFraction(){
        int temp1 = this.numerator;
        int temp2 = this.deminorator;
        do {
            if(temp1 > temp2){
                temp1 -= temp2;
            } else {
                temp2 -= temp1;
            }
        } while(temp1 != temp2);
        int gcd = temp1;
        int abNumerator = numerator / gcd;
        int abDeminorator = deminorator / gcd;
        System.out.printf("> Phan so sau khi rut gon la %d/%d \n",abNumerator,abDeminorator);
    }
    
    public void inverseFraction(){
        int reNumerator = this.deminorator;
        int reDeminorator = this.numerator;
        System.out.printf("> Phan so sau khi nghich dao la %d/%d \n",reNumerator,reDeminorator);
    }
    
    public void addFraction(Fraction x, Fraction y){
        Fraction z = new Fraction();
        if(x.deminorator == y.deminorator){
            z.numerator = x.numerator + y.numerator;
            z.deminorator = x .deminorator;
            System.out.printf("> Tong hai phan so la %d/%d \n",z.numerator,z.deminorator);
        } else {
            z.numerator = x.numerator*y.deminorator + y.numerator*x.deminorator;
            z.deminorator = x.deminorator*y.deminorator;
            System.out.printf("> Tong hai phan so la %d/%d \n",z.numerator,z.deminorator);
            System.out.print("\t");
            z.abridgedFraction();
        }
    }
    
    public void subFraction(Fraction x, Fraction y){
        Fraction z = new Fraction();
        if(x.deminorator == y.deminorator){
            z.numerator = Math.abs(x.numerator - y.numerator);
            z.deminorator = x .deminorator;
            System.out.printf("> Hieu hai phan so la %d/%d \n",z.numerator,z.deminorator);
        } else {
            z.numerator = Math.abs(x.numerator*y.deminorator - y.numerator*x.deminorator);
            z.deminorator = x.deminorator*y.deminorator;
            System.out.printf("> Hieu hai phan so la %d/%d \n",z.numerator,z.deminorator);
            System.out.print("\t");
            z.abridgedFraction();
        }
    }
    
    public void mulFraction(Fraction x, Fraction y){
        Fraction z = new Fraction();
        z.numerator = x.numerator*y.numerator;
        z.deminorator = x.deminorator*y.deminorator;
        System.out.printf("> Tich hai phan so la %d/%d \n",z.numerator,z.deminorator);
        System.out.print("\t");
        z.abridgedFraction();
    }
    
    public void delFraction(Fraction x, Fraction y){
        Fraction z = new Fraction();
        z.numerator = x.numerator*y.deminorator;
        z.deminorator = x.deminorator*y.numerator;
        System.out.printf("> Thuong hai phan so la %d/%d \n",z.numerator,z.deminorator);
        System.out.print("\t");
        z.abridgedFraction();
    }
}
