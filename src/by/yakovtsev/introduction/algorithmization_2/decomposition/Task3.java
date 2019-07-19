package by.yakovtsev.introduction.algorithmization_2.decomposition;

public class Task3 {

    public static void main(String[] args) {

        System.out.println("Area of a regular hexagon == " + hexagoneArea(triangleArea(6)));
    }

    public static double triangleArea(int side) {
        return Math.sqrt(3) / 4 * Math.pow(side, 2);
    }

    public static double hexagoneArea(double triangleArea) {
        return 6 * triangleArea;
    }


}
