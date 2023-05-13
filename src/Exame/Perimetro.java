package Exame;

import java.util.Scanner;

public class Perimetro {
    
    static double comp, larg, area, perim;
    
    public static void main(String args[]){
      
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o Comprimento: ");
        comp = ler.nextDouble();
        
        System.out.print("Digite a Largura: ");
        larg = ler.nextDouble();
        
        
        calcularArea();
        calcularPerimetro();
        imprimir();
        
    }
    
    static void calcularArea(){
        
        area = comp * larg;
        
    }
         
    static void calcularPerimetro(){
        
        perim = (comp * larg) / 2;
        
    }
    
    static void imprimir(){
        
        System.out.println("\nO Comprimento vale: " + comp);
        System.out.println("A Largura vale: " + larg);
        
        System.out.println("\nA area vale: " + area);
        System.out.println("O Perímetro vale: " + perim);
        
    }
    
}
