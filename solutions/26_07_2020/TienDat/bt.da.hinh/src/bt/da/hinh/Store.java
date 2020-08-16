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
public class Store {
    Product[] products = new Product[10000];
    protected int i = 0;
    
    Scanner input = new Scanner(System.in);
    
    public void addProduct() {
        String a;
        System.out.print("> Nhap san pham moi (c/s): ");
        a = input.nextLine();
        switch (a) {
            case "c":
                Camera c = new Camera();
                c.addNew();
                products[i] = c;
                i++;
                break;
            case "s":
                SmartPhone s = new SmartPhone();
                s.addNew();
                products[i] = s;
                i++; 
                break;
            default:
                System.out.println("\t San pham nhap vao khong hop le ! ");
                break;
        }
    } 
    
    private final static int[] COL_SIZE = {10, 20, 10, 15, 10, 10, 10};
    
    private String getSpaceFor(int i, String value) {
        int colSize = COL_SIZE[i];
        int length = value.length() +1;
        String space = "";
        for (int j = 0; j < colSize - length; i++) {
            space += " ";
        }
        return space;
    }
    
    public void listProduct() {
        if(products.length == 0) {
            System.out.println("> Khong co san pham nao trong danh sach !");
        } else {
//            System.out.println("> Danh sach san pham: ");
//            System.out.println("----------+--------------------+----------+---------------+----------+----------+----------+");
//            System.out.println("|   Id    |         Ten        |    Gia   |    SoLuong    |    Sim   |  Camera  |    Wifi  |");
//            System.out.println("----------+--------------------+----------+---------------+----------+----------+----------+");
//            for (int j = 0; j < i; j++) {
//                System.out.print("|\t" + products[j].id + "\t|\t"+ products[j].name + "\t|      " + products[j].price + "\t|\t   " + products[j].quantity + "\t\t|");
//                if (products[j] instanceof Camera) {
//                    System.out.println("\t\t|\t\t|\t" + ((Camera) products[j]).hasWifi + "\t|");
//                } else if (products[j] instanceof SmartPhone) {
//                    System.out.print("\t" + ((SmartPhone) products[j]).sim + "\t|");
//                    System.out.println("\t" + ((SmartPhone) products[j]).hasCamera + "\t|\t\t|");
//                }
//            }
//            System.out.println("----------+--------------------+----------+---------------+----------+----------+----------+");
            for (int j = 0; j < i; j++) {
                System.out.printf("> San pham thu %d: \n", j+1);
                System.out.println("\t> Id: " + products[j].id);
                System.out.println("\t> Ten: " + products[j].name);
                System.out.println("\t> Gia: " + products[j].price);
                System.out.println("\t> So luong: " + products[j].quantity);
                if (products[j] instanceof Camera) {
                    System.out.println("\t> Has Wifi: " + ((Camera) products[j]).hasWifi);
                } else if (products[j] instanceof SmartPhone) {
                    System.out.println("\t> Sim: " + ((SmartPhone) products[j]).sim);
                    System.out.println("\t> Has Camera: " + ((SmartPhone) products[j]).hasCamera);
                }
            }
        }
    }
    
    public void searchProduct() {
        String foundName;
        boolean found = false;
        do {
            System.out.print("> Nhap ten san pham ban muon tim: ");
            foundName = input.nextLine();
            if (foundName.length() == 0) {
                System.out.println("( Ten nhap vao khong hop le ! Moi nhap lai ! )");
            }
        } while(foundName.length() == 0);
        for (int j = 0; j < i; j++) {
            if(products[j].name.contains(foundName)) {
                System.out.println("> San pham ban muon tim la: ");
                System.out.println("\t> Id: " + products[j].id);
                System.out.println("\t> Ten: " + products[j].name);
                System.out.println("\t> Gia: " + products[j].price);
                System.out.println("\t> Chat luong: " + products[j].quantity);
                if (products[j] instanceof Camera) {
                    System.out.println("\t> Wifi: " + ((Camera) products[j]).hasWifi);
                } else if (products[j] instanceof SmartPhone) {
                    System.out.println("\t> Sim: " + ((SmartPhone) products[j]).sim);
                    System.out.println("\t> Camera: " + ((SmartPhone) products[j]).hasCamera);
                }
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("> Khong tim thay san pham ban muon !");
        }
    }
    
    public void sortProduct(){
        System.out.println("> Chon thu tu sap xep: ");
        System.out.println("> 1. Giam dan.");
        System.out.println("> 2. Tang dan.");
        System.out.print("> Lua chon: ");
        int choice = Integer.parseInt(input.nextLine());
        Product temp = new Product();
        if (choice == 1) {
            for (int j = 0; j < i-1; j++) {
                for (int k = j+1 ; k < i; k++) {
                    if(products[j].price < products[k].price) {
                        temp = products[j];
                        products[j] = products[k];
                        products[k] = temp;
                    }
                }
            }
            System.out.println("> Da sap xep theo thu tu giam dan ! ");
        } else if (choice == 2) {
            for (int j = 0; j < i-1; j++) {
                for (int k = j+1 ; k < i; k++) {
                    if(products[j].price > products[k].price) {
                        temp = products[j];
                        products[j] = products[k];
                        products[k] = temp;
                    }
                }
            }
            System.out.println("> Da sap xep theo thu tu tang dan ! ");
        } else {
            System.out.println("\t Khong hop le !");
        }
    }
    
    public void updateProduct(){
        String foundName;
        boolean found = false;
        do {
            System.out.print("> Nhap ten san pham ban muon cap nhat: ");
            foundName = input.nextLine();
            if (foundName.length() == 0) {
                System.out.println("( Ten nhap vao khong hop le ! Moi nhap lai ! )");
            }
        } while(foundName.length() == 0);
        for (int j = 0; j < i; j++) {
            if(products[j].name.endsWith(foundName)) {
                String a;
                System.out.print("> Nhap loai san pham (c/s): ");
                a = input.nextLine();
                switch (a) {
                    case "c":
                        Camera c = new Camera();
                        c.addNew();
                        products[j] = c;
                        break;
                case "s":
                    SmartPhone s = new SmartPhone();
                    s.addNew();
                    products[j] = s;
                    break;
                default:
                    System.out.println("( San pham nhap vao khong hop le ! )");
                    break;
                }
                System.out.println("> Da cap nhap san pham !");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("> Khong tim thay san pham ban muon !");
        } 
    }
}
 