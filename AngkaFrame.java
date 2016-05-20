/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihanbab9;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Anita Rizky A
 */
public class AngkaFrame extends Frame{
    Label judul, kata;
    TextField txtangka;
    Button btnHasil;

public AngkaFrame(){
        setLayout(null);
        
        judul = new Label("Angka, Angka.. Angka");
        judul.setFont(new Font("Arial", 1, 14));
        add(judul);
        judul.setBounds(100, 30, 170, 20);
        
        kata = new Label("Masukkan angka 1 - 10 : ");
        add(kata);
        kata.setBounds(100, 60, 170, 20);
        
        txtangka = new TextField("");
        add(txtangka);
        txtangka.setBounds(125, 80, 60, 20);
        
        btnHasil = new Button("Angka");
        add(btnHasil);
        btnHasil.setBounds(120, 180, 100, 20);
        btnHasil.addActionListener(new mainAction());
}
 
    class mainAction implements ActionListener {
        int count = 0;
        public void actionPerformed(ActionEvent event) {
            
            int angka = Integer.parseInt(txtangka.getText().trim());
            if (angka == (int)(Math.random() * 10)+1){
                JOptionPane.showMessageDialog(null,"Yey, Selamat Kamu Menang!");
                System.exit(0);
            }
            else {  
                 JOptionPane.showMessageDialog(null,"Kalah");
                 count++;
            }
            
            if(count == 3)
                JOptionPane.showMessageDialog(null,"Oops, Maaf Kamu Kalah");
            }
        }
    }