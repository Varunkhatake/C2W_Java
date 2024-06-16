import java.util.*;

class Q8{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for(int i=0; i<size; i++){
			System.out.print("Enter element: ");
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<size; i++){
			if(arr[i]>5 && arr[i]<9){
				System.out.println(arr[i] + "is greater then 5 but less then 9");
			}
		}
	}
}

