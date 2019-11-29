package by.nkt.agreg.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

    // 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
// Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
    public class Car {

        private static final int WHEEL_COUNT = 4;

        private static List<Wheel> wheels = new ArrayList<>(WHEEL_COUNT);
        private Engine engine = new Engine();
        private int gasCan;
        private CarMake carMake;

        public Car() {
        }

        public Car(Engine engine, int gasCan, CarMake carMake) {
            this.engine = engine;
            this.gasCan = gasCan;
            this.carMake = carMake;
        }

        public Engine getEngine() {
            return engine;
        }

        public void setEngine(Engine engine) {
            this.engine = engine;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            by.nkt.agreg.entity.Car car = (by.nkt.agreg.entity.Car) o;
            return Objects.equals(engine, car.engine);
        }

        @Override
        public int hashCode() {
            return Objects.hash(engine);
        }
        public int getGasCan() {
            return gasCan;
        }

        public void setGasCan(int gasCan) {
            this.gasCan = gasCan;
        }
        public CarMake getCarMake() {
            return carMake;
        }

        public void setCarMake(CarMake carMake) {
            this.carMake = carMake;
        }
    }

