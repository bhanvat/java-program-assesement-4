package bhavana;

import bhavana.Rectangle;

class Rectangle {
    int length = 10;
    int breadth = 5;

    void display() {
        int area = length * breadth;

        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area of Rectangle: " + area);
    }
}

public class exp2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.display();
    }
}
