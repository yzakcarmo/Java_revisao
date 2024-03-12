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