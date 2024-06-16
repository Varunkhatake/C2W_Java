import java.util.*;

class Q5{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int size1 = sc.nextInt();
		int size2 = sc.nextInt();
		int arr1[] = new int[size1];
		int arr2[] = new int[size2];

		for(int i=0; i<size1; i++){
			arr1[i] = sc.nextInt();
			

		}
		System.out.println("array2");
		for(int i=0; i<size2; i++){
			arr2[i]=sc.nextInt();
		}
		int arr3[]=new int[size1+size2];
		for(int i=0; i<size1+size2; i++){
			if(i<size1){
				arr3[i]=arr1[i];
				System.out.print(arr3[i]+" ");
			}
			else{
				arr3[i]=arr2[i-size1];
				System.out.print(arr3[i]+" ");
			}

		}
	}
}


