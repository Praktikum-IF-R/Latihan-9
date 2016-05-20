package latihan99;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class Game extends Frame {

    static int angka = (int)(Math.random() * 9 + 1);
    static int count = 0;
    Label lbTebak, lbJudul;
    TextField txtTebak;
    Button btnTebak;

    public Game() {
        setLayout(null);

        lbJudul = new Label("Game Tebak Angka");
        lbJudul.setFont(new Font("Arial", 1, 14));
        add(lbJudul);
        lbJudul.setBounds(100, 50, 170, 20);

        lbTebak = new Label("Check : ");
        add(lbTebak);
        lbTebak.setBounds(100, 125, 65, 20);

        txtTebak = new TextField("0");
        add(txtTebak);
        txtTebak.setBounds(200, 125, 60, 20);

        btnTebak = new Button("Check");
        add(btnTebak);
        btnTebak.setBounds(120, 200, 100, 20);
        btnTebak.addActionListener(new mainAction());
    }

    class mainAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            int tebakan = Integer.parseInt(txtTebak.getText().trim());
            if (tebakan != angka) {
                JOptionPane.showMessageDialog(null, "Jawaban salah!");
                count += 1;
                if (count == 3) {
                    JOptionPane.showMessageDialog(null, "Kesempatan habis!");
                    System.exit(0);
                }
            } else if (tebakan == angka) {
                JOptionPane.showMessageDialog(null, "Jawaban benar!");
                System.exit(0);
            }

        }
    }
}
