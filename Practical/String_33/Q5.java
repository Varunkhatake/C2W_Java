import java.util.*;
class Q5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string : ");
		String str1=sc.next();
		System.out.print("Enter string : ");
                String str2=sc.next();
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		System.out.println(str1.equals(str2));
	}
}
