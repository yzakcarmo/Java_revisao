package modulo17.exercicio.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modulo17.exercicio.model.entities.Product;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        System.out.print("Digite o caminho do arquivo de origem: ");
        String source = sc.nextLine();
        sc.close();
        //String source = "src\\modulo17\\file\\exemplo.csv";
        String path = new File(source).getParent();
        new File(path + "\\out").mkdir();
        String target = path + "\\out\\sumarry.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(source))) {
                      
            String line = br.readLine();           
            while (line != null) {
                String[] lines = line.split(",");
                list.add(new Product(lines[0], Double.valueOf(lines[1]), Integer.valueOf(lines[2])));                
                line = br.readLine();
            }

           try(BufferedWriter bw = new BufferedWriter(new FileWriter(target))) {
                for(Product product : list) {
                    bw.write(product.getName() + "," + String.format("%.2f", product.total()));
                    bw.newLine();
                }
            }
            catch(IOException e) {
                System.out.println("Erro de escrita: " + e.getMessage());
            }
        }
        catch(IOException e) {
            System.out.println("Erro de leitura: " + e.getMessage());
        }
    }    
}
