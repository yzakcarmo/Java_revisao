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
```
List<Product> list = new ArrayList<>();

list.add(new Product("Tv", 900.00));
list.add(new Product("Mouse", 50.00));
list.add(new Product("Tablet", 350.50));
list.add(new Product("HD Case", 80.90));

list.removeIf(p -> p.getPrice() >= 100.0);
```
Nesse caso o Predicate está inserido como uma lambda inline `p -> p.getPrice() >= 100.0`

# Method Reference
```
Product::staticProductPredicate
```
Usando o `::` foi feita uma referencia ao metodo estatico `staticProductPredicate` da classe `Product`

# Consumer
Interface funcional que executa uma ação e não traz retorno
```
List<Product> list = new ArrayList<>();

list.add(new Product("Tv", 900.00));
list.add(new Product("Mouse", 50.00));
list.add(new Product("Tablet", 350.50));
list.add(new Product("HD Case", 80.90));

list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
list.forEach(System.out::println);
```
Nesse caso o Consumer está inserido como uma lambda inline `p -> p.setPrice(p.getPrice() * 1.1)`