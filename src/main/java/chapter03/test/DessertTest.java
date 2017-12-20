package chapter03.test;

import chapter03.service.Dessert;
import org.springframework.beans.factory.annotation.Autowired;

public class DessertTest {

    private Dessert dessert;

    @Autowired
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }
}
