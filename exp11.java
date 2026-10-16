package bhavana;

import bhavana.Prime;

class Prime {
    int number = 7;

    void display() {
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is Not a Prime Number");
        }
    }
}

public class exp11 {
    public static void main(String[] args) {
        Prime p = new Prime();
        p.display();
    }
}