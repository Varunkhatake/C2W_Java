import java.util.*;

class Q8{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int rem=0;
		while(num>0){
			rem=num%10;
			if(rem==0){
				System.out.println("is duck number");
				break;
			}
			num/=10;
		}
		if(rem!=0){
			System.out.println("is not duck number");
		}

	}
}
