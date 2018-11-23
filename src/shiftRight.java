
public class shiftRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ex1= {1,6,5,4,2};
		shiftRight(ex1);
		
	}
	public static void shiftRight(int[] x) {
		int temp=x[x.length-1];
		for(int y=x.length-1;y>=1;y--) {
			x[y]=x[y-1];
		}
		x[0]=temp;
		for(int z=0;z<x.length;z++) {
		System.out.print(x[z] + " ");
		}
	}

}
