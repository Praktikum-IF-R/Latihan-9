package tebakang;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class tebakangka extends JFrame {

    int count = 0;
    Label lbJudul;
    int acak, hasil;
    private JButton button;
    private JTextField textfield;
    private JLabel label;
    private JLabel promptlabel;
    private JLabel resultlabel;
    private JLabel randomlabel;

    public tebakangka() {
        setLayout(null);
        promptlabel = new JLabel("Pilih Angka 1-10");
        add(promptlabel);
        promptlabel.setBounds(85, 30, 170, 20);

        textfield = new JTextField(5);
        add(textfield);
        textfield.setBounds(50, 70, 170, 20);

        button = new JButton("?Bener Ga Ya?");
        add(button);
        button.setBounds(50, 120, 170, 20);
        resultlabel = new JLabel("");
        add(resultlabel);

        randomlabel = new JLabel("");
        add(randomlabel);

        event e = new event();
        button.addActionListener(e);

    }

    public class event implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            acak = (int) (Math.random() * 10 + 1);
            count++;
            try {
                hasil = (int) (Double.parseDouble(textfield.getText()));
                if (hasil == acak) {

                    JOptionPane.showMessageDialog(null, "Anda Menang");
                    count = 0;

                } else if (count == 3) {
                    JOptionPane.showMessageDialog(null, "Anda Salah");
                    count = 0;
                }

            } catch (Exception ex) {
                randomlabel.setText("Please enter only the number");
            }

        }

    }
}
