package Execs;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha o produto ");
        System.out.println("""
                --------------------
                         MENU
                 1 - Celular -- R$ 1600
                 2 - Computador -- R$ 5000
                 3 - Mesa -- R$ 250
                --------------------
                """);
        System.out.print("Digite aqui: ");
        int escolha = entrada.nextInt();

        switch (escolha) {

            case 1:
                int cel = 1600;
                System.out.println("Celular -- R$ 1600");
                System.out.print("Digite quantas vezes deseja parcelar: ");
                int qtdParcela = entrada.nextInt();
                if (qtdParcela == 2) {

                    double vt = (cel + (cel * 0.025));
                    double parMensal = vt / qtdParcela;
                    System.out.println("Valor total : " + "R$ " + vt);
                    System.out.printf("Valor parcela: R$ %.2f ", parMensal);
                } else if (qtdParcela >= 3 && qtdParcela <= 5) {

                    double vt = (cel + (cel * 0.05));
                    double parMensal = vt / qtdParcela;
                    System.out.println("Valor total : " + "R$ " + vt);
                    System.out.printf("Valor parcela: R$ %.2f ", parMensal);
                } else if (qtdParcela >= 6 && qtdParcela <= 8) {

                    double vt = (cel + (cel * 0.075));
                    double parMensal = vt / qtdParcela;
                    System.out.println("Valor total : " + "R$ " + vt);
                    System.out.printf("Valor parcela: R$ %.2f ", parMensal);
                } else if (qtdParcela > 8) {

                    double vt = (cel + (cel * 0.095));
                    double parMensal = vt / qtdParcela;
                    System.out.println("Valor total : " + "R$ " + vt);
                    System.out.printf("Valor parcela: R$ %.2f ", parMensal);
                }
                break;
            case 2:
                int comp = 5000;
                System.out.println("Computador -- R$ 5000");
                System.out.print("Digite quantas vezes deseja parcelar: ");
                qtdParcela = entrada.nextInt();

                if (qtdParcela == 2) {

                    double vt = (comp + (comp * 0.025));
                    double parMensal = vt / qtdParcela;
                    System.out.println("Valor total : " + "R$ " + vt);
                    System.out.printf("Valor parcela: R$ %.2f ", parMensal);
                } else if (qtdParcela >= 3 && qtdParcela <= 5) {

                    double vt = (comp + (comp * 0.05));
                    double parMensal = vt / qtdParcela;
                    System.out.println("Valor total : " + "R$ " + vt);
                    System.out.printf("Valor parcela: R$ %.2f ", parMensal);
                } else if (qtdParcela >= 6 && qtdParcela <= 8) {

                    double vt = (comp + (comp * 0.075));
                    double parMensal = vt / qtdParcela;
                    System.out.println("Valor total : " + "R$ " + vt);
                    System.out.printf("Valor parcela: R$ %.2f ", parMensal);
                } else if (qtdParcela > 8) {

                    double vt = (comp + (comp * 0.095));
                    double parMensal = vt / qtdParcela;
                    System.out.println("Valor total : " + "R$ " + vt);
                    System.out.printf("Valor parcela: R$ %.2f ", parMensal);
                }
                break;
            case 3:
                int mesa = 250;
                System.out.println("Mesa -- R$ 250");
                System.out.print("Digite quantas vezes deseja parcelar: ");
                qtdParcela = entrada.nextInt();

                if (qtdParcela == 2) {

                    double vt = (mesa + (mesa * 0.025));
                    double parMensal = vt / qtdParcela;
                    System.out.println("Valor total : " + "R$ " + vt);
                    System.out.printf("Valor parcela: R$ %.2f ", parMensal);
                } else if (qtdParcela >= 3 && qtdParcela <= 5) {

                    double vt = (mesa + (mesa * 0.05));
                    double parMensal = vt / qtdParcela;
                    System.out.println("Valor total: " + "R$ " + vt);
                    System.out.printf("Valor parcela: R$ %.2f ", parMensal);
                } else if (qtdParcela >= 6 && qtdParcela <= 8) {

                    double vt = (mesa + (mesa * 0.075));
                    double parMensal = vt / qtdParcela;
                    System.out.println("Valor total : " + "R$ " + vt);
                    System.out.printf("Valor parcela: R$ %.2f ", parMensal);
                } else if (qtdParcela > 8) {

                    double vt = (mesa + (mesa * 0.095));
                    double parMensal = vt / qtdParcela;
                    System.out.println("Valor total : " + "R$ " + vt);
                    System.out.printf("Valor parcela: R$ %.2f ", parMensal);
                }
                break;
            default:
                System.out.println("Escolha inválida");
        }
    }
}
