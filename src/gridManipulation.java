
public class gridManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] box=fillGrid(5);
	
	}
	
	public static int[][] fillGrid(int n){
		int[][] box=new int[n][n];
		int tot =n*n;
		int tot2 = 1;
		int rowCount=0;
		for(int row=0; row<box.length; row++) {
			for(int col=0;col<box.length;col++) {
				box[col][row]=tot2;
				tot2++;
				System.out.print(box[row][col]+"\t");
				
			}
				
			System.out.println();	
		}
		return box;
		}
		
		
		
	
		
	
	
			
		/*for(int row2=0; row2<box.length; row2++) {
				for(int col2=0;col2<box[row2].length;col2++) {
					box[row2][col2]=box[col2][row2];
					
					System.out.print(box[row2][col2]+"\t");
					rowCount++;
					
					if(rowCount==n) {
						System.out.println();
						rowCount=0;
				}
				
			}
				return box;
		}*/
		
	
}
	



