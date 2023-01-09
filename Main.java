import java.awt.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap vao b: ");
        double b = sc.nextDouble();
        System.out.println("Nhap vao c: ");
        double c = sc.nextDouble();
        QuadracticEquation quadracticEquation = new QuadracticEquation(a, b, c);
        if (quadracticEquation.getDiscrimiant() == 0) System.out.println("Phuong trinh co nghiem kep la: " + quadracticEquation.getRoot1());
        if (quadracticEquation.getDiscrimiant() < 0) System.out.println("Phuong trinh vo nghiem");
        if (quadracticEquation.getDiscrimiant() > 0) System.out.println("Phuong trinh co 2 nghiem la: " + quadracticEquation.getRoot1() + " va " + quadracticEquation.getRoot2());;
    }
}
