import java.io.*;

class Q6{
	public static void main(String s[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter size: ");
		int size = Integer.parseInt(br.readLine());

		char arr[] = new char[size];

		for(int i=0; i<size; i++){
			
			arr[i] = (char)br.read();
		}

		System.out.println("Element are");
		for(int j=0; j<size; j++){
			System.out.print(arr[j]+" ");
		}
	}
}

