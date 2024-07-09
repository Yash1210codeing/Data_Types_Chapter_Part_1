package Data_Types_Chapter_Part_1;
public class Decimal_To_Binary {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 37; // src (Source) Base 10
		int sum = 0;
		int mul = 1;
		while (n > 0) {
		int rem = n % 2; // Des (Destination) Base 2
		sum = sum + rem * mul;
		mul = mul * 10;
		n = n / 2;
		}
		System.out.println(sum);
	}
}
