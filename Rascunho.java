import java.util.Set;
import java.util.TreeSet;

public class Rascunho {
    public static void main(String[] args) {
        //Github na linha de comando https://cli.github.com/manual
        Set<String> set = new TreeSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));
        for (String p : set) {
            System.out.println(p);
        }
    }
}