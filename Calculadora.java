package semana4.desafios;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcao;
        int a = 0;
        int b = 0;

        do {
            System.out.println("\nEscolha uma operação:\n" +
                    "1- Soma\n" +
                    "2- Subtração\n" +
                    "3- Multiplicação\n" +
                    "4- Divisão\n" +
                    "5- Módulo\n" +
                    "6- Sair");
            opcao = entrada.nextInt();
            entrada.nextLine();

            while (true) {
                System.out.print("Escolha o primeiro numero: ");
                if (entrada.hasNextInt()) {
                    a = entrada.nextInt();
                    break;
                } else {
                    System.out.println("Entrada inválida, digite um número inteiro.");
                    entrada.next();
                }
            }

            while (true) {
                System.out.print("Escolha o segundo numero: ");
                if (entrada.hasNextInt()) {
                    b = entrada.nextInt();
                    break;
                } else {
                    System.out.println("Entrada inválida, digite um número inteiro.");
                    entrada.next();
                }
            }

            switch (opcao) {
                case 1:
                    int soma = a + b;
                    System.out.printf("O resultado da soma é: %d\n", soma);
                    break;
                case 2:
                    int sub = a - b;
                    System.out.printf("O resultado da subtração é: %d\n", sub);
                    break;
                case 3:
                    int mult = a * b;
                    System.out.printf("O resultado da multiplicação é: %d\n", mult);
                    break;
                case 4:
                    if (b == 0) {
                        while (b == 0) {
                            System.out.println("O divisor deve ser diferente de 0, escolha outro numero: ");
                            b = entrada.nextInt();
                        }
                    }
                    int div = a / b;
                    System.out.printf("O resultado da divisão é: %d\n", div);
                    break;
                case 5:
                    int mod = a % b;
                    System.out.printf("O resultado do módulo é: %d\n", mod);
                    break;
                case 6:
                    System.out.println("Saindo do programa.\n");
                    break;
                default:
                    System.out.println("Número inválido, escolha uma opção válida\n");
            }
        } while (opcao != 6);

        entrada.close();
    }
}
