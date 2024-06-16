import java.io.*;

class Q9{
	public static void main(String s[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter size: ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		for(int i=0; i<size; i++){
			System.out.println("enter element");
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int j=0; j<size; j++){
			System.out.print(arr[j]+" ");
		}

		for(int i=0; i<size; i++){
			if(i%2==1){
				System.out.println(arr[i]+" is an odd indexed element");
			}
		}
	}
}

