import java.util.*;

class Q4{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];

		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		

		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				if(arr[i]==arr[j] && i!=j){
					System.out.print("first dublicate at index : +"+i);
					break;
					
				}


			}


		}
		
	}
}
