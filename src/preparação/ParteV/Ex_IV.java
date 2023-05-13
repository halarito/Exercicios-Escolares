package preparação.ParteV;
import javax.swing.JOptionPane;

public class Ex_IV {
    public static void main(String[] args){
               
        int n, cont = 0;
        int[] vetor = new int[10]; 
        
        JOptionPane.showMessageDialog(null, " Digite 10 valores: ");
        
        for (int i = 0; i < 10; i++){
            n = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite o " + (i+1) + "º valor: "));
            if (n < 0){
                cont += 1;
                vetor[i] = n;
            }
            else{
                vetor[i] = 0;
            }
        }             
        JOptionPane.showMessageDialog(null, cont + " valor(es) é(são) negativo(s)\n");
        
        
        for (int i = 0; i < 10; i++){            
            if (vetor[i]<0){
                JOptionPane.showMessageDialog(null, vetor[i]);
            }            
        }
        
    }
}
