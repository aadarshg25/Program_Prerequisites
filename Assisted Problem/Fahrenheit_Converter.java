import java.util.Scanner;

public class Fahrenheit_Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature(in Celsius) : ");
        int cel = sc.nextInt();
        double Fah = (cel * (9.0 / 5)) + 32;
        System.out.println("Temperature in Fahrenheit is " + Fah);
    }
}
