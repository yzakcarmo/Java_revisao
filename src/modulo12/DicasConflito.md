# Soluções para conflitos
## Problema simples:
### Push rejeitado (Local ficou atrasado em relação a remoto)

1. Primeiro vai precisar atualizar a local usando o `git pull`;
2. Nesse momento vai abrir o VIM, porque o arquivo novo do historico remoto está no "meio do caminho" das alterações da local;
3. `Sair do VIM salvando a mensagem` sugerida para o commit de merge;

4. Agora, finalmente poderá seguir com o `git push`, sem problemas.

## Conflito
### Historicos distintos sobre um mesmo arquivo (3 vias)
