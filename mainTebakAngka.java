package Latihan9;

import com.sun.prism.Image;
import java.awt.Color;
import javax.swing.JOptionPane;

public class mainTebakAngka {

    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "[PENTING WAJIB BACA, SYARAT MAIN]\nMasukkan sebuah bilangan yang anda kira BENAR,\n"
                + "jika anda SALAH memasukkan bilangan yang dimaksud sebanyak lebih dari 3 kali\n"
                + "maka anda akan kalah ....\n"
                + "Semoga Beruntung :)");
        TebakAngka tb = new TebakAngka();
        tb.setBackground(Color.WHITE.darker());
        tb.setForeground(Color.BLACK.brighter());
        tb.setSize(400, 300);
        tb.show();
    }

}
