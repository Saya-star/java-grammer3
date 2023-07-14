//人を表す抽象クラス
public abstract class AbstractPerson {
	// 性別を取得するための抽象メソッド
	protected abstract String getGender();

	// 性別に応じて標準出力するインスタンスメソッド
	public void speak() {
		System.out.println("I'm a " + getGender());
	}
}