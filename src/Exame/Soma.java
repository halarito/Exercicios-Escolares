package Exame;

import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num1 = ler.nextInt();

        System.out.print("Digite outro numero: ");
        int num2 = ler.nextInt();

        int soma = 0;

        if (num1 > num2) {
            for (int i = num1; i >= num2; i--) {
                soma += i;
            }
        } else if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                soma += i;
            }
        } else if (num1 == num2) {
            System.out.println("Os dois valores são iguais");
        }

        System.out.println("A soma dos inteiros existentes entre " + num1 + " e " + num2 + " é: " + soma);

    }
}
