/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparação;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Arlindo Halar
 */
public class TesteNome {
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        
        String nome;
        
        System.out.print("Digite o seu Nome: ");
        nome = ler.next();
        
        //JOptionPane.showMessageDialog(null, "\nO teu nome é " + nome);
        JOptionPane.showMessageDialog(null, "Bem vindo ao Java" + nome);
    }
}
