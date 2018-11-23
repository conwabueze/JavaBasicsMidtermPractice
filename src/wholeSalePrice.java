import java.util.Scanner;

public class wholeSalePrice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter wholesale value: ");
		double wholeSale= input.nextDouble();
		System.out.print("Enter percentage: ");
		int percent= input.nextInt();
		calculate(wholeSale,percent);
		
		

	}
	public static void calculate(double wholeSale, int percent) {
		double convertCent= percent/100.0;
		double discount = convertCent*wholeSale;
		double retail= discount+wholeSale;
		System.out.printf("Your retail value is: $%.2f", retail);
	}

}
