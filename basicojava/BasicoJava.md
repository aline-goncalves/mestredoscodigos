## **O básico do Java**

**1. Vamos fazer uma viagem ao passado. O Java foi criado na década de 90. Vamos entender qual foi a motivação da criação da linguagem, seus principais conceitos e características e qual sua importância para o desenvolvimento de software. Faça, então, sua pesquisa e pontue seu entendimento sobre tudo isso.**   
&nbsp;

**2. No mundo Java existe uma sopa de letrinhas e siglas, mas algumas são fundamentais para o entendimento do propósito da linguagem. Vamos, então, aprender um pouco mais sobre a plataforma. Pesquise sobre e pontue o que cada palavra abaixo significa, onde e quando usamos e qual a importância de cada uma delas:**   
* **JVM:**  
*sigla para Java Virtual Machine, ou seja, a Máquina Virtual Java. Sua responsabilidade é executar o bytecode (.class)*  
* **JDK:**  
*sigla para Java Development Kit, ou seja, a Kit de Desenvolvimento Java. Possui a função de compilar o código-fonte (.java) em bytecode (.class)*   
* **JRE:**  
*sigla para Java Runtime Enviroment, ou seja, a Ambiente de Execução Java. É quem fornece as bibliotecas padrões Java a fim da compilação do código-fonte*
&nbsp;

**3. Para começarmos desenvolver em Java, precisamos de muito pouco. Basta um editor de texto, uma outra coisinha que você aprendeu na questão de número 2 e um terminal. Crie uma classe Java utilizando um editor qualquer. Esta classe deve ter um método main que imprima a frase “Hello World!”, para começarmos com o pé direito esta aventura de programação. Agora faça uma explanação sobre:**
* **O que você precisou para resolver esta questão?**       
    *As ferramentas JDK, JRE e JVM* 
   
* **O comando que você usou para compilar?**
    *javac HelloWorld.java -> onde 'HelloWorld.java' é o nome da classe Java criada. No Prompt de comando, acesse o diretório em que seu arquivo.java está localizado o arquivo contendo o código fonte java da classe executável .java está localizado (o arquivo contendo o código fonte java da classe executável). Após isso, basta digitar o comando “javac” seguido pelo nome do seu arquivo com a extensão .java. Exemplo: “javac Teste.java”, onde “Teste.java” é o nome do arquivo com o código fonte da classe executável (com o método principal). Para finalizar e executar o comando, pressione a tecla “Enter"*   
    
* **O comando que você usou para executar?**        
    *java HelloWorld -> onde 'HelloWorld' é o nome do bytecode gerado pelo JDK. Após a execução do comando explicado no item a, será criado automaticamente um arquivo .class, o qual permitirá a execução pela JVM. Para isso, ainda no Prompt de comando, permanecendo no diretório em que seu arquivo .java está localizado (o mesmo do arquivo .class), digite o comando “java” seguido pelo nome do arquivo gerado, dessa vez sem a sua extensão. Exemplo: “java Teste”, sendo o arquivo gerado o Teste.class* 

* **Qual é a estrutura miníma de uma classe Java?**     
    *A declaração da classe e o método main, conforme o exemplo:*   
    ```
        public class HelloWorld{
           public static void main (String args[]){
                
           }
        }
   ``` 
* **O que é o método main e qual a sua importância?**       
    *O método main tem a seguinte assinatura:*  
    ```
        public static void main (String args[]){
    ``` 
    *Analisando, podemos perceber que se trata de um método público, ou seja, pode ser utilizado por toda a aplicação. Estáico, ocupa um espaço fixo na memória do PC; Não possui retorno (void); possui 'main' como nome e possui um array de Strings como parâmetro. Esse parâmetro pode ser utilizado no momento da execução do bytecode. É esse método que inicializa roda a aplicação, por isso é famoso e importante.*    

* **O que é e em que momento da resolução da questão foi gerado o BYTECODE?**        
    *O bytecode foi gerado ao executar o comando 'javac HelloWorld.java'. É esse arquivo que a JVM executa, de modo a subir a aplicação. Esse processo é o que garante que o mesmo código-fonte pode ser executado em diferentes Sistemas Operacionais. O ByteCode é um arquivo gerado na compilação de um código fonte Java.Nesse arquivo, tem-se as instruções para a JVM rodar a aplicação.*
&nbsp;

**4. Durante muito tempo, uma das maiores dificuldades na hora de programar era o gerenciamento de memória. Os desenvolvedores eram responsáveis pela sua alocação e liberação manualmente, o que levava a muitos erros e memory leaks. Hoje, em todas as plataformas modernas (incluindo Java), temos gerenciamento de memória automático através de algoritmos de coleta de lixo. Pesquise sobre Garbage Collector e faça uma explanação de como este algoritmo funciona na plataforma Java. Também implemente dois algoritmos em Java: um que exemplifique um possível erro de OutOfMemoryError e outro que mostre os cuidados tomados para não acontecer este tipo de erro durante o desenvolvimento de software.**     
    *É uma aplicação associada a JMV e dinamiza o funcionamento do sistema porque é o processo responsável pela limpeza da memória principal. Como o nome sugere, o “coletor de lixo” remove os objetos que não estão sendo mais utilizados e o faz no momento que esses perdem a referência.*
