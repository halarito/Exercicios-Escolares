
package preparação;

import java.util.Scanner;
import javax.swing.*;



public class Preparação {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);     
        int n, ac = 0;
        
        //System.out.print("Digite os valores: \n");
        JOptionPane.showMessageDialog(null, "A seguir, digite os valores: ");    
        
        for(int i = 1; i <= 3; i++){
            
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o "+ i + " valor: "));
            //System.out.print("O "+ i + " valor: ");
            //n = ler.nextInt();
            ac = ac + n;
            
        }
        
        //System.out.print("A soma é: " + "50");
        JOptionPane.showMessageDialog(null, "A soma é: " + ac);
                
        }
    
}
