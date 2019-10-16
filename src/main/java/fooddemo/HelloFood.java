package fooddemo;

public class HelloFood {

	public static void main(String[] args) {

		Fruit f = new Fruit();
		System.out.println(f.talkAboutYourself());

		Vegetable v = new Vegetable();
		System.out.println(v.talkAboutYourself());
	}

}
