/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai15;

/**
 *
 * @author King Midas
 */
public class FlashLamp {
    boolean status = true;
    private Battery battery = new Battery();
    
    public FlashLamp() {
        this.status = false;
    }
    
    public void setBattery(Battery b) {
        this.battery = b;
    }
    
    public void getBatteryInfo() {
        System.out.printf("> Muc nang luong pin cua den = %d \n",this.battery.energy);
    }
    
    public void turnOn() {
        if (this.battery.energy > 0) {
            this.status = true;
            battery.decreeEnergy();
            System.out.println("> Den sang !");
        } else {
            System.out.println("> Het pin ! Den khong the sang !");
        }
    }
    
    public void turnOff() {
        System.out.println("> Den tat !");
        this.status = false;
    }
}
