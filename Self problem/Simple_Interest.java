import java.util.Scanner;

public class Simple_Interest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Principle Value : ");
        int p = sc.nextInt();

        System.out.println("Enter the Rate : ");
        int r = sc.nextInt();

        System.out.println("Enter the Time Period : ");
        int t = sc.nextInt();

        float si = (p * r * t) / 100.0f;

        System.out.println("Simple Interest : " + si);
    }
}
