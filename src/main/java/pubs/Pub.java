package pubs;


import enums.OpenHour;
import interfaces.IGetBill;
import menu.Drink;


import java.util.ArrayList;
import java.util.List;

public class Pub {
    private String name;
    private List<IGetBill> placesToGetBill;
    private List<Drink> drinksMenu;

    public Pub(String name){
        this.placesToGetBill = new ArrayList<>();
        this.name = name;
        this.drinksMenu = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addDrinkToMenu(Drink drink) {
        this.drinksMenu.add(drink);
    }

    public void addPlaceToGetBill(IGetBill placeToGetBill){
        this.placesToGetBill.add(placeToGetBill);
    }

    List<IGetBill> getPlacesToGetBill(){
        return this.placesToGetBill;
    }

    public Drink getDrink1() {
        return drinksMenu.get(0);
    }

    public Drink getHappyHourDrink(OpenHour hour) {
        if(hour == OpenHour.FIVE_PM || hour == OpenHour.SIX_PM || hour == OpenHour.SEVEN_PM || hour == OpenHour.EIGHT_PM){
            double halfPrice = getDrink1().getPrice() / 2;
            Drink halfPriceDrink = new Drink(getDrink1().getDescription(), halfPrice, getDrink1().getAllergens());
            return halfPriceDrink;
        } else {
            return getDrink1();
        }
    }

}
