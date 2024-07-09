package Data_Types_Chapter_Part_1;
public class Binary_To_Decimal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=100101;     // src base 2
        int sum=0;
        int mul=1;
        while(n>0) {
        int rem=n%10;   // Des Base 10
        sum=sum+rem*mul;
        mul=mul*2;
        n=n/10;
        }
        System.out.println(sum);
	}
}
