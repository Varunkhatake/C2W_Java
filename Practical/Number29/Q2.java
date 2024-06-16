import java.util.*;

class Q2{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		int rem=0;
		while(num>0){
			rem = num%10;
			int fact = 1;
			for(int i=1; i<=rem; i++){
				fact = fact*i;
			}
			sum = sum+fact;
			num/=10;
		}
		if(sum==temp){
			System.out.println(temp+" is Strong number");
		}
		else{
			System.out.println(temp+" not Strong number");
		}
	}
}

