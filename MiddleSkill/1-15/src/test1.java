import java.util.Arrays;
import java.util.Collections;

public class test1 {
	public static void main(String[] args) {
		//改行
		c();
		System.out.println("問１");
		//問１のメソッドを呼び出して出力してください（引数５と１０）
		System.out.print(sum(5,10));
		//改行
		c();
		System.out.println("問２");
		//問２のメソッドを呼び出して出力してください（引数"しんぶんし"）
		String word="しんぶんし";
		System.out.print(isKaibun(word));
		//改行
		c();
		System.out.println("問３");
		//問3のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
		Integer [] i = {5,3,1,9,4,8};
		array(i);
		for(int array:i) {
		System.out.print(array);
		}
		//改行
		c();
		System.out.println("問４");
		//問4のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
		int [] k = {5,3,1,9,4,8};
		int arrayMin=array2(k);
		System.out.println(arrayMin);

	}
	//問題1:2つの整数を受け取り、それらの和を返すメソッドを作成してください。
	public static int sum(int number1,int number2) {
		return number1+number2;

	}

	//問題2:文字列を受け取り、その文字列が回文であるかどうかを返すメソッドを作成してください。
	public static boolean isKaibun(String str) {
		boolean isKai=true;
		char[] data=str.toCharArray();
		for(int i=0;i<data.length/2;i++) {
			if(data[i]!=data[data.length-1-i]) {
				isKai=false;
				break;
			}
		}

		return isKai;


	}

	//問題3:整数の配列を受け取り、その配列の要素を降順にソートするメソッドを作成してください。(for文は利用しないこと)
	public static Integer[] array(Integer[] array) {
		Arrays.sort(array,Collections.reverseOrder());
		return array;

	}

	//問題4:整数の配列を受け取り、その配列の中で最小値を持つ要素のインデックスを返すメソッドを作成してください。
	public static int array2(int[] array2){
		int min=array2[0];
		for(int i=1; i<array2.length;i++) {
			if(array2[i]<min) {
				min=array2[i];
			}
		}
		return min;

	}


	//改行メソット
	public static void c() {

		System.out.println();
		return;

	}




}

