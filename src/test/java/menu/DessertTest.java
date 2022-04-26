package menu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tables.Table;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DessertTest {
    private Dessert dessert;

    @BeforeEach
    public void setUp(){
        Table table = new Table();
        dessert = new Dessert("Sticky Toffee Pudding", 5.95, "Eggs, Dairy, Gluten");
    }

    @Test
    public void canGetPrice(){
        assertThat(dessert.getPrice()).isEqualTo(5.95);
    }

}