package maintebakangka;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class TebakAngka extends Frame {
    int count;
    Label lbJudul, lbAngka;
    TextField txtAngka;
    Button btnTebak;
    public TebakAngka() {
        setLayout(null);
        lbJudul = new Label("Tebak Angka");
        lbJudul.setFont(new Font("Arial", 1, 14));
        add(lbJudul);
        lbJudul.setBounds(120, 40, 170, 20);
        lbAngka = new Label("Masukkan Angka (1-10) : ");
        add(lbAngka);
        lbAngka.setBounds(70, 80, 150, 20);
        txtAngka = new TextField("0");
        add(txtAngka);
        txtAngka.setBounds(220, 80, 30, 20);
        btnTebak = new Button("Tebak");
        add(btnTebak);
        btnTebak.setBounds(120, 120, 100, 20);
        btnTebak.addActionListener(new mainAction());
    }
    class mainAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            int angka = Integer.parseInt(txtAngka.getText().trim());
            int tebak = (int) (Math.random() * 10 + 1);
            count++;
            if (angka == tebak) {
                JOptionPane.showMessageDialog(null, "Anda Menang");
                count = 0;
            } else if (count == 3) {
                JOptionPane.showMessageDialog(null, "Anda Kalah");
                count = 0;
            }
        }
    }
}
