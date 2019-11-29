package by.nkt.agreg.entity;

import java.util.Objects;

// 5. Туристические путевки.
// Сформировать набор предложений клиенту по выбору туристической путевки различного типа
// (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
// Учитывать возможность выбора транспорта, питания и числа дней.
// Реализовать выбор и сортировку путевок.
//
//
public class TouristTour {
    private int numberOfDays;

    private TypeOfTour typeOfTour;

    private Transport transport;

    private Food food;

    public TouristTour(int numberOfDays, TypeOfTour typeOfTour, Transport transport, Food food) {
        this.numberOfDays = numberOfDays;
        this.typeOfTour = typeOfTour;
        this.transport = transport;
        this.food = food;
    }

    public TouristTour() {
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public TypeOfTour getTypeOfTour() {
        return typeOfTour;
    }

    public void setTypeOfTour(TypeOfTour typeOfTour) {
        this.typeOfTour = typeOfTour;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TouristTour that = (TouristTour) o;
        return numberOfDays == that.numberOfDays &&
                typeOfTour == that.typeOfTour &&
                transport == that.transport &&
                food == that.food;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfDays, typeOfTour, transport, food);
    }

    @Override
    public String toString() {
        return "TouristTour{" +
                "numberOfDays=" + numberOfDays +
                ", typeOfTour=" + typeOfTour +
                ", transport=" + transport +
                ", food=" + food +
                '}';
    }
}
