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

    public void roots(){
        Scanner myObj = new Scanner(System.in);
        double D=0;
        double x=0;
        double x1=0;
        double x2=0;
        double a=0;
        double b=0;
        double c=0;
        System.out.println("Hello Im a program to solve quadratic equation");
        System.out.println("Enter a:");
        a = myObj.nextInt();
        System.out.println("Enter b:");
        b = myObj.nextInt();
        System.out.println("Enter c:");
        c = myObj.nextInt();

        if (a==0){
            System.out.println("Nieje to qvadraticka rovnica");
        }else{
            D= Math.pow(b,2)-4*a*c;
            System.out.println("D=" + D);
            if (D>0){
                x1=(((-b)+Math.sqrt(D))/2*a);
                x2=(((-b)-Math.sqrt(D))/2*a);
                System.out.println("dve riesenia: x1=" + x1 + " x2=" + x2 );
            }
            if (D==0){
                x1=(-b)/(2*a);
                System.out.println("Jedno riesenie: x=" + x );
            }
            if (D<0){
                System.out.println("Nema riesenie");
            }
        }
    }

}
