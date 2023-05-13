package Interfaces;

/*public*/ class Gato implements Animal {
    
    String nome;
    
    @Override
    public void deslocar(String a){
        System.out.println("O Gato anda a " + a);
    }
    
    public void gatoMiar(String miar){
     
        System.out.println(miar); 
    }
    
    public Gato (String nome){
     
        this.nome = nome; 
    }
    
    @Override
    public void comer(String b){
    
        System.out.println("O Gato come " + b);
    }
}
