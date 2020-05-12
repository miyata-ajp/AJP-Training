import java.util.Random;
import java.util.Scanner;

public class Blackjack {

	public static void main(String[] args) {

		// ①初期値を設定
		int child = 0;
		int parent = 0;
		String input = "Yes";

		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		// ②入力した文字がNoか判断
		while (!input.equals("No")) {

			// ③Yesが入力された時
			if (input.equals("Yes")) {

				// ④1～10のランダム数値(子)を１つ取得
				int randomValue = random.nextInt(10) + 1;

				// ⑤.⑥取得したランダム数値とランダム数値(子)の合計表示
				int childTotal = (randomValue + child);
				System.out.println("数値：" + randomValue + ",合計：" + childTotal);
				child = childTotal;

				// ⑦.⑧合計が21より大きいか比較
				if (child > 21) {
					System.out.print("LOSE");
					System.exit(0);
					scan.close();
				}
			}
			// ⑨メッセージを出力
			System.out.println("次のランダム数値を取得しますか。[Yes/No]");

			// ⑩ランダム数値の取得するかを入力する
			input = scan.next();
		}
		scan.close();

		// ⑪15～22のランダム数値(親)を１つ取得
		parent = random.nextInt(8) + 15;

		// ⑫数値(親)と数値(子)の合計を表示
		System.out.println("親数値：" + parent + ",合計：" + child);

		// ⑬～⑲数値(親)と数値(子)合計を比較
		if (parent > 21) {
			System.out.println("WIN");
		} else if (parent > child) {
			System.out.println("LOSE");
		} else if (parent == child) {
			System.out.println("DRAW");
		} else {
			System.out.println("WIN");
		}

	}
}
