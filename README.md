# Java Graphs

> Demonstração do uso da lib JFreeChart e do design patterns Strategy para alternar entre a criação de gráficos dos tipos barra e pizza em aplicações Java.

## Baixando a lib

Acesse o site oficial do JFreeChart clicando [aqui](http://www.jfree.org/jfreechart/).

Clique em `Download`.

Será exibido uma lista com as versões disponíveis para download.
Neste projeto a versão escolhida foi a `1.0.19`.
```
../
1.0.14/                                           2011-11-21 07:35         -      
1.0.15/                                           2013-07-05 07:27         -      
1.0.17/                                           2014-02-11 14:27         -      
1.0.18/                                           2014-07-24 08:53         -      
1.0.19/                                           2014-07-31 12:34         -      
1.5.0/                                            2017-11-05 11:58         -      
maven-metadata.xml                                2017-11-05 12:00       486      
maven-metadata.xml.md5                            2017-11-05 12:00        32      
maven-metadata.xml.sha1                           2017-11-05 12:00        40  
```

Será exibido uma lista com os tipos de arquivos disponíveis.
```
../
jfreechart-1.0.19-javadoc.jar                     2014-07-31 12:34   5206678      
jfreechart-1.0.19-javadoc.jar.asc                 2014-07-31 12:34       536      
jfreechart-1.0.19-javadoc.jar.asc.md5             2014-07-31 12:34        32      
jfreechart-1.0.19-javadoc.jar.asc.sha1            2014-07-31 12:34        40      
jfreechart-1.0.19-javadoc.jar.md5                 2014-07-31 12:34        32      
jfreechart-1.0.19-javadoc.jar.sha1                2014-07-31 12:34        40      
jfreechart-1.0.19-sources.jar                     2014-07-31 12:34   2006715      
jfreechart-1.0.19-sources.jar.asc                 2014-07-31 12:34       536      
jfreechart-1.0.19-sources.jar.asc.md5             2014-07-31 12:34        32      
jfreechart-1.0.19-sources.jar.asc.sha1            2014-07-31 12:34        40      
jfreechart-1.0.19-sources.jar.md5                 2014-07-31 12:34        32      
jfreechart-1.0.19-sources.jar.sha1                2014-07-31 12:34        40      
jfreechart-1.0.19.jar                             2014-07-31 12:34   1565065      
jfreechart-1.0.19.jar.asc                         2014-07-31 12:34       536      
jfreechart-1.0.19.jar.asc.md5                     2014-07-31 12:34        32      
jfreechart-1.0.19.jar.asc.sha1                    2014-07-31 12:34        40      
jfreechart-1.0.19.jar.md5                         2014-07-31 12:34        32      
jfreechart-1.0.19.jar.sha1                        2014-07-31 12:34        40      
jfreechart-1.0.19.pom                             2014-07-31 12:34      9574      
jfreechart-1.0.19.pom.asc                         2014-07-31 12:34       536      
jfreechart-1.0.19.pom.asc.md5                     2014-07-31 12:34        32      
jfreechart-1.0.19.pom.asc.sha1                    2014-07-31 12:34        40      
jfreechart-1.0.19.pom.md5                         2014-07-31 12:34        32      
jfreechart-1.0.19.pom.sha1                        2014-07-31 12:34        40 
```

Baixe o `jfreechart-1.0.19.jar`.

## Adicionando a lib ao projeto

Este projeto foi desenvolvido no Netbeans, então os passos para se associar o JFreechart ao projeto será conforme esta IDE.
<img src="/img/netbeans.png">

Crie um diretório e descompacte o arquivo `jfreechart-1.0.19.jar`. Esta diretório será usado para o projeto consumir a lib.
<img src="/img/dir1.png">

Dentro do Netbeans, clique com o botão direito do mouse sobre o projeto e escolha `Propriedades`. Será aberta uma nova janela.
<img src="/img/janela.png">

Em categorias, selecione `Biblioteca` e depois em `Adicionar JAR/Pasta`   
<img src="/img/add.png">

Na janela que abrir, navegue ate a pasta onde descompactou o JFreeChart.
<img src="/img/dir2.png">

Acesse o diretório `lib` e dentro dele selecione os arquivos `jcommon-1.0.23`,`jfreechart-1.0.19` e `swtgraphics2d` e clique em Abrir.
<img src="/img/lib.png">

Observe que a pasta `Bibliotecas` do projeto contém os respectivos arquivos. Agora a lib está pronta para uso.

## Testando a lib

A exibição do grafico se feita ao executar a classe `TesteGrafico`.

```java
public class TesteGrafico {
    
    public static void main(String[] args){

        Grafico graf = new Grafico(15);
        
        graf.setQuantNumber(50);

        graf.setGraficBehavier(new GraficoPizza());  
    }
}
```

Instanciando classe grafico com 15 itens.
```java
Grafico graf = new Grafico(15);
```

Alterando a quantidade de itens no gráfico.
```java
graf.setQuantNumber(50);
```

Atribuindo comportamento de Pizza ao gráfico
```java
graf.setGraficBehavier(new GraficoPizza());
```

Atribuindo comportamento de Barra ao gráfico
```java
graf.setGraficBehavier(new GraficoDeBarra());
```

## Gráficos gerados 

### Pizza

<img src="/img/pizza.png" width="600" height="400">

### Barra

<img src="/img/barra.png" width="600" height="400">
