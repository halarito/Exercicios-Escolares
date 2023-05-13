package preparação.ParteI;

import javax.swing.JOptionPane;

public class Ex_I{

    public static void main(String[] args){       
        
        double n1, n2, media;
        do{
            n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a 1ª nota: " , "As notas variam de 0 a 20", JOptionPane.INFORMATION_MESSAGE));
            n2 = Double.parseDouble(JOptionPane.showInputDialog(" Digite a 2ª nota: "));             
            
            media = (n1 + n2)/2;            
            
        }while(n1 < 0 || n1 > 20 || n2 < 0 || n2 > 20);
    
        JOptionPane.showMessageDialog(null," A média é " + media );
    }      
}