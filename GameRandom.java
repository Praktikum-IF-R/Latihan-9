/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamerandom;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class GameRandom extends Frame{

    Label lbJudul, lbPerintah;
    TextField txtAngka;
    Button btHasil;
    int i = 1;
    
    public GameRandom(){
        setLayout(null);
        lbJudul = new Label("Game Tebak Angka");
        lbJudul.setFont(new Font("Monotype Corsiva", 3, 14));
        add(lbJudul);
        lbJudul.setBounds(110, 40, 150, 50);
        
        lbPerintah = new Label("Masukan Angka 1 - 10 !");
        lbPerintah.setFont(new Font("Time New Roman", 1, 11));
        add(lbPerintah);
        lbPerintah.setBounds(115, 85, 135, 20);
        
        txtAngka = new TextField("");
        add(txtAngka);
        txtAngka.setBounds(155, 105, 60, 20);
        
        btHasil = new Button("Coba!");
        add(btHasil);
        btHasil.setBounds(135, 130, 100, 20);
        btHasil.addActionListener(new mainAction());
    }
    class mainAction implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            int angka= Integer.parseInt(txtAngka.getText().trim());
            int nilai = (int)(Math.random()*11);
            if(angka == nilai){
                JOptionPane.showMessageDialog(null, "TEBAKAN ANDA BENAR!");
            }else if(i == 3){
               JOptionPane.showMessageDialog(null, "LOSER!!!!!");
            }
            i++;
        }
        
    }
}
