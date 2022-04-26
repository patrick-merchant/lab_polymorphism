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

    @Override
    public MenuItem getOrderForTwo(){
        String descriptionTwoPlates = this.getDescription() + " (two plates)";
        MainCourse mainForTwo = new MainCourse(descriptionTwoPlates, price, getAllergens(), getCanAddChips());
        return mainForTwo;
    }

    @Override
    public MenuItem getOrderForTwo(String customDescription, double customPrice){
        MainCourse customMain = new MainCourse(customDescription, customPrice, getAllergens(), getCanAddChips());
        return customMain;
    }
}
