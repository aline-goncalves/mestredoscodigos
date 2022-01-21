
/*
É comum a necessidade de armazenamento de variáveis em memória sequencial. 
O Java permite esta implementação com o uso de arrays. 
Mostre, por meio de algoritmos, utilizando no mínimo dois tipos primitivos 
e dois tipos não primitivos (classes wrappers), como podemos:

 - Declarar um array;
 - Inicializar;
 - Acessar posições;
 - Percorrer um array.
*/
import java.util.Random;

public class TesteArrays {
    // declaração/instanciação:
    static int[] inteiro = new int[5];
    static double[] real = new double[5];
    static Integer inteiroWrapper[] = new Integer[5];
    static Double realWrapper[] = new Double[5];

    static Random gerador = new Random();

    public static void main(String[] args) {
        populaInt();
        populaDouble();
        exibeInt();
        System.out.println("###############################");
        exibeDouble();
        System.out.println("###############################");
        exibeIntWrapper();
        System.out.println("###############################");
        exibeDoubleWrapper();
        System.out.println("###############################");
        acessarPosicao(3);
    }

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

    //acessando uma posição do array
    public static void acessarPosicao(int x){
        System.out.println("# Exibindo posição " + x + " de cada Array: #");
        System.out.println("Posição[" + x + "] do vetor inteiro: " + inteiro[x]);
        System.out.println("Posição[" + x + "] do vetor Wrapper inteiro: " + inteiroWrapper[x]);
        System.out.println("Posição[" + x + "] do vetor double: " + real[x]);
        System.out.println("Posição[" + x + "] do vetor Wrapper double: " + realWrapper[x]);
    }
}
