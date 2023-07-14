public class Person {
    //enumを使う
    public enum Gender {MAN,WOMAN};
    private Gender gender;

    //インスタンスメソッドspeak：性別を元に表示内容(I'm a 性別)を切り替える
    public Person (Gender gender){
        this.gender = gender;
    }

    public void speak() {
        switch (gender) {
            case MAN:
                System.out.println("I'm a man.");
                break;
            case WOMAN:
                System.out.println("I'm a woman.");
                break; 
            default:
        }
    }


//mainクラス：男性・女性のインスタンスを一つずつ作成する
//それぞれのインスタンスのspeakを呼び出す
    public static void main (String[] args){
        Person man = new Person(Gender.MAN);
        man.speak();

        Person woman = new Person(Gender.WOMAN);
		woman.speak();
	}
}
