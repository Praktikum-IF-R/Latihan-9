package latihangui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class Class extends Frame {
    
    
    Label a,b,c;
    TextField p;
    Button btnSubmit,btnKeluar;
    int k;
    public Class(){
        setLayout(null);
        a = new Label("     TEBAK ANGKA KUY !");
        a.setFont(new Font("Arial", 1, 15));
        add(a);
        a.setBounds(100, 50, 500, 40);
        
        p = new TextField("0");
        add(p);
        p.setBounds(100, 100, 200, 35);
        
        btnSubmit = new Button("Submit");
        add(btnSubmit);
        btnSubmit.setBounds(100, 160, 100, 20);
        btnSubmit.addActionListener(new game());
        btnKeluar = new Button("Keluar");
        add(btnKeluar);
        btnKeluar.setBounds(200, 160, 100, 20);
        btnKeluar.addActionListener(new exit());
    }
        
        class game implements ActionListener{
    public void actionPerformed(ActionEvent ae) {
        int hasil = Integer.parseInt(p.getText().trim());
        int a = (int) ((int) 1+Math.random()*10);        
        if(hasil==a){
        JOptionPane.showMessageDialog(null,"SELAMAT ANDA MENANG");
        System.exit(0);}
        else{
        JOptionPane.showMessageDialog(null, "SALAH "+a);
        k++;}
        if(k==3){
        JOptionPane.showMessageDialog(null, "Anda kalah program akan berhenti otomatis!");
        
        System.exit(0);}
    }
}
        
class exit implements ActionListener{
    public void actionPerformed(ActionEvent event){
        System.exit(0);
    }
}
        
    
}
