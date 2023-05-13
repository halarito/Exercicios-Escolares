package preparação;

import java.util.Scanner;

public class PinturaTapete {
    
    Scanner ler = new Scanner(System.in);
    
    // c - comprimento
    // l - largura 
    // h - altura
    // ptp - preçoTotalPintura
    // ptt - preçoTotalTapete      
    // ppt - PrecoPadraoTapete
    
    static double c, l, h, ptt, ptp, ppt;

    PinturaTapete(double c, double l, double h){
        
        this.c = c;
        this.l = l;
        this.h = h;
        
    }
    
    public void CalculaTapete(){
        
        System.out.print("Preço de colocacao de Tapete/m2 (Mt): ");
        ppt = ler.nextDouble();
        
        ptt = this.c * this.l * ppt;
    
        }
    
        // lp - LarguraPorta
        // hp - AlturaPorta
        // lj - LarguraJanela
        // hj - AlturaJanela
        // pp - PrecoPintura
        // atj - AreaTotalJanelas
        // atp - AreaTotalPortas
        // atq - AreaTotalQuarto
        // ptp - PrecoTotalPintura 
        // astq - AreaSubTotalQuarto
        // atpj - AreaTotalPortasJanelas
    
    double pp, lp, hp, lj, hj, atq, atj = 0, atp = 0, atpj = 0, astq;
    
    public void CalculaPintura(int nrP, int nrJ){
        
        astq = c*h*2 + l*h*2;
        
        for(int i = 1; i <= nrP; i++){
            
            System.out.print("  Porta " + i + ": \n" + "Largura: ");
            lp = ler.nextDouble();
            
            System.out.print("Altura: ");
            hp = ler.nextDouble();
        
            atp = atp + lp * hp; 
        }
        
        for(int i = 1; i <= nrJ; i++){
            
            System.out.print("\n  Janela " + i + ": \n" + "Largura: ");
            lj = ler.nextDouble();
            
            System.out.print("Altura: ");
            hj = ler.nextDouble();
        
            atj = atj + lj * hj;
        }
        
        atpj = atp + atj;
        atq = astq - atpj;
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.print("Digite o preço da pintura/m2 (Mt): ");
        pp = ler.nextDouble();
        ptp = pp * atq;
    }
    
    public void PrintarConta(){
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Tapete: " + ptt + "Mt");
        System.out.println("Pintura: " + ptp + "Mt");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        
    }
}
