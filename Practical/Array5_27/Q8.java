import java.util.*;

class Q8{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];

		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		for(int i=0; i<size; i++){
			if(min>=arr[i]){
				min=arr[i];
			}
		}
		int min2 = arr[0];
		for(int i=0; i<size; i++){
                        if(min2>=arr[i] && min2>min){
                                min2=arr[i];
                        }

                }
		System.out.print("the second min element : "+min2);
		
		System.out.print("the  min element : "+min);
	}
}
