## **Trabalhando com tipos de dados**

**1. O Java possui vários tipos de dados primitivos para resolvermos diversos problemas e, para cada tipo primitivo, existe uma classe _WRAPPER_. Pontue:**

- **Diferença entre os tipos primitivos e as classes _Wrapper_;**

&nbsp;_Tipos primitivos são tipos de variáveis mais utilizados em métodos simples e laços de repetição. Seu processamento é mais rápido e consome menos memória quando comparados às classes_ Wrappers.

&nbsp;_Cada tipo primitivo possui sua classe_ Wrapper, _a qual disponibiliza métodos e a possibilidade de utilização de recursos impossíveis com os tipos primitivos._ Wrappers _são mais utilizados em casos mais complexos, e compõem o pacote_ java.lang, _que é importado por padrão em todos programas Java._

&nbsp;_Por se tratarem de classes, é possivel a criação de um objeto do tipo_ Wrapper, _logo, adicioná-lo a um_ ArrayList _ou a um_ HashMap. _Também é possível invocar um método de sua classe, como por exemplo, converter tipos, realizar comparações e operações matemáticas._

- **Quais são os tipos primitivos e suas classes _Wrapper_;**

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

- **Qual o valor default de cada tipo primitivo e de cada classe _Wrapper_;**
_Valor_ default _dos tipos primitivos:_
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
        <td>pL</td>
    </tr>
     <tr>
        <td>short</td>
        <td>0</td>
    </tr>
</table>
</center>

_Valor_ default _das classes_ Wrapper: _se tratando de classes, logo sua utilização está relacionada à declaração de um objeto. Sendo assim, o valor padrão é_ null.

- **Como consigo converter cada tipo primitivo em uma classe _Wrapper_ e como consigo converter cada classe _Wrapper_ em um tipo primitivo;**
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

- **Um exemplo de utilização de cada tipo durante o desenvolvimento de _software_.**

**2. Qualquer programa de computador precisa manter informações de alguma forma. Assim, as linguagens de programação permitem a criação de variáveis. Pontue:**

- **Declaração de variáveis com inicialização implícita;**  
  &nbsp;_Declaração de variáveis com inicialização implícita é quando o valor é atribuído através do retorno de um método ou alguma expressão:_

```
    int x = 2 + 5;
    int y = soma(2,5);
```

- **Declaração de variáveis com inicialização explícita;**  
  &nbsp;_Declaração de variáveis com inicialização explícita é quando o valor é atribuído diretamente, como uma constante:_

```
    int x = 7;
```

- **Obrigatoriedade de inicialização de variáveis no Java;**  
  &nbsp;_Em Java, quando o código tenta utilizar uma variável que não foi inicializada, se torna impossível sua compilação._

- **Como funciona o escopo de variáveis no Java;**  
  &nbsp;_Geralmente os escopos são classificados em "global" e "local". Dessa forma, uma variável "global" pode ser utilizada por toda a classe e uma "local" apenas no bloco de comando em que é declarada. Porém, deve-se atribuir atenção à possibilidade de aninhamento de blocos de comando. Quando há esse fator, o que é declarado no bloco mais externo pode ser utilizado pelos blocos internos, porém o inverso não é verdadeiro._  
  &nbsp;_Além disso, o tempo de vida de uma variável está vinculado ao seu escopo. Ela é criada assim que seu escopo é atingido e destruída ao sair dele. Se a variável receber um inicializador, ela será reinicializada todas as vezes que o escopo for executado.E uma variável só é válida após sua declaração, de modo que, se for declarada ao fim de um método, não poderá ser utilizada._

- **Quando utilizar a palavra reservada _final_ na declaração de uma variável.**  
   &nbsp;_Quando é necessário atribuir valor à variável apenas uma única vez durante a execução do programa, utilizamos a palavra 'final' em sua declaração. Essa única atribuição pode ser na declaração ou em outra parte do código, dentro ou fora de um método (o que a difere de uma constante)._

**3. Um dos tipos mais utilizados na plataforma Java é o tipo _String_, com S maiúsculo. Strings em Java são objetos ou instâncias da classe _java.lang.String_ que devem ser declaradas e instanciadas. Vamos, então, concentrar nossa energia no estudo deste tipo tão importante. Crie exemplos utilizando String mostrando:**

- **Como criamos um objeto do tipo _String_;**  
  &nbsp;_A criação de um objeto do tipo String é idêntica a criação de uma variável. Segue um exemplo:_

```
    String exemploObjetoString;
```

