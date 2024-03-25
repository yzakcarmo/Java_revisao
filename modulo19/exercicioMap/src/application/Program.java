package modulo19.exercicioMap.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        String path = "modulo19/exercicioMap/file/exemplo.csv";
        Map<String, Integer> urna = new TreeMap<>();
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(",");
                String name = fields[0];
                int votos = Integer.parseInt(fields[1]);

                if (urna.containsKey(name)) votos += urna.get(name);
                urna.put(name,votos);

                line = br.readLine();
            }

            for (String candidato : urna.keySet()) {
                System.out.println(candidato + ": " + urna.get(candidato));
            }
        }
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
