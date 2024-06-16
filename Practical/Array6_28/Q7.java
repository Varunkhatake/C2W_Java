import java.util.*;

class Q7{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];

		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}

		for(int i=0; i<size; i++){
			if(arr[i]>=65 && arr[i]<=90){
				System.out.print((char)arr[i]+" ");
			}
			else{
				System.out.print(arr[i]+" ");
			}
		}
	}
}

