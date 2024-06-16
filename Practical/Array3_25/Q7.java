import java.util.*;

class Q7{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[]= new int[size];

		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}


		for(int i=0; i<size; i++){
			if(size%2==1 && size>5){
				if(arr[i]%2==0){
					System.out.print(arr[i]+" ");
				}

			}
			else{
				if(arr[i]%2==0){

					System.out.print(arr[i]+"");
				}
			}

		
		}
	}
}

