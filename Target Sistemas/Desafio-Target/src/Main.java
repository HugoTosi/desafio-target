/* Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
(exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número,
ele calcule a sequência de Fibonacci e retorne uma mensagem avisando
se o número informado pertence ou não a sequência. */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um valor de número inteiro:");

        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        int num = sc.nextInt();
        int sequencia = 0, primeiroNumero = 0, segundoNumero = 1;
        boolean encontrado = false;

        for (int i = 0; i < num; i++) {
            sequencia = primeiroNumero + segundoNumero;
            segundoNumero = primeiroNumero;
            primeiroNumero = sequencia;

            if (num == sequencia) {
                System.out.println("Número informado pertence à sequência de Fibonacci");
                encontrado = true;
            }

        }
        if (!encontrado) {
            System.out.println("Não encontrado na sequência de Fibonacci");
        }
    }
}