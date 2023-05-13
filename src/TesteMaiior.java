//Teste
public class TesteMaiior {

    public static void main(String[] a){
        
        int maior = 0;
        
        int[] num = new int[10];
        
        num[0] = 10;
        num[1] = 18;
        num[2] = 10;
        num[3] = 11;
        num[4] = 9;
        num[5] = 15;
        num[6] = 19;
        num[7] = 13;
        num[8] = 16;
        num[9] = 13;
        
        for(int i = 0; i < 10; i++){
            
            if(num[i] > maior){
                
                maior = num[i];
            
            }
            
        }
        
        System.out.println("maior = " + maior);
    }
    
}
