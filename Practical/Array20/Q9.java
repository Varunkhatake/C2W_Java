import java.util.*;

class Q9{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter element: ");
		

		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		for(int i=0; i<size; i++){
			if(min>=arr[i]){
				min=arr[i];
			}

		}
		System.out.print("min no is: "+min);

	}
}

