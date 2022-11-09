import java.util.Scanner;

/**
 *
 * @author tokri
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Adja meg az elso szamot!");
        Scanner input = new Scanner(System.in);
        double number1 = input.nextInt();
        System.out.println("Adja meg az elso szamot!");
        input = new Scanner(System.in);
        double number2 = input.nextInt();
        
        
        System.out.println("A tergogat: " + terfogatSzamol(number1, number2));
        System.out.println("A felszin: " + felszinSzamol(number1, number2));
    }
    
}
