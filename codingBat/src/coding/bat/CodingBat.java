package coding.bat;

public class CodingBat {
	public static int last2(String str) {
		String tail = str.substring(str.length() - 2);
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
