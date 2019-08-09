package by.yakovtsev.introduction.algorithmization_2.decomposition;

//9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
//если угол между сторонами длиной X и Y— прямой.
public class Task9 {

    public static void main(String[] args) {
        areaQuadRangle(8, 10, 12, 13);
    }

    public static void areaQuadRangle(int x, int y, int z, int t){

        double squareTriangle1 = x * y / 2;
        double hepotinuza  = Math.hypot(x,y);
        double halfPerTriangle2 = (hepotinuza + z + t) / 2;
        double squareTriangle2;

        if((z + t > hepotinuza) && (hepotinuza + z >= t) && (hepotinuza + t >= z)){
            squareTriangle2 = Math.sqrt(halfPerTriangle2 * (halfPerTriangle2 - hepotinuza) * (halfPerTriangle2 - z) * (halfPerTriangle2 -t));
        }else {
            System.out.println("Quadrangle with sides like this does not exist.");
            squareTriangle2 = squareTriangle1 * (-1);
        }

        double square = squareTriangle1 + squareTriangle2;
        System.out.println("square of quadrangle is " + square);
    }
}
