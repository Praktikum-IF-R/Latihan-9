package tebakangka.gui;

import java.awt.*;

import java.awt.event.*;

import javax.swing.JOptionPane;

public class tebakAngka extends Frame {
    Label lbJudul, lbInput;
    TextField txtAngka; 
    Button btnTebak, btnExit;
    
    public tebakAngka(){
        setLayout(null);
        
        lbJudul = new Label("GAME TEBAK ANGKA");
        lbJudul.setFont(new Font("Arial", 1, 14));
        add(lbJudul);
        lbJudul.setBounds(100, 50, 170, 20);
        
        lbInput = new Label("Masukan Angka :");
        add(lbInput);
        lbInput.setBounds(100, 80, 170, 20);
        
        txtAngka = new TextField("0");
        add(txtAngka);
        txtAngka.setBounds(100, 110, 150, 20);
        
        btnTebak = new Button("Tebak");
        add(btnTebak);
        btnTebak.setBounds(115, 140, 50, 20);
        btnTebak.addActionListener(new game());
        
        btnExit = new Button("Exit");
        add(btnExit);
        btnExit.setBounds(180, 140, 50, 20);
        btnExit.addActionListener(new game());
    }
    
     class game implements ActionListener {
        int count = 0;
        
        @Override
        public void actionPerformed(ActionEvent event) {
                Object source = event.getSource();
                
                if(source == btnExit){
                    System.exit(0);
                }
                else if(source == btnTebak){
                    int random = (int) (Math.random()*10)+1;
                    int angka = Integer.parseInt(txtAngka.getText().trim());
                
                   
                    if(angka==random)
                        JOptionPane.showMessageDialog(null, "SELAMAT ANDA MENANG");
                    else{
                        count++;
                        if(count == 3)
                            JOptionPane.showMessageDialog(null, "MAAF ANDA KURANG BERUNTUNG");
                        else
                            JOptionPane.showMessageDialog(null, "Coba Lagi ?");
                        
                    }
                
                   
                    
                }
                   
        }
    }
    
    
}
