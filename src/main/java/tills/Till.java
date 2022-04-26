package tills;

import interfaces.IGetBill;
import menu.MenuItem;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Till implements IGetBill {
    private List<MenuItem> tillOrder;
    private int tillNumber;

    public Till(int tillNumber){
        tillOrder = new ArrayList<>();
        this.tillNumber = tillNumber;
    }

    public List<MenuItem> getOrder(){
        return this.tillOrder;
    }

    public void addToOrder(MenuItem menuItem){
        this.tillOrder.add(menuItem);
    }

    public double calculateOrderPrice() {
        double sum = 0;
        for (int i=0; i < this.tillOrder.size(); i++){
            sum += this.tillOrder.get(i).getPrice();
        }
        DecimalFormat df = new DecimalFormat("#.##");
        sum = Double.valueOf(df.format(sum));
        return sum;

    }

    public String getOrderDescriptions() {
        String desc = "";
        for (int i = 0; i < this.tillOrder.size(); i++) {
            if (i < this.tillOrder.size() - 1) {
                desc = desc + (this.tillOrder.get(i).getDescription()) + ", ";
            } else desc = desc + (this.tillOrder.get(i).getDescription());
        }
        return desc;
    }

    public String getBill(String desc, double sum) {
        return desc + sum;
    }
}
