package bhavana;

import bhavana.EvenOdd;

class EvenOdd {
    int number = 7;

    void display() {
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }
}

public class exp4 {
    public static void main(String[] args) {
        EvenOdd e = new EvenOdd();
        e.display();
    }
}
