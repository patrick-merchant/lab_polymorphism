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



    @Override
    public MenuItem getOrderForTwo(){
        String descriptionLarge = this.getDescription() + " (large)";
        double priceForTwo = this.getPrice() * 2;
        Starter starterForTwo = new Starter(descriptionLarge, priceForTwo, getAllergens(), getIsShareable());
        return starterForTwo;
    }

    @Override
    public MenuItem getOrderForTwo(String customDescription, double customPrice){
        Starter customStarter = new Starter(customDescription, customPrice, getAllergens(), getIsShareable());
        return customStarter;
    }


}
