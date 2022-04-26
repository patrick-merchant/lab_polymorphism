package tills;

import menu.Dessert;
import menu.Drink;
import menu.MainCourse;
import menu.Starter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pubs.Till;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TillTest {

    private Till till;

    @BeforeEach
    public void setUp(){
        till = new Till(1);
        till.addToOrder(new Starter("Nachos", 8.95, "Dairy", true));
        till.addToOrder(new MainCourse("Chilli con Carne", 10.95, "None", false));
        till.addToOrder(new Dessert("Sticky Toffee Pudding", 5.95, "Eggs, Dairy, Gluten"));    }

    @Test
    public void hasTillOrder(){
        assertThat(till.getOrder().size()).isEqualTo(3);
    }

    @Test
    public void canAddDrinkToOrder(){
        till.addToOrder(new Drink("Coke", 3.00, "None"));
        assertThat(till.getOrder().size()).isEqualTo(4);
    }

    @Test
    public void canGetBill(){
        assertThat(till.getBill(till.getOrderDescriptions(), till.calculateOrderPrice())).isEqualTo("Nachos, Chilli con Carne, Sticky Toffee Pudding" + 25.85);
    }
}
