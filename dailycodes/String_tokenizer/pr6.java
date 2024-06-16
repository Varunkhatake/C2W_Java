import java.io.*;
class C6{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter your name:");
                String name = br.readLine();
                br.close();

                System.out.print("Enter socity name: ");
                String socname = br.readLine();

                System.out.print("Enter Wing: ");
                char wing =(char) br.read();

                System.out.print("Enter flatno: ");
                int flatno =Integer.parseInt( br.readLine());

		System.out.println("Your name: "+name);
		System.out.println("Your socity: "+socname);
		System.out.println("wing "+wing);
		System.out.println("flatno: "+flatno);
        }
}
