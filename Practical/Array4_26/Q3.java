import java.util.*;

class Q3{
        public static void main(String s[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter size: ");
                int size = sc.nextInt();
                int arr[] = new int[size];
                int max  = arr[0];
                for(int i=0; i<size; i++){
                        arr[i]=sc.nextInt();
                }

                for(int i=0; i<size; i++){
                        if(max<=arr[i]){
                                max=arr[i];
                        }

                }
		int max2 = arr[1];
		for(int i=0; i<size; i++){
			if(max2<=arr[i] && max2<max){
				max2=arr[i];
			}
		}

             

                System.out.print("second max: "+max2);

        }
}
