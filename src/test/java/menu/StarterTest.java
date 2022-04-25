package menu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tables.Table;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StarterTest {
    private Starter starter;

    @BeforeEach
    public void setUp(){
        Table table = new Table();
        starter = new Starter("Garlic Bread", 3.50, "Dairy", false);
    }

    @Test
    public void canGetPrice(){
        assertThat(starter.getPrice()).isEqualTo(3.50);
    }

}
