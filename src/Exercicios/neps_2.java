package Exercicios;
import java.util.Scanner;

/*
LINK DA QUESTÃO
https://neps.academy/exercise/144
*/

public class neps_2 {
    void main(){
        double pi = 3.1416;
        Scanner obj = new Scanner(System.in);
        int raio = obj.nextInt();
        double calc = pi*(raio*raio);
        System.out.printf("%.2f",calc);


    }
}