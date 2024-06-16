import java.util.*;

class Q5{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		int temp=0;

		for(int i=0; i<size; i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<size/2; i++){
			temp = arr[i];
			arr[i]=arr[size-1-i];
			arr[size-1-i]=temp;
		}
		for(int i=0; i<size; i++){
			System.out.print(arr[i]+" ");
		}

	}
}

