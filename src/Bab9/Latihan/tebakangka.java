package Bab9.Latihan;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class tebakangka extends Frame {

    static int angka = (int) (Math.random() * 9 + 1);
    static int count = 0;
    Label lbTebak, lbJudul;
    TextField txtTebak;
    Button btnTebak;

    public tebakangka() {
        setLayout(null);
        lbJudul = new Label("   Tebak Angka 1-10");
        lbJudul.setFont(new Font("Arial", 1, 14));
        add(lbJudul);
        lbJudul.setBounds(100, 30, 170, 20);

        lbTebak = new Label("Tebak : ");
        add(lbTebak);
        lbTebak.setBounds(100, 60, 62, 20);

        txtTebak = new TextField("0");
        add(txtTebak);
        txtTebak.setBounds(200, 60, 60, 20);

        btnTebak = new Button("Tebak");
        add(btnTebak);
        btnTebak.setBounds(120, 100, 100, 20);
        btnTebak.addActionListener(new mainAction());
    }

    class mainAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {

            int tebakan = Integer.parseInt(txtTebak.getText().trim());
            if (tebakan != angka) {
                JOptionPane.showMessageDialog(null, "Salah!");
                count += 1;
                if (count == 3) {
                    JOptionPane.showMessageDialog(null, "Kesempatan jawab habis!");
                    System.exit(0);
                }
            } else if (tebakan == angka) {
                JOptionPane.showMessageDialog(null, "Benar!");
                System.exit(0);
            }

        }
    }
}
