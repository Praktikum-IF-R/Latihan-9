package TebakAngka;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class TFrame extends Frame{
    Label lbInput, lbJudul,lbBingkaia, lbBingkaib;
    Button btnSubmit, btnKeluar;
    TextField txtIn;
    int b;
    public TFrame(){
        setLayout(null);
        lbBingkaia = new Label("==================================");
        add(lbBingkaia);
        lbBingkaia.setBounds(115,35,170,20);
        lbBingkaib = new Label("==================================");
        add(lbBingkaib);
        lbBingkaib.setBounds(115,85,170,20);
        lbJudul = new Label("Game Tebak Angka");
        lbJudul.setFont(new Font("Arial",1,14));
        add(lbJudul);
        lbJudul.setBounds(130, 60, 170, 20);
        lbInput = new Label("Masukkan angka : ");
        add(lbInput);
        lbInput.setBounds(100, 120, 100, 20);
        txtIn = new TextField("");
        add(txtIn);
        txtIn.setBounds(250, 120, 62, 20);
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
        int hasil = Integer.parseInt(txtIn.getText().trim());
        int a = (int) ((int) 1+Math.random()*10);        
        if(hasil==a){
        JOptionPane.showMessageDialog(null,"SELAMAT ANDA MENANG");
        System.exit(0);}
        else{
        JOptionPane.showMessageDialog(null, "SALAH "+a);
        b++;}
        if(b==3){
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
