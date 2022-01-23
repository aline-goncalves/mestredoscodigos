## **Trabalhando com laços de repetição**   

**7. Quando estamos desenvolvendo um *software*, por vários momentos surge a necessidade de executar uma parte do código várias vezes, como uma repetição. O Java oferece alguns tipos de laços de repetição para o programador escolher, então pesquise sobre o assunto e:**

- **Faça um algoritmo demonstrando o funcionamento dos laços de repetição *while, for, enhanced - for* e *do/while*;**
- **Faça uma comparação entre os tipos de laços;**
- **Demostre por meio de um algoritmo o funcionamento do *break* e do continue em laços de repetição.**      

&nbsp;*O* 'while' *é executado somente e enquanto sua condição* boolean *for verdadeira. Ao escrever o código, não se sabe a quantidade de vezes que a repetição será executada ou se será executada. **Exemplo:*** 
```
    while(<condicao boolean>){
        //bloco de comando
        //não esquecer de considerar a condição boolean
    }  
```     

&nbsp;*O* 'do/while' *obriga o bloco de comando ser executado pelo menos uma vez e, a partir dessa execução, tem-se a possibilidade de continuar a repetição ou não, até quando a condição* boolean *definida no* while. *for satisfeita. Também não é sabido a quantidade de vezes que a repetição será executada durante o desenvolvimento, ou se será executada alguma vez. **Exemplo:***    
```
    do{
        //bloco de comando
        //não esquecer de considerar a condição boolean
    }while(<condicao boolean>);
```

&nbsp;*O* 'for' *é uma estrutura de repetição dependente de uma variável de controle. Com base nela é executado, exatamente, a quantidade de vezes determinada (a menos que tenha alguma condição no bloco que altere a variável de controle). Sua estrutura possui 3 argumentos: declaração e inicialização da variável de controle; condição de até quando o bloco de comando será executado, com base na variável de controle; incrimento da variável de controle, ao final de cada execução. **Exemplo:***  
```
    for(int i = 0; i < 5; i++){
        //bloco de comando
    }
```

&nbsp;*O* 'enhanced - for' *tem seu controle com base em um* Array, *ou seja, sua "variável" de controle é, na verdade, um objeto do tipo do* Array, *e o incremento é a atribuição das posições do* Array *para o objeto criado. Dessa forma, a repetição se dá percorrendo o vertor. **Exemplo:***  
```
    ArrayList<Pessoa> pessoas = new ArrayList<>();
    int[] numeros = new int[5];
    
    for(Pessoa p : pessoas){
        //bloco de comando
    }

    for(int i : numeros){
        //bloco de comando
    }
```

 - ***Comandos:* break *e* continue:**  

*O comando* 'break' *interrompe o laço de repetição ou a estrutura condicional* switch, *saindo do laço. Já o* 'continue', *interrompe apenas a interação atual, deixando de executar as linhas de código abaixo dele. Utilizando esses comandos, pode-se manipular o laço de repetição otimizando o tempo de execução **Exemplo:***   

*Algoritmo que verifica se entre os números 1 e 1.000.000 existe um mínimo múltiplo comum entre 17 e 19. Caso exista, o imprima (e só imprima o menor). Sem os comandos* 'break' *e* 'continue' *o algoritmo teria que testar cada número do intervalo, dividindo-os por 17 e 19 e comparando o resto da divisão. Porém, com os comandos citados, pode-se resumir a quantidade de testes feitos, pois assim que encontrasse o número procurado, o laço de repetição seria interrompido. Além disso, é possível otimizar ainda mais realizando uma dupla verificação, onde só iria testar a divisão por 17 e 19 nos números ímpares (o múltiplo de 17 e 19 deve ser ímpar).*
```
    public class ContinueBreakTest {
        public static void main(String[] args) {        
            for(int i=1 ; i <=1000000; i++){
                if(i % 2 == 0){
                    continue; 
                    /*nesse caso, a iteração é interrompida, de modo que o próximo condicional não seja executado, 
                    pois significa que se trata de um número par, o qual não pode ser múltiplo de 17 e 19.*/
                }

                if((i % 17 == 0) && (i % 19 == 0)){
                    System.out.println("Mínimo múltiplo comum entre 17 e 19: " + i);
                    break;
                    /*nesse caso, o laço de repetição é interrompido. Como o programa não tem outras funcionalidades,
                    ele também é interrompido. Assim, após ter encontrado o mínimo múltiplo comum entre 17 e 19, não
                    há motivos para continuar as verificações.*/
                }
                
            }
        }    
    }
```
