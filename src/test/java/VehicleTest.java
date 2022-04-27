

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import dealerships.Dealership;
import transports.Car;
import transports.ElectricCar;
import transports.Motorbike;
import vehicles.Vehicle;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VehicleTest {

        Dealership dealership;
        Vehicle vehicle1;
        Car car;
        ElectricCar electricCar;
        Motorbike motorbike;
        private Vehicle Car;


        @BeforeEach
        public void setUp() {
                dealership = new Dealership();
                dealership.addVehicle(new Car("Volkswagen","Golf","X4DVN",120,1000));
                dealership.addVehicle(new ElectricCar("Tesla","ModelS","TSLA",200,10000));
                dealership.addVehicle(new Motorbike("Yahama","XMAX","2SLOW",60,500));

        }

        @Test
        public void canGetBrand(){
                dealership.addVehicle(Car);
                assertThat(vehicle1.getBrand().isEqualTo("Volkswagen");
        }

}
