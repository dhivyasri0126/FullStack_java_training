package com.example.order;

public class OrderModel {
    private Integer id;
    private String name;
    public OrderModel(Integer id,String name){
        this.id = id;
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

}
