import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ブラックジャックへようこそ");
        System.out.println("ゲームを開始します。");
        Random rand = new Random();
        int mark_id = rand.nextInt(4);
        System.out.println(mark_id);
        String mark [] = {"スペード", "ハート", "クラブ", "ダイヤ"};
        System.out.println(mark[mark_id]);
        int card_id = rand.nextInt(13);
        System.out.println(card_id +1);
        System.out.println("あなたの引いたカードは" +mark[mark_id] +"の" +(card_id +1) +"です。");
    }
}