- **Como podemos concatenar uma _String_;**  
  &nbsp;_Na linguagem java, pode-se concatenar uma String utilizando o método 'concat() da classe String ou o operador '+'._

```
    String string1 = "a", string2 = "b", string3 = "c";
    string1 = string1.concat(string2); // terá como valor 'ab'
    string3 = string1 + string3; // terá como valor 'abc'
```

- **Quais os principais comportamentos de uma _String_;**
  &nbsp;_._

- **Como trabalhamos com _String_ utilizando as classes _StringBuilder_ e _StringBuffer_, pontuando a diferença entre elas e qual a importância de usá-las;**  
  &nbsp;_Uma *String* é imutável. Quando atribuímos um novo valor a ela, na verdade estamos criando um novo objeto, substituindo a referência do antigo (que continua na memória)._  
  &nbsp;_Já o *StringBuilder* permite a real alteração do objeto e a concatenação de *Strings* é feita através do '*append(valor)*'. Dessa forma, pode-se dizer que a performance dele, em comparação com a concatenação de *Strings*, é melhor._  
  &nbsp;_O *StringBuffer* possui função e performance similares ao *StringBuilder*. A diferença entre eles é que o *StringBuffer* é sincronizado, permitindo uma maior consistência do código durante a execução de *threads* modificando a mesma *String*._

- **Como transformamos _String_ em outro tipo de dado;**  
  &nbsp;_Utilizando os métodos_ parse() _das classes_ Wrapper _:_

```
    String string1 = "1", string2 = "2";
    int soma = Integer.parseInt(string1) + Integer.parseInt(string2);
    //soma receberá o valor inteiro 3
```

- **Como podemos transformar qualquer tipo de dado em uma _String_.**  
  &nbsp;*Para converter outros tipos de dados em uma String, pode ser utilizado o método 'valueOf() da classe String, o método toString() presente nas classes *Wrapper* ou ainda utilizar concatenação. Exemplos:*

```
    String numero;
    int x;

    numero = String.valueOf(x);
    numero = Integer.toString(x);
    numero = "" + x;
```

**4. Trabalhar com sistemas que manipulam valores decimais é uma tarefa crítica e que deve exigir o máximo de atenção do desenvolvedor. Trabalhar com _Double_ pode trazer uma certa dificuldade quando precisamos de precisão em operações matemáticas de valores decimais. Uma alternativa para resolver esse problema é utilizar a classe _BigDecimal_, que trabalha com pontos flutuantes de precisão arbitrária, conseguindo estipular o nível de precisão do valor. Diante disso, vamos aprender a trabalhar com esta classe. Faça exemplos de algoritmo que:**

- **Converta uma _String_ para _BigDecimal_;**

```
    String numero = "0.000000000000000001";
    BigDecimal bigDecimal = new BigDecimal(numero);
```

- **Converta um _Double_ para _BigDecimal_;**

```
    Double numero = 0.0001;
    BigDecimal bigDecimal = new BigDecimal(numero);
```

- **Execute as operações matemáticas de subtração, adição, divisão, multiplicação e potência de números decimais, demostrando diferentes estratégias de arredondamento em todas as operações;**

