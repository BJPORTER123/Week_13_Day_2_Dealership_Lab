package Tests;

import Behaviors.Sellables;
import DealershipPackage.Dealership;
import PartsPackage.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Engine engine;
    Dealership dealership;

    @Before

    public void setup(){
        dealership = new Dealership(1000);
        engine = new Engine("Diesel Engine", 200);
    }

    @Test
    public void canSell(){
        dealership.addStock(engine);
        dealership.sellCar(engine);
        assertEquals(0, dealership.getStock());
        assertEquals(1200, dealership.getTill(), 0.0);
    }

}
