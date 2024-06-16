import java.util.*;

class Q8{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int size = sc.nextInt();
		char arr[] = new char[size];
		int count = 0; 

		for(int i=0; i<size; i++){
			arr[i]=sc.next().charAt(0);
		}
		char ch = sc.next().charAt(0);

		for(int i=0; i<size; i++){
			if(arr[i]==ch){
				count++;
			}
		}
		System.out.print(ch +" occurs "+count+ " times in the given array.");
	}
}


