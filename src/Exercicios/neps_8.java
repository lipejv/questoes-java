package Exercicios;
import java.util.Scanner;

/*
LINK DA QUESTÃO
https://neps.academy/exercise/153
*/
public class neps_8 {
    public static void main(String[] args)
    {
        int contador = 0;
        Scanner obj = new Scanner(System.in);
        while (true){
            int valor = obj.nextInt();
            if(valor == 2018){
                break;
            }else{
                contador+=1;
            }
        }
        System.out.println(contador);
    }
}
