package bab8;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class Game extends Frame {

    Label lbJudul, lbJawab;
    TextField txtJawab;
    Button btnJawab;
    private int a, i=0;

    public Game() {
        this.a=(int)Math.random()*10+1;
        setLayout(null);
        lbJudul = new Label("Tebak Angka 1 - 10");
        lbJudul.setFont(new Font("Times new roman", 1, 16));
        add(lbJudul);
        lbJudul.setBounds(300, 30, 250, 45);
        lbJawab = new Label("tebakan anda ");
        add(lbJawab);
        lbJawab.setBounds(100, 100, 100, 20);
        txtJawab = new TextField("");
        add(txtJawab);
        txtJawab.setBounds(200, 100, 170, 20);
        btnJawab = new Button("Check");
        add(btnJawab);
        btnJawab.setBounds(300, 150, 100, 20);
        btnJawab.addActionListener(new mainAction());i++;
    }

    class mainAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            int jawab = Integer.parseInt(txtJawab.getText().trim());
            if(jawab!=a){
                JOptionPane.showMessageDialog(null, "salah");i++;}
            else
                JOptionPane.showMessageDialog(null, "jawaban anda benar");i=0;
            if(i==4)
                JOptionPane.showMessageDialog(null, "jawaban anda benar");
        }
    }
}