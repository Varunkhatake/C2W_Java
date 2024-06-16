import java.util.*;

class Q7{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for(int i=0; i<arr.length; i++){
			System.out.print("Enter Element : ");
			arr[i] = sc.nextInt();
		}
		

		for(int i=0; i<arr.length; i++){
			if(size%2==0){
				if(i%2==0){
					System.out.println(arr[i]+" ");
				}
			}
			else{
				System.out.println(arr[i]+" ");
			}
		}
	}
}

