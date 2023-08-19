package com.example.demo.entity;
import lombok.*;
@Data
public class kangaroo extends Animal{

    private int sleepHour;

    private boolean isAggressive;

    public kangaroo(int id,String name,double weight,String gender,int sleep){

        super(id,name,weight,gender);
        this.sleepHour=sleep;
    }

}
