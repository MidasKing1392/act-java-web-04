/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt.da.hinh;

/**
 *
 * @author King Midas
 */
public class SmartPhone extends Product {
    protected boolean hasCamera;
    protected int sim;

    public SmartPhone() {
    }

    public SmartPhone(boolean hasCamera, int sim) {
        this.hasCamera = hasCamera;
        this.sim = sim;
    }

    public SmartPhone(boolean hasCamera, int sim, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.hasCamera = hasCamera;
        this.sim = sim;
    }

    public boolean isHasCamera() {
        return hasCamera;
    }

    public void setHasCamera(boolean hasCamera) {
        this.hasCamera = hasCamera;
    }

    public int getSim() {
        return sim;
    }

    public void setSim(int sim) {
        this.sim = sim;
    }
    
    @Override
    public void addNew() {
        super.addNew();
        System.out.print("> Nhap sim: ");
        this.sim = Integer.parseInt(input.nextLine());
        System.out.print("> SmartPhone co camera ? (Y/N) > ");
        String hasCameraStr = input.nextLine();
        if (hasCameraStr.equals("Y")) {
            this.hasCamera = true;
        } else if (hasCameraStr.equals("N")) {
            this.hasCamera = false;    
        }
    }
}
