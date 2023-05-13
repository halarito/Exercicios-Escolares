package Exame;

import java.util.Scanner;

public class Novo extends Imovel{

    static Scanner ler = new Scanner(System.in);
    
    public static void main(String a[]){
        
        preco = preco * 20 / 100;
        
        ler();
    }

    static void ler(){
        
        System.out.print("Digite o endereço: ");
        endereco = ler.next();
        
        System.out.print("Digite o preco: ");
        preco = ler.nextDouble();
        
    }
    
}

