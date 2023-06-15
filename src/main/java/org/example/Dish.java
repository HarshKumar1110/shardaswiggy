package org.example;

public class Dish {


    String dishName;
    int restroId;
    int dishPrice;
    public Dish(int restroId, int dishPrice, String dishName) {
        this.dishName = dishName;
        this.restroId = restroId;
        this.dishPrice = dishPrice;

    }

    @Override
    public String toString() {
        return "Dish{" +
                "dishName='" + dishName + '\'' +
                ", restroId=" + restroId +
                ", dishPrice=" + dishPrice +
                '}';
    }
}
