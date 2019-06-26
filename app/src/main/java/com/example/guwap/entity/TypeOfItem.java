package com.example.guwap.entity;

public enum TypeOfItem {
    STEERS ("steers", 100),
    HORSES ("horses",  200),
    SNAKEOIL ("snakeoil", 50),
    WHISKEY ("whiskey", 20),
    CHICKENWING ("chickenwing", 5),
    GOLD ("gold", 200),
    WOOD ("wood", 100),
    CHEWINGTOBACCO ("chewingtobacco", 5),
    PEYOTE ("peyote", 20),
    COAL ("coal",2 ),
    GUNS ("guns", 100),
    WEIRDMUSHROOMS ("weirdmushrooms", 87);

    private int numberOfTypesOfItems;
    private String name;
    private double price;
    private TypeOfItem(String name, double price) {
        this.name = name;
        this.numberOfTypesOfItems = 12;
        this.price = price;
    }
    public int getNumberOfTypesOfItems(){
        return numberOfTypesOfItems;
    }
    public String getName() {
        return name;
    }
    public double getPrice() { return price; }
}
