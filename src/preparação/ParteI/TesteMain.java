/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparação.ParteI;
import java.util.Scanner;
/**
 *
 * @author Arlindo Halar
 */
public class TesteMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
       
        System.out.println("Ola Mundo!");
       
        int valor1 = (int) (Math.random() * 10);
        int valor2 = (int) (Math.random() * 10);
        
        int soma = valor1 + valor2;
        int ans;
        //int valr = 5 + (int)(Math.random() * ((10 - 5) + 1));
        System.out.print("Qual é o resultado de: " + valor1 +" + "+ valor2 + ": ");
        ans = ler.nextInt();
        
        if(soma == ans){
            System.out.println("Corretoooo!!! ");
        }else{
            System.out.println("Errrrrrado!!! ");
        }
    }
    
}
