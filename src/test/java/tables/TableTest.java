package tables;

import menu.Dessert;
import menu.MainCourse;
import menu.Starter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TableTest {

    private Table table;

    @BeforeEach
    public void setUp(){
        table = new Table();
        table.addToOrder(new Starter("Nachos", 8.95, "Dairy", true));
        table.addToOrder(new MainCourse("Chilli con Carne", 10.95, "None"));
        table.addToOrder(new Dessert("Sticky Toffee Pudding", 5.95, "Eggs, Dairy, Gluten"));
    }

    @Test
    public void addsToOrder(){
        assertThat(table.getOrder().size()).isEqualTo(3);
    }
    

//    @Test
//    public void canGetBill(){
//        assertThat(calculateBillPrice()).isEqualTo(25.85);
////        assertThat(getOrderDescriptions()).isEqualTo();
//    }
}
