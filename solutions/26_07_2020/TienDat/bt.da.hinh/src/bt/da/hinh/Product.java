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
public class Product {
    protected int id;
    protected String name;
    protected double price;
    protected int quantity;

    Scanner input = new Scanner(System.in);
    
    public Product() {
    }

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuality(int quality) {
        this.quantity = quality;
    }

    public void addNew() {
        System.out.print("> Nhap id: ");
        this.id = Integer.parseInt(input.nextLine());
        System.out.print("> Nhap ten: ");
        this.name = input.nextLine();
        System.out.print("> Nhap gia: ");
        this.price = Double.parseDouble(input.nextLine());
        System.out.print("> Nhap so luong: ");
        this.quantity = Integer.parseInt(input.nextLine());
    }
}