```
    import java.math.BigDecimal;
    import java.math.RoundingMode;

    public class TesteBigDecimal{
        public static void main (String[] args){

            BigDecimal bigDecimal1 = new BigDecimal("10.2567");
            BigDecimal bigDecimal2 = new BigDecimal("2.236");

            System.out.println("                                                        ");
            System.out.println("--------------------------------------------------------");
            System.out.println("Soma BigDecimal： " + (bigDecimal1.add(bigDecimal2)));
            System.out.println("Soma BigDecimal (arredondando para valor mais próximo com 2 casas decimais)： "
                + (bigDecimal1.add(bigDecimal2)).setScale(2, RoundingMode.HALF_EVEN));
            System.out.println("Soma BigDecimal (arredondando para valor mais baixo com 2 casas decimais)： "
                + (bigDecimal1.add(bigDecimal2)).setScale(2, RoundingMode.HALF_DOWN));
            System.out.println("Soma BigDecimal (arredondando para valor mais alto com 2 casas decimais)： "
                + (bigDecimal1.add(bigDecimal2)).setScale(2, RoundingMode.UP));

            System.out.println("                                                        ");
            System.out.println("--------------------------------------------------------");
            System.out.println("Subtracao BigDecimal： " + (bigDecimal1.subtract(bigDecimal2)));
            System.out.println("Subtracao BigDecimal (arredondando para valor mais próximo com 2 casas decimais)： "
                + (bigDecimal1.subtract(bigDecimal2)).setScale(2, RoundingMode.HALF_EVEN));
            System.out.println("Subtracao BigDecimal (arredondando para valor mais baixo com 2 casas decimais)： "
                + (bigDecimal1.subtract(bigDecimal2)).setScale(2, RoundingMode.HALF_DOWN));
            System.out.println("Subtracao BigDecimal (arredondando para valor mais alto com 2 casas decimais)： "
                + (bigDecimal1.subtract(bigDecimal2)).setScale(2, RoundingMode.UP));

            System.out.println("                                                        ");
            System.out.println("--------------------------------------------------------");
            System.out.println("Multiplicacao BigDecimal： " + bigDecimal1.multiply(bigDecimal2));
            System.out.println("Multiplicacao BigDecimal (arredondando para valor mais próximo com 2 casas decimais)： "
                + (bigDecimal1.multiply(bigDecimal2)).setScale(2, RoundingMode.UP));
            System.out.println("Multiplicacao BigDecimal (arredondando para valor mais baixo com 2 casas decimais)： "
                + (bigDecimal1.multiply(bigDecimal2)).setScale(2, RoundingMode.HALF_DOWN));
            System.out.println("Multiplicacao BigDecimal (arredondando para valor mais alto com 2 casas decimais)： "
                + (bigDecimal1.multiply(bigDecimal2)).setScale(2, RoundingMode.UP));

            System.out.println("                                                        ");
            System.out.println("--------------------------------------------------------");
            System.out.println("Divisao BigDecimal： " + bigDecimal1.divide(new BigDecimal("2")));
            System.out.println("Divisao BigDecimal (arredondando para valor mais próximo com 2 casas decimais)： "
                + bigDecimal1.divide(new BigDecimal("2")).setScale(2, RoundingMode.UP));
            System.out.println("Divisao BigDecimal (arredondando para valor mais baixo com 2 casas decimais)： "
                + bigDecimal1.divide(new BigDecimal("2")).setScale(2, RoundingMode.HALF_DOWN));
            System.out.println("Divisao BigDecimal (arredondando para valor mais alto com 2 casas decimais)： "
                + bigDecimal1.divide(new BigDecimal("2")).setScale(2, RoundingMode.UP));

            System.out.println("                                                        ");
            System.out.println("--------------------------------------------------------");
            System.out.println("Potência BigDecimal： " + bigDecimal1.pow(2));
            System.out.println("Potência BigDecimal (arredondando para valor mais próximo com 2 casas decimais)： "
                + bigDecimal1.pow(2).setScale(2, RoundingMode.UP));
            System.out.println("Potência BigDecimal (arredondando para valor mais baixo com 2 casas decimais)： "
                + bigDecimal1.pow(2).setScale(2, RoundingMode.HALF_DOWN));
            System.out.println("Potência BigDecimal (arredondando para valor mais alto com 2 casas decimais)： "
                + bigDecimal1.pow(2).setScale(2, RoundingMode.UP));

        }

    }
```

- **Faça a comparação entre 2 objetos to tipo _BigDecimal_.**
```
    BigDecimal a = new BigDecimal(1);
    BigDecimal b = 	new BigDecimal(99999999.99);

    if(a.compareTo(b) > 0){
        System.out.println("a maior que b");

    }else if(a.compareTo(b) < 0){
        System.out.println("a menor que b");

    }else{
        System.out.println("a igual a b");
    }
```

