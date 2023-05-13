
package Teste2022;
import java.util.*;

public class ContasJava extends ContaEspecial {
   
    static Scanner ler = new Scanner(System.in);
    
    static float valor_a_sacar; 
    static float valor_a_depositar; 
    
    public static void main(String[] args) {
        
        //a)
        System.out.println("Digite o nome do cliente: ");
        cliente = ler.next();
        
        System.out.println("Digite o numero da conta: ");
        num_conta = ler.nextInt();
        
        System.out.println("Digite o saldo: ");
        saldo = ler.nextFloat();
        
        //b)
        System.out.println("Digite o valor a sacar: ");
        valor_a_sacar = ler.nextFloat();
        sacar();
        
        //c
        System.out.println("Digite o valor a depositar: ");
        valor_a_depositar = ler.nextFloat();
        calcularNovoSaldo();
        
        //d
        System.out.println("O novo saldo é: " + saldo);
        
        //e
        System.out.println("Nome: " + cliente);
        System.out.println("Conta: " + num_conta);
        System.out.println("Saldo: " + saldo);
        
    }
    
    static public void sacar(){
        if(saldo <= limite){
            System.out.println("Atingiu o saldo limite");
        }else{
            saldo = saldo - valor_a_sacar;
            System.out.println("Saldo sacado com sucesso");
        }
        
    }
    
    static void calcularNovoSaldo(){
        
        saldo = saldo + valor_a_depositar;
        
    }
    
}
