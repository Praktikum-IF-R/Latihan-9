package tebakangka;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class tebak extends Frame {

    Label lbJudul, lbTulis, lbPerintah;
    TextField txtPerintah, txtAngka;
    Button btnHasil;

    public tebak() {
        setLayout(null);
        lbJudul = new Label("TEBAK ANGKA");
        lbJudul.setFont(new Font("Calibri", 1, 20));
        add(lbJudul);
        lbJudul.setBounds(100, 40, 170, 20);

        lbPerintah = new Label("Masukkan angka 1 sampai 9 !");
        add(lbPerintah);
        lbPerintah.setBounds(50, 70, 200, 20);

        txtAngka = new TextField("");
        add(txtAngka);
        txtAngka.setBounds(50, 90, 250, 30);

        lbTulis = new Label("Kamu memiliki tiga kesempatan!");
        add(lbTulis);
        lbTulis.setBounds(70, 150, 200, 20);

        btnHasil = new Button("ENTER");
        add(btnHasil);
        btnHasil.setBounds(120, 200, 100, 40);
        btnHasil.addActionListener(new mainAction());
    }

    class mainAction implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            int j = 0;
            j++;
            int angka = Integer.parseInt(txtAngka.getText().trim());
            int nilai;
            nilai = (int) (Math.random() * 10);
            if (angka == nilai) {
                JOptionPane.showMessageDialog(null, "CONGRATS!");
                System.exit(0);
            }
            if (angka != nilai) {                
                if (j <= 3) {
                    JOptionPane.showMessageDialog(null, "YOU ARE LOSER!");
                }
                if (j > 3) {
                    JOptionPane.showMessageDialog(null, "U R RUNNING OUT THE CHANCE");
                    System.exit(0);
                }
            }           
        }
    }
}
