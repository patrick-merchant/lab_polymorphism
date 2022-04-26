package kitchen;

import pubs.Table;

import java.util.LinkedList;

public class Chef {
    String name;
    LinkedList<Table> tableOrders;

    public Chef(String name){
        this.name = name;
        tableOrders = new LinkedList<>();

    }

    public String getName() {
        return name;
    }

    public LinkedList<Table> getTableOrders() {
        return tableOrders;
    }

    public Table cook(){

        Table table = this.getTableOrders().pop();
        return table;
    }
}
