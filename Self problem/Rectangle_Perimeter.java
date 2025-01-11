import java.util.Scanner;

public class Rectangle_Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Length : ");
        int l = sc.nextInt();

        System.out.println("Enter the Width : ");
        int w = sc.nextInt();

        int Perimeter = 2 * (l + w);

        System.out.println("Perimeter of Rectangle : " + Perimeter);
    }
}
