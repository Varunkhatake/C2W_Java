import java.util.*;

class Q4{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr1[] = new int[size];
		int arr2[] = new int[size];

		for(int i=0; i<size; i++){
			arr1[i] = sc.nextInt();
			

		}
		System.out.println("array2");
		for(int i=0; i<size; i++){
			arr2[i]=sc.nextInt();
		}


		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				if(arr1[i]==arr2[j]){
					System.out.print(arr1[i]+" ");
				}
			}
		}
	}
}


