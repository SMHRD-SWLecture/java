package Season3;

public class Ex02이진수십진수로변환 {

	public static void main(String[] args) {
		String str = "01001101";

		int tenNum = Integer.parseInt(str, 2);

		System.out.println(str + "(2) = " + tenNum + "(10)");
	}
}
