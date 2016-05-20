/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author imgeek
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class Tebaklah_layout extends Frame {

    Label judul, masuk;
    TextField angkamu;
    Button check, exit;
    int chance = 4;

    public Tebaklah_layout() {
        setLayout(null);
        judul = new Label("Game Tebak Angka");
        judul.setFont(new Font("calibri", 1, 13));
        add(judul);
        judul.setBounds(130, 30, 170, 20);

        masuk = new Label("Masukkan Angka : ");
        masuk.setFont(new Font("calibri", 1, 13));
        add(masuk);
        masuk.setBounds(60, 50, 150, 40);

        angkamu = new TextField("0");
        add(angkamu);
        angkamu.setFont(new Font("calibri", 1, 13));
        angkamu.setBounds(220, 55, 100, 25);

        check = new Button("Check");
        check.setBounds(150, 90, 70, 40);
        add(check);
        check.addActionListener(new aksi());
        chance -= 1;

        exit = new Button("Exit");
        exit.setBounds(220, 90, 70, 40);
        add(exit);
        exit.addActionListener(new exitt());

    }

    class aksi implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            int masuk = Integer.parseInt(angkamu.getText().trim());
            int answer = (int)(Math.random() * 4 + 1);
            if (masuk != answer) {
                JOptionPane.showMessageDialog(null, "Jawaban anda salah, sisa " + chance+" kesempatan");
                chance -= 1;
                if (chance < 0) {
                    JOptionPane.showMessageDialog(null, "Anda kalah, wkwkwkwk");

                }
            } else if (masuk == answer) {
                JOptionPane.showMessageDialog(null, "Selamat jawaban anda bener, hore menang kau...");
            }

        }
    }

    class exitt implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            dispose();

        }
    }
}
