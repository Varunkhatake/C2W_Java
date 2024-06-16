import java.util.*;

class Q10{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("num: ");
		long num = sc.nextLong();
		long rem = 0;

		while(num>0){
			rem = num%10;

			if(rem%2==1){
				System.out.print(rem*rem + " ");
			}
			num=num/10;
		}
	}
}


