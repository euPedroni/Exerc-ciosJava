package Execs;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int maiorNum;
        int menorNum;
        int num;
        System.out.print("Digite o primeiro número: ");
        num = entrada.nextInt();
        maiorNum = num;
        menorNum = num;

    for (int i = 0; i < 9; i++){
        System.out.println("Digite um número: ");
         num = entrada.nextInt();
        if (num > maiorNum){

            maiorNum = num;
        } else if (num < menorNum){
            menorNum = num;
        }
    }
        System.out.printf("O maior número digitado foi %d!\n",maiorNum);
        System.out.printf("O menor número digitado foi %d!",menorNum);

    entrada.close();

    }
}
