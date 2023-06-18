package org.example;

public class Dish {
    String dishName;
    int restroId;
    int dishPrice;
    public Dish(int restroId, String dishName , int dishPrice) {
        this.restroId = restroId;
        this.dishName = dishName;
        this.dishPrice = dishPrice;
    }

    public int getRestroId(){
        return restroId;
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
