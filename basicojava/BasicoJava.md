## **O básico do Java**

**1. Vamos fazer uma viagem ao passado. O Java foi criado na década de 90. Vamos entender qual foi a motivação da criação da linguagem, seus principais conceitos e características e qual sua importância para o desenvolvimento de software. Faça, então, sua pesquisa e pontue seu entendimento sobre tudo isso.**   
&nbsp;

#### **Hisórico da linguagem**  
*A liguagem Java foi criada em 1991 na empresa Sun Microsystems, a qual pertence à Oracle atualmente. Foi resultado do* Green Project *

&nbsp;
#### **Motivação da criação da linguagem**  
*O objetivo inicial não era a criação de uma linguagem e sim, permitir a comunicação entre aparelhos eletrônicos. 
Com isso, os criadores perceberam que não poderiam ficar presos a sistemas operacionais. Assim, o Java foi projetado para permitir o desenvolvimento de aplicações portáteis, de alto desempenho, e para uma ampla variedade de plataformas de computação.*

&nbsp;
#### **Suas principais características**    
- *Orientação a objetos: o que permite a herança, abstração, polimorfismo, encapsulamento e outros conceitos que visam a reutilização de códigos de forma dinâmica e estática*;
- *Portabilidade: aplicações Java são completamente independentes dos sistemas operacionais (SO). Isso pois essas aplicações são executadas pela Java* Virtual Machine *(JVM), a qual sim, precisa ser compatível com o SO*;
- *Segurança: pode-se dizer que a segurança em Java é pautada em dois níveis:*
***Proteção de* hardware** *através da proteção da memória RAM, isso
porque no Java não há a possibilidade da implementação de “ponteiros”. O que
promove a integridade ao gerenciar a memória principal e evita a alocação de
um espaço que está sendo utilizado por outra aplicação.
E a* ***proteção de* software** *é apurada pela grande quantidade de APIs
fornecidas nas bibliotecas nativas do Java. Códigos que já foram testados e
melhorados, permitindo uma menor chance de erros durante o
desenvolvimento de um sistema que as utilizem*;
- *Variedade de* Frameworks *e bibliotecas: o que facilita o desenvolvimento na linguagem Java, e contrubui para uma maior segurança e clareza do código, devido ao reaproveitamento de códigos já testados e utilizados diversas vezes*;
- Multithreading: *a linguagem Java permite o desenvolvimento de sistemas* multithreading, *ou seja, capazes de lidar com tarfeas e acessos simultâneos*;
- Garbage Collector: *um recurso da linguagem que remove os objetos que não estão sendo mais
utilizados e o faz no momento que esses perdem a referência*;
- *Acoplamento: é o quanto um módulo depende do outro para realizar sua função. Quanto menor o acoplamento dos módulos, mais flexível e reutilizável o código*;
- *Coesão: divisão dos sistemas em módulos com pequenas responsabilidades, o que facilita a manutenção e evita "efeitos colaterais". Esses módulos possuem uma relação forte e visam o mesmo objetivo*.

&nbsp;
#### **Sua importância para o desenvolvimento de *software***   
- *Java não é apenas uma linguagem de programação, é também uma plataforma de desenvolvimento;*
- *Com a linguagem Java, é possível desenvolver muitos tipos de aplicações* (desktop, web, mobile, *televisões digitais e outras);*
- *Java é base para muitas aplicações em rede;*
- *Possui comunidades muito fortes, que incentivam e apoiam o estudo da linguagem. Essas comunidades promovem encontros regionais, palestras, minicursos e trocas de experiências entre os membros;*
- *A máquina virtual Java roda outras linguagens (cerca de 350 linguagens);*
- *O Java foi testado, refinado, estendido e comprovado por uma comunidade dedicada de desenvolvedores, arquitetos e entusiastas;*
- *Ao viabilizar o desenvolvimento de aplicações para ambientes heterogêneos, as empresas se tornam aptas a fornecer mais serviços, aumentar a produtividade, a comunicação e a colaboração com o usuário final;*
- *A Oracle Academy disponibiliza um portfólio vasto de* softwares, *conteúdos, tecnologias, treinamentos, suportes, um site do desenvolvedor do Java, onde os inscritos recebem* newsletters *voltadas para a tecnologia, cursos e certificações virtuais pela* Web *ou presenciais.*

&nbsp;
### **Referências**

**A importância da programação Java no campo da Informática.** Disponível em: <http://ptcomputador.com/P/java-programming/89645.html>

FILGUEIRAS, Fellipe. **Java – a origem.** 2015. Disponível em: <https://tableless.com.br/java-origem/>

**Java | Características e plataformas.** 2017. Disponível em: <https://www.formabase.com/java-carateristicas-plataformas/>

**Obtenha Informações sobre a Tecnologia Java.** Oracle. Disponível em: <https://www.java.com/pt-BR/about/>

**O que é Java? Conheça as particularidades dessa linguagem de programação.** Rock Content. 2019. Disponível em: <https://rockcontent.com/br/blog/o-que-e-java/#qual>

