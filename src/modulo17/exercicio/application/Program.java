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

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> values = new ArrayList<>();
        //String source = sc.nextLine();
        sc.close();
        String source = "src\\modulo17\\file\\exemplo.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(source))) {
            new File(source + "\\out").mkdir();           
            String line = br.readLine();           
            while (line != null) {
                StringBuilder text = new StringBuilder();
                String[] lines = line.split(",");

                Double summary = Double.valueOf(lines[1]) * Integer.valueOf(lines[2]);                
                text.append(lines[0] + ",");

                values.add(text.toString());
                line = br.readLine();
            }            
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(source + "\\out\\sumarry.csv"))) {
            for(String value : values) {
                bw.write(value);
                bw.newLine();
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }    
}
