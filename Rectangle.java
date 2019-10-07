package sk.itsovy.matysko.orter;
import java.util.Scanner;

public class Rectangle {
    public void exercise1() {
        Scanner newObj = new Scanner(System.in);
        System.out.println("Enter size:");
        int riadok = newObj.nextInt();
        int pocet = newObj.nextInt();
        for (int a = 1; a <= riadok; a++) {
            System.out.println();
            for (int j = 1; j <= pocet; j++) {
                System.out.print("@");
            }
        }
    }
    public void exercise2() {
        Scanner newObj = new Scanner(System.in);
        System.out.println("Enter size:");
        String char2 = newObj.nextLine();
        int riadok = newObj.nextInt();
        int pocet = newObj.nextInt();
        for (int a = 1; a <= riadok; a++) {
            for (int j = 1; j <= pocet; j++) {
                if (a == 1 || a == riadok || j == 1 || j == pocet)
                System.out.print(char2);
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
