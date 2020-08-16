/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class ComplexNumber {
    private float re;
    private float im;
    
    Scanner input = new Scanner(System.in);

    public ComplexNumber() {
    }

    public ComplexNumber(float re, float im) {
        this.re = re;
        this.im = im;
    }

    public float getRe() {
        return re;
    }

    public void setRe(float re) {
        this.re = re;
    }

    public float getIm() {
        return im;
    }

    public void setIm(float im) {
        this.im = im;
    }
    
    public void inputComplexNumber(){
        System.out.print("Nhap phan thuc: ");
        this.re = input.nextFloat();
        System.out.print("Nhap phan ao: ");
        this.im = input.nextFloat();
    }
    
    public void outputComplexNumber(){
        System.out.printf("> So phuc vua nhap la %1.1f + %1.1fi\n",this.re,this.im);
    }
    
    public void addComplexNumber(ComplexNumber a, ComplexNumber b){
        ComplexNumber c = new ComplexNumber();
        c.re = a.re + b.re;
        c.im = a.im + b.im;
        System.out.printf("> Tong hai so phuc la %1.1f + %1.1fi\n",c.re,c.im);
    }
    
    public void subComplexNumber(ComplexNumber a, ComplexNumber b){
        ComplexNumber c = new ComplexNumber();
        c.re = a.re - b.re;
        c.im = a.im - b.im;
        System.out.printf("> Tong hai so phuc la %1.1f + %1.1fi\n",c.re,c.im);
    }
    
    public void mulComplexNumber(ComplexNumber a, ComplexNumber b){
        ComplexNumber c = new ComplexNumber();
        c.re = a.re*b.re - a.im*b.im;
        c.im = a.re*b.im + a.im*b.re;
        System.out.printf("> Tich hai so phuc la %1.1f + %1.1fi\n",c.re,c.im);
    }
    
    public void delComplexNumber(ComplexNumber a, ComplexNumber b){
        ComplexNumber c = new ComplexNumber();
        c.re = (a.re*b.re + a.im*b.im) / (b.re*b.re + b.im*b.im);
        c.im = (b.re*a.im - a.re*b.im) / (b.re*b.re + b.im*b.im);
        System.out.printf("> Thuong hai so phuc la %1.3f + %1.3fi\n",c.re,c.im);
    }
}
