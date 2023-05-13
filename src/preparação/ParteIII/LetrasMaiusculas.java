
package preparação.ParteIII;
import java.util.Scanner;

public class LetrasMaiusculas {
   
    public static void main(String[] args){
        
       Scanner ler = new Scanner(System.in); 
       String nome = ler.nextLine();
       StringBuffer novoNome = new StringBuffer(nome);
       
       
       for(int i = 0; i < nome.length(); i++){
           
           if(Character.isSpace(nome.charAt(i))){
               //novoNome.setCharAt(i, Character.NON_SPACING_MARK);
           }
           else if(Character.isLowerCase(nome.charAt(i))){
               novoNome.setCharAt(i, Character.toUpperCase(nome.charAt(i)));
           }
           else if(Character.isUpperCase(nome.charAt(i))){
               novoNome.setCharAt(i, Character.toLowerCase(nome.charAt(i)));
           }
       }
       System.out.println(novoNome);
        
    }
}
