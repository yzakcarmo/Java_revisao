# Tipo Curinga(wildcard types)
São representados por `?` . Exemplo `List<?> myObjs = new ArrayList<Object>();`

## Covariancia e Contravariancia
### Covariancia
```
List<Integer> intList = new ArrayList<Integer>();
intList.add(10);
intList.add(5);

List<? extends Number> list = intList;

Number x = list.get(0);

list.add(20); // erro de compilacao
```
É possivel acessar/extrair elementos, mas não inserir

### Contravariancia
```
List<Object> myObjs = new ArrayList<Object>();
myObjs.add("Maria");
myObjs.add("Alex");

List<? super Number> myNums = myObjs;

myNums.add(10);
myNums.add(3.14);

Number x = myNums.get(0); // erro de compilacao
```
É possivel inserir elementos, mas não acessar/extrair

# hashCode e equals
São operações da classe Object usadas para comparar se um objeto é igual a outro.

`equals` = lenta, mas sempre assertiva;

`hashCode` = rapida, mas tem uma pequena chance de falso positivo, já que se baseia no calculo com um valor int.

# Set
Representa um conjunto de elementos.

## HashSet
Mais rápido (operações O(1) em tabela hash) e não ordenado.

Exemplo:
```
Set<String> set = new HashSet<>();

set.add("TV");
set.add("Tablet");
set.add("Notebook");

System.out.println(set.contains("Notebook"));
for (String p : set) {
    System.out.println(p);
}
```

Saida:
```
true
TV
Notebook
Tablet
```

## TreeSet
Mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo compareTo do objeto (ou Comparator)
Exemplo:
```
Set<String> set = new TreeSet<>();

set.add("TV");
set.add("Tablet");
set.add("Notebook");

System.out.println(set.contains("Notebook"));
for (String p : set) {
    System.out.println(p);
}
```

Saida:
```
true
Notebook
TV
Tablet
```

## LinkedHashSet
Velocidade intermediária e elementos na ordem em que são adicionados
Exemplo:
```
Set<String> set = new LinkedHashSet<>();

set.add("TV");
set.add("Notebook");
set.add("Tablet");

System.out.println(set.contains("Notebook"));
for (String p : set) {
    System.out.println(p);
}
```

Saida:
```
true
TV
Notebook
Tablet
```

## Metodos
* `contains(x)` = retorna se o elemento faz parte do conjunto
* `add(x)` = adiciona elemento;
* `remove(x)` = remove elemento;
* `removeIf()` = remove elementos que cumprem determinado predicado;

    Exemplo: `removeIf(x -> x.length() >3)` = vai remover todos os elementos que o tamanho seja maior que 3
* `x.addAll(y)`= faz a união dos elementos entre o conjunto `x` e `y`;
* `x.retainAll(y)`= faz a intersecção dos elementos entre o conjunto `x` e `y`;
* `x.removeAll(y)`= faz a diferença dos elementos entre o conjunto `x` e `y`;

# Map
