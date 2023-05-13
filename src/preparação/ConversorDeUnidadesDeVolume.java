package preparação;

import javax.swing.JOptionPane;

public class ConversorDeUnidadesDeVolume {
    
    public static void L_Cm3(double l){
        
        double valorEmCm3 = l * 1000;
        
        JOptionPane.showMessageDialog(null, l + " litros = " + valorEmCm3 + " Cm3");
    }
    
    public static void m3_L(double m3){
        
        double valorEmL = m3 * 1000;
        
        JOptionPane.showMessageDialog(null, m3 + " m3 = " + valorEmL + " litros");
    }
    
    public static void m3_Pes3(double m3){
        
        double valorEmP3 = m3 * 35.32;
        
        JOptionPane.showMessageDialog(null, m3 + " m3 = " + valorEmP3 + " litros");
    }
    
    public static void g_P3(double g){
        
        
        double valorEmP3 = g * 231;
        
        JOptionPane.showMessageDialog(null, g + " galão = " + valorEmP3 + " Polegadas");
    }
    
    public static void g_L(double g){
        
        
        double valorEmL = g * 3.785;
        
        JOptionPane.showMessageDialog(null,g + " galão = " + valorEmL + " litros");
    }
    
}

