package com.example.myapplication;
import java.util.Date;

public class Sad extends Mood{
    public Sad() {
        super();
    }

    // constructor with date
    public Sad(Date date) {
        super(date);
    }

    @Override
    public String getMoodString() {
        return "Sad";
    }
}
