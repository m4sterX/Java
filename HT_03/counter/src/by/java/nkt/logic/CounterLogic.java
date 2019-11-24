package by.java.nkt.logic;

import by.java.nkt.entity.Counter;

public class CounterLogic {
    Counter counter = new Counter();
    public void increaseNum(Counter counter) {
        if (counter.getNum() + 1 <= counter.getDistanceMax() && counter.getNum() + 1 >= counter.getDistanceMin()) {
            counter.setNum(counter.getNum()+1);
        } else {
            System.out.println("IndexOutOfBounds");
        }
    }
    public void decreaseNum(Counter counter) {
        if (counter.getNum() - 1 <= counter.getDistanceMax() &&  counter.getNum() - 1 >= counter.getDistanceMin()) {
            counter.setNum(counter.getNum()-1);
        } else {
            System.out.println("IndexOutOfBounds");
        }
    }
}
