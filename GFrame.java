package Latihan;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GFrame extends Frame{
    int angka = (int)(Math.random()*9+1);
    int angka2 = 0;
    Label judul, input;
    TextField txtInput;
    Button result, random;
    
    public GFrame(){
        setLayout(null);
        judul = new Label("Game Tebak Angka");
        add(judul);
        judul.setBounds(95, 60, 170, 30);
        
        input = new Label("Input Angkamu");
        add(input);
        input.setBounds(105, 100, 100, 20);
        
        txtInput = new TextField();
        add(txtInput);
        txtInput.setBounds(100, 125, 100, 20);
        
        result = new Button("Mari Tebak");        
        add(result);
        result.setBounds(98, 180, 100, 20);
        result.addActionListener(new mainAction());
    }
    class mainAction implements ActionListener{
        public void actionPerformed(ActionEvent c){
            int a = Integer.parseInt(txtInput.getText().trim());
            if(a==angka){
                if(angka2<3){
                    JOptionPane.showMessageDialog(null, "Anda Menang");}
                else{
                    JOptionPane.showMessageDialog(null, "3x Kesempatan Anda Habis, Walau Benar.");
                }
            }
            else{
            angka2++;
            JOptionPane.showMessageDialog(null, "Anda Kalah");
            }
        }
    }
}