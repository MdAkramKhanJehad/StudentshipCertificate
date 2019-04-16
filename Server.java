package sample;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;

public class Server {

     static Map<String,Integer> map=new HashMap<>();

        static void initialize(){

        map.put("jehad", 1000);
        map.put("ash", 1000);
        map.put("rakib", 100);

        //System.out.println(map.containsKey("ash"));


    }
    public void createAcc(String accName, Integer balance){

        map.put(accName, balance);

    }

    public static void main(String[] args) {
        int flag = 0;
        ServerSocket s1;
        try {
             initialize();

            String name, pass, msg;
            s1 = new ServerSocket(10000);
            Socket ss= s1.accept();
            Scanner sc2 = new Scanner(ss.getInputStream());
            System.out.println("welcome to server");
            name = sc2.nextLine();
            PrintStream p = new PrintStream(ss.getOutputStream());
            if(map.containsKey(name)){
                msg = "give password";
                p.println(msg);

                pass = sc2.nextLine();
                if(map.get(name)>100){
                    flag =1;

                }else {

                    p.println("Not enough money!");
                }

            }
            else{
                System.out.println("Wrong input");
            }

            if(flag==1){
                msg = "ok";
                p.println(msg);

            }



        } catch (IOException e) {

            e.printStackTrace();
        }

    }




}
