import java.io.*;

class Q7{
	public static void main(String s[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter size: ");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];

		for(int i=0; i<size; i++){
			System.out.println("Enter element");
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Element are");
		for(int j=0; j<size; j++){
			System.out.print(arr[j]+" ");
		}

		for(int i=0; i<size; i++){
			if(arr[i]%4==0){
				System.out.println(arr[i]+" is divisible by 4 and its index is "+i);
			}
		}
	}
}

