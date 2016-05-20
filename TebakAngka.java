package Latihan9;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class TebakAngka extends Frame {

    TextField tbkAngka;
    Label Judul, MasukAngka;
    Button Submit;
    Button Keluar;
    int angka = 2;
    static int mulai = 1;

    public TebakAngka() {
        setLayout(null);
        Judul = new Label("AYOK TEBAK ANGKA");
        Judul.setFont(new Font("Arial", 1, 14));
        add(Judul);
        Judul.setBounds(130, 30, 200, 20);

        MasukAngka = new Label("Angka ");
        add(MasukAngka);
        MasukAngka.setBounds(120, 70, 62, 20);

        tbkAngka = new TextField("");
        add(tbkAngka);
        tbkAngka.setBounds(200, 70, 100, 20);

        Submit = new Button("Submit");
        add(Submit);
        Submit.setBounds(200, 110, 100, 20);
        Submit.addActionListener(new mainSubmit());

        Keluar = new Button("Exit");
        add(Keluar);
        Keluar.setBounds(100, 110, 100, 20);
        Keluar.addActionListener(new mainKeluar());

    }

    class mainSubmit implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int angka2 = Integer.parseInt(tbkAngka.getText().trim());
            do {
                if (angka2 == angka) {
                    JOptionPane.showMessageDialog(null, "EHEEM BENAR, ANDA MENANG ^_^");
                    mulai = 1;
                } else if (mulai >= 3 || (mulai >= 3 && angka2 != angka)) {
                    JOptionPane.showMessageDialog(null, "SETDAH, ANDA KALAH -_-");
                    mulai = 1;
                    break;
                }
                mulai++;
            } while (mulai <= 1 && mulai >= 3);
        }
    }

    class mainKeluar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
        }

    }
    }
