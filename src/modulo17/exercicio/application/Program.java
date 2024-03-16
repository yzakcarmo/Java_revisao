package modulo17.exercicio.application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String source = sc.nextLine();
        String source = "src\\modulo17\\file\\exemplo.csv";
        try(BufferedReader bf = new BufferedReader(new FileReader(source))) {
            File path = new File(source);
        }
        catch(IOException e) {
            e.printStackTrace();
        }        
    }    
}
