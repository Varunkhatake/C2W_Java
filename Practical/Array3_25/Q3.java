import java.util.*;

class Q3{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[]= new int[size];

		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter specific um");
		int sp = sc.nextInt();
		int count = 0;


		for(int i=0; i<size; i++){
			if(arr[i]==sp){
				count++;
			}
		
		}
		System.out.print("number "+sp + " occured "+count+" time in an array");
	}
}

