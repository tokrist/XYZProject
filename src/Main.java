import java.util.Scanner;

/**
 *
 * @author tokri
 */
public class Main {
    public static double terfogatSzamol(double a, double b){
        double pi = Math.PI;
        double terfogat = a*a*pi*b;
        return terfogat;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Adja meg a sugarat!");
        Scanner input = new Scanner(System.in);
        double r = input.nextInt();
        System.out.println("Adja meg a magassagot!");
        input = new Scanner(System.in);
        double m = input.nextInt();
        
        
        System.out.println("A tergogat: " + terfogatSzamol(r, m));
        System.out.println("A felszin: " + felszinSzamol(r, m));
    }
    
}


