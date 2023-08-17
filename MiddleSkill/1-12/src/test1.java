
public class test1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//改行
		c();
		System.out.println("問１");
		//問題1:下記の条件を満たすようにif文を3つネストして条件式を作成してください。
		//
		//変数x,y,zは正の整数であれば下の条件に続く。それ以外は”正の整数：NG”と表示する
		//xの値が10の倍数であれば下の条件に続く。それ以外は”10の倍数：NG”と表示する
		//x + y + z = 100であれば”プラス100：OK”それ以外は”プラス100：NG”と表示する

		int x = 20;
		int y = 60;
		int z = 20;

		if (x > 0 && y > 0 && z > 0) {
			if (x % 10 == 0) {
				if (x + y + z == 100) {
					System.out.print("プラス100 : OK");
				} else {
					System.out.print("プラス100 : NG");
				}

			} else {
				System.out.print("10の倍数 : NG");
			}

		} else {
			System.out.print("正の整数 : NG");
		}

		//改行
		c();
		System.out.println("問２");
		//問題2:問1と同じ内容で三項演算子で条件式を作成しなさい。最後に変数aを出力する。
		String a = "";

		a=x>0&&y>0&&z>0?x%10==0?x+y+z==100?"プラス100 : OK":"プラス100 : NG":"10の倍数NG" : "正の整数 : NG";
		System.out.print(a);

	}

	//改行メソット
	public static void c() {

		System.out.println();
		return;

	}
}
