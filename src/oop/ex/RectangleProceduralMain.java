package oop.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        int width = 5;
        int height = 8;
        int area = calculateArea(width, height);
        System.out.println(" 넓이 = " + area);

        int perimeter = calcultaePerimeter(width, height);
        System.out.println("둘레 길이 = " + perimeter);

        boolean square =  isSquare(width , height);
        System.out.println("정사각형 인가요 = " + square);


    }


    static int calculateArea(int x, int y){
        int area;
        area = x * y ;
        return area;
    }
    static int calcultaePerimeter(int x, int y){
        return 2 * (x + y);
    }
    static  boolean isSquare(int x , int y){
        return x == y;
    }
}

