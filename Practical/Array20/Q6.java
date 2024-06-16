import java.util.*;

class Q6{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size: ");
		int size = sc.nextInt();
		int prod = 1;

		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++){
			System.out.print("Enter Element: ");
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++){
			if(i%2==1){
			
				prod = prod*arr[i];
			}
		}
		System.out.print("product of add indexed "+prod);
	}
}



