package praktic.geometry.mains;

import java.util.Scanner;

import praktic.geometry.shapes.Circle;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static final String COLOR_GREEN = "\u001B[32m";
    public static final String COLOR_RESET = "\u001B[0m";

    public static void main(String[] args) {
        Circle circle = new Circle();

        System.out.println(COLOR_GREEN + "=====================================" + COLOR_RESET);
        System.out.println("Nama\t: Jevon Mozart Christian Bano");
        System.out.println("NIM\t: 245150700111020");
        System.out.println(COLOR_GREEN + "=====================================" + COLOR_RESET);

        System.out.println("Circle");
        System.out.println(COLOR_GREEN + "=====================================" + COLOR_RESET);

        System.out.print("Isikan ID\t: ");
        int id = scanner.nextInt();
        System.out.print("Isikan Radius\t: ");
        double radius = scanner.nextDouble();

        circle.setId(id);
        circle.setRadius(radius);

        System.out.println(COLOR_GREEN + "=====================================" + COLOR_RESET);
        circle.getDeskripsi();
        System.out.println(COLOR_GREEN + "=====================================" + COLOR_RESET);
    }
}
