package kitchen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ChefTest {

    private Chef chef;

    @BeforeEach

    public void setUp() {
        chef = new Chef("Liliana");
    }

    @Test
    public void chefHasName(){
        assertThat(chef.getName()).isEqualTo("Liliana");
    }
}
