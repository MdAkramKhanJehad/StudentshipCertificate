package sample;

import java.io.IOException;
import java.util.Scanner;

public class Client {
    Scanner sc =  new Scanner (System.in);

    public void initialize(){
        int choice;

        System.out.println("log in as Admin or Student?\n1)student\t2)admin");
        choice = sc.nextInt();
        try {
            if (choice == 1) {



                SerializeObject serial_io = new SerializeObject();
                serial_io.writeSerializeList();
                serial_io.readDeserializeList();


            } else {
                String name, password, input;

                name = sc.nextLine();
                password = sc.nextLine();

                System.out.println("Do you want to creat account?\nyes\tor    no");
                input = sc.nextLine();

                if(input.equalsIgnoreCase("yes")){
                    //do something for acc create
                }
                else
                    System.out.println("thanks ");




            }

        } catch(Exception ex){

            ex.printStackTrace();
        }


    }


    public void printCertificate(){




    }


}
