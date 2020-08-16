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
public class Battery {
    protected int energy;
    
    public Battery() {
        this.energy = 10;
    }

    public Battery(int energy) {
        this.energy = energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
    
    public int getEnergy() {
        return energy;
    }
    
    public void decreeEnergy () {
        this.energy = this.energy - 2;
    }
}
