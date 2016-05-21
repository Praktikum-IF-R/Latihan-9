/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Rexy
 */
public class TebakAngka extends JFrame {
       int RandomNum, Guess;
    private JButton button;
    private JTextField textfield;
    private JLabel label;
    private JLabel promptlabel;
    private JLabel resultlabel;
    private JLabel randomlabel;
    
    private JLabel judullabel;
       public TebakAngka(){
        setLayout(new FlowLayout());
           judullabel = new JLabel("Permainan Tebak Angka");
        judullabel.setFont(new Font("Arial", 1, 14));
        add(judullabel);
        judullabel.setBounds(100, 40, 400, 60); 
    promptlabel= new JLabel("Please enter your random number 1-10 :");
    add(promptlabel);
   
    textfield = new JTextField(5);
    add(textfield);
   
    button = new JButton("Ayo Tebak!");
    add(button);
   
    resultlabel= new JLabel("");
    add(resultlabel);
   
    randomlabel= new JLabel("");
    add(randomlabel);
   
    event e = new event();
    button.addActionListener(e);
   }
    public class event implements ActionListener{
   
    public void actionPerformed(ActionEvent e){
        RandomNum = (int)(Math.random()*10+1);
               
                try{
                
                    Guess=(int)(Double.parseDouble(textfield.getText()));
                if(Guess==RandomNum){
                    resultlabel.setText("Kamu menang");
                                    }
                else if(Guess!=RandomNum){
                    resultlabel.setText("Kamu Kalah");
                }
                resultlabel.setText("Angka yang dimaksud adalah : "+RandomNum);;
               
                }
                catch(Exception ex){
                randomlabel.setText("Tolong inputkan angka saja ");
                }
               
       
                   }}}

