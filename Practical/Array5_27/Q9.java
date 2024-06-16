import java.util.*;

class Q9{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		long num = sc.nextInt();
		int count = 0;
		long rev = 0;
		long rem = 0;

		while(num>0){
			rem = num%10;
			rev = rev*10+rem;
			num/=10;
			count++;
		}
		System.out.println(rev);

		long arr[] = new long[count];
		long rem2=0;
		for(int i=0; i<count; i++){
			rem2 = rev%10;
			arr[i]=rem2+1;
			System.out.print(arr[i]);
			rev/=10;
		}
	}
}

