package menu;

public class MainCourse extends MenuItem {
    boolean canAddChips;
    public MainCourse(String description, double price, String allergens, boolean canAddChips) {
        super(description, price, allergens);
        this.canAddChips = canAddChips;

    }

    public boolean getCanAddChips() {
        return canAddChips;
    }
}
