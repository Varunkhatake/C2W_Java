import java.util.*;

class Q6{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int size = sc.nextInt();
		char arr[] = new char[size];
		int count1 = 0;
		int count2 = 0;	

		for(int i=0; i<size; i++){
			arr[i]=sc.next().charAt(0);
		}
		

		for(int i=0; i<size; i++){
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' || arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U'){
				count1++;
			}
			else{
				count2++;
			}
			
		}
		System.out.println("count of vowel: "+count1);
		System.out.println("count of consonents: "+count2++);
	}
}


