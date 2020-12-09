package basicPrograms;

public class Reverse {
	public static void main(String[] args) {
		String s = "prabhu";

		StringBuilder sb = new StringBuilder();

		sb.append(s);

		sb = sb.reverse();
		System.out.println(sb);

	}

}
