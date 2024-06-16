import java.util.*;

class Q5{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size: ");
		int size = sc.nextInt();
		int sum = 0;

		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++){
			System.out.print("Enter Element: ");
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++){
			if(i%2==1){
			
				sum = sum+arr[i];
			}
		}
		System.out.print("sum of odd indexed : "+sum);

	}
}



