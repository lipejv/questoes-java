package Exercicios;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
LINK DA QUESTÃO
https://neps.academy/exercise/236
*/
public class neps_11 {
    public static void main(String[] args)
    {
        ArrayList<Integer> quadradoMagico = new ArrayList<>();
        Scanner obj = new Scanner(System.in);
        int quadrado = obj.nextInt();
        for(int i = 0; i < quadrado; i++){
            quadradoMagico.add(new int[quadrado]);
        }
        for(int i = 0; i < quadrado;i++){
            int[] linhasQuadrado = new int[quadrado];
            for(int n = 0; n < quadrado;n++){
                int num = obj.nextInt();
                quadradoMagico.add(i)[n] = num;
            }

        }
    }
}


