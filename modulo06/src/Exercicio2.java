import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        while(x != 0 && y != 0) {
            if( x > 0 ) {
                if (y > 0) System.out.println("primeiro");
                else System.out.println("quarto");
            } 
            else if (y > 0) System.out.println("segundo");
            else System.out.println("terceiro");

            x = scan.nextInt();
            y = scan.nextInt();
        }
        scan.close();
    }
}
