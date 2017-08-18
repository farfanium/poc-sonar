package coding.bat;

public class CodingBat {
	public static void main(String[] args) {
		System.out.println(last2("axxxaaxx"));
	}

	public static int last2(String str) {
		String tail = str.substring(str.length() - 2, str.length());
		int idx = 0;
		int result = 0;
		while (idx >= 0) {
			idx = str.indexOf(tail, idx);
			if(idx != -1) {
				idx++;
				result++;
			}
		}
		return result - 1;
	}
}
