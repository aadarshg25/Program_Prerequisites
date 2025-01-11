import java.util.Scanner;

public class Kilo_To_Miles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();

        double miles = kilometers * 0.621371;

        System.out.println("The distance in miles is: " + miles);

    }
}