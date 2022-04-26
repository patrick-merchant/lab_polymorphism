package menu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tables.Table;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StarterTest {
    private Starter starter;
    private double customPrice;
    private String customDescription;

    @BeforeEach
    public void setUp(){
        Table table = new Table();
        starter = new Starter("Garlic Bread", 3.50, "Dairy", false);
        customPrice = 8.00;
        customDescription = "Large Garlic Bread with Cheese";
    }

    @Test
    public void canGetPrice(){
        assertThat(starter.getPrice()).isEqualTo(3.50);
    }

    @Test
    public void canGetDescription() {
        assertThat(starter.getDescription()).isEqualTo("Garlic Bread");
    }

    @Test
    public void canGetAllergens() {
        assertThat(starter.getAllergens()).isEqualTo("Dairy");
    }


    @Test
    public void canGetIsShareable(){
        assertThat(starter.getIsShareable()).isEqualTo(false);
    }

    @Test
    public void canGetStarterForTwo(){
        assertThat(starter.getOrderForTwo().getDescription()).isEqualTo("Garlic Bread (large)");
        assertThat(starter.getOrderForTwo().getPrice()).isEqualTo(7.00);
    }

    @Test
    public void canGetCustomStarterForTwo() {
        assertThat(starter.getOrderForTwo(customDescription, customPrice).getDescription()).isEqualTo("Large Garlic Bread with Cheese");
        assertThat(starter.getOrderForTwo(customDescription, customPrice).getPrice()).isEqualTo(8.00);
    }




}
