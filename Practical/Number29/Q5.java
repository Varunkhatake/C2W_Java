import java.util.*;

class Q5{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int sq=0;
		int digit=0;
		 
		while(num>0){
			num/=10;
			digit++;
		}
		sq=temp*temp;
		int rem = 0;
		int rev = 0;
		while(digit>0){
			rem=sq%10;
			rev = rev*10+rem;
			sq/=10;
			digit--;
		}
		int rem2=0;
		int rev2=0;
		while(rev>0){
			rem2=rev%10;
			rev2=rev2*10+rem2;
			rev/=10;
		}
		if(rev2==temp){
			System.out.println(temp+" is automorphic");
		}
		else{
			System.out.println(temp+" not automorphic");
		}
	}
}


