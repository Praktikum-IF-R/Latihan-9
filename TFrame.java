
package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class TFrame extends Frame {
    Label judul ;
    TextField inputangka;
    Button Insert;
    int t,s;
    public TFrame (){
        setLayout(null);
        judul = new Label ("GAME MASUKKAN ANGKA");
        judul.setFont (new Font ("Calibri", 1, 14));
        add(judul);
        judul.setBounds(90, 60, 180, 20);
        
        inputangka = new TextField();
        add(inputangka);
        inputangka.setBounds(100, 80 , 180 , 20);
        
        Insert = new Button ("START");
        add(Insert);
        Insert.setBounds(110, 125 , 100, 20);
        Insert.addActionListener(new mainAction());
    }
    public class mainAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
        int input = Integer.parseInt(inputangka.getText().trim());
        s =(int) Math.random()*10+1; 
         t++;
        if (input == s){
             JOptionPane.showMessageDialog (null, "Menang");
         }
         else if (input!=s){
             if (input >3){
             JOptionPane.showMessageDialog(null, "Kalah");
         }
             else if (input <=3){
                  JOptionPane.showMessageDialog(null, "Kalah");
         }
        
             
        }

        
    }
}
}