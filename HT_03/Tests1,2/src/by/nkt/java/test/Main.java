package by.nkt.java.test;


public class Main {
    public static void main(String[] args) {
        Test1 test = new Test1();

        test.setNum1(10);
        test.setNum2(20);

        test.getSum();

        System.out.println(test.returnBiggest());

    }

}
