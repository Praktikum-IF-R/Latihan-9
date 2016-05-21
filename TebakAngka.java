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
       int angka = Integer.parseInt(textfield.getText().trim());
            int jawab = (int) (Math.random() * 10 + 1);
        int count = 0;
            count++;
            if (angka == jawab) {
                JOptionPane.showMessageDialog(null, "Kamu Menang!");
                count = 0;
            } else if (count == 3) {
                JOptionPane.showMessageDialog(null, "Salah terus,jawaban yang bener tuh" + jawab);
                count = 0;
            } else {
                JOptionPane.showMessageDialog(null, "Salah bro!");
            }
        }
    }
}           
