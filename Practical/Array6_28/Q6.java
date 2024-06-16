import java.util.*;

class Q6{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];

		for(int i=0; i<size; i++){
			arr[i]= sc.nextInt();
		}

		for(int i=0; i<size; i++){
			if(arr[i]%5==0){
				System.out.println("An element munltiple of 5 found at index: "+i);
			}
		}
	}
}
