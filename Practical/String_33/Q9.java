import java.util.*;
class Q9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string: ");
		String str1=sc .next();
		int lenth=str1.length();
		if(str1.isEmpty()){
		}else{
			System.out.println(str1.charAt(lenth-2));
		}
	}
}


