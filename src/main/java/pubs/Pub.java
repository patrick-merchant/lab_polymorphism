package pubs;


import interfaces.IGetBill;

import java.util.ArrayList;
import java.util.List;

public class Pub {
    private String name;
    private List<IGetBill> placesToGetBill;

    public Pub(String name){
        this.placesToGetBill = new ArrayList<>();
        this.name = name;

    }

    public String getName() {
        return this.name;
    }

    public void addPlaceToGetBill(IGetBill placeToGetBill){
        this.placesToGetBill.add(placeToGetBill);
    }

    List<IGetBill> getPlacesToGetBill(){
        return this.placesToGetBill;
    }

}
