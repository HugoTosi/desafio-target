/*Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula,
além de informar a quantidade de vezes em que ela ocorre. */

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String frase;
        int a = 0;

        System.out.println("Escreva uma frase:");
        frase = sc.nextLine().toUpperCase();


        for (int i = 0; i<frase.length(); i++){

            if (frase.charAt(i) == 'A'){
                a++;
            }
        }
        System.out.printf("A frase possui %d letra(s) A", a);





    }
}
