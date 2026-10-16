package bhavana;

import bhavana.SimpleInterest;

class SimpleInterest {
    double p = 10000;
    double r = 5;
    double t = 2;

    void display() {
        double si = (p * r * t) / 100;

        System.out.println("Principal: " + p);
        System.out.println("Rate of Interest: " + r);
        System.out.println("Time: " + t);
        System.out.println("Simple Interest: " + si);
    }
}

public class exp8 {
    public static void main(String[] args) {
        SimpleInterest s = new SimpleInterest();
        s.display();
    }
}