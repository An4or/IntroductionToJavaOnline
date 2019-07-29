package by.yakovtsev.introduction.programming_with_classes_4.classes_and_objects.task7;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    private float angleAlfa;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

        angleAlfa = Math.round(Math.toDegrees(Math.acos((Math.pow(sideA, 2) + Math.pow(sideB, 2) - Math.pow(sideC, 2)) / (2 * sideA * sideB))) * 100000);
        angleAlfa /= 100000;

    }

    public Triangle(double sideA, double sideB, float angleAlfa) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.angleAlfa = angleAlfa;

        sideC = Math.round(Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2) - 2 * sideA * sideB * Math.cos(Math.toRadians(angleAlfa))) * 100000);
        sideC /= 100000;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3.0, 3.0, 3.0);
        System.out.println(triangle.toString());
        System.out.println("Squre == " + triangle.square());
        System.out.println("Perimetr == " + triangle.perimetr());
        triangle.medianCross();

        Triangle triangle2 = new Triangle(3.0, 3.0, 8.0f);
        System.out.println(triangle2.toString());
        System.out.println("Squre == " + triangle2.square());
        System.out.println("Perimetr == " + triangle2.perimetr());
        triangle2.medianCross();


    }


    public double getSideA() {
        return sideA;
    }


    public double getSideB() {
        return sideB;
    }


    public double getSideC() {
        return sideC;
    }


    public float getAngleALFA() {
        return angleAlfa;
    }


    public double square() {
        return 0.5 * sideA * sideB * Math.sin(Math.toRadians(angleAlfa));
    }


    public double perimetr() {
        return sideA + sideB + sideC;
    }


    public void medianCross() {
        double medianBetweenAB = Math.sqrt(2 * Math.pow(sideA, 2) + 2 * Math.pow(sideB, 2) - Math.pow(sideC, 2)) / 2;
        double medianBetweenBC = Math.sqrt(2 * Math.pow(sideB, 2) + 2 * Math.pow(sideC, 2) - Math.pow(sideA, 2)) / 2;
        double medianBetweenAC = Math.sqrt(2 * Math.pow(sideA, 2) + 2 * Math.pow(sideC, 2) - Math.pow(sideB, 2)) / 2;


        System.out.println("The medians of the triangle are:\nbetween the parties:\nab "
                + medianBetweenAB + ";\nbc " + medianBetweenBC + ";\nac " + medianBetweenAC);

        System.out.println("The intersection point of the medians is at a distance from the corners between the sides:\nab "
                + medianBetweenAB / 3 * 2 + ";\nbc " + medianBetweenBC / 3 * 2 + ";\nac " + medianBetweenAC / 3 * 2);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", angleAlfa=" + angleAlfa +
                '}';
    }
}
