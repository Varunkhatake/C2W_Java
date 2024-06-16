import java.util.*;

class Q9{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size : ");
		int size = sc.nextInt();

		char arr[] = new char[size];
		for(int i=0; i<size; i++){
			arr[i] = sc.next().charAt(0);
		}

		for(int i=0; i<size; i++){
			if(arr[i]>='a' && arr[i]<='z'){
				System.out.print(arr[i] + " " );
			}else{
			
				System.out.print("#"+" ");
			}

		}
	
				
	}
}

