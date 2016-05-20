package Bab9.Latihan;

public class mainTebak {

    public static void main(String[] args) {
        tebakangka window = new tebakangka();
        window.setTitle("Tebak Angka");
        window.setSize(350, 170);
        window.show();
        System.out.println("RNG 1-10 : "+tebakangka.angka);
    }
}
