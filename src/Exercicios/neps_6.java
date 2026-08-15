package Exercicios;
import java.util.Arrays;
import java.util.Scanner;

/*
LINK DA QUESTÃO
https://neps.academy/exercise/176
*/
public class neps_6 {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int valores = obj.nextInt();
        int[] lista = new int[valores];
        for(int i = 0; i < valores; i++){
            int valorListado = obj.nextInt();
            lista[i] = valorListado;
        }
        Arrays.sort(lista);
        for(int i = 0; i < valores; i++){
            System.out.format("%d"+" ", lista[i] );

        }
    }
}
