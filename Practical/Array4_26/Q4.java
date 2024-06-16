import java.util.*;

class Q4{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];

		int count = 0;
		for(int i=0; i<size; i++){
			arr[i]=sc.nextInt();
		}
		int num=sc.nextInt();

		for(int i=0; i<size; i++){
			if(num==arr[i]){
				count++;
			}
		}
		if(count>2){
			System.out.print(num+" occurs more the 2");
		}
	}
}

