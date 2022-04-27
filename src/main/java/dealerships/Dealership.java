package dealerships;

import vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Dealership {

    List<Vehicle> vehicles;

    public Dealership() { vehicles = new ArrayList<>(); }

    public void addVehicle (Vehicle vehicle) { vehicles.add(vehicle); }

    public List<Vehicle> getVehicles() { return this.vehicles; }

    }

