import java.util.*;

class Q2{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[]= new int[size];

		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter specific um");
		int sp = sc.nextInt();


		for(int i=0; i<size; i++){
			if(arr[i]==sp){
				System.out.print(sp+" first occurred at index :  "+i);
				break;
			}
		
		}
	}
}

