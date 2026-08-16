package Exercicios;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
/*
LINK DA QUESTÃO
https://neps.academy/exercise/396
*/
public class neps_10 {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> listaPosicoes = new ArrayList<>();
        for(int i = 0; i < 10;i++){
            int valores = obj.nextInt();
            lista.add(valores);
        }
        int valorDesejado = obj.nextInt();
        int quantValor = Collections.frequency(lista, valorDesejado);
        if(quantValor == 0){
            System.out.println("Mia x");
        }else{
            for(int i = 0; i< 10; i++){
                if(lista.get(i) == valorDesejado){
                    listaPosicoes.add(i);
                }
            }
            System.out.println(quantValor);
            for(int i = 0; i < quantValor; i++){
                System.out.print(listaPosicoes.get(i)+" ");
            }

        }

        }
    }


