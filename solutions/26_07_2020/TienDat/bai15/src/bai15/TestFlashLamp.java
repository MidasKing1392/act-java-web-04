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
public class TestFlashLamp {
    public static void main(String[] args) {
        Battery b = new Battery();
        FlashLamp f = new FlashLamp();
        // Lắp pin cho đèn
        f.setBattery(b);
        // Bật và tắt lần 1
        f.turnOn();
        f.turnOff();
        System.out.print("\n");
        // Bật và tắt lần 2
        f.turnOn();
        f.turnOff();
        System.out.print("\n");
        // Bật và tắt lần 3
        f.turnOn();
        f.turnOff();
        System.out.print("\n");
        // Bật và tắt lần 4
        f.turnOn();
        f.turnOff();
        System.out.print("\n");
        // Bật và tắt lần 5
        f.turnOn();
        f.turnOff();
        System.out.print("\n");
        
        f.getBatteryInfo();
    }
}
