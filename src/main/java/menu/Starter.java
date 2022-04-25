package menu;

public class Starter extends MenuItem {
    boolean isShareable;
    public Starter(String description, double price, String allergens, boolean isShareable){
        super(description, price, allergens);
        this.isShareable = isShareable;
    }

    public boolean getIsShareable() {
        return isShareable;
    }
}
