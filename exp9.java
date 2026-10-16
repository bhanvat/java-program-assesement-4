package bhavana;

import bhavana.Factorial;

class Factorial {
    int number = 5;

    void display() {
        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }

        System.out.println("Number: " + number);
        System.out.println("Factorial: " + fact);
    }
}

public class exp9 {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        f.display();
    }
}