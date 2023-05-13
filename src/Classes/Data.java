package Classes;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
    public static void main(String[] args){
        
        Date data = new Date();
        SimpleDateFormat formatacao = new SimpleDateFormat("y"); 
        

        System.out.println(formatacao.format(data));
    }
}
