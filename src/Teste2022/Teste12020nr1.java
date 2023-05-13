/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste2022;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Arlindo Halar
 */
public class Teste12020nr1 {
    public static void main(String args[]){
        
        
        JFrame tela = new JFrame();
        tela.setBounds(400, 300, 400, 250);
        tela.setLayout(null);
        tela.setVisible(true);
        
        JButton ok = new JButton("OK");
        ok.setBounds(150, 70, 80, 30);
                
        tela.add(ok);
        
        ActionListener ac = new ActionListener(){
        
            public  void actionPerformed(ActionEvent e) {
                
                if("ok1".equals(e.getActionCommand())){
                        JOptionPane.showMessageDialog(null, "Saudações! ");
                }
            }
        };
        
        ok.setActionCommand("ok1");
        ok.addActionListener(ac);
    }
}
