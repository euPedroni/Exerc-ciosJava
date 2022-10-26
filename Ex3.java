package Execs;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int valor;

        System.out.print("Digite um valor: ");
        valor = entrada.nextInt();

        if (valor % 2 == 0) {

            System.out.println("Este número é par!");
        } else {

            System.out.println("Este número é ímpar!");
        }
        entrada.close();

    }
}
