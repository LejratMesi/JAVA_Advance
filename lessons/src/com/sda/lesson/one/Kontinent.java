package com.sda.lesson.one;

public class Kontinent {

    private String name;
    private  int area;

    public  Kontinent(String name, int area){
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
