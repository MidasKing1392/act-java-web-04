/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai18;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author King Midas
 */        
public class Shop extends Product {
    List<Product> productList = new ArrayList<>();
    
    Scanner input = new Scanner(System.in);
    
    public void addProduct() {
        Product product = new Product();
        do {
            System.out.print("> Nhap ten san pham: ");
            product.name = input.nextLine();
            if (product.name.length() == 0) {
                System.out.println("( Ten san pham khong hop le ! Moi nhap lai ! )");
            }
        } while (product.name.length() == 0);
        do {
            System.out.print("> Nhap mo ta san pham: ");
            product.description = input.nextLine();
            if (product.description.length() == 0) {
                System.out.println("( Mo ta san pham khong hop le ! Moi nhap lai ! )");
            }
        } while (product.description.length() == 0);
        do {
            System.out.print("> Nhap gia san pham: ");
            product.price = Float.parseFloat(input.nextLine());
            if ((product.price <= 0) || (product.price > 100)) {
                System.out.println("( Gia nhap vao khong hop le ! Moi nhap lai ! )");
            }
        } while ((product.price <= 0) || (product.price > 100));
        System.out.println("> Nhap danh gia san pham: ");
        for (int i = 0; i < 5; i++) {
            do {
                System.out.print("\t>  ");
                product.rate[i] = Integer.parseInt(input.nextLine());
                if ((product.rate[i] < 1) || (product.rate[i] > 5)) {
                    System.out.println("( Danh gia nhap vao khong hop le ! Moi nhap lai ! )");
                } 
            }while ((product.rate[i] < 1) || (product.rate[i] > 5));
        }
        productList.add(product);
    }
    
    public void removeProduct() {
        String removeName;
        boolean found = false;
        do {
            System.out.print("Nhap ten san pham muon tim: ");
            removeName = input.nextLine();
            if (removeName.length() == 0) {
                System.out.println("( Ten san pham khong hop le ! Moi nhap lai ! )");
            }
        } while (removeName.length() == 0);
        for (Product p : productList) {
            if (p.name.contains(removeName)) {
                productList.remove(p);
                System.out.println("Da loai bo san pham " +removeName);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("> Khong tim thay san pham muon loai bo !");
        }
    }
    
    public void iterateProductList() {
        if (productList.size() == 0) {
            System.out.println("> Khong co san pham nao trong shop !");
        } else {
            System.out.println("> Danh sach cac san pham co trong shop: ");
            for(Product p : productList) {
                System.out.println("\t> San pham " + p.name);
                p.viewInfo();
                int sum = 0;
                for (int i = 0; i < 5; i++) {
                    sum += p.rate[i];
                }
                double average = sum / p.rate.length;
                System.out.printf("\t\t> Danh gia trung binh %1.1f sao\n",average);
            }
        }
    }
    
    public void searchProduct() {
        System.out.println("> Nhap khoang gia ban muon tim: ");
        System.out.print("> Gia nho nhat: ");
        int min = Integer.parseInt(input.nextLine());
        System.out.print("> Gia lon nhat: ");
        int max = Integer.parseInt(input.nextLine());
        boolean found = false;
        System.out.println("> Cac san pham co gia trong khoang ban muon tim: ");
        for (Product p : productList) {
            if (p.price > min && p.price < max) {
                System.out.println("\t> San pham " + p.name);
                found = true;
            }
        }
        if (!found) {
            System.out.println("\t> Khong co san pham nao !");
        }
    }
    
    public void sortProduct() {
        
        int choice = 0;
        System.out.println("1. Sap xep theo thu tu tang dan ");
        System.out.println("2. Sap xep theo thu tu giam dan ");
        System.out.print("> Lua chon: ");
        choice = Integer.parseInt(input.nextLine());
        if (choice == 1) {
            for (Product a : productList) {
                for (Product b : productList) {
                    if(b.price < a. price) {
                        Product c = new Product();
                        productList.indexOf(a) = productList.indexOf(c);
                        a = b;
                        b = c;
                    }
                }
            }
            System.out.println("> Da sap xep theo thu tu tang dan");
            iterateProductList();
        } else if (choice == 2) {
            for (Product a : productList) {
                for (Product b : productList) {
                    if(b.price > a. price) {
                        c = a;
                        a = b;
                        b = c;
                    }
                }
            }
            System.out.println("> Da sap xep theo thu tu giam dan");
            iterateProductList();
        } else {
            System.out.println("> Khong hop le !");
        }
    }
    
    public void updateProduct() {
        
    }
}
