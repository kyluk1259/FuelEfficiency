/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuelefficiency;

/**
 *
 * @author kyluk1259
 */
public class Motorcycle extends Vehicle {

    private double efficiency, gas;

    public Motorcycle(double gasIn) {
        super();
        efficiency = 6.3;
        gas = gasIn;
    }
    
    public Double getDistance() {
        double distance = (gas / efficiency) * 100;
        return distance;
    }
}
