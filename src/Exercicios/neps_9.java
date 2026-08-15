package Exercicios;
import java.util.Scanner;

/*
LINK DA QUESTÃO
https://neps.academy/exercise/142
*/
public class neps_9 {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int horas = obj.nextInt();
        int minutos = obj.nextInt();
        int calculo = (horas*60)+minutos;
        System.out.println(calculo);
    }
}
