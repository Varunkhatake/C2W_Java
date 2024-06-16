import java.util.*;
class Q2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string: ");
		String str1=sc.next();
		int length=str1.length();
		for(int i=0;i<length;i++){
			System.out.println(str1.charAt(i));
		}
	}
}
