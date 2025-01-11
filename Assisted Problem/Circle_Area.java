import java.util.Scanner;
import java.util.*;

public class Circle_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of Circle : ");
        int r = sc.nextInt();
        double area = Math.PI * (r * r);
        System.out.println("Area of circle is : " + area);

    }
}
