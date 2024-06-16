import java.io.*;

class Q5{
	public static void main(String s[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter size: ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		for(int i=0; i<size; i++){
			System.out.println("Enter element");
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.print("Element are: ");
		for(int i=0; i<size; i++){
			System.out.print(arr[i]+ " ");
		}
		System.out.println(); 

		for(int i=0; i<size; i++){
			if(arr[i]<10){
				System.out.println(arr[i]+" is less than 10");
			}
		}
	}
}

