
package Teste2022;

public class ContaBancaria {
    static String cliente;
    static int num_conta;
    static float saldo;
    
    static public void sacar(){
        if(saldo <= 0){
            System.out.println("Saldo negativo");
        }else{
            saldo = saldo;
        }
    }
    
    public void depositar(){
        
    }
}
