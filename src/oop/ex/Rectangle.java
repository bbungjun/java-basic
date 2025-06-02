package oop.ex;

public class Rectangle {
    int weight;
    int height;

    int calculateArea(){
        return height * weight;
    }

    int calculatePerimeter(){
        return 2 * (weight + height);
    }

    boolean isSquare() {
        if (weight == height) {
            return true;
        }
        return false;
    }


}
