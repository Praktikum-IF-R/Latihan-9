/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latiansoal;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane  ;
public class togel extends Frame{
    int t=0;
    Label Tebak;
    TextField Tebakan;
    Button Tombol;
    
    public togel(){
        setLayout(null);
        Tebak = new Label("Tebakan anda 3x");
        Tebak.setFont(new Font("Times New Roman",1,12));
        add (Tebak);
        Tebak.setBounds(50, 30, 100, 50);
        Tebakan = new TextField();
        add(Tebakan);
        Tebakan.setBounds(250, 30, 100, 50);
        Tombol = new Button("Silahkan tebak");
        add(Tombol);
        Tombol.setBounds(150, 100, 100, 50); 
        Tombol.addActionListener(new maintogel());
        
    }
    
    class maintogel implements ActionListener{
        
        @Override
            public void actionPerformed(ActionEvent Tebak) {
            int Jawab = Integer.parseInt(Tebakan.getText().trim());
            int Jawaban=(int)(Math.random()*10);
            if(Jawaban==Jawab){
                JOptionPane.showMessageDialog(null,"Widih jago kan");
                System.exit(0);
                
            }
            else if(Jawab!=Jawaban){
                t++;
            }
            if(t==3){
                JOptionPane.showMessageDialog(null, "kasian deh kalah");
                System.exit(0);
            }
        }
        
        
    }
}
