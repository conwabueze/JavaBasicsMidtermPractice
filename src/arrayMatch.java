
public class arrayMatch {

	public static void main(String[] args) {
		int[] a = {9,2,3,4};
		int[] b= {4,3,6,5};
		int[] c= {3,2,1,4};
		longest(a,b,c);
	}

	public static void match(int[] a, int[] b, int[] c) {
		String ref= longest(a,b,c).toString();
		String first = a.toString();
		String sec = b.toString();
		String third = c.toString();
		System.out.print("[");
		for(int x=0; x<ref.length(); x++) {
			String charlie = Character.toString(ref.charAt(x));
			if(first.contains(charlie)&&sec.contains(charlie)&&third.contains(charlie)) {
				System.out.print(ref.charAt(x)+",");
			}
		}
		System.out.print("]");
	}
	
	public static int[] longest(int[] a, int[] b, int[] c) {
		int max = Math.max(a.length, b.length);
		max=Math.max(max, c.length);
		if(max==a.length) {
			return a;
		}
		else if(max==b.length) {
		return b;
		}
		else if(max==c.length) {
				return c;
		}
		return c;
	}

}
	
