package preparação;

import java.util.Scanner;

public class Princinpal {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.print("Digite sobre a sala/quarto: \n    O comprimento: ");
        // c - comprimento; 
        double c = ler.nextDouble();

        System.out.print("    A largura: ");
        // l - largura;
        double l = ler.nextDouble();

        System.out.print("    A altura: ");
        // h - altura;
        double h = ler.nextDouble();
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        
        System.out.print(" Digite o numero de portas: ");
        // nrP - numeroPortas;
        int nrP = ler.nextInt();

        System.out.print(" Digite o numero de Janelas: ");
        // nrJ - numeroJanelas;
        int nrJ = ler.nextInt();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        
        
        PinturaTapete casa1 = new PinturaTapete(c, l, h);
        
        casa1.CalculaPintura(nrP, nrJ);
        casa1.CalculaTapete();
        casa1.PrintarConta();
       
    }
}
