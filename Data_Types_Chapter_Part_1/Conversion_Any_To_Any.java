package Data_Types_Chapter_Part_1;
import java.util.*;
public class Conversion_Any_To_Any {
	//8
	//2 
	//33
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int src=sc.nextInt();
        int db=sc.nextInt();
        int num=sc.nextInt();
        int num1=base10(num,src);
        System.out.println(disbase(num1,db));
	}
	public static int base10(int num,int src) {
		int ans=0;
		int mul=1;
		while(num!=0) {
			int rem=num%10;
			ans=ans+rem*mul;
			mul*=src;
			//mul/=10;
			num=num/10;
		}
		return ans;
	}
	public static int disbase(int num,int dis) {
		int ans=0;
		int mul=1;
		while(num!=0) {
			int rem=num%dis;
			ans=ans+rem*mul;
			mul*=10;
			num/=dis;
		}
		return ans;
}
}
