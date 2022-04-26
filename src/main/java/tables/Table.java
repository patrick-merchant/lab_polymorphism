package tables;

import menu.MenuItem;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Table {
    private List<MenuItem> order;

    public Table(){
        order = new ArrayList<>();
    }

    public List<MenuItem> getOrder(){
        return this.order;
    }

    public void addToOrder(MenuItem menuItem){
        this.order.add(menuItem);
    }

    public double calculateOrderPrice() {
        double sum = 0;
        for (int i=0; i < this.order.size(); i++){
            sum += this.order.get(i).getPrice();
        }
        DecimalFormat df = new DecimalFormat("#.##");
        sum = Double.valueOf(df.format(sum));
        return sum;

    }

    public String getOrderDescriptions() {
        String desc = "";
        for (int i = 0; i < this.order.size(); i++) {
            if (i < this.order.size() - 1) {
                desc = desc + (this.order.get(i).getDescription()) + ", ";
            } else desc = desc + (this.order.get(i).getDescription());
        }
        return desc;
    }

    public String getBill(String desc, double sum) {
        return desc + sum;
    }

}