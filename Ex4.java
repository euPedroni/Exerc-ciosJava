package Execs;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = entrada.next();

        System.out.println("\nInforme sua idade: ");
        int idade = entrada.nextInt();

        if (idade > 18 && idade <= 65) {
            System.out.printf("%s, você tem %d anos e seu voto é obrigatório!", nome, idade);

        } else if (idade >= 16 && idade <= 18 || idade > 65) {
            System.out.printf("%s, você tem %d anos e seu voto não é obrigatório!", nome, idade);
        } else if (idade < 16) {
            System.out.printf("%s, você tem %d anos e ainda não pode ser eleitor!", nome, idade);
        }
        entrada.close();
    }
}
