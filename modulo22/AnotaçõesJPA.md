# JPA
## EntityManager
Um objeto que encapsula uma conexão com a base de dados e serve para efetuar operações de
acesso a dados (inserção, remoção, deleção, atualização) em entidades (clientes, produtos, pedidos, etc.)
por ele monitoradas em um mesmo contexto de persistência. Geralmente mantem-se uma instância única de EntityManager para cada thread do sistema (no caso
de aplicações web, para cada requisição ao sistema).

## EntityManagerFactory
Um objeto utilizado para instanciar objetos EntityManager, geralmente se tem um só para toda a aplicação.

# Maven InteliJ
Pra adicionar o Maven no projeto, só selecionar ele e usar `Ctrl + Shift + A` -> `Add Framework Support`

# Metodos do EntityManager
## Persist
Adiciona o objeto no BD:
```
Person p1 = new Person(null, "Teste1", "teste1@");
Person p2 = new Person(null, "Teste2", "teste2@");

EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
EntityManager em = emf.createEntityManager();

em.getTransaction().begin();
em.persist(p1);
em.persist(p2);
em.getTransaction().commit();

System.out.println("Pronto");
em.close();
emf.close();
```
Toda ação que não seja uma simples consulta é necessario ter uma Transaction.

## Find
Resgata objetos do BD
```
EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
EntityManager em = emf.createEntityManager();

Person p = em.find(Person.class, 2);

System.out.println(p);
em.close();
emf.close();
```

## Remove
Remove objetos do BD, porém a remoção só pode ser feita de objetos monitorados(aqueles que você acabou de inserir ou que você buscou no BD)
```
EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
EntityManager em = emf.createEntityManager();

Person p = em.find(Person.class, 2);

em.getTransaction().begin();
em.remove(p);
em.getTransaction().commit();

em.close();
emf.close();
```

# Anotations Jakarta
```
@Entity
@Table(name = "tb_user")
public class User implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  (........)

  @JsonIgnore
  @OneToMany(mappedBy = "client")
  private List<Order> orders = new ArrayList<>();

  (.......)
}
----------------------------------------------------------------
@Entity
@Table(name = "tb_order")
public class Order implements Serializable {
  (........)

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
  private Instant moment;

  @ManyToOne
  @JoinColumn(name = "client_id")
  private User client;

  (.......)
```
`@Entity` = Sinaliza que a classe é uma entidade

`@Table(name = "tb_user")` = Sinaliza o nome que será usado para a tabela dessa entidade

`@GeneratedValue(strategy = GenerationType.IDENTITY)` = Sinaliza que a propriedade será autoincrementada no BD

`@JsonIgnore` = Sinaliza para o Jackson que não deve apresentar esse atributo

`@OneToMany(mappedBy = "client")` = Mapeia a relação `Um para Muitos` nesse atributo com outra classe/entidade e que o atributo do outro lado é o `client` 

`@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")` = Sinaliza como deve ser formatado o JSON desse atributo

`@JoinColumn(name = "client_id")` = Mapeia qual a coluna que será usada para a ligação das tabelas

```
@RestController
@RequestMapping(value = "/users")
public class UserResource {}
```
`@RestController` = Sinaliza que a classe é um serviço

`@RequestMapping(value = "/users")` = Sinaliza qual o caminho que será usado para acionar esse serviço.

```
@GetMapping
public ResponseEntity<List<User>> findAll() {
    List<User> list = service.findAll();
    return ResponseEntity.ok().body(list);
}
```
`@GetMapping` = Sinaliza que  ao acessar o caminho raiz com o verbo GET executará o metodo. Também pode receber um `(value = "")` para especificar o caminho.
