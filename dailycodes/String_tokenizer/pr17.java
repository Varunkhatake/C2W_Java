import java.util.*;
class C17{
        public static void main(String[] args){
                Scanner sc = new Scanner (System.in);
                System.out.println("enter player info : ");
                String info = sc.nextLine();
                StringTokenizer st = new StringTokenizer(info,"@#");
                String str1 = st.nextToken();

                while(st.hasMoreTokens()){
                        System.out.println(st.nextToken());
                }
        }
}
 
