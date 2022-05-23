package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public Input() {
        scanner = new Scanner(System.in);
    }
    public  String getString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
    public boolean IO(String prompt) {
        System.out.print(prompt);
        String out = scanner.nextLine();
        if(scanner.nextLine().equals("y")) {
            return true;
        }
        return false;
    }
    public int getInt(String prompt, int min, int max) {
        int num = 0;
        do {
            System.out.print(prompt);
            num = scanner.nextInt();
            scanner.nextLine();
        } while (num < min || num > max);
        return num;
    }
    public static int getInt(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
    public double getDouble(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }
    public double getDouble(String prompt, double min, double max) {
        double num = 0;
        do {
            System.out.print(prompt);
            num = scanner.nextDouble();
            scanner.nextLine();
        } while (num < min || num > max);
        return num;
    }
    public void close() {
        scanner.close();
    }

    public int getInt() {
        return scanner.nextInt();
    }
}
