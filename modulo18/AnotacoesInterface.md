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
A partir do Java8 é possivel definar metodos concretos em interfaces
```
public interface InterestService {
    double getInterestRate();
    default double payment(double amount, int months) {
        if(months < 1 ) throw new InvalidParameterException("Mês tem que ser maior que zero");

        return amount * Math.pow(1.0 + getInterestRate() / 100.00, months);
    }
}
```