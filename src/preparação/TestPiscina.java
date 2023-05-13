/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparação;

import javax.swing.JOptionPane;

/**
 *
 * @author Arlindo Halar
 */
public class TestPiscina {
    
    public static void main(String[] args){
        
        Piscina casa_1 = new Piscina(3, 3, 2);
        
        casa_1.quantidadeDeAgua();
        casa_1.tempoNecessario();
        casa_1.drenarAgua();
    }
}
