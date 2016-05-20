package Tugas9;

/**
 *
 * @author wahyuridiansyah
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class GameTebak extends Frame {

    int count;
    Label lbJudul, lbAngka;
    TextField txtAngka;
    TextArea wahyu;
    Button btnTebak;

    public GameTebak() {
        setLayout(null);
        lbJudul = new Label("Tebak Angka (1-10) Dengan 3-Kali Kesempatan");
        lbJudul.setFont(new Font("Arial", 1, 14));
        add(lbJudul);
        lbJudul.setBounds(15, 40, 340, 20);
        lbAngka = new Label("Input Angka: ");
        add(lbAngka);
        lbAngka.setBounds(75, 80, 85, 20);
        txtAngka = new TextField("0");
        add(txtAngka);
        txtAngka.setBounds(160, 80, 30, 20);
        btnTebak = new Button("Tebak!");
        add(btnTebak);
        btnTebak.setBounds(195, 80, 60, 20);
        btnTebak.addActionListener(new mainAction());
        wahyu = new TextArea("NIM: 155150200111232 | M. Wahyu Dwi Ridiansyah");
        add(wahyu);
        wahyu.setBounds(10, 120, 330, 20);
    }

    class mainAction implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            int angka = Integer.parseInt(txtAngka.getText().trim());
            int jawaban = (int) (Math.random() * 10 + 1);
            count++;
            if (angka == jawaban) {
                JOptionPane.showMessageDialog(null, "Kamu Menang!");
                count = 0;
            } else if (count == 3) {
                JOptionPane.showMessageDialog(null, "Kamu Kalah! Angka Yang Benar Adalah " + jawaban);
                count = 0;
            } else {
                JOptionPane.showMessageDialog(null, "Jawabanmu Salah!");
            }
        }
    }
}
