package DealershipPackage;

import Behaviors.Sellables;

import java.util.ArrayList;

public class Dealership {

    //INSTANCE VARIABLES:
    private ArrayList<Sellables> stock;

    private double till;

    public Dealership(double till) {
        this.till = till;
        this.stock = new ArrayList<>();
    }

    public int getStock() {
        return stock.size();
    }

    public double getTill() {
        return till;
    }

    public void addStock(Sellables sellable){
        stock.add(sellable);
    }

    public void removeStockIfNotNull(Sellables sellable){
        if(stock.size() > 0 ){
            stock.remove(sellable);
        }
        return;
    }

    public void addMoneyToTill(Sellables sellable){
        till += sellable.getPrice();
    }

    public void sellCar(Sellables sellable){
        removeStockIfNotNull(sellable);
        addMoneyToTill(sellable);
    }


}
