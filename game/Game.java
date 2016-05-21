package game;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
public class Game extends Frame{
    Label labeljudul, labelinput;
    TextField txtInput;
    Button btnJwb;
    public Game(){
        setLayout(null);
    labeljudul = new Label("Masukkan angka 1 - 10");
    labeljudul.setFont(new Font("Impact", 6,18));
    add(labeljudul);
    labeljudul.setBounds(300, 130, 200 , 20);
    labelinput = new Label("Input Angka : ");
    add(labelinput);
    labelinput.setBounds(200, 160, 100, 20);
    txtInput = new TextField("");
    add(txtInput);
    txtInput.setBounds(300,160,200, 20);
    btnJwb = new Button("Press to check");
    btnJwb.setFont(new Font("Impact", 6,18));
    add(btnJwb);
    btnJwb.setBounds(300, 180, 150, 20);
    btnJwb.addActionListener(new mainAction());
    JOptionPane.showMessageDialog(null, "Welcome To Game Tebak Angka"+"\n Cara bermain sangat simple, pemain hanya cukup meinginputkan angka dari 1-10");
    }
    class mainAction implements ActionListener {
            int count;
            public void actionPerformed(ActionEvent event) {
                int jawaban=Integer.parseInt(txtInput.getText().trim());
                int hasil=(int)(Math.random()*5+5);
                if(hasil==jawaban){
                    JOptionPane.showMessageDialog(null, "Congrats!! You Win this game");
                    System.exit(0);
                }
                else if(hasil!=jawaban){
                    hasil=count++;
                }
                if(count==3){
                     JOptionPane.showMessageDialog(null, "You Lose");
                    System.exit(0);
                }
            }
        }
}