package sample;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class clientMain {

    public static void main(String[] args) {
        try{
            Client cl = new Client();
            c1.initialize();

            String name, pass, temp;
            Scanner sc= new Scanner(System.in);

            Socket s = new Socket("127.0.0.1", 10000);
            Scanner sc1 = new Scanner(s.getInputStream());
            System.out.println("Enter name");
            name = sc.nextLine();
            PrintStream p = new PrintStream(s.getOutputStream());
            p.println(name);
            temp= sc1.nextLine();
            System.out.println(temp);
            pass = sc.nextLine();
            p.println(pass);



        } catch(Exception ex){

            ex.printStackTrace();
        }







    }

}
