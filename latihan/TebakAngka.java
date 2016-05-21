/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author Lenovo
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class TebakAngka extends Frame {

    Label Lab1,Lab2;
    TextField txt;
    Button Tebak;

    public TebakAngka() {
        setLayout(null);

        Lab1 = new Label("Masukkan Angka");
        Lab1.setFont(new Font("Arial", 1, 14));
        add(Lab1);
        Lab1.setBounds(90, 30, 170, 20);
        
        Lab2 = new Label("Note : 3 kali kesempatan");
        Lab2.setFont(new Font("Arial", 1, 10));
        add(Lab2);
        Lab2.setBounds(90, 120, 170, 20);

        txt = new TextField("");
        add(txt);
        txt.setBounds(100, 70, 100, 20);

        Tebak = new Button("Tebak");
        add(Tebak);
        Tebak.setBounds(100, 100, 100, 20);
        Tebak.addActionListener(new mainAction());

    }

    class mainAction implements ActionListener {
        int i=1;
        public void actionPerformed(ActionEvent event) {
            int angka = 1 + (int) (Math.random() * 10);

            int tebak = Integer.parseInt(txt.getText().trim());
            
            if (tebak == angka) {
                JOptionPane.showMessageDialog(null, "Selamat Anda Menang");
            } else {
                if(i==3){
                    JOptionPane.showMessageDialog(null, "Anda Kalah");
                    System.exit(0);
                }
                else
                    i++;
            }
        }
    }
}

