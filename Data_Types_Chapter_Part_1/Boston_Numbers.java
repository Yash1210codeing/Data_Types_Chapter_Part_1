package Data_Types_Chapter_Part_1;
import java.util.*;
public class Boston_Numbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(sumofdigit(n)==bostonnumber(n)) {
        	System.out.println(1);
        }else {
        	System.out.println(0);
        }
	}
	public static int bostonnumber(int n) {
		int primefact=0;
		for(int i=2;i<=n;i++) {
			while(n%i==0) {
				primefact=primefact+sumofdigit(i);
				n=n/i;
			}
		}
		return primefact;
	}
	public static int sumofdigit(int n) {
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
	}
}
