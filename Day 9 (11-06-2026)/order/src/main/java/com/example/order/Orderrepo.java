package com.example.order;

import java.util.ArrayList;
import java.util.List;

public class Orderrepo {
    
    public List<OrderModel> findAll(){
        return l;
    }
    public void save(OrderModel s){
        l.add(s);
    }

}
