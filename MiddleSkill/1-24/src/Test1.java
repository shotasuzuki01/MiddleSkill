public class Test1 {
	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問題1:下記を条件としたトライキャッチ文を作成しなさい
		//条件：NullPointerExceptionを発生させ「ヌルポが発生しました」と出力する。
		//try文の処理はthrow new を使い強制的に例外を発生させる事。
		//改行


		try {
			String str=null;

			throw new NullPointerException();
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.print("「ヌルポが発生しました」");
		}finally {
			System.out.println();
		}

		System.out.println("問２");
		//問題2:下記を条件としたトライキャッチ文を作成しなさい
		//条件：NumberFormatExceptionを発生させ「数字フォーマットエラーが発生しました」と出力する。
		//またcatch処理後に必ず「例外処理は終了です」と出力されるプログラム構成にする事
		//try文の処理はthrow new を使い強制的に例外を発生させる事。
		//改行
		try {
			String strNum="abc";
			int n1=Integer.parseInt(strNum);
			throw new NumberFormatException();
		} catch (NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			System.out.print("「数字フォーマットエラーが発生しました」");
		}finally {
			System.out.println();
		}

		System.out.println("問３");
		//問題3:下記を条件としたトライキャッチ文を作成しなさい
		//条件：NumberFormatExceptionを発生させNumberFormatException意外のExceptionでキャッチし「何らかの例外が発生しました」と出力する。
		//try文の処理はthrow new を使い強制的に例外を発生させる事。
		//改行
		try {
			String strNum="abc";
			int n1=Integer.parseInt(strNum);
			throw new NumberFormatException();
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			System.out.print("「何らかの例外が発生しました」");
		}finally {
			System.out.println();
		}
		System.out.println("問4");
		//問題4:例外処理を行うメリットを下記にコメント解答欄に記述しなさい
		/*回答欄「例外処理を使うことで例外に対する処理を一元管理できるようになります。
		また、例外を処理した場合には、プログラムを中断せずに処理を先に進めたり、
		どこでどのような異常が発生したのか情報を通知してからプログラムを中断することも可能になります。　」
		*/
	}
}

