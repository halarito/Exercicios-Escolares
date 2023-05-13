import java.util.Scanner;

public class Ex_2 {
    
    public static void main(String[] a){
        
        Scanner ler = new Scanner(System.in);
        
        double n1, n2, m;
        
        do{
            
            System.out.print("Digite a nota 1: ");
            n1 = ler.nextDouble();
            
            System.out.print("Digite a nota 2: ");
            n2 = ler.nextDouble();
           
            
            
        }while(n1 < 0 || n1 > 20 || n2 < 0 || n2 > 20);
        
        m = (n1 + n2)/2;
        
        System.out.println("\nA média é de: " + m + " Valores");
    }
    
}
