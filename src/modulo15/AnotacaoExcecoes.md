# Try-catch
```
try {
}
catch (ExceptionType e) {
}
catch (ExceptionType e) {
}
```
`try {}` = código a ser executado

`catch (ExceptionType e)` = Vai capturar a exceção e executar o código inserido

# Pilha de chamadas de métodos
```
try {
    String[] vect = sc.nextLine().split(" ");
    int position = sc.nextInt();
    System.out.println(vect[position]);
}
catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Invalid position!");
    e.printStackTrace();
}
```
`e.printStackTrace()` = Mostra a pilha de chamadas de métodos, permitindo entender o que está acontecendo no erro, sem parar a aplicação.

# Finally
```
try {
}
catch (ExceptionType e) {
}
finally{
}
```
`finally{}` = Código a ser executado tendo ou não exceção.

# Propagação de exceção
```
public class DomainException extends RuntimeException {
    public DomainException (String msg) {
        super(msg);
    }
}
```
A classe acima é um exemplo de exceção personalizada

Como ela faz uso do `extends RuntimeException` os seus metodos não precisam propagar as exceções.

Mas caso ela use `extends Exception` seria necessario propagar as exceções como no exemplo abaixo:

```
public void updateDates(LocalDate checkIn, LocalDate checkOut) throws IllegalArgumentException {
    if(checkOut.isBefore(LocalDate.now()) || checkIn.isBefore(LocalDate.now()))
        throw new DomainException("As datas de atualização da reserva devem ser futuras");

        if(checkOut.isBefore(checkIn))
        throw new DomainException("A data de check-out deve ser depois do check-in");        

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
```
`throw new` = Lança a exceção onde chamou o método

`throws IllegalArgumentException` = Propaga a exceção para onde chamou o método trata-la