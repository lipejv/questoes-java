package Exercicios;
import java.util.Scanner;

/*
LINK DA QUESTÃO
https://neps.academy/exercise/324
*/
public class neps_3 {
    public static void main(String[] args)
    {
        int coposQuebrados = 0;
        Scanner obj = new Scanner(System.in);
        int loop = obj.nextInt();
        for (int i = 0; i < loop; i++) {
            int latas = obj.nextInt();
            int copos = obj.nextInt();
            if(latas > copos){
                coposQuebrados +=copos;
            }
        }
        System.out.println(coposQuebrados);
    }
}
