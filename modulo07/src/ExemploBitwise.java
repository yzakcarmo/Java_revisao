import java.util.Scanner;

public class ExemploBitwise {
    public static void main(String[] args) {
        /*
         * & - "E" bit a bit
         * | - "OU" bit a bit
         * ^ - "OU-exclusivo"(só um deles pode ser verdadeiro) bit a bit
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int mask = 0b100000;

        if((n & mask) != 0) System.out.println("6 bit é verdadeiro");
        else System.out.println("6 bit é falso");
    }
}
