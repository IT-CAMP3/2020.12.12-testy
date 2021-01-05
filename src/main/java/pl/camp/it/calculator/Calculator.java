package pl.camp.it.calculator;

public class Calculator {

    int operations = 0;

    public Calculator() {
        System.out.println("Konstruktor kalkulatora !!");
    }

    public int add(int a, int b) {
        this.operations++;
        return a+b;
    }

    public int diff(int a, int b) {
        this.operations++;
        return a-b;
    }

    public int multiply(int a, int b) {
        this.operations++;
        return a*b;
    }

    public double divide(int a, int b) {
        this.operations++;
        if(b == 0) {
            throw new IllegalArgumentException();
        }
        return ((double) a)/((double) b);
    }
}
