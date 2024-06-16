import java.util.*;

class Q3{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];

		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		
		int flage = 0;

		for(int i=0; i<size/2; i++){
			if(arr[i]==arr[size-1-i]){
				
			}
			else{
				flage=1;
			}

		}
		if(flage==1){
			System.out.print("not");
		}
		else{
			System.out.print("array is a palindrome");
		}
		
	}
}
