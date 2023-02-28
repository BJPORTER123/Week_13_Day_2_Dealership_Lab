package CustomerPackage;

import CarPackage.Car;

import java.util.ArrayList;

public class Customer {

    //INSTANCE VARIABLES:
    private double money;
    private ArrayList<Car> ownedCars;

    //CONSTRUCTOR:
    public Customer(double money) {
        this.money = money;
        this.ownedCars = new ArrayList<>();
    }
    //GETTERS:
    public double getMoney() {
        return money;
    }

    public ArrayList<Car> getOwnedCars() {
        return ownedCars;
    }

}
