package by.nkt.agreg.logic;

import by.nkt.agreg.entity.Car;
import by.nkt.agreg.entity.CarMake;

public class CarLogic {

    public void driveACar(Car car) {

    }

    public void fillPetrol(Car car, int petrolNumber) {
        car.setGasCan(petrolNumber);
    }

    public void changeWheel(Car car){
    }

    public CarMake returnCarMake(Car car) {
         return car.getCarMake();
    }
}
