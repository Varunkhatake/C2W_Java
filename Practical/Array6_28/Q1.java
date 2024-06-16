import java.util.*;

class Q1{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		int flage=0;

		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<size-1; i++){
			if(arr[i]>=arr[i+1]){

			}
			else{
				flage=1;
			}
		}
		if(flage==1){
			System.out.println("gine array are not descending order");
		}
		else{
			System.out.println("array is descending");
		}
	}
}


