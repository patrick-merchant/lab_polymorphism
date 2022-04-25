package menu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tables.Table;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MainCourseTest {
    private MainCourse mainCourse;

    @BeforeEach
    public void setUp(){
        Table table = new Table();
        mainCourse = new MainCourse("Chilli con Carne", 10.95, "None");
    }

    @Test
    public void canGetPrice(){
        assertThat(mainCourse.getPrice()).isEqualTo(10.95);
    }

}