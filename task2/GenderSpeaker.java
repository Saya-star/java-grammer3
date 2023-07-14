public class GenderSpeaker {
	public static void main(String args[]) {

		// Manクラス、Womanクラスのインスタンスを生成し、doSpeakメソッドに渡す
		doSpeak(new Man());
		doSpeak(new Woman());
	}

	// doSpeakメソッド
	public static void doSpeak(AbstractPerson person) {
		person.speak();
	}
}
