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