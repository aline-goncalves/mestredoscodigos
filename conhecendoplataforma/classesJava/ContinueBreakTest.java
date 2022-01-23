package classesJava;
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
