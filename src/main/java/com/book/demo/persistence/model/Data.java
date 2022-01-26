package com.book.demo.persistence.model;

public class Data {

    int value;

    public Data(int value)
    {
        this.value = value;
        System.out.println(value);
    }

    public int getValue()
    {
        return value;
    }
}
