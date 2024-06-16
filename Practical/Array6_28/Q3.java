import java.util.*;

class Q3{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];

		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the key: ");
		int key = sc.nextInt();
		int count = 0;
		for(int i=0; i<size; i++){
			if(arr[i]==key){
				count++;
			}
		}
		for(int i=0; i<size; i++){
			if(count>2){
				if(key==arr[i]){
					arr[i]=arr[i]*arr[i]*arr[i];
					System.out.print(arr[i]+" ");
				}
				else{
					System.out.print(arr[i]+" ");
				}
			}
			else{
				System.out.print(arr[i]+" ");
			}
		}
	}
}

		