PALMEIRA, Thiago Vinícius Varallo. **Java: história e principais conceitos.** 2012. Disponível em: <https://www.devmedia.com.br/java-historia-e-principais-conceitos/25178>

PACIEVITCH, Yuri. **História do Java.** Disponível em: <https://www.infoescola.com/informatica/historia-do-java/>

SANTANA, Otávio Gonçalves de. **Por que java?** 2011. Disponível em: <https://www.devmedia.com.br/por-que-java/20384>

&nbsp;

**2. No mundo Java existe uma sopa de letrinhas e siglas, mas algumas são fundamentais para o entendimento do propósito da linguagem. Vamos, então, aprender um pouco mais sobre a plataforma. Pesquise sobre e pontue o que cada palavra abaixo significa, onde e quando usamos e qual a importância de cada uma delas:**   
* **JVM:**  
*sigla para Java Virtual Machine, ou seja, a Máquina Virtual Java. Sua responsabilidade é executar o bytecode (.class), de modo que a aplicação possa ser utilizada pelo usuário final;*  
* **JDK:**  
*sigla para Java Development Kit, ou seja, o Kit de Desenvolvimento Java. Possui a função de compilar o código-fonte (.java) em bytecode (.class), transformando o código-fonte em uma aplicação;*   
* **JRE:**  
*sigla para Java Runtime Enviroment, ou seja, a Ambiente de Execução Java. É quem fornece as bibliotecas padrões Java a fim da compilação do código-fonte.*
&nbsp;

**3. Para começarmos desenvolver em Java, precisamos de muito pouco. Basta um editor de texto, uma outra coisinha que você aprendeu na questão de número 2 e um terminal. Crie uma classe Java utilizando um editor qualquer. Esta classe deve ter um método main que imprima a frase “Hello World!”, para começarmos com o pé direito esta aventura de programação. Agora faça uma explanação sobre:**
* **O que você precisou para resolver esta questão?**       
    *As ferramentas: JDK (Java Development Kit), JRE (Java Runtime Enviroment) e JVM (Java Virtual Machine).* 
   
* **O comando que você usou para compilar?**
    *javac HelloWorld.java -> onde 'HelloWorld.java' é o nome da classe Java criada. No Prompt de comando, foi acessado o diretório em que meu arquivo.java está localizado. Nesse arquivo contém o código-fonte java da classe executável (.java). Após isso, bastou digitar o comando “javac” seguido pelo nome do meu arquivo com a extensão .java e pressionar a tecla “Enter". Exemplo: “javac Teste.java”, onde “Teste.java” é o nome do arquivo com o código fonte da classe executável.*   
    
* **O comando que você usou para executar?**        
    *java HelloWorld -> onde 'HelloWorld' é o nome do bytecode gerado pelo JDK. Após a execução do comando explicado no item anterior, foi criado automaticamente um arquivo .class, o qual permitirá a execução pela JVM. Para isso, ainda no Prompt de comando, permanecendo no diretório em que meu arquivo .java está localizado (o mesmo do arquivo .class), digitei o comando “java” seguido pelo nome do arquivo gerado, dessa vez sem a sua extensão. Exemplo: “java Teste”, sendo o arquivo gerado o Teste.class.* 

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
        
        }
    ``` 
    *Analisando, podemos perceber que se trata de um método público, ou seja, pode ser utilizado por toda a aplicação. Estático, pois ocupa um espaço fixo na memória do computador; Não possui retorno (void); seu nome é 'main' e tem um array de Strings como parâmetro. Esse parâmetro pode ser utilizado no momento da execução do bytecode para inserção de dados no programa. É esse método que inicializa (executa) a aplicação, por isso é 'famoso' e importante.*    

* **O que é e em que momento da resolução da questão foi gerado o BYTECODE?**        
    *O bytecode possui a extensão .class e foi gerado ao executar o comando 'javac HelloWorld.java'. Esse passo é chamado de compilação. É nesse arquivo que contém as instruções para a JVM rodar a aplicação. Isso garante que o mesmo código-fonte possa ser executado em diferentes Sistemas Operacionais, pois o bytecode sempre será utilizado apenas pela JVM.*
&nbsp;

**4. Durante muito tempo, uma das maiores dificuldades na hora de programar era o gerenciamento de memória. Os desenvolvedores eram responsáveis pela sua alocação e liberação manualmente, o que levava a muitos erros e memory leaks. Hoje, em todas as plataformas modernas (incluindo Java), temos gerenciamento de memória automático através de algoritmos de coleta de lixo. Pesquise sobre Garbage Collector e faça uma explanação de como este algoritmo funciona na plataforma Java. Também implemente dois algoritmos em Java: um que exemplifique um possível erro de OutOfMemoryError e outro que mostre os cuidados tomados para não acontecer este tipo de erro durante o desenvolvimento de software.**     
    &nbsp;&nbsp;&nbsp;*O* Garbage Collector *é uma aplicação associada a JMV e dinamiza o funcionamento do sistema. Isso ocorre porque o* Garbage Collector *é responsável pela limpeza da memória principal. Como o nome sugere, o “coletor de lixo” remove os objetos que não estão sendo mais utilizados e o faz no momento que esses perdem a referência.*
