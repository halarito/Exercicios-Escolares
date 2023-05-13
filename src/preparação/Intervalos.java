package preparação;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Intervalos {

    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        int n, n0_100 = 0, n101_200 = 0, nmaior_200 = 0;
        
        for(int i = 0; i < 20; i++){
            
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o " + (i+1) + "º valor"));
           
            if(-1 < n && n < 101){
                n0_100 = n0_100 + 1;
                //System.out.println(n + " - 0/100");
            }
            else if(101 <= n && n <= 200){
                n101_200 = n101_200 + 1;
                //System.out.println(n + " - 101/200");
            }
            else if(n > 200){
                nmaior_200 = nmaior_200 + 1;
                //System.out.println(n + " - >200");
            }
        }
        
        JOptionPane.showMessageDialog(null, "Dos numeros inseridos:  \n" + n0_100 + " - estão entre 0 a 100\n" + n101_200 + " - estão entre 101 a 200\n" + nmaior_200 + " - são maiores que 200");
    }
}
