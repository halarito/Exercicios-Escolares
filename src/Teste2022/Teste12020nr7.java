/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste2022;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Arlindo Halar
 */
public class Teste12020nr7 {
    public static void main(String[] args) {
        
        JFrame tela = new JFrame();
        tela.setBounds(400, 300, 400, 250);
        tela.setLayout(null);
        tela.setVisible(true);
        
        JLabel l1 = new JLabel("Digite o texto: ");
        l1.setBounds(40, 70, 120, 25);
        
        JTextField t1 = new JTextField();
        t1.setBounds(40, 100, 170, 25);
        
        JButton b1 = new JButton("Converter");
        b1.setBounds(70, 135, 100, 25);
        
        
        
        ActionListener ac = new ActionListener(){
        
            public  void actionPerformed(ActionEvent e) {
                
                if("ok1".equals(e.getActionCommand())){
                        JOptionPane.showMessageDialog(null, t1.getText().length());
                        
                        for(int i = 0; i < t1.getText().length(); i++){
                            
                        }
                }
            }
        };
        
        b1.setActionCommand("ok1");
        b1.addActionListener(ac);
        
        tela.add(l1);
        tela.add(t1);
        tela.add(b1);
        
    }
}
