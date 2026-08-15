package Exercicios;
import java.util.Scanner;

/*
LINK DA QUESTÃO
https://neps.academy/exercise/146
*/
public class neps_4 {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int x = obj.nextInt();
        int y = obj.nextInt();
        if(x > 0 && y > 0){
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        }else if (x < 0 && y < 0) {
            System.out.println("Q3");
        }else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }else{
            System.out.println("eixos");
        }
    }
}
