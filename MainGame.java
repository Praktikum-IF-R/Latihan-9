package latihan99;
public class MainGame {
    public static void main(String[] args) {
        Game window = new Game();
        window.setTitle("Game Tebak Angka dengan GUI java.awt");
        window.setSize(350, 300);
        window.show();
        System.out.println("Jawaban dari 1-10 adalah : " +Game.angka);
    }   
}
