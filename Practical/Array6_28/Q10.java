import java.util.*;

class Q10{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		int max = arr[0];

		for(int i=0; i<size; i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<size; i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		
		System.out.print(max);
		int max2=arr[1];
		for(int i=0; i<size; i++){
			if(arr[i]>max2 && arr[i]<max){
				max2=arr[i];
			}
		}
		System.out.print(max2);
		int max3=arr[2];
                for(int i=0; i<size; i++){
                        if(arr[i]>max3 && arr[i]<max2){
                                max3=arr[i];
                        }
                }
		System.out.print(max3);
	}
}
