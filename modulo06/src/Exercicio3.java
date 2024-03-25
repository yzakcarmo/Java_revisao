import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();
        int gasolina = 0, alcool = 0, diesel = 0;

        do {
            switch (opcao) {
                case 1:
                    alcool++;
                    opcao = scan.nextInt();
                    break;
                case 2:
                    gasolina++;
                    opcao = scan.nextInt();
                    break;
                case 3:
                    diesel++;
                    opcao = scan.nextInt();
                    break;
                case 4 :
                    break;            
                default:
                    opcao = scan.nextInt();
                    break;
            }
        } while (opcao != 4);
        scan.close();

        System.out.println("\nMuito obrigado");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
