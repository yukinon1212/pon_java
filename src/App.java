import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ブラックジャックへようこそ");
        System.out.println("ゲームを開始します。");
        Random rand = new Random();
        int random_number = rand.nextInt(4);
        System.out.println(random_number);
        String mark[];
        mark = new String[4];
        mark[0] = "スペード";
        mark[1] = "ハート";
        mark[2] = "クラブ";
        mark[3] = "ダイヤ";
        System.out.println(mark[random_number]);
        Random ran = new Random();
        int random_kazu = ran.nextInt(13);
        System.out.println(random_kazu +1);
        System.out.println("あなたの引いたカードは" +mark[random_number] +"の" +(random_kazu +1) +"です。");
    }
}
