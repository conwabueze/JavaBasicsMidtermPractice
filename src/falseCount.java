
public class falseCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] arr = { false, false, false, true, true, true, true };
		System.out.print(percentFalse(arr));
	}

	public static double percentFalse(boolean[] source) {
		int count = 0;
		for (int x = 0; x < source.length; x++)
			if (source[x] == false) {
				count++;
			}
		double percent = (count / (double)source.length)*100;
		return percent;
	}

}
