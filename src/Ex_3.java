import java.util.Scanner;

public class Ex_3 {

    public static void main(String[] a) {

        Scanner ler = new Scanner(System.in);

        double somaAlturaHomem = 0;
        int totalHomens = 0;
        int totalMulheres = 0;

        double maiorAltura = 0;
        double menorAltura = 3;
        
        String[] sexo = new String[10];
        double[] altura = new double[10];

        System.out.println("Digite as alturas e sexos: ");

        for (int i = 0; i < 10; i++) {

            System.out.println("\nPessoa " + (i + 1));
            System.out.print("Sexo: ");
            sexo[i] = ler.next();

            System.out.print("Altura: ");
            altura[i] = ler.nextDouble();

        }
        
        for(int i = 0; i < 10; i++){
            
            if(null != sexo[i])switch (sexo[i]) {
                
                case "Femenino":
                    totalMulheres = totalMulheres + 1;
                    break;
                    
                case "Masculino":
                    totalHomens = totalHomens + 1;
                    somaAlturaHomem = somaAlturaHomem + altura[i];
                    break;
            }
            
        }
        
        for(int i = 0; i < 10; i++){
            
            if(altura[i] > maiorAltura){
                
                maiorAltura = altura[i];
                
            }
            
            if(altura[i] < menorAltura){
                
                menorAltura = altura[i];
                
            }
            
        }
        
        //Alínea c
        System.out.println("O numero de Mulheres é: " + totalMulheres);
        
        //Alínea b
        System.out.println("A média das alturas dos Homens é: " + (somaAlturaHomem/totalHomens));
        
        //Alínea a
        System.out.println("A maior Altura do grupo é: " + maiorAltura);
        System.out.print("A menor Altura do grupo é: " + menorAltura);
        
        System.out.println("\n\n");
        
    }

}
