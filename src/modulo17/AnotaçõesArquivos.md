# Try-with-resources
## É um bloco try que declara um ou mais recursos, e garante que eles serão fechados ao final do bloco 
```
try (BufferedReader br = new BufferedReader(new FileReader(path))) {
    String line = br.readLine();
    while (line != null) {
        System.out.println(line);
        line = br.readLine();
    }
}
catch (IOException e) {
    System.out.println("Error: " + e.getMessage());
}
```

# FileReader e BufferedReader

FileReader = Faz a leitura de caracteres do arquivo.

BufferedReader = Faz mais rapido.

# FileWriter e BufferedWriter

FileWriter = Faz a escrita de caracteres no arquivo.

`new FileWriter(path)` = Cria/recria o arquivo

`new FileWriter(path,true)` = Acrescenta ao arquivo existente

BufferedWriter = Faz mais rapido.

# File para manipulação de pastas e listagem de arquivos

```
File path = new File("c:\\temp");

File[] folders = path.listFiles(File::isDirectory);
System.out.println("FOLDERS:");
for (File folder : folders) {
    System.out.println(folder);
}

File[] files = path.listFiles(File::isFile);
System.out.println("FILES:");
for (File file : files) {
    System.out.println(file);
}

boolean success = new File(strPath + "\\subdir").mkdir();
System.out.println("Directory created successfully: " + success);
```

`File path = new File("c:\\temp");` = Cria um objeto _File_ para o caminho inicial que será usado.

`path.listFiles()` = Retorna uma lista de objetos de acordo com o parametro passado.

`File[] folders = path.listFiles(File::isDirectory);` = Cria uma lista de objetos com a referencia das pastas no caminho origem 

`File[] files = path.listFiles(File::isFile);` = Cria uma lista de objetos com a referencia dos arquivos no caminho origem 