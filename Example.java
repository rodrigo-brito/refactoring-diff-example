import java.io.*;

public class Example {
	public void SayHello() {
		System.out.println("Hello");
	}

	public String Letters() {
		String result = "";

		// letters
		result += "A";
		result += "B";
		result += "C";
		result += "D";
		result += "E";

		return result;
	}

	public void DoNothingRenamed() {
		System.out.println("do nothing");
	}

	public static void main(String[] args) {
		Example example = new Example();
		MyNumbers numbers = new MyNumbers();
		System.out.println(example.Letters() + numbers.Numbers());
		example.SayHello();
	}
}