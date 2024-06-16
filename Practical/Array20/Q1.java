import java.util.*;

class Q1{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size: ");
		int size = sc.nextInt();
		int count = 0;

		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++){
			System.out.print("Enter Element: ");
			arr[i] = sc.nextInt();
		}
		System.out.print("even numbers ");
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2==0){
				System.out.print(arr[i]+" ");
				count++;
			}
		}
		System.out.print("\nCount of even element is "+count);
	}
}



