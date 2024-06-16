import java.util.*;

class Q2{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		int sum = 0;

		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		int count2 = 0;

		for(int i=0; i<size; i++){
			int count1 = 0;
			for(int j=1; j<=arr[i]; j++){
				if(arr[i]%j==0){
					count1++;
				}
			}
			if(count1==2){
				sum=sum+arr[i];
				count2++;
			}
		}
		System.out.println(count2);
		System.out.println(sum);
	}
}
