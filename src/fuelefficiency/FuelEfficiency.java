/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuelefficiency;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author kyluk1259
 */
public class FuelEfficiency {

    public static Vehicle[] vehicles = new Vehicle[4];
    public static double[] distance = new double[4];
    public static DecimalFormat x = new DecimalFormat("0.00");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        init();
    }

    private static void init() {
        String in = JOptionPane.showInputDialog("How many litres of gas will be used?");
        check(in);
        double gas = Double.parseDouble(in);
        distance(gas);
    }

    private static void distance(double gas) {
        vehicles[0] = new Car(gas);
        vehicles[1] = new Truck(gas);
        vehicles[2] = new Hybrid(gas);
        vehicles[3] = new Motorcycle(gas);

        for (int i = 0; i < distance.length; i++) {
            distance[i] = vehicles[i].getDistance();
        }
        output(gas);
    }

    private static void output(double gas) {

        String output = "On " + x.format(gas) + "L of gas the vehicles can travel:";
        output += "\nCar: " + x.format(distance[0]) + "KM";
        output += "\nTruck: " + x.format(distance[1]) + "KM";
        output += "\nHybrid: " + x.format(distance[2]) + "KM";
        output += "\nMotorcycle: " + x.format(distance[3]) + "KM";

        System.out.println(output);
    }

    private static void check(String in) {
        if (in == null) {
            System.exit(0);
        } else if (isIncorrect(in)) {
            init();
        } else {
            return;
        }
    }

    private static boolean isIncorrect(String in) {
        for (char a : in.toCharArray()) {
            if (Character.isWhitespace(a) || Character.isAlphabetic(a)) {
                return true;
            }
        }
        return false;
    }

}
