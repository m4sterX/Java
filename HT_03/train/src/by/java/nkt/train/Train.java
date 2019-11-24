package by.java.nkt.train;

public class Train {
    private String destination; // УНКТ НАЗНАЧ
    private int arriveTimeMin; // ВРЕМЯ ПРИБЫТИЯ
    private int arriveTimeHour;

    public int getArriveTimeMin() {
        return arriveTimeMin;
    }

    public void setArriveTimeMin(int arriveTimeMin) {
        this.arriveTimeMin = arriveTimeMin;
    }

    public int getArriveTimeHour() {
        return arriveTimeHour;
    }

    public void setArriveTimeHour(int arriveTimeHour) {
        this.arriveTimeHour = arriveTimeHour;
    }

    private int trainNumber;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }


    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public Train(String destination, int trainNumber, int arriveTimeHour, int arriveTimeMin) {
        this.destination = destination;
        this.arriveTimeHour = arriveTimeHour;
        this.arriveTimeMin = arriveTimeMin;
        this.trainNumber = trainNumber;
    }

    public Train() {
        this.destination = "not set";
        this.trainNumber = 0;
        this.arriveTimeHour = 0;
        this.arriveTimeMin = 0;
    }
}
