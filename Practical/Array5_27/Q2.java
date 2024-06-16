import java.util.*;

class Q2{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];

		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		int sum1 = 0;

		for(int i=0; i<size; i++){
			if(arr[i]%2==0){
				sum=sum+arr[i];
			}
			else{
				sum1=sum1+arr[i];
			}

		}
		System.out.println("odd sum"+ sum1);
		System.out.println("even sum"+ sum);
	}
}
