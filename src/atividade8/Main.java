package atividade8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int s = 0;
        int n1 = 0, n2 = 0;

        while (s != 5) {

            System.out.print("Escolha um opção: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtrai");
            System.out.println("3 - Multiplica");
            System.out.println("4 - Divide");
            System.out.println("5 - Sair");
            s = input.nextInt();
            if (s != 5) {
                System.out.println("Digite o primeiro valor: ");
                n1 = input.nextInt();
                System.out.println("Digite o segundo valor: ");
                n2 = input.nextInt();
            }
            switch (s) {
                case 1:
                    int soma = n1 + n2;
                    System.out.println(soma);

                    break;
                case 2:
                    int subtracao = n1 - n2;
                    System.out.println(subtracao);
                    break;
                case 3:
                    int multiplicacao = n1 * n2;
                    System.out.println(multiplicacao);
                    break;
                case 4:
                    int divisao = n1 / n2;
                    System.out.println(divisao);
                    break;
                case 5:
                    System.out.println("desligando calculadora");
                default:
            }
        }
    }
}

