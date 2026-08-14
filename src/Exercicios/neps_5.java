package Exercicios;
import java.util.Scanner;

/*
LINK DA QUESTÃO
https://neps.academy/exercise/216
*/
public class neps_5 {
    void main()
    {
        Scanner obj = new Scanner(System.in);
        int valor = obj.nextInt();

        for(int i = 1; i <= valor;i++){
            if(valor % i == 0){
                System.out.print(i);
                System.out.print(" ");
            } else if (i == valor) {
                System.out.print(valor);
            }
        }
    }
}
