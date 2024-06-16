import java.util.*;

class Q5{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];

		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		

		for(int i=0; i<size; i++){
			int count = 0;
			for(int j=0; j<size; j++){
				while(arr[i]>0){
					arr[i]/=10;
					count++;

					
				}
			
			}

			System.out.print(count + " ");


		}
		
	}
}
