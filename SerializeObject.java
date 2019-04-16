package sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class SerializeObject{

    private static String filename= "src\\serialization\\information.txt";


    public void writeSerializeList(){
        AccountOwnerInfo ac1 = new AccountOwnerInfo("kamal", "razzakr", "srsr", "12232", 3.00);
        AccountOwnerInfo ac2 = new AccountOwnerInfo("Sabbir", "muhib", "sergaef", "90000000", 3.00);

        ArrayList<AccountOwnerInfo> accHolderList = new ArrayList<>();

        accHolderList.add(ac1);
        accHolderList.add(ac2);


        try {
            ObjectOutputStream obOutStream = new ObjectOutputStream(new FileOutputStream(filename));

            obOutStream.writeObject(accHolderList);
            obOutStream.close();


        } catch (FileNotFoundException ex) {
            System.out.println("FileOutputStream in " + ex.toString());
        } catch (IOException ex) {
            System.out.println("ObjectOutputStream in " + ex.toString());
        }

    }



    public void readDeserializeList(){

        try {
            ObjectInputStream obInStream =
                    new ObjectInputStream(new FileInputStream(filename));

            ArrayList<AccountOwnerInfo> listOfAccHolder =
                    (ArrayList<AccountOwnerInfo>) obInStream.readObject();

            for (AccountOwnerInfo deserializeAccHolder : listOfAccHolder){
                System.out.println("\nName: " + deserializeAccHolder.name +
                        "\nfather: " + deserializeAccHolder.father +"\nacc number: "+ deserializeAccHolder.mother
                        +"\nNID : "+ deserializeAccHolder.nidNum+"\ncgpa: "+deserializeAccHolder.cgpa);
            }


        } catch (IOException ex) {
            System.out.println("IO Exception" + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("classNotFound Exception" + ex.getMessage());
        }

    }



}
