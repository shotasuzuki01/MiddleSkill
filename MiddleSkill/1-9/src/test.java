
public class test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		1.数字の5と9の変数を定義し、足した数字を出力しなさい。
		int a=5;
		int b=9;
		int ab=a+b;
		System.out.println(ab);

//		2.64ビット整数の「1111111111」を定義し2倍した値を出力しなさい。
		long c=1111111111;
		long cc=c  * 2;
		System.out.println(cc);

//		3.boolean型の変数の値に不正な文字列比較を入れてfalseを出力してください。
		boolean isString;
		String msg1="ABC";
		String msg2="abc";

		isString=msg1.equals(msg2);

		System.out.println(isString);

	}

}
