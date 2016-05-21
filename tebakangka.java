package latian;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class tebakangka extends Frame {

    int hitung;
    Label judul, input, kali;
    TextField angka;
    Button tebak;

    public tebakangka() {
        setLayout(null);

        judul = new Label("Can you guess the number?");
        judul.setFont(new Font("Calibri", 1, 20));
        add(judul);
        judul.setBounds(95, 30, 300, 30);

        input = new Label("Input between 1-10");
        input.setFont(new Font("Arial", 1, 11));
        add(input);
        input.setBounds(170, 80, 150, 20);

        kali = new Label("You have 3 chance only");
        kali.setFont(new Font("Arial", 1, 11));
        add(kali);
        kali.setBounds(160, 122, 150, 20);

        angka = new TextField();
        add(angka);
        angka.setBounds(120, 100, 200, 20);

        tebak = new Button("Guess");
        add(tebak);
        tebak.setBounds(170, 200, 100, 50);
        tebak.addActionListener(new mainAction());

    }

    class mainAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            int a = Integer.parseInt(angka.getText().trim());
            int jawaban = (int) (Math.random() * 10);
            hitung++;
            if (hitung <= 3) {
                if (a == jawaban) {
                    JOptionPane.showMessageDialog(null, "Indeed you are daebak");
                    System.exit(hitung);
                } else if (a != jawaban) {
                    JOptionPane.showMessageDialog(null, "You suck, maybe next time");
                }
            } else {
                System.exit(0);
            }
        }
    }
}
