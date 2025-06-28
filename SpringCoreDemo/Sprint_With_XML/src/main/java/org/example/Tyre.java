package org.example;

public class Tyre {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "working"+brand;
    }

    public Tyre(String brand) {
        super();
        this.brand = brand;
    }

}
