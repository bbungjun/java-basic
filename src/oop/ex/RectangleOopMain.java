package oop.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        int area = rectangle.calculateArea();
        System.out.println("넓이 = " + area);

        int  perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레  = "  + perimeter);

        boolean square = rectangle.isSquare();
        System.out.println("정사각 형 ?  = " + square);


    }
}
