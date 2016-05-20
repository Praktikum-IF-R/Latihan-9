package latihan9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class GameRandom extends Frame {

    Label Title, Input;
    Button Main;
    TextField Angka;
    int count = 1;

    public GameRandom() {
        setLayout(null);
        Title = new Label("Games Tebak Angka!");
        Title.setFont(new Font("Berlin Sans FB", 3, 14));
        add(Title);
        Title.setBounds(80, 40, 150, 50);
        Input = new Label("Prediksi anda (1-10) ");
        Input.setFont(new Font("Berlin Sans FB", 1, 11));
        add(Input);
        Input.setBounds(90, 85, 110, 20);
        Angka = new TextField("0");
        add(Angka);
        Angka.setBounds(130, 105, 40, 20);
        Main = new Button("Wish Me Luck!");
        add(Main);
        Main.setBounds(100, 130, 100, 20);
        Main.addActionListener(new ActionForGames());
    }

    class ActionForGames implements ActionListener {

        public void actionPerformed(ActionEvent GameRandom) {
            int angka = Integer.parseInt(Angka.getText().trim());
            int hasil = (int) (Math.random() * 11);
            if (angka == hasil) {
                JOptionPane.showMessageDialog(null, "Uyee Menang! \n\nDesigned by Ardia Regita P (155150200111238)");
                count = 0;
            } else if (count == 3) {
                JOptionPane.showMessageDialog(null, "Yah kalah :( Jawaban yang benar " + hasil + "\n\nDesigned by Ardia Regita P (155150200111238)");
                count = 0;
            }
            count++;
        }
    }
}