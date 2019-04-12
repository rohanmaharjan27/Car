package com.example.car;

public class CarModel {
    private String make,year,color,price,size;

    public CarModel(String make, String year, String color, String price, String size) {
        this.make = make;
        this.year = year;
        this.color = color;
        this.price = price;
        this.size = size;
    }

    public String getMake() {
        return make;
    }

    public String getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString(){
        return  "\r\n Manufacturer: " + make +
                "\r\n Year: " + year +
                "\r\n Color: " + color +
                "\r\n Price: " + price +
                "\r\n Engine Size: " + size;
    }
}
