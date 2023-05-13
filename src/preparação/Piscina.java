package preparação;

import javax.swing.JOptionPane;

public class Piscina {
    
    double comprimento, largura, profundidade, taxaDepositada_min, taxaDrenada_min;
    
    public Piscina(double c, double l, double p){
        comprimento = c;
        largura = l;
        profundidade = p;
        taxaDepositada_min = 100;
        taxaDrenada_min = 90;
    }
    
    Piscina(){
        
    }
    
    static double quantAgua;
    static double drenarAgua;
    double l_adicionais;
    int p;
    double qantAgua;
    
    
    public double quantidadeDeAgua(){
        
        double volume = comprimento * largura * profundidade;
        
        quantAgua = volume * 1000;
        
        p = JOptionPane.showConfirmDialog(null, " A Picina esta Vazia? ", "Quantidade de agua ", JOptionPane.YES_NO_OPTION);
        
        if(p == JOptionPane.YES_OPTION){
            
            JOptionPane.showMessageDialog(null, "Volume = " + volume + " m3\n" + "Agua = " + quantAgua + " litros");
        
        }
        else{
            
            qantAgua = Double.parseDouble(JOptionPane.showInputDialog(null, " Digite a quantidade de agua que a picina tem: "));
            
            l_adicionais = quantAgua - qantAgua;
            
            JOptionPane.showMessageDialog(null, "Para encher a picina são necessarios " + l_adicionais + " Litros adicionais");
        }
        
        return quantAgua; 
    }
    
    
    public void tempoNecessario(){
        double tempo;
        
        if(p != JOptionPane.YES_OPTION){
            tempo = qantAgua / taxaDepositada_min;
        }
        else{
            tempo = quantAgua/taxaDepositada_min;
        }
        JOptionPane.showMessageDialog(null, "São necessarios "+tempo+" minutos para encher a Piscina");
    }
    
    
    public void drenarAgua(){

        double t = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o tempo que deseja drenar a agua: "));
        double drenarAgra = t *  taxaDrenada_min;
        JOptionPane.showMessageDialog(null, "Em " + t + " minutos pode-se drenar " + drenarAgra +" Litros de Agua");

    }
    
}
