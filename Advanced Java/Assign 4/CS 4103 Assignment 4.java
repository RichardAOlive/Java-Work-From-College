import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.Writer;
import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;
interface Homework{
    void setpageNumber(int newValue);
}
class JavaHomework implements Homework {
    static int pageNumber = 394;

    public void setpageNumber(int newValue){
        pageNumber = newValue;
    }


    public static void main(String[] args) {
        System.out.println(pageNumber);
        try{
            File myFile = new File("C:\\Users\\roliv\\Documents\\Homework\\Advanced Java\\Assign 4\\Homework4.txt");
            if (myFile.createNewFile()){
                System.out.println("File created :" + myFile.getName());
            } else{
                System.out.println("File already exists");
            }
            FileWriter myWriter = new FileWriter("C:\\Users\\roliv\\Documents\\Homework\\Advanced Java\\Assign 4\\Homework4.txt");
            //String newLine = System.getProperty("line.separator");
            for(int i = 0; i <= 100; i++)
            {
                myWriter.write(i + "\n");
                System.out.println(i);
            }
            myWriter.close();
            Scanner myReader = new Scanner(myFile);
            ArrayList<String> arrayList = new ArrayList<>();
            while (myReader.hasNextLine()){
                arrayList.add(myReader.nextLine());
            }
            for(int y = 0; y<=100; y++)
            {
            System.out.println(arrayList.get(y));
            }
            myReader.close();
        } catch(IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}