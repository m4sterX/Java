package by.java.nkt.logic;

public class TriangleLogic {

    public double countP(int x1, int y1, int x2, int y2, int x3, int y3) {

        double ab = findAb( x1, y1, x2, y2);
        double bc = findBC( x2, y2, x3, y3);
        double ac = findAC( x1, y1, x3, y3);

        return ab + bc + ac;
    }
    public double[] dashDotOfMidPoints(int x1, int y1, int x2, int y2, int x3, int y3){

       double pointX = (double) (x1 + x2 + x3) / 3;
       double pointY = (double) (y1 + y2 + y3) / 3;

       double[] arr = new double[]{pointX, pointY};

       return arr;

    }
    public double countS(int x1, int y1, int x2, int y2, int x3, int y3){
        return (double) Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) / 2;
    }
    public double findAb(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
    }
    public double findBC(int x2, int y2, int x3, int y3) {
        return Math.sqrt(Math.pow(x3 - x2,2) + Math.pow(y3 - y2,2));
    }
    public double findAC(int x1, int y1, int x3, int y3) {
        return Math.sqrt(Math.pow(x3 - x1,2) + Math.pow(y3 - y1,2));
    }

}
