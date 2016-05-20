
package tebakang;

import javax.swing.JFrame;


public class gui{
   public static void main(String args[]){
        tebakangka gui = new tebakangka();
       
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setTitle("Tebak Angka");
        gui.setSize(300,250);
    }
}