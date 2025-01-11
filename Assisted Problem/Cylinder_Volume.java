import java.util.Scanner;

public class Cylinder_Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of Cylinder : ");
        int r = sc.nextInt();
        System.out.println("Enter the height of Cylinder : ");
        int h = sc.nextInt();
        double volume = Math.PI * (r * r) * h;
        System.out.println("volume of Cylinder is : " + volume);
    }
}
