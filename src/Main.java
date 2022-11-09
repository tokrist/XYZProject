import java.util.Scanner;

/**
 *
 * @author tokri
 */
public class Main {
    public double terfogatSzamol(int a, int b){
        double pi = Math.PI;
        double terfogat = a*a*pi*b;
        return terfogat;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner("Adjon meg az elso szamot!");
        double number1 = input.nextInt();
        input = new Scanner("Adja meg a masodik szamot!");
        double number2 = input.nextInt();
        
        
        System.out.println("A tergogat: " + terfogatSzamol(number1, number2));
        System.out.println("A felszin: " + felszinSzamol(number1, number2));
    }
    
}


