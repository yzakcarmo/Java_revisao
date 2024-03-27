# Comparator

É uma interface funcional usada para implementar comparação.

Exemplo em uma classe apartada:
```
public class MyComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}
```

Exemplo em uma classe anonima(Inserida dentro do código de outra classe):
```
...
Comparator<Product> comp = new Comparator<Product>() {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
};
....
```

Exemplo em uma expressão lambda(função anonima):
```
...
Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
....
```

# Predicate
Interface funcional que testa o predicado passado e retorna um booleano

Lambda declarada
```
List<Product> list = new ArrayList<>();

list.add(new Product("Tv", 900.00));
list.add(new Product("Mouse", 50.00));
list.add(new Product("Tablet", 350.50));
list.add(new Product("HD Case", 80.90));

Predicate<Product> remove = p -> p.getPrice() >= 100.0;

list.removeIf(remove);
```

Lambda inline
```
list.removeIf(p -> p.getPrice() >= 100.0);
```
Nesse caso o Predicate está inserido como uma lambda inline `p -> p.getPrice() >= 100.0`

# Method Reference
```
Product::staticProductPredicate
```
Usando o `::` foi feita uma referencia ao metodo estatico `staticProductPredicate` da classe `Product`

# Consumer
Interface funcional que executa uma ação e não traz retorno.

Lambda declarada
```
Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);
list.forEach(cons);
```

Lambda inline
```
list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
list.forEach(System.out::println);
```

# Function
Interface funcional de 2 parametros T e R, cujo metodo receb o T e devolve um objeto R

Lambda declarada
```
Function<Product, String> func = p -> p.getName().toUpperCase();

List<String> names = list.stream().map(func).collect(Collectors.toList());
names.forEach(System.out::println);
```

Lambda inline
```
List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
names.forEach(System.out::println);
```
`.collect(Collectors.toList())`= Converte de Stream para List

# Stream
É uma sequencia de elementos advinda de uma fonte de dados que oferece suporte a "operações agregadas"(exemplo: Coleções, Arrays).

## Operações
### Operações Intermediarias
* filter(pred) = filtra a stream de acordo com predicado
  * Exemplo: `list.stream.filter( x -> x % 2 == 0)` Mantem somente os elementos pares.
* map = É uma função que aplica uma função a todos elementos de uma stream.
* flatmap
* peek
* distinct
* sorted = ordena os elementos de acordo com a condição passada
* skip
* limit(cond) = limita a função que chamou a ser executada até satisfazer a condição passada

### Operações Terminais
* forEach = Executa ação para cada elemento
* forEachOrdered = O anterior, só que ordena os elementos antes
* toArray = Converte para Array
* reduce(v, func(arg1, arg2)) = usa um valor inicial(neutro) e uma função com dois argumentos que gera um resultado.
  * Exemplo: `int sum = list.stream().reduce(0, (x, y) -> x + y);` Faz a soma de todos os elementos e retorna na variavel `sum`.
* collect
* min
* max = 
* count = retona a contagem de elementos
* anyMatch (cond) = executa até encontrar o primeiro elemento que satisfaça a condição
* allMatch (*)
* noneMatch (*)
* findFirst (e) = para o processamento quando encontra a primeira ocorrencia do elemento
* findAny (*)

## Iniciando uma stream

Basta chamar o método stream() ou parallelStream() a partir de qualquer objeto Collection.
```
List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

Stream<Integer> st1 = list.stream();
System.out.println(Arrays.toString(st1.toArray()))
```

Outras formas são:
* Stream.of() = Cria a Stream passando os elementos diretamente na função 
```
Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
System.out.println(Arrays.toString(st2.toArray()));
```

* Stream.iterate(v, preposição) = Cria a Stream com base em um elemento inicial e uma função para iteração
```
Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
System.out.println(Arrays.toString(st3.limit(10).toArray()));
```

Exemplo com Fibonacci
```
Stream<Long> st4 = Stream.iterate(new long[]{ 0L, 1L }, p->new long[]{ p[1], p[0]+p[1] }).map(p -> p[0]);
System.out.println(Arrays.toString(st4.limit(10).toArray()));
```

