/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package limparcaixas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Vent
 */
public class LimparCaixas extends JFrame {
    JLabel rotulo1, rotulo2;
    JTextField texto1, texto2;
    JButton limpar;
    public LimparCaixas(){
        super("Exemplo Limpar");
        Container tela = getContentPane();
        setLayout(null);
        rotulo1 = new JLabel("1º Número: ");
        rotulo2 = new JLabel("2º Número: ");
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        limpar = new JButton("Limpar");
        rotulo1.setBounds(50,60,100,20);
        rotulo2.setBounds(50,60,100,20);
        texto1.setBounds(120,20,200,20);
        texto2.setBounds(120,60,200,20);
        limpar.setBounds(150,100,80,20);
        
        limpar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        texto1.setText(null);
                        texto2.setText(null);
                        texto1.requestFocus();
                        
                    }
                });
        
      tela.add(rotulo1);
      tela.add(rotulo2);
      tela.add(texto1);
      tela.add(texto2);
      tela.add(limpar);
      setSize(400, 250);
      setVisible(true);
    }
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LimparCaixas app = new LimparCaixas();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// TODO code application logic here
    }
    
}
