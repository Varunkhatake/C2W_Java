import java.util.*;

class Q9{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];

		for(int i=0; i<size; i++){
			arr[i]=sc.nextInt();
		}
		int count = 0;

		for(int i=0; i<size; i++){
			int rem = 0;
			int rev = 0;
			int temp = arr[i];
			while(arr[i]>0){
				rem=arr[i]%10;
				rev=rev*10+rem;
				arr[i]/=10;
			}
			if(rev==temp){
				count++;
			}
		}
		System.out.print("count of palindrome element is "+count);
	}
}
