/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class Matrix {
    private int column;
    private int row;
    private float[][] a = new float [1000][1000];
    
    Scanner input = new Scanner(System.in);

    public Matrix() {
    
    }

    public Matrix(int column, int row) {
        this.column = column;
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
    
    public void inputMatrix() {
        System.out.print("So hang = ");
        this.row = input.nextInt();
        System.out.print("So cot = ");
        this.column = input.nextInt();
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                System.out.printf("a[%d][%d] = ",i,j);
                a[i][j] = input.nextFloat();
            }
        }
    }

    public void outputMatrix() {
        System.out.println("> Ma tran vua nhap la: ");
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                System.out.printf("%1.1f \t",a[i][j]);
            }
            System.out.print("\n");
        }
    }
    public void addMatrix(Matrix a, Matrix b) {
        Matrix c = new Matrix();
        if ((a. row != b.row) || (a.column != b.column)) {
            System.out.println("> Hai ma tran khong the cong voi nhau");
        } else {
            System.out.println("> Tong hai ma tran: ");
            for (int i = 0; i < a.row; i++) {
                for (int j = 0; j < a.column; j++) {
                    c.a[i][j] = a.a[i][j] + b.a[i][j];
                }
            }
            for (int i = 0; i < a.row; i++) {
                for (int j = 0; j < a.column; j++) {
                    System.out.printf("%1.1f \t",c.a[i][j]);
                }
                System.out.print("\n");
            }
        }
    }
    
    public void mulMatrix(Matrix a, Matrix b) {
        Matrix c = new Matrix();
        if (a.column != b.row) {
            System.out.println("> Hai ma tran khong the nhan voi nhau");
        } else {
            System.out.println("> Tich hai ma tran: ");
            for (int i = 0; i < a.row; i++) {
                for (int j = 0; j < b.column; j++) {
                    c.a[i][j] = 0;
                    for (int k = 0; k < a.column; k++) {
                        c.a[i][j] += a.a[i][k]*b.a[k][j];
                    }
                }  
            }
            for (int i = 0; i < a.row; i++) {
                for (int j = 0; j < b.column; j++) {
                    System.out.printf("%1.1f \t",c.a[i][j]);
                }
                System.out.print("\n");
            }
        }
    }
}
