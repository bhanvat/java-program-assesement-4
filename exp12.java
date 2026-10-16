package bhavana;

import bhavana.Fibonacci;

class Fibonacci {
    int n = 10;

    void display() {
        int a = 0;
        int b = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println();
    }
}

public class exp12 {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.display();
    }
}
