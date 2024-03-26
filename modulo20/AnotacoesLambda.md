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