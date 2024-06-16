import java.util.*;

class Q2{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int max  = arr[0];
		int min = arr[1];
		int diff = 0;

		for(int i=0; i<size; i++){
			arr[i]=sc.nextInt();
		}
		

		for(int i=0; i<size; i++){
			if(min>=arr[i]){
				min=arr[i];
				System.out.println(min);
			}
		}
		for(int i=0; i<size; i++){
                        if(max<=arr[i]){
                                max=arr[i];
                        }

                }
		diff = max-min;
		System.out.print("diff is: "+diff);
		
	}
}


