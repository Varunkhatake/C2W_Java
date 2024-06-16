import java.util.*;

class Q8{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		char arr[] = new char[size];

		for(int i=0; i<size; i++){
			arr[i] = sc.next().charAt(0);
		}
		char temp = 'a';
		for(int i=0; i<size/2; i++){
			temp = arr[i];
			arr[i]= arr[size-1-i];
			arr[size-1-i] = temp;
		}

		for(int i=0; i<size; i++){
                        System.out.print(arr[i]+" ");

                }
	}
}
