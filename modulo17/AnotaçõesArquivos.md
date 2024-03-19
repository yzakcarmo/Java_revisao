# Try-with-resources
É um bloco try que declara um ou mais recursos, e garante que eles serão fechados ao final do bloco 
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

`String line = br.readLine()` = Lê a linha do arquivo e atribui na variavel `line`

# FileWriter e BufferedWriter
```
try(BufferedWriter bw = new BufferedWriter(new FileWriter(target))) {
    for(Product product : list) {
        bw.write(product.getName() + "," + String.format("%.2f", product.total()));
        bw.newLine();
    }
}
catch(IOException e) {
    System.out.println("Erro de escrita: " + e.getMessage());
}
```

FileWriter = Faz a escrita de caracteres no arquivo.

BufferedWriter = Faz mais rapido.

`new FileWriter(path)` = Cria/recria o arquivo

`new FileWriter(path,true)` = Acrescenta ao arquivo existente

`bw.write()` = Escreve o que for passado

`bw.newLine()` = Inicia uma nova linha no arquivo

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

`File path = new File("c:\\temp")` = Cria um objeto _File_ para o caminho inicial que será usado.

`path.getParent()` = Retorna em String o caminho acima do caminho definido.

`File[] folders = path.listFiles(File::isDirectory)` = Cria uma lista de objetos com a referencia das pastas no caminho definido 

`File[] files = path.listFiles(File::isFile)` = Cria uma lista de objetos com a referencia dos arquivos no caminho definido. 

`new File(path + "\\subdir").mkdir()` = Cria uma nova pasta no caminho definido.