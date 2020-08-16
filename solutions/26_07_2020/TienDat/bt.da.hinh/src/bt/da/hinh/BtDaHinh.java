/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt.da.hinh;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class BtDaHinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Store s = new Store();
        int i, dem = 0;
        
        do {
            System.out.print("\n");
            Menu.Menu();
            System.out.print("\n> Lua chon: ");
            i = input.nextInt();
            if (i < 1 || i > 6) {
                System.out.printf("Khong co lua chon nao ung voi so %d \n",i);
            }
            switch(i) {
                case 1: 
                    System.out.printf("--- Nhap thong tin san pham thu %d --- \n",dem+1);
                    dem++;
                    s.addProduct();
                    break;
                case 2:
                    s.listProduct();
                    break;
                case 3:
                    s.searchProduct();
                    break;
                case 4:
                    s.sortProduct();
                    break;
                case 5:
                    s.updateProduct();
                    break;
                case 6:
                    break;
            }
        } while (i != 6);
    }
}
