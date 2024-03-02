# Comandos Git
## Inicializando repositorio
```
git init
git add .
git commit -m "Mensagem explicativa"
git branch -M main
git remote add origin 
git push -u origin main
```

git init = inicia o repositorio na pasta.

git add . = adiciona todos os arquivos para staged

git commit -m "Mensagem explicativa" = Faz o commit

git branch -M main  = Garante que a branch usada vai ser main

git remote add origin git@github.com:seuusuario/seurepositorio.git  = Vincula ao repositorio do Github, usando SSH

git push -u origin main = Sobe as mudanças

## Clonando
```
git clone git@github.com:seuusuario/seurepositorio.git
git add .
git commit -m "Mensagem explicativa"
git push
```

git clone = Traz o repositorio remoto para a maquina


## Log das versões
```
git log
``` 
Lista resumida:
```
git log --oneline
```

## Listagem mudanças em arquivo
```
git diff arquivo
```

## Alternar para outro commit ou branch
```
git checkout cod.commit\branch
```
Também é possivel ir para commits anteriores usando `HEAD~quantidade`, exemplo : HEAD~1 pra ir no penultimo commit.

