import java.io.*;

class Q2{
	public static void main(String s[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter size: ");
		int size = Integer.parseInt(br.readLine());

		int arr[]= new int[size];

		for(int i=0; i<size; i++){
			System.out.println("Enter Element");
			arr[i] = Integer.parseInt(br.readLine());
		}

		for(int i=0; i<size; i++){
			System.out.print(arr[i] + " " );
		}
	}
}

