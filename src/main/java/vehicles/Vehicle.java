package vehicles;

import dealerships.Dealership;
import vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

    private int price;
    private String brand;

    private String model;

    private String regPlate;

    private int topSpeed;

    private int Price;

    protected Dealership dealership;
    List<Vehicle> vehicles;

    public Vehicle(String brand, String model, String regPlate, int topSpeed, int price){

        this.brand = brand;
        this.model = model;
        this.regPlate = regPlate;
        this.topSpeed = topSpeed;
        this.price = price;
        //this.setDealership(owner);

    }

    public void setDealership(Dealership owner) { this.dealership = owner;}

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public String getRegPlate() { return regPlate; }
    public int getPrice() { return price; }
    public int getTopSpeed() { return topSpeed;}




}
