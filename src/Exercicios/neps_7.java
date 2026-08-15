package Exercicios;
import java.util.Scanner;

/*
LINK DA QUESTÃO
https://neps.academy/exercise/225
*/
public class neps_7 {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int estouro = obj.nextInt();
        String[] operacao = new String[3];
        for(int i = 0; i< 3;i++){
            String calc = obj.next();
            operacao[i] = calc;
        }
        if(operacao[1].equals("*")){
            int resultadoOperacao = Integer.parseInt(operacao[0])*Integer.parseInt(operacao[2]);
            if(resultadoOperacao > estouro){
                System.out.println("OVERFLOW");
            }else{
                System.out.println("OK");
            }
        }
        else if(operacao[1].equals("+")){
            int resultadoOperacao = Integer.parseInt(operacao[0])+Integer.parseInt(operacao[2]);
            if(resultadoOperacao > estouro){
                System.out.println("OVERFLOW");
            }else{
                System.out.println("OK");
            }
        }
    }
}
