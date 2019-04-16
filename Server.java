package sample;

import javax.swing.*;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.Scanner;

public class Server {

    Map<String, double> map=new HashMap<String, double>();

        static void initialize(){

        map.put("jehad", 1000.0);
        map.put("ash", 1000.0);
        map.put("rakib", 1000.0);

        //System.out.println(map.containsKey("ash"));


    }
    public void createAcc(String accName double balance){

        map.put(accName, balance);

    }

    public static void main(String[] args) {
        int flag = 0;
        ServerSocket s1;
        try {
             initialize();

            String name, password, msg;
            s1 = new ServerSocket(10000);
            Socket ss= s1.accept();
            Scanner sc = new Scanner(ss.getInputStream());

            name = sc.nextLine();
            PrintStream p = new PrintStream(ss.getOutputStream());
            if(map.containsKey(name)){
                msg = "give password";
                PrintStream p = new PrintStream(ss.getOutputStream());
                p.println(msg);

                msg = sc.nextLine();
                if(map.get(name)>100){
                    flag =1;

                }else {

                    System.out.println("Not enough money!");
                }

            }
            else{
                System.out.println("Wrong input");
            }

            if(flag==1){



            }






        } catch (IOException e) {

            e.printStackTrace();
        }

    }




}
