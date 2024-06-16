import java.util.*;

class Q2{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		int sum = 0;

		for(int i=0; i<arr.length; i++){
			System.out.print("Enter Element : ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Element divisible by 3 : ");

		for(int i=0; i<arr.length; i++){
			if(arr[i]%3==0){
				System.out.print(arr[i]+"  ");
				sum=sum+arr[i];
			}
		}
		System.out.print("\nSum of element divisible by 3 is: "+sum);
	}
}

