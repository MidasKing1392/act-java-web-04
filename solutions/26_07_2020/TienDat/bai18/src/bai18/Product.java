/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai18;

/**
 *
 * @author King Midas
 */
public class Product {
    protected String name, description;
    protected double price;
    protected int [] rate = new int[5];

    public Product() {
    }

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int[] getRate() {
        return rate;
    }

    public void setRate(int[] rate) {
        this.rate = rate;
    }
    
    public void viewInfo() {
        System.out.println("\t\t> Ten san pham: " + this.name);
        System.out.println("\t\t> Mo ta san pham: " + this.description);
        System.out.println("\t\t> Gia san pham: " + this.price);
        System.out.println("\t\t> Danh gia san pham: ");
        for (int i = 0; i < 5; i++) {
            System.out.printf("\t\t\t> %d sao \n", rate[i]);
        }
    }
}
