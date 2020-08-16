/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sinh vien co phai la hoc vien dang ki khoa hoc HDSE ? > T/F");
        char flag1 = input.nextLine().charAt(0);
        System.out.println("Sinh vien co diem tong ket >= 75% ? > T/F");
        char flag2 = input.nextLine().charAt(0);
        System.out.println("Sinh vien khong vi pham noi quy cua trung tam ? > T/F");
        char flag3 = input.nextLine().charAt(0);
        System.out.println("Sinh vien chi thi lan dau tien trong cac ki thi ? > T/F");
        char flag4 = input.nextLine().charAt(0);
        if ((flag1 != 'T') || (flag2 != 'T') || (flag3 != 'T') || (flag4 != 'T')) {
            System.out.println("> Sinh vien khong duoc hoc bong !");
        } else {
            System.out.println("> Sinh vien co duoc hoc bong !");
        }
    }
    
}
