## **Trabalhando com tipos de dados**

**1. O Java possui vários tipos de dados primitivos para resolvermos diversos problemas e, para cada tipo primitivo, existe uma classe *WRAPPER*. Pontue:**
- **Diferença entre os tipos primitivos e as classes *Wrapper*;**   
&nbsp;*Tipos primitivos são tipos de variáveis mais utilizados em métodos simples e laços de repetição. Seu processamento é mais rápido e consome menos memória quando comparados às classes* Wrappers.

&nbsp;*Cada tipo primitivo possui sua classe* Wrapper, *a qual disponibiliza métodos e a possibilidade de utilização de recursos impossíveis com os tipos primitivos.* Wrappers *são mais utilizados em casos mais complexos, e compõem o pacote* java.lang, *que é importado por padrão em todos programas Java.*

&nbsp;*Por se tratarem de classes, é possivel a criação de um objeto do tipo* Wrapper, *logo, adicioná-lo a um* ArrayList *ou a um* HashMap. *Também é possível invocar um método de sua classe, como por exemplo, converter tipos, realizar comparações e operações matemáticas.*

- **Quais são os tipos primitivos e suas classes *Wrapper*;**

<center>
<table>
    <tr>
        <td><b>Tipos Primitivos</b></td>
        <td><b>Classes Wrapper</b></td>
    </tr>
     <tr>
        <td>boolean</td>
        <td>Boolean</td>
    </tr>
     <tr>
        <td>byte</td>
        <td>Byte</td>
    </tr>
     <tr>
        <td>char</td>
        <td>Character</td>
    </tr>
     <tr>
        <td>int</td>
        <td>Integer</td>
    </tr>
     <tr>
        <td>float</td>
        <td>Float</td>
    </tr>
         <tr>
        <td>double</td>
        <td>Double</td>
    </tr>
     <tr>
        <td>long</td>
        <td>Long</td>
    </tr>
     <tr>
        <td>short</td>
        <td>Short</td>
    </tr>
</table>
</center>

- **Qual o valor default de cada tipo primitivo e de cada classe *Wrapper*;**
*Valor* default *dos tipos primitivos:*
<center>
<table>
    <tr>
        <td><b>Tipos Primitivos</b></td>
        <td><b>Valor Default</b></td>
    </tr>
     <tr>
        <td>boolean</td>
        <td>false</td>
    </tr>
     <tr>
        <td>byte</td>
        <td>0</td>
    </tr>
     <tr>
        <td>char</td>
        <td>\u0000 ou 0</td>
    </tr>
     <tr>
        <td>int</td>
        <td>0</td>
    </tr>
     <tr>
        <td>float</td>
        <td>0.0f</td>
    </tr>
         <tr>
        <td>double</td>
        <td>0.0d</td>
    </tr>
     <tr>
        <td>long</td>
        <td>0L</td>
    </tr>
     <tr>
        <td>short</td>
        <td>0</td>
    </tr>
</table>
</center>

*Valor* default *das classes* Wrapper: *se tratando de classes, logo sua utilização está relacionada à declaração de um objeto. Sendo assim, o valor padrão é* null.

- **Como consigo converter cada tipo primitivo em uma classe *Wrapper* e como consigo converter cada classe *Wrapper* em um tipo primitivo;**
<center>
<table>
    <tr>
        <td><b>Tipos Primitivos em Wrappers</b></td>
        <td><b>Wrappers em Tipos Primitivos</b></td>
    </tr>
     <tr>
        <td>boolean</td>
        <td>Boolean</td>
    </tr>
     <tr>
        <td>byte</td>
        <td>Byte</td>
    </tr>
     <tr>
        <td>char</td>
        <td>Character</td>
    </tr>
     <tr>
        <td>int</td>
        <td>Integer</td>
    </tr>
     <tr>
        <td>float</td>
        <td>Float</td>
    </tr>
         <tr>
        <td>double</td>
        <td>Double</td>
    </tr>
     <tr>
        <td>long</td>
        <td>Long</td>
    </tr>
     <tr>
        <td>short</td>
        <td>Short</td>
    </tr>
</table>
</center>

- **Um exemplo de utilização de cada tipo durante o desenvolvimento de *software*.**  


**2. Qualquer programa de computador precisa manter informações de alguma forma. Assim, as linguagens de programação permitem a criação de variáveis. Pontue:**
- **Declaração de variáveis com inicialização implícita;**
- **Declaração de variáveis com inicialização explícita;**
- **Obrigatoriedade de inicialização de variáveis no Java;**
- **Como funciona o escopo de variáveis no Java;**
- **Quando utilizar a palavra reservada final na declaração de uma variável.**  


**3. Um dos tipos mais utilizados na plataforma Java é o tipo *String*, com S maiúsculo. Strings em Java são objetos ou instâncias da classe *java.lang.String* que devem ser declaradas e instanciadas. Vamos, então, concentrar nossa energia no estudo deste tipo tão importante. Crie exemplos utilizando String mostrando:**
- **Como criamos um objeto do tipo *String*;**
- **Como podemos concatenar uma *String*;**
- **Quais os principais comportamentos de uma *String*;**
- **Como trabalhamos com *String* utilizando as classes *StringBuilder* e *StringBuffer*, pontuando a diferença entre elas e qual a importância de usá-las;**
- **Como transformamos *String* em outro tipo de dado;**
- **Como podemos transformar qualquer tipo de dado em uma *String*.** 


**4. Trabalhar com sistemas que manipulam valores decimais é uma tarefa crítica e que deve exigir o máximo de atenção do desenvolvedor. Trabalhar com *Double* pode trazer uma certa dificuldade quando precisamos de precisão em operações matemáticas de valores decimais. Uma alternativa para resolver esse problema é utilizar a classe *BigDecimal*, que trabalha com pontos flutuantes de precisão arbitrária, conseguindo estipular o nível de precisão do valor. Diante disso, vamos aprender a trabalhar com esta classe. Faça exemplos de algoritmo que:**
- **Converta uma *String* para *BigDecimal*;**
- **Converta um *Double* para *BigDecimal*;**
- **Execute as operações matemáticas de subtração, adição, divisão, multiplicação e potência de números decimais, demostrando diferentes estratégias de arredondamento em todas as operações;**
- **Faça a comparação entre 2 objetos to tipo *BigDecimal*.** 


**5. No Java 8 foi introduzida uma nova API para manipulação de datas e horas. Vamos entender quais classes e métodos foram incluídos. Faça uma pesquisa sobre as classes listadas abaixo e mostre, por meio de algorítimos, onde cada uma pode ser usada e como podemos criar objetos de datas, manipular datas, extrair partes de datas, realizar comparações entre datas, alterar datas e converter entre os diversos tipos de datas listadas:**
- ***LocalDate*;**
- ***LocalTime*;**
- ***LocalDateTime*;**
- ***MonthDay*;**
- ***YearMonth*;**
- ***Period*.**   


**6. É comum a necessidade de armazenamento de variáveis em memória sequencial. O Java permite esta implementação com o uso de arrays. Mostre, por meio de algoritmos, utilizando no mínimo dois tipos primitivos e dois tipos não primitivos (classes *wrappers*), como podemos:**
- **Declarar um *array*;**
- **Inicializar;**
- **Acessar posições;**
- **Percorrer um *array*.**   
