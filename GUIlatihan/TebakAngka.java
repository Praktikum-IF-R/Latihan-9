package GUIlatihan;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class TebakAngka extends Frame{
    int ngulangg;
    Label lbtabel, lbangka;
    TextField txtAngka;
    Button tebak;
    
    public TebakAngka(){
        setLayout(null);
        
        lbtabel = new Label("Tebak angka 1-10");
        lbtabel.setFont(new Font("Arial", 1, 16));
        add(lbtabel);
        lbtabel.setBounds(110,80,170,20);
        
        lbangka = new Label("Masukkan : ");
        lbangka.setFont(new Font("Arial", 1, 13));
        add(lbangka);
        lbangka.setBounds(40,120,70,20);
        
        txtAngka = new TextField("0");
        add(txtAngka);
        txtAngka.setBounds(180, 120, 30, 20);
        
        tebak = new Button("Tebak");
        add(tebak);
        tebak.setBounds(150, 180, 40, 30);
        tebak.addActionListener(new Action());
    }

class Action implements ActionListener{
    public void actionPerformed(ActionEvent event){
        int angka = Integer.parseInt(txtAngka.getText().trim());
        int tebak = (int) (Math.random() * 10+1);
        ngulangg++;
        if(angka==tebak){
            JOptionPane.showMessageDialog(null, "Anda Menang! :D");
            ngulangg = 0;
        }
        else if(ngulangg==3){
            JOptionPane.showMessageDialog(null, "Anda Kalah! :P");
            ngulangg = 0;
        }
        
    }
}
    
}
