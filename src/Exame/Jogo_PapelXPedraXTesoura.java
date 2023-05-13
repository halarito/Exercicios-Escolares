package Exame;
import java.util.*;
public class Jogo_PapelXPedraXTesoura {
    
    public static void main(String[] args){
        Random rand = new Random();
        Scanner ler = new Scanner(System.in);
        String nomes[] = {"Pedra","Papel","Tesoura"};
        
        int computador = rand.nextInt(3);
        int jogador;
        
        System.out.print("Suas Opções: \n [0] Pedra\n [1] Papel\n [2] Tesoura\nQual é a sua jodaga? : ");
        jogador = ler.nextInt();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Computador: " + nomes[computador]);
        System.out.println("Jogador: " + nomes[jogador]);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=");
        
        if(computador == 0){ // Pedra
            
            if(jogador == 0){
                System.out.println(" \n=-=- EMPATE -=-= ");
            }
            else if(jogador == 1){
                System.out.println(" \n=-=- JOGADOR VENCE -=-= ");
            }
            else if(jogador == 2){
                System.out.println(" \n=-=- COMPUTADOR VENCE -=-= ");
            }
            else{
                System.out.println("\nJogada Inválida");
            }
            
        }
        else if(computador == 1){ // Papel
            
            if(jogador == 0){
                System.out.println(" \n=-=- COMPUTADOR VENCE -=-= ");
            }
            else if(jogador == 1){
                System.out.println(" \n=-=- EMPATE -=-= ");
            }
            else if(jogador == 2){
                System.out.println(" \n=-=- JOGADOR VENCE -=-= ");
            }
            else{
                System.out.println("\nJogada Inválida");
            }
        }
        else if(computador == 2){ // Tesoura
            
            if(jogador == 0){
                System.out.println(" \n=-=- JOGADOR VENCE -=-= ");
            }
            else if(jogador == 1){
                System.out.println(" \n=-=- COMPUTADOR VENCE -=-= ");
            }
            else if(jogador == 2){
                System.out.println(" \n=-=- EMPATE -=-= ");
            }
            else{
                System.out.println("\nJogada Inválida");
            }
        }
        
    }
            
}
