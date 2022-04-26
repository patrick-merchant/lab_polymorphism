package pubs;

import menu.Drink;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tables.Table;
import tills.Till;

import static enums.OpenHour.SIX_PM;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PubTest {

    private Pub pub;
    private Till till;
    private Table table;
    private Drink aperol;


    @BeforeEach
    public void setUp() {
        pub = new Pub("The Leg of Mutton and Cauliflower");
        till = new Till(1);
        table = new Table();
        aperol = new Drink("Aperol Spritz", 9.90, "None");
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

    @Test
    public void pubHasDrink(){
        pub.addDrinkToMenu(aperol);
        assertThat(pub.getDrink1()).isEqualTo(aperol);
    }

    @Test
    public void canGetHappyHourDrink(){
        pub.addDrinkToMenu(aperol);
        assertThat(pub.getHappyHourDrink(SIX_PM).getPrice()).isEqualTo(4.95);
    }

}