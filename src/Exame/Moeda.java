package Exame;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class Moeda {
    
    public static void main(String[] args){
        
        JFrame tela = new JFrame("Conversão de Moedas");
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLayout(null);
        tela.setBounds(500,300,350,250);
        
        //lblMoeda - Label Moeda
        JLabel lblMoeda = new JLabel("Selecione a moeda");
        lblMoeda.setBounds(20, 20, 130, 30);
        lblMoeda.setHorizontalAlignment(JLabel.CENTER);
        
        //cbMoeda - Combo Box Moeda
        JComboBox cbMoeda = new JComboBox();
        cbMoeda.setBounds(170, 20, 130, 30);
        cbMoeda.addItem("Dolar");
        cbMoeda.addItem("Euro");
        cbMoeda.addItem("Rand");
        
        //lblValorM - Label Valor em Meticais
        JLabel lblValorM = new JLabel("Valor a converter: ");
        lblValorM.setBounds(20, 70, 130, 30);
        lblValorM.setHorizontalAlignment(JLabel.CENTER);
        
        //lblValorConv - Label Valor Convertido
        JLabel lblValorCon = new JLabel("Valor convertido: ");
        lblValorCon.setBounds(20, 100, 130, 30);
        lblValorCon.setHorizontalAlignment(JLabel.CENTER);
        
        //txtValorM - Compo de texto Valor em Meticais
        JTextField txtValorM = new JTextField();
        txtValorM.setBounds(170, 70, 130, 30);
        txtValorM.setHorizontalAlignment(JTextField.CENTER);
        
        //txtValorConv - Compo de texto Valor Convertido
        JTextField txtValorConv = new JTextField();
        txtValorConv.setBounds(170, 100, 130, 30);
        txtValorConv.setHorizontalAlignment(JTextField.CENTER);
        
        JButton botao = new JButton("Converter");
        botao.setBounds(100, 150, 100, 30);
        
        double valorConv;
        DecimalFormat df = new DecimalFormat("#,###.###");
        
        ActionListener ac = new ActionListener(){
           
            public void actionPerformed(ActionEvent e){
                if("converter".equals(e.getActionCommand())){
                    
                    int indice = cbMoeda.getSelectedIndex();
                    if(txtValorM.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Digite o valor a converter");
                    }
                    else{
                        if(cbMoeda.getSelectedIndex() == 0){
                            txtValorConv.setText(String.valueOf(df.format(Double.parseDouble(txtValorM.getText())/64)));
                        }
                        else if(cbMoeda.getSelectedIndex() == 1){
                            txtValorConv.setText(String.valueOf(df.format(Double.parseDouble(txtValorM.getText())/74)));
                        }
                        else if(cbMoeda.getSelectedIndex() == 2){
                            txtValorConv.setText(String.valueOf(df.format(Double.parseDouble(txtValorM.getText())/4)));
                        }
                    }
                }
            }   

        };
        
        botao.setActionCommand("converter");
        botao.addActionListener(ac);
        
        tela.add(botao);
        tela.add(txtValorM);
        tela.add(txtValorConv);
        tela.add(lblValorM);
        tela.add(lblValorCon);
        tela.add(cbMoeda);
        tela.add(lblMoeda);
        tela.setVisible(true);
    }
}
