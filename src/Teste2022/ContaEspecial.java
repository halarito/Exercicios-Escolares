
package Teste2022;

public class ContaEspecial extends ContaBancaria{
    
    static float limite;

    
    static public void sacar() {
        
        
        if(saldo <= limite){
            System.out.println("Atingiu o saldo limite");
        }else{
            saldo = saldo;
        }
        
    }
    
}
