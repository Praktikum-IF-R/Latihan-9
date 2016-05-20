/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan9;

/**
 *
 * @author Lenovo
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class tebak extends Frame{
    int i=0;
    Label tebak;
    TextField tebakan;
    Button tombol;
    
    public tebak(){
        setLayout(null);
        tebak=new Label("tebakan kamu: ");
        tebak.setFont(new Font ("Calibri",1,14));
        add(tebak);
        tebak.setBounds(50, 30, 100, 50);
        tebakan= new TextField();
        add(tebakan);
        tebakan.setBounds(250, 30, 100, 50);
        tombol=new Button(" ayo tebak ");
        add(tombol);
        tombol.setBounds(150, 100, 100, 50);
        tombol.addActionListener(new maintebak());
    }
    
    class maintebak implements ActionListener{
        public void actionPerformed(ActionEvent tebak) {
            
            int jawab=Integer.parseInt(tebakan.getText().trim());    
            int jawaban=(int)(Math.random()*10);
            if(jawab==jawaban){
                    JOptionPane.showMessageDialog(null, "mantap otak anda");
                    System.exit(0);
                }
                else if(jawab!=jawaban) {
                    i++;
                    
                }
            if (i==3){
                JOptionPane.showMessageDialog(null, "anda kalah huhuhu cedih");
                System.exit(0);
            }
        }
    }
}
