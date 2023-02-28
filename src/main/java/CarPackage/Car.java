package CarPackage;

import Behaviors.Sellables;
import PartsPackage.Tyre;

import java.util.ArrayList;

public abstract class Car implements Sellables {

    //INSTANCE VARIABLES:
    private String name;
    private double price;
    private String colour;
    private String engine;
    private ArrayList<Tyre> tyres;



    //CONSTRUCTOR FUNCTION:
    public Car(String name, double price, String colour, String engine) {
        this.name = name;
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.tyres = new ArrayList<>();
    }

    //GETTERS:
    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public String getColour() {
        return colour;

    }

    public ArrayList<Tyre> getTyres() {
        return tyres;
    }

    public double getPrice(){
        return price;
    }
}
