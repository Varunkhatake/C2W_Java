import java.util.*;

class Q1{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int sum  = 0;
		int avg = 0; 

		for(int i=0; i<size; i++){
			arr[i]=sc.nextInt();
		}
		

		for(int i=0; i<size; i++){
			sum=sum+arr[i];
		}
		avg=sum/size;
		System.out.print("avg is  "+avg);
	}
}