**5. No Java 8 foi introduzida uma nova API para manipulação de datas e horas. Vamos entender quais classes e métodos foram incluídos. Faça uma pesquisa sobre as classes listadas abaixo e mostre, por meio de algorítimos, onde cada uma pode ser usada e como podemos criar objetos de datas, manipular datas, extrair partes de datas, realizar comparações entre datas, alterar datas e converter entre os diversos tipos de datas listadas:** ***LocalDate*; *LocalTime*; *LocalDateTime*; *MonthDay*; *YearMonth*; *Period*.**   
```
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.Period;

public class Teste{
	static LocalDate localDateHoje = LocalDate.now();
	static LocalDate localDateOntem = LocalDate.now().minusDays(1);
	static LocalTime localTime = LocalTime.now();
	static LocalDateTime localDateTime = LocalDateTime.now();
	static MonthDay monthDay = MonthDay.now();
	static YearMonth yearMonth = YearMonth.now();
	static Period period = Period.between(localDateHoje, localDateOntem); 
	static LocalDate localDate = LocalDate.now();

	public static void main (String [] args){
		System.out.println("localDateHoje " + localDateHoje);	
		System.out.println("localDateOntem " + localDateOntem);	
		System.out.println("localTime " + localTime);	
		System.out.println("localDateTime " + localDateTime);	
		System.out.println("monthDay " + monthDay);	
		System.out.println("yearMonth " + yearMonth);	
		System.out.println("period " + period);	

		//manipulando datas
		LocalDate localDateAmanha = localDateOntem.plusDays(2);
		System.out.println("localDateAmanha " + localDateAmanha);
		localDateTime = localDateTime.plusDays(1).plusMonths(1).plusHours(2);
		System.out.println("localDateTime " + localDateTime);	
		localDate = localDate.minusDays(1).plusMonths(5);
		System.out.println("localDate " + localDate);

		//extraindo partes de datas:
		int year = localDate.getYear();
		System.out.println("year " + year);
		String month = localDateTime.getMonth().toString();
		System.out.println("month " + month);
		int hour = localTime.getHour();
		System.out.println("hour " + hour);

		//realizando comparações entre datas: 
		boolean isAfter  = localDateHoje.isAfter(localDateOntem); //true
		System.out.println("isAfter " + isAfter);
		boolean isBefore = localDateHoje.isBefore(localDateOntem); //false
		System.out.println("isBefore " + isBefore);
		boolean isEqual  = localDateHoje.isEqual(localDateOntem); //false
		System.out.println("isEqual " + isEqual);
  
		//convertendo LocalDateTime em LocalDate e em LocalTime
		localDate = localDateTime.toLocalDate();
		System.out.println("localDate " + localDate);
		LocalTime localTime = localDateTime.toLocalTime();
		System.out.println("localTime " + localTime);
	}
}
```

**6. É comum a necessidade de armazenamento de variáveis em memória sequencial. O Java permite esta implementação com o uso de arrays. Mostre, por meio de algoritmos, utilizando no mínimo dois tipos primitivos e dois tipos não primitivos (classes _wrappers_), como podemos:**

- **Declarar um _array_;**
```
    // declaração/instanciação:
    static int[] inteiro = new int[5];
    static double[] real = new double[5];
    static Integer inteiroWrapper[] = new Integer[5];
    static Double realWrapper[] = new Double[5];
```

- **Inicializar;**
```
    // inicialização/população
    public static void populaInt() {
        for (int i = 0; i < 5; i++) {
            inteiro[i] = gerador.nextInt();
            inteiroWrapper[i] = gerador.nextInt();
        }
    }

    // inicialização/população
    public static void populaDouble() {
        for (int i = 0; i < 5; i++) {
            real[i] = gerador.nextDouble();
            realWrapper[i] = gerador.nextDouble();
        }
    }
```

- **Acessar posições;**
```
    //acessando uma posição do array
    public static void acessarPosicao(int x){
        System.out.println("# Exibindo posição " + x + " de cada Array: #");
        System.out.println("Posição[" + x + "] do vetor inteiro: " + inteiro[x]);
        System.out.println("Posição[" + x + "] do vetor Wrapper inteiro: " + inteiroWrapper[x]);
        System.out.println("Posição[" + x + "] do vetor double: " + real[x]);
        System.out.println("Posição[" + x + "] do vetor Wrapper double: " + realWrapper[x]);
    }
```

- **Percorrer um _array_.**
```
    // exibição/acesso as posições
    public static void exibeInt() {
        System.out.println("# Exibindo Array de números inteiros: #");
        for (int i = 0; i < 5; i++) {
            System.out.println("Posição[" + i + "] do vetor inteiro: " + inteiro[i]);
        }
    }

    // exibição/acesso as posições
    public static void exibeDouble() {
        System.out.println("# Exibindo Array de números reais: #");
        for (int i = 0; i < 5; i++) {
            System.out.println("Posição[" + i + "] do vetor double: " + real[i]);
        }
    }

    // exibição/acesso as posições
    public static void exibeIntWrapper() {
        System.out.println("# Exibindo Array Wrapper de números inteiros: #");
        for (int i = 0; i < 5; i++) {
            System.out.println("Posição[" + i + "] do vetor Wrapper inteiro: " + inteiroWrapper[i]);
        }
    }

    // exibição/acesso as posições
    public static void exibeDoubleWrapper() {
        System.out.println("# Exibindo Array Wrapper de números reais: #");
        for (int i = 0; i < 5; i++) {
            System.out.println("Posição[" + i + "] do vetor Wrapper double: " + realWrapper[i]);
        }
    }
```
