package by.java.nkt.entity;

public class Counter {
    private double num;
    private double distanceMax;
    private double distanceMin;


    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public Counter() {
        this.num = 5;
        this.distanceMax = 10;
        this.distanceMin = 0;
    }
    public void increaseNum() {
        if (num + 1 <= distanceMax && num + 1 >= distanceMin) {
           num++;
        } else {
            System.out.println("IndexOutOfBounds");
        }
    }
    public void decreaseNum() {
        if (num - 1 <= distanceMax && num - 1 >= distanceMin) {
            num--;
        } else {
            System.out.println("IndexOutOfBounds");
        }
    }
    public Counter(double num, double distanceMax, double distanceMin) {
        this.num = num;
        this.distanceMax = distanceMax;
        this.distanceMin = distanceMin;
    }
    public double currentNum() {
        return num;
    }
}
