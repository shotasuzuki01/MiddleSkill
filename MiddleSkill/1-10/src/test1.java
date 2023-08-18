import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class test1 {
	public static void main(String[] args) {

				//改行
				System.out.println("問１");
				//問題1:配列"numa"の要素を全要素を出力しなさい。※i++など利用しないfor文で記述すること
				int[] numa = {1, 2, 3, 4, 5};

				for(int i:numa) {
					System.out.print(i+" ");
				}

				//改行
				System.out.println();

				System.out.println("問２");

				//問題2:配列"numb"の要素を逆順に出力してください。
				int[] numb = {1, 2, 3, 4, 5};
				for(int i=0; i<numb.length/2;i++) {
					int tmp=numb[i];
					numb[i]=numb[numb.length-1-i];
					numb[numb.length-1-i]=tmp;
				}
				System.out.print(Arrays.toString(numb));

				//改行
				System.out.println();

				System.out.println("問３");

				//問題3:配列"numc"の中で偶数の要素だけを合計した値を出力してください。
				int[] numc = {1, 2, 3, 4, 5};

				int sum=0;
				for(int i=0;i<numc.length;i++) {
					if(i%2==0) {
						sum+=i;
					}
				}
				System.out.print(sum);

				//改行
				System.out.println();

				System.out.println("問４");

				//問題4:この配列"numd"をコピーした配列名"new_numd"を作り"new_numd"の中身を出力してください。
				int[] numd = {1, 3, 5, 7, 9};
				int[] new_numd=Arrays.copyOf(numd,numd.length);
				for(int i:new_numd) {
					System.out.print(i+" ");
				}
				//改行
				System.out.println();
				System.out.println("問５");

				//問題5:この配列"nume"を昇順に並び替えて出力しなさい。
				int[] nume = {6, 2, 8, 1, 9};
				for(int i=0; i<nume.length;i++) {
					for(int j=i+1;j<nume.length;j++) {
						if(nume[i]>=nume[j]) {
							int tmp=nume[i];
							nume[i]=nume[j];
							nume[j]=tmp;
						}
					}
					System.out.print(nume[i]+" ");
				}

				//改行
				System.out.println();
				System.out.println("問６");

				//問題6:配列"numf"に要素を1つ(10)追加した配列"new_numf"を作成し出力しなさい。
				int[] numf = {1, 3, 5, 7, 9};
				int number=10;
				int[] new_numf;

				new_numf=addNumber(numf,number);
				for(int i=0;i<new_numf.length;i++) {
					System.out.print(new_numf[i]+" ");
				}

				System.out.println();
				System.out.println("問７");

				//問題7:Map"car"に「キー："honda"　バリュー"ホンダ",キー："toyota"　バリュー："トヨタ",キー："subaru"　バリュー："スバル"」の要素を追加してください
				Map<String,String>car=new HashMap<>();
				car.put("honda","ホンダ");
				car.put("toyota","トヨタ");
				car.put("subaru","スバル");

				//改行
				System.out.println();
				System.out.println("問８");

				//問題8:Map"car"の「キー："toyota"」のバリューを出力してください。
				System.out.print(car.get("toyota"));

				//改行
				System.out.println();
				System.out.println("問９");

				//問題9:Map"car"のキーとバリューを全て出力してください。※for文で行うこと

				for(Iterator<String> itr = car.keySet().iterator(); itr.hasNext();) {
					String key= itr.next();
					System.out.print(key+":"+car.get(key)+" ");
				}
				//改行
				System.out.println();
				System.out.println("問１０");

				//問題10:Map"car"のキーとバリューを全て出力してください。※forEach文で行うこと
				car.forEach((key,val)->System.out.print(key+":"+val+" "));



	}
	//問6　addNumberメソッド
	public static int[] addNumber(int[] numf,int number) {
		int[] newNumber=new int[numf.length+1];
		System.arraycopy(numf, 0, newNumber, 0, numf.length);
		newNumber[numf.length]=number;
		return newNumber;

	}

}
