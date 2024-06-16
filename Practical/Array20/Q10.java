import java.util.*;

class Q10{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter element: ");
		

		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		for(int i=0; i<size; i++){
			if(max<=arr[i]){
				max=arr[i];
			}

		}
		for(int i=0; i<size; i++){
			if(max==arr[i]){
				System.out.print("maximun number in the array found at pos "+i+" is "+max);
			}
		}
	}
}

