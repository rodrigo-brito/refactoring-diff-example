import java.io.*;

public class Example {
	public void DoNothing() {
		System.out.println("do nothing");
	}

	public String LetterAndNumbers() {
		String result = "";

		// letters
		result += "A";
		result += "B";
		result += "C";
		result += "D";
		result += "E";

		// numbers
		result += "1";
		result += "2";
		result += "3";
		result += "4";
		result += "5";

		return result;
	}

	public void SayHello() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		Example example = new Example();
		System.out.println(example.LetterAndNumbers());
		example.SayHello();
	}
}