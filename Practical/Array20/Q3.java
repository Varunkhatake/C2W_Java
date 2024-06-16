import java.util.*;

class Q3{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();

		char arr[] = new char[size];

		for(int i=0; i<size; i++){
			System.out.print("Enter element: ");
			arr[i] = sc.next().charAt(0);
		}
		for(int i=0; i<size; i++){
			if(arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'||arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
				System.out.println("vowel "+arr[i]+" found at index "+i);
			}
		}
	}
}

