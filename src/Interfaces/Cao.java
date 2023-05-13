package Interfaces;

public class Cao implements Animal{
    
    @Override
    public void deslocar(String a){
        System.out.println("A pé");
    }
    
    @Override
    public void comer(String b){
        System.out.println("O Cão come: ");
    }
}
