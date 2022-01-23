package classesJava;
import java.util.Random;

public class TesteFor{
    static Random gerador = new Random();
    public static void main(String[] args) {
        int[] numeros = new int[5];

        for(int j = 0; j < 5; j++){
            numeros[j] = gerador.nextInt();
        }

        for(int i : numeros){
            System.out.println(i);
        }
    }
}