# JPA
## EntityManager
Um objeto que encapsula uma conexão com a base de dados e serve para efetuar operações de
acesso a dados (inserção, remoção, deleção, atualização) em entidades (clientes, produtos, pedidos, etc.)
por ele monitoradas em um mesmo contexto de persistência. Geralmente mantem-se uma instância única de EntityManager para cada thread do sistema (no caso
de aplicações web, para cada requisição ao sistema).

## EntityManagerFactory
Um objeto utilizado para instanciar objetos EntityManager, geralmente se tem um só para toda a aplicação.

# Mavaen InteliJ
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