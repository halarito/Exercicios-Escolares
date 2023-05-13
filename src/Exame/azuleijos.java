package Exame;

import java.util.Scanner;

public class azuleijos {

    public static void main(String argas[]){
        
        Scanner ler = new Scanner(System.in);
        
        double hp, lp, hacm, lacm, ham, lam, ap, aa;
        double quant;
        
        System.out.println("Digite a altura(m) e a largura(m) da parede (sucessivamente): ");
        hp = ler.nextDouble();
        lp = ler.nextDouble();
        
        System.out.println("Digite a altura(cm) e a largura(cm) do azulejo (sucessivamente): ");
        hacm = ler.nextDouble();
        lacm = ler.nextDouble();
        
        ap = hp * lp;
        
        ham = hacm * 0.01;
        lam = lacm * 0.01;
        
        aa = lam * ham;
        
        quant = ap / aa;
        
        System.out.println("Para preencher a parade sao necessários " + quant + " azulejos");
        
    } 
    
}
