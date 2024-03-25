package application;

import modulo19.exemploGenericsDelimitado.src.model.entities.Product;
import modulo19.exemploGenericsDelimitado.src.model.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();
        String path = "modulo19/exemploGenericsDelimitado/file/exemplo.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            Product max = CalculationService.max(list);

            System.out.println("Mais caro:");
            System.out.println(max);
        }
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
