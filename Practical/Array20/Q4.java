import java.util.*;

class Q4{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter element: ");

		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the number to search in array: ");
		int S = sc.nextInt();
		for(int i=0; i<size; i++){
			if(S==arr[i]){
				System.out.println(S+" found at index "+i);
			}
		}
	}
}

