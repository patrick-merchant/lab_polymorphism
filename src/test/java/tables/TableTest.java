package tables;

import menu.Dessert;
import menu.Drink;
import menu.MainCourse;
import menu.Starter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pubs.Table;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TableTest {

    private Table table;

    @BeforeEach
    public void setUp(){
        table = new Table();
        table.addToOrder(new Starter("Nachos", 8.95, "Dairy", true));
        table.addToOrder(new MainCourse("Chilli con Carne", 10.95, "None", false));
        table.addToOrder(new Dessert("Sticky Toffee Pudding", 5.95, "Eggs, Dairy, Gluten"));
    }

    @Test
    public void hasOrder(){
        assertThat(table.getOrder().size()).isEqualTo(3);
    }

    @Test
    public void canCalculateOrderPrice(){
        // Currently calculateBillPrice() returns long decimal, very near to the price I want.
        // This is something to do with the way I have summed 3 double primitives or values.
//        assertThat(table.calculateOrderPrice()).isGreaterThan(25.84);
//        assertThat(table.calculateOrderPrice()).isLessThan(25.86);
        // I think I have solved this, but will leave it here just in case.
        assertThat(table.calculateOrderPrice()).isEqualTo(25.85);
    }

    @Test
    public void canGetOrderDescriptions() {
        assertThat(table.getOrderDescriptions()).isEqualTo("Nachos, Chilli con Carne, Sticky Toffee Pudding");
    }

    @Test
    public void canGetBill() {
        assertThat(table.getBill(table.getOrderDescriptions(), table.calculateOrderPrice())).isEqualTo("Nachos, Chilli con Carne, Sticky Toffee Pudding" + 25.85);
    }

    @Test
    public void canAddDrinkToOrder(){
        table.addToOrder(new Drink("Guinness", 4.90, "None"));
        assertThat(table.getOrder().size()).isEqualTo(4);
        assertThat(table.calculateOrderPrice()).isEqualTo(30.75);
    }
}
