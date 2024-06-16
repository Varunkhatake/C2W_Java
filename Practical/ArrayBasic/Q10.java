import java.io.*;

class Q10{
        public static void main(String s[])throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter size: ");
                int size = Integer.parseInt(br.readLine());

                String arr[] = new String[size];

                for(int i=0; i<size; i++){
                        System.out.println("enter player name: ");
                        arr[i] =br.readLine();
                }
		System.out.println("Playing 11 are");
                for(int j=0; j<size; j++){
                        System.out.println(j+") "+arr[j]);
                }

               
        }
}
