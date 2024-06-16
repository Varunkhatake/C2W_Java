import java.util.*;

class Q6{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		char arr[]= new char[size];

		for(int i=0; i<size; i++){
			arr[i] = sc.next().charAt(0);
		}

		for(int i=0; i<size; i++){
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' || arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U'){
				
			}
			else{
				System.out.print(arr[i]+" ");
			}
		
		}
	}
}

