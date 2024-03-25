public class ExemploString {
    public static void main(String[] args) {
        /*
         * toLowerCase = minusculas
         * toUpperCase = maiusculas
         * trim = remove espaço nos cantos
         * substring = cria nova String a depender do argumento
         * Replace = substitui a depender do argumento
         * IndexOf LastIndexOf = retorna um int com a posição do argumento passado
         * split = Quebra a String com base no argumento e cria um array com as string criadas
         */
        String original = "abcd efgh ABC abc  ";
        String lower = original.toLowerCase();
        String upper = original.toUpperCase();
        String trim = original.trim();
        String subString = original.substring(2);
        String subStringComFim = original.substring(2,9);
        String replace = original.replace('a', 'y');
        String replaceComString = original.replace("ABC", "XYZ");
        int index = original.indexOf("ab");
        int last = original.lastIndexOf("ab");
        String [] split = original.split(" ");
        String original1 = split[0];

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + lower + "-");
        System.out.println("toUpperCase: -" + upper + "-");
        System.out.println("trim: -" + trim + "-");
        System.out.println("substring(2): -" + subString + "-");
        System.out.println("substring(2, 9): -" + subStringComFim + "-");
        System.out.println("replace('a', 'y'): -" + replace + "-");
        System.out.println("replace('ABC', 'XYZ'): -" + replaceComString + "-");
        System.out.println("Index of 'bc': " + index);
        System.out.println("Last index of 'bc': " + last);
        System.out.println("Split primeira String: " + original1);
    }
}
