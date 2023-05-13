package Exame;

import java.util.Scanner;

public class Numeros {
    
    public static void main(String args[]){
        
        Scanner ler = new Scanner(System.in);
        int n;
        int n0_200 = 0;
        int n201_400 = 0;
        int n_acima_400 = 0;
        
        System.out.println("Digite 50 numeros: ");
        
        for(int i = 1; i <= 50; i++){
            
            System.out.print("O " + i + "º Número: ");
            n = ler.nextInt();
            
            if(n >= 0 && n <= 200 ){
                n0_200 += 1;
            }
            if(n >= 201 && n <= 400 ){
                n201_400 += 1;
            }
            if(n > 400 ){
                n_acima_400 += 1;
            }
        }
        
        System.out.print("\nOs numeros entre 0 a 200 são: " + n0_200);
        System.out.print("\nOs numeros entre 201 a 400 são: " + n201_400);
        System.out.print("\nOs numeros acima de 400 são: " + n_acima_400);
    }
}
