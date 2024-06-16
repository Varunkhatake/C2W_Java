import java.util.*;
class C13{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("enter payer info: ");
	String info = sc.nextLine();
	StringTokenizer st =  new StringTokenizer(info," ");
        String str1 = st.nextToken();
        String str2 = st.nextToken();
        String str3 = st.nextToken();
	String str4 = st.nextToken();
	System.out.println("playerName : "+str1);
	System.out.println("jersy : "+str2);
	System.out.println(" Ave : "+str3);
	System.out.println("grade : "+str4);
        }
}
   

