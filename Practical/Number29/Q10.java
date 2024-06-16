import java.util.*;

class Q10{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp =num;
		int num1 = num;
		int digit =0;

		while(num>0){
			num/=10;
			digit++;

		}
		
		int sum =0;
		int rem = 0;
		while(temp>0){
			rem = temp%10;
			int mult=1;
			for(int i=1; i<=digit; i++){
				mult = mult*rem;
			
			}
			sum = sum+mult;
			temp/=10;
		}

		if(sum==num1){
			System.out.println(num1+" is a armstrong number");
		}
		else{
			System.out.println("Not armstrong ");
		}
	}
}

