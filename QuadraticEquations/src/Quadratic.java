/*By Juan Lagos
* CSC 201
* Professor Tanes Kanchanawanchai
* Assignment 9 Chapter 9
* Computer Configuration
* Due Date: 10/01/17
* Use this as your quadratic calculator! It works!*/
import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {

        Scanner uInput = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = uInput.nextDouble();
        double b = uInput.nextDouble();
        double c = uInput.nextDouble();

        Equations equation = new Equations(a, b, c);
        double discriminant = equation.getDiscriminant();

        if (discriminant > 0) {
            System.out.printf("The roots are %.1f", equation.getRoot1());
            System.out.printf(" and %.1f", equation.getRoot2());
        } else if (discriminant == 0) {
            System.out.print("The root is " + equation.getRoot1());
        } else {
            System.out.print("The equation has no roots!");
        }
    }
}
