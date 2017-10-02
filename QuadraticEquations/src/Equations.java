/*By Juan Lagos
* CSC 201
* Professor Tanes Kanchanawanchai
* Assignment 9 Chapter 9
* Computer Configuration
* Due Date: 10/01/17*/
public class Equations {

    private double a,b,c;

    public Equations(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA(double a) {
        this.a = a;
        return a;
    }

    public double getB(double b) {
        this.b = b;
        return b;
    }

    public double getC(double c) {
        this.c = c;
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4.0 * a * c;
    }

    public double getRoot1() {
        return  ((-b + Math.sqrt(getDiscriminant())) / (2.0 * a));
    }

    public double getRoot2() {
        return  ((-b - Math.sqrt(getDiscriminant())) / (2.0 * a));
    }

}
