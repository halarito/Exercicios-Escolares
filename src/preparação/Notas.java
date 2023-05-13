package preparação;

import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int nr_alunos;
        /*
        System.out.print("Numero de alunos: ");
        nr_alunos = ler.nextInt();
        */
        
        /*Notas(){
            System.out.println("");
        }*/
        
        String[] nomes = new String[10/*nr_alunos*/];
        double[] notas = new double[10/*nr_alunos*/];
        int[] numeros = new int[10/*nr_alunos*/];

        System.out.print(" Digite os Nomes de acordo com os numeros:\n ");

        for (int i = 0; i < notas.length; i++) {
            int nr = i + 1;
            System.out.print("\n   Aluno " + nr + ": \nNome: ");
            nomes[i] = ler.nextLine();
            
            //next() - lê apenas a primeira palavra da proxima linha;
            //nextLine() - lê toda linha contando com os espaços; 
        }

        
        System.out.print("\n\n Digite as Notas:\n-------------------");
        double total = 0;
        for (int i = 0; i < notas.length; i++) {
            int nr = i + 1;
            System.out.println("\n   Aluno " + nr + ": \nNome: " + nomes[i]);

            do {
                System.out.print("Nota: ");
                notas[i] = ler.nextDouble();
                
                if(notas[i] < 0 || notas[i] > 20){
                    System.out.print("--Nota inválida-- \n");
                }
            } while (notas[i] < 0 || notas[i] > 20);

            total += notas[i];

        }
        double media = total / notas.length;

        System.out.println("-----------------");
        System.out.println("\nA media: " + media);
        System.out.println("Alunos com notas abaixo da media: ");

        for (int i = 0; i < notas.length; i++) {
            numeros[i] = i + 1;
            if (notas[i] < media) {
                System.out.println(numeros[i] + " \t " + nomes[i] + " \t " + notas[i]);
            }
        }

        System.out.println("------------------\nAluno(s) com a nota mais alta: \nNumero\tNome\tNota");

        double max, m = 0, mmax;

        int i = 0;

        do {

            mmax = Math.max(m, notas[i]);
            max = Math.max(mmax, notas[i + 1]);
            m = max;
            i += 2;

        } while (i < notas.length);

        for (int j = 0; j < numeros.length; j++) {
            numeros[j] = j + 1;
        }

        for (int j = 0; j < notas.length; j++) {
            if (notas[j] == max) {
                System.out.println(numeros[j] + " \t" + nomes[j] + " \t\t" + notas[j]);
            }
        }
    }
}
