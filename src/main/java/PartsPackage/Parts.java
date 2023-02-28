package PartsPackage;

import Behaviors.Sellables;

public abstract class Parts implements Sellables {
    //INSTANCE VARIABLES:
    private String name;
    private double price;

    //CONSTRUCTOR FUNCTION:
    public Parts(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice(){
        return price;
    }
}
