package Interfaces;

public class Teste {
    public static void main(String[] args){
        //Animal cat1 = new Gato();
        //Gato cat = (Gato)cat1; //DownCast ou estreitamento
        Cao dog = new Cao();
        Animal[] an = {
            new Gato(" Santa"), 
            new Cao(),
            new Gato(" Maria")
        };
        /*cat.comer("Peixe, Rato");
        cat.deslocar("Pé");
        */
        int ig = 0;
        //cat.gatoMiar("miau miau");
        for (int i = 0; i < an.length; i++)
        {
            
            if(an[i] instanceof Gato){
                
                System.out.println();
                ig = ig + 1;
                
            }
        }
        
        System.out.println("Instancias de Gato: " + ig);

//cat1.gatoMiar("miau miau");
        //cat1.miar("miau miau");
    } 
}
