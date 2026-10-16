package bhavana;

import bhavana.Square;

class Square {
    int number = 6;

    void display() {
        int result = number * number;

        System.out.println("Number: " + number);
        System.out.println("Square: " + result);
    }
}

public class exp5 {
    public static void main(String[] args) {
        Square s = new Square();
        s.display();
    }
}
