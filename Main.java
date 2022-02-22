package com.iot;

record Dishwasher (float waterConsumptionPerYear, int numberOfProgram, String brand, int numberOfSetsOfUtensils) {
    //Additional static fields//
    private static String model;
    private static double priceInDollars;

    //Getter, setter methods for static fields//
    public static void setModel (String model){
        Dishwasher.model = model;
    }
    public static String getModel () {
        return Dishwasher.model;
    }
    public static void setPrice (double priceInDollars){
        Dishwasher.priceInDollars = priceInDollars;
    }
    public static double getPrice () {
        return Dishwasher.priceInDollars;
    }

    //Constructor without parameters//
    public Dishwasher () {
        this(103.5f,13, "LG", 7);
        System.out.print("Constructor of zero parameters was called\n");
    }

    //Constructor with 2 parameters//
    public Dishwasher (int numberOfProgram, String brand) {
        this(103.5f, numberOfProgram, brand, 7 );
        System.out.print("Constructor of two parameters was called\n");
    }

@Override
public String toString() {
        return "Brand:'" + this.brand + "'\nNumber of program: " +this.numberOfProgram + " \nWater consumption per year: " +
                this.waterConsumptionPerYear + " \nNumber of sets of utensils: " + this.numberOfSetsOfUtensils + "\n";
}

}

public class Main {

    public static void main(String[] args) {
	Dishwasher dishwasher = new Dishwasher();
    Dishwasher dishwasher2 = new Dishwasher(4,"Sony");
    Dishwasher dishwasher3 = new Dishwasher(120.5f, 12, "THG", 13);
    System.out.println(dishwasher.toString());
    System.out.println(dishwasher2.toString());
    System.out.println(dishwasher3.toString());
    }
}
