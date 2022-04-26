package pubs;

import menu.Dessert;
import menu.Drink;
import menu.MenuItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PubTest {

    private Pub pub;
    private Till till;
    private Table table;

    @BeforeEach

    public void setUp() {
        pub = new Pub("The Leg of Mutton and Cauliflower");
        till = new Till(1);
        table = new Table();
    }

    @Test
    public void pubHasName(){
        assertThat(pub.getName()).isEqualTo("The Leg of Mutton and Cauliflower");
    }

    @Test
    public void pubHasPlacesToOrderFrom(){
        pub.addPlaceToGetBill(table);
        pub.addPlaceToGetBill(till);
        assertThat(pub.getPlacesToGetBill().size()).isEqualTo(2);
    }

}