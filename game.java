/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB9_3;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Deltaviyahya
 */
public class game extends JFrame {
    int angka = (int)(Math.random() * 9 + 1 );
    int angka2 = 0;
    Label judul, input;
    TextField txtInput;
    private JLabel randomlabel;
    Button result, random;
    
    public game(){
        setLayout(null);
        judul = new Label("Game Tebak Angka");
        add(judul);
        judul.setBounds(95, 60, 170, 30);
        
        input = new Label("Input Angkamu");
        add(input);
        input.setBounds(105, 100, 100, 20);
        
        txtInput = new TextField();
        add(txtInput);
        txtInput.setBounds(100, 125, 100, 20);
        
        randomlabel = new JLabel("");
        add(randomlabel);
        
        result = new Button("Tebak ! ");        
        add(result);
        result.setBounds(98, 180, 100, 20);
        result.addActionListener(new mainAction());
    }
    class mainAction implements ActionListener{
        public void actionPerformed(ActionEvent c){
            angka2++;
            try{
            int a = Integer.parseInt(txtInput.getText().trim());
            if(a == angka){
               if(angka2 < 3){
                   JOptionPane.showMessageDialog(null, "Anda Menang");
                   angka2 = 0;
               }
                else{
                   JOptionPane.showMessageDialog(null, "3x Kesempatan Anda Sudah Habis :( ");
                   angka2 = 0; 
               }
           }
           else{
           JOptionPane.showMessageDialog(null, "Anda Kalah");
           }
            } catch (Exception ex) {
                randomlabel.setText("Please enter only the number");
        }
   }
    }
}
