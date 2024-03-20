# Interface Comparable
É implementada para possibilitar a comparação entre objetos de uma mesma classe
```
public class Employee implements Comparable<Employee> {
    ...

    @Override
    public int compareTo(Employee other) {
        return name.compareTo(other.getName());
    }
}
```
# Default Methods
A partir do Java8 é possivel definar metodos 
```
```