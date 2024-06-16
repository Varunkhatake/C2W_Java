import java.util.*;

class Q4{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum=0;
		for(int i=1; i<=num/2; i++){
			if(num%i==0){
				sum=sum+i;
			}
		}
		if(sum>num){
			System.out.println(num+"  is Abundant");
		}
		else{
			System.out.println(num+" is not Abundant" );
		}
	}
}

