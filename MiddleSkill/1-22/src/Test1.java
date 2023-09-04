import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) throws ParseException {
		String shinyaBirthday = "1998/03/19";
		String minamiBirthday = "2000/02/14";
		String furuyamaBirthday = "1998/09/12";
		//改行
		c();
		System.out.println("問１");
		//問題1:現在の時刻を出力してください
		Date date = new Date();
		System.out.print(date);

		//改行
		c();
		System.out.println("問２");
		//問題2:shinyaBirthdayとminamiBirthdayを日付型に変更し条件式で誕生日を比較し早い方の日付を文字列型で出力しなさい。
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date shinyaBirthday2 = sdFormat.parse(shinyaBirthday);
		Date minamiBirthday2 = sdFormat.parse(minamiBirthday);
		long long1 = shinyaBirthday2.getTime();
		long long2 = minamiBirthday2.getTime();

		if (long1 > long2) {
			String strDate = sdFormat.format(minamiBirthday2);
			System.out.print(strDate);

		} else if (long1 < long2) {
			String strDate = sdFormat.format(shinyaBirthday2);
			System.out.print(strDate);
		}
		//問題3:furuyamaBirthdayに５年2ヶ月追加した値を文字列型で表示しなさい
		c();
		System.out.println("問3");
		Date furuyamaBirthday2 = sdFormat.parse(furuyamaBirthday);
		Calendar furuyamaCal = Calendar.getInstance();
		furuyamaCal.setTime(furuyamaBirthday2);
		furuyamaCal.add(Calendar.YEAR, 5);
		furuyamaCal.add(Calendar.MONTH, 2);
		System.out.print(sdFormat.format(furuyamaCal.getTime()));

	}

	//改行メソット
	public static void c() {

		System.out.println();
		return;

	}

}
