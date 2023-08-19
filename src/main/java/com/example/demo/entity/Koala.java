package com.example.demo.entity;


import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Koala extends Animal{



    private int sleepHour;
    public Koala(int id,String name,double weight,String gender,int sleep){

        super(id,name,weight,gender);
        setSleepHour(sleep);
    }


}
