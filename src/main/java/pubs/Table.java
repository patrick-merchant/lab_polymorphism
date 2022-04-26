package pubs;

import interfaces.IGetBill;
import menu.MenuItem;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Table implements IGetBill {
    private List<MenuItem> tableOrder;

    public Table(){
        tableOrder = new ArrayList<>();
    }

    public List<MenuItem> getOrder(){
        return this.tableOrder;
    }

    public void addToOrder(MenuItem menuItem){
        this.tableOrder.add(menuItem);
    }

    public double calculateOrderPrice() {
        double sum = 0;
        for (int i=0; i < this.tableOrder.size(); i++){
            sum += this.tableOrder.get(i).getPrice();
        }
        DecimalFormat df = new DecimalFormat("#.##");
        sum = Double.valueOf(df.format(sum));
        return sum;

    }

    public String getOrderDescriptions() {
        String desc = "";
        for (int i = 0; i < this.tableOrder.size(); i++) {
            if (i < this.tableOrder.size() - 1) {
                desc = desc + (this.tableOrder.get(i).getDescription()) + ", ";
            } else desc = desc + (this.tableOrder.get(i).getDescription());
        }
        return desc;
    }

    public String getBill(String desc, double sum) {
        return desc + sum;
    }

}