import java.util.*;

class Q6{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];

		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		

		for(int i=0; i<size; i++){
			int count =0;
			for(int j=1; j<=arr[i]; j++){
				if(arr[i]%j==0){
					count++;
					
				}
				
			}
			if(count==2){
				System.out.print("first prime number found at index: "+i);
				break;
			}



		}
		
	}
}
