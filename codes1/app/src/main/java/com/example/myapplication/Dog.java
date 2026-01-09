package com.example.myapplication;

import java.util.Date;
public class Dog extends Pet implements Pettable {

    public Dog(String name){
        super(name);
    }

    public Dog(String name, Date birthDate){
        super(name, birthDate);
    }
    public String speak(){
        return"Woof!";
    }

    public void pet(){

    }
}