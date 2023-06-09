package app.models;

import app.base.BaseModel;

public class OrderAModel implements BaseModel {

    @Override
    public double getOrderCost(int quantity, double price) {
        return quantity * price;
    }
}
