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
public abstract class Vehicle {
    private double efficiency, gas;
    public Vehicle() {
    }

    public Double getDistance() {
        double distance = (gas / efficiency) * 100;
        return distance;
    }
}
