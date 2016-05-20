package Latihan9;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DS
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class TebakAngka extends Frame {
    Button tombol;
    TextField IsiTebakan;
    Label judul, heading1, input;
    TextArea keterangan;   
    int proses;

    public TebakAngka() {
        setLayout(null);
        judul = new Label("TEBAK ANGKA GAN");
        judul.setFont(new Font("Comic Sans MS", 3,20));
        add(judul);        
        judul.setForeground(Color.WHITE);
        judul.setBounds(100, 30, 150, 20);
        
        heading1 = new Label("1-10");
        heading1.setFont(new Font("Arial", 3, 15));
        add(heading1);                 
        heading1.setForeground(Color.WHITE);
        heading1.setBounds(150, 60, 45, 20); 
        
        input = new Label ("Tebak Angka : ");
        add(input);
        input.setFont(new Font("Arial",3,12));
        input.setForeground(Color.WHITE);
        input.setBounds(75, 100, 85, 20);
        
        IsiTebakan = new TextField(null);
        add(IsiTebakan);
        IsiTebakan.setBounds(180, 100, 30, 20);      
        
        keterangan = new TextArea("Anda mendapatkan kesempatan hanya 3x");
        add(keterangan);
        keterangan.setBackground(Color.green);
        keterangan.setBounds(50, 150, 260, 20);        
        tombol = new Button("Tebak Gan !");
        add(tombol);
        tombol.setBackground(Color.MAGENTA);
        tombol.setBounds(120, 200, 100, 20);
        tombol.addActionListener(new mainAction());
    }

    class mainAction implements ActionListener {    
        public void actionPerformed(ActionEvent event) {
            proses++;
            if (proses > 3) {               
                JOptionPane.showMessageDialog(tombol, "Kesempatan Habis");
            } else if (proses <= 3) {
                if (Integer.parseInt(IsiTebakan.getText()) == (int) ((Math.random() * 10) + 1)) {
                    JOptionPane.showMessageDialog(tombol, "Tebakan Tepat Gan");
                } else {
                    JOptionPane.showMessageDialog(tombol, "Tebakan salah Gan");
                }
            }
        }
    }
}

