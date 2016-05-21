/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB9.latihan;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class GUInya extends Frame {

    Button btn;
    TextField txtNebak, txtHasil;
    Label judul;
    boolean test;
    int perhitungan;

    public GUInya() {
        setLayout(null);
        judul = new Label("Coba keberuntunganmu");
        add(judul);
        judul.setFont(new Font("Arial", 1, 14));
        btn = new Button("coba");
        add(btn);
        btn.setBounds(120, 200, 100, 20);
        btn.addActionListener(new mainAction());
        txtNebak = new TextField("0");
        add(txtNebak);
        txtNebak.setBounds(20, 90, 100, 20);
        txtNebak.setSize(300, 30);
        txtNebak.setBackground(Color.GREEN);
    }

    class mainAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            perhitungan++;
            if (perhitungan > 3) {
                JOptionPane.showMessageDialog(btn, "Uwess Leeee..");
            } else if (perhitungan <= 3) {
                if (Integer.parseInt(txtNebak.getText()) == (int) ((Math.random() * 10) + 1)) {
                    JOptionPane.showMessageDialog(btn, "Menang");
                } else {
                    JOptionPane.showMessageDialog(btn, "Kalah.. coba lagi");
                }
            }
        }
    }
}
