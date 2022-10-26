package Execs;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("""
                --------------------
                         MENU
                 1 - Bolo de cenoura -> 450 calorias
                 2 - Marmitex -> 1400 calorias
                 3 - Pizza -> 2000 calorias
                --------------------
                """);

        int b = 450;
        int m = 1400;
        int p = 2000;

        System.out.print("O que deseja? ");
        int escolha = entrada.nextInt();
        switch (escolha){
            case 1:
                System.out.printf("Você escolheu bolo de cenoura! Que possui %d calorias",b);
            break;
                case 2:
                System.out.printf("Você escolheu marmitex! Que possui %d calorias", m);
           break;
            case 3:
                System.out.printf("Você escolheu Pizza! Que possui 2000", p);
            break;
        }

    }
}
