package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class TebakAngka extends Frame {
    Label judul,angka1;
    TextField angka;
    Button btntebak;
    public TebakAngka(){
        setLayout(null);
        setBackground(Color.PINK);
        judul = new Label("Tebak Angka");
        judul.setFont(new Font("Arial", 1, 20));
        add(judul);
        judul.setBounds(85, 60, 170, 20);
        angka1 = new Label("Angka (1-10) : ");
        add(angka1);
        angka1.setBounds(85, 100, 80, 20);
        angka = new TextField();
        add(angka);
        angka.setBounds(170, 100, 40, 20);
        btntebak = new Button("Tebak");
        btntebak.setBackground(Color.MAGENTA);
        add(btntebak);
        btntebak.setBounds(100, 150, 100, 20);
        btntebak.addActionListener(new Tebak());
    }
    public class Tebak implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
        int angkarahasia = (int) ((Math.random()*10)+1);
           int a = Integer.parseInt(angka.getText());
           if (a == angkarahasia){
               JOptionPane.showMessageDialog(btntebak,"Benar");
           }else {
               JOptionPane.showMessageDialog(btntebak,"\t\t             Salah\n Jangan Menyerah~");
               JOptionPane.showMessageDialog(btntebak,"\t\t             Salah\n Jangan Menyerah~");
           }
        }
    }
}
