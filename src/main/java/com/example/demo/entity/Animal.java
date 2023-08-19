package com.example.demo.entity;
import lombok.*;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Animal {
    private int id;
    private String name;
    private double weight;
    private String gender;



}
