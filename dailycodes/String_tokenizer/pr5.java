import java.io.*;
class C5{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter your name:");
                String name = br.readLine();
                br.close();

                System.out.print("Enter socity name: ");
                String socname = br.readLine();

                System.out.print("Enter Wing: ");
                char wing = br.readLine();

                System.out.print("Enter flatno: ");
                int flatno =Integer.parseInt( br.readLine());
        }
}
