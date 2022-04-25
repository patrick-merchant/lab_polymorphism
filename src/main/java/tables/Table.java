package tables;

import menu.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Table {
    List<MenuItem> order;

    public Table(){
        order = new ArrayList<>();
    }

    public List<MenuItem> getOrder(){
        return this.order;
    }

    public void addToOrder(MenuItem menuItem){
        this.order.add(menuItem);
    }

    public double calculateBillPrice() {
        double sum = 0;
        for (int i=0; i < this.order.size(); i++){
            sum += this.order.get(i).getPrice();
        }
        return sum;
    }

    public String getOrderDescriptions() {
        String desc = "";
        for (int i = 0; i < this.order.size(); i++) {
            if(i < this.order.size()-1) {
                desc = desc + (this.order.get(i).getDescription()) + ", ";
            } else desc = desc + (this.order.get(i).getDescription());
        }
        return desc;


//
//    @Override
//    // The below overload method is suitable for customers who want to make changes to their order.
//    // It will add the item to the order, but also print any custom requests for the kitchen to see.
//    public void addToOrder(MenuItem menuItem, String customRequests){
//        this.order.add(menuItem);
//        System.out.println(customRequests);
//    }

    }}