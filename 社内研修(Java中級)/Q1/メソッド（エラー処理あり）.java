public class test {

	public static void main(String args[]) {

		try {
			// 引数の数をチェック
			if (args.length >= 2) {

				// 引数の値が整数であることを確認
				int first = Integer.parseInt(args[0]);
				int second = Integer.parseInt(args[1]);

				// 第二引数が「０」の時
				if (second == 0) {
					System.out.println("0除算はできません");
					System.exit(0);
				}

				// 計算結果
				System.out.println("計算結果は" + first / second + "です");

				// 引数が２つ以下の時
			} else if (args.length < 2) {
				System.out.println("引数が足りません");

				System.exit(0);
			}

			// 引数に文字列を含む時
		} catch (NumberFormatException e) {
			System.out.println("引数に文字列があります");
		}
	}
}
