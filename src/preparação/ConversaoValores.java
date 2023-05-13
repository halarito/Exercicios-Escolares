package preparação;

import javax.swing.JOptionPane;

public class ConversaoValores {
    
    public static void main(String[] args){
        
        int res;
        
        res = Integer.parseInt(JOptionPane.showInputDialog(null, "   Conversão para: \n1. l - Cm3\n2. m3 - l\n3. m3 - pés3\n4. Galão - Polegadas3\n5. Galão - Litros"));
        
        
        if (res == 1){
            
            double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor em litros: "));
            ConversorDeUnidadesDeVolume.L_Cm3(valor);
        }
        
        else if(res == 2){
            
            double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor em metros: "));
            ConversorDeUnidadesDeVolume.m3_L(valor);
        }
        
        else if(res == 3){
            
            double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor em metros: "));
            ConversorDeUnidadesDeVolume.m3_Pes3(valor);
        }
        
        else if(res == 4){
            
            double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor em galões: "));
            ConversorDeUnidadesDeVolume.g_P3(valor);
        }
        else if(res == 5){
            
            double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor em galões: "));
            ConversorDeUnidadesDeVolume.g_L(valor);
        }
        
    } 
}
