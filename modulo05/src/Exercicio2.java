import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        

        scan.close();
        String resposta = (i%2 == 0) ? "PAR" : "IMPAR";
        
        System.out.println(resposta);
    }
    
}
